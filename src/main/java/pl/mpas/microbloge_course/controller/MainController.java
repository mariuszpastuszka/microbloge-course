package pl.mpas.microbloge_course.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "registration";
    }

    @RequestMapping(value = "/register", method = { RequestMethod.POST })
    public String registerUser(@RequestParam(required = false) String login,
                               @RequestParam(required = false) String password1,
                               @RequestParam(required = false) String password2) {
        return "registration-ok";
    }

}
