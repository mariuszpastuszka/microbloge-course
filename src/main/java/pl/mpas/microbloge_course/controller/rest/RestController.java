package pl.mpas.microbloge_course.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/giveMeNewUser")
    public User giveMeNewUser() {
        return new User("Mariusz", "Pastuszka");
    }
}
