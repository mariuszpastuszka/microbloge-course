package pl.mpas.microbloge_course.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mpas.microbloge_course.model.RegistrationResult;
import pl.mpas.microbloge_course.model.User;
import pl.mpas.microbloge_course.service.UserService;

@Controller
public class MainController {

    private UserService userService;

    public MainController() {
        // empty
    }

    public MainController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "registration";
    }

    @RequestMapping(value = "/register", method = { RequestMethod.POST })
    public String registerUser(@RequestParam(required = true) String login,
                               @RequestParam(required = true) String password1,
                               @RequestParam(required = true) String password2) {

        User newUser = new User(login, password1, password2);
        RegistrationResult registrationResult = userService.registerNewUser(newUser);

        // TODO:MP handle all responses
        String result = "registration-fail";
        if (registrationResult == RegistrationResult.REG_SUCCESS) {
            result = "registration-ok";
        } else if (registrationResult == RegistrationResult.REG_USER_ALREADY_EXISTS) {
            result = "registration-already-exists";
        }

        return result;
    }

}
