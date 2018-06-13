package pl.mpas.microbloge_course.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "pl.mpas.microbloge_course")
@EnableJpaRepositories("pl.mpas.microbloge_course")
@EntityScan("pl.mpas.microbloge_course")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
