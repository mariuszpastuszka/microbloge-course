package pl.mpas.microbloge_course.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan(basePackages = {"pl.mpas.microbloge_course.service"})
public class TestConfig {

    @Bean
    JavaMailSender mailSender() {
        return new JavaMailSenderImpl();
    }
}
