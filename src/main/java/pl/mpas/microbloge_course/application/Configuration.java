package pl.mpas.microbloge_course.application;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import pl.mpas.microbloge_course.controller.MainController;
import pl.mpas.microbloge_course.service.UserService;

@org.springframework.context.annotation.Configuration
public class Configuration {

   @Bean
   public MainController mainController() {
       return new MainController(userService());
   }

   @Bean
    public UserService userService() {
       return new UserService();
   }
}
