package pl.mpas.microbloge_course.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import pl.mpas.microbloge_course.service.implementation.MailServiceImpl;

public class MailServiceTest {

    MailService mailService = new MailServiceImpl(new JavaMailSenderImpl(), null);
    @Test
    public void sendMail() {
        boolean result =  mailService.sendEmailToUser("john-doe@gmail.com",
                "Hello",
                "Thanks for registration",
                "microbloge-course");

        Assert.assertTrue(result);
    }
}
