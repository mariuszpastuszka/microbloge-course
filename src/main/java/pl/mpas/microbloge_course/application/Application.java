package pl.mpas.microbloge_course.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.mpas.microbloge_course")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
