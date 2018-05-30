package pl.mpas.microbloge_course.controller.development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.microbloge_course.model.User;
import pl.mpas.microbloge_course.service.UserService;

import java.util.List;

@RestController
public class DevelopmentTests {

    private UserService userService;

    @Autowired
    public DevelopmentTests(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/giveMeAllRegisteredUser")
    public List<User> giveMeAllRegisteredUser() {
        return userService.findAllRegisteredUsers();
    }
}
