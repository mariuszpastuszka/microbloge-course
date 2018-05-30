package pl.mpas.microbloge_course.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import pl.mpas.microbloge_course.model.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/giveMeNewUser")
    public User giveMeNewUser() {
        return new User("test-login", "password", "password");
    }
}
