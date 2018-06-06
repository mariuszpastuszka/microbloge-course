package pl.mpas.microbloge_course.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import pl.mpas.microbloge_course.service.implementation.MailServiceImpl;

import java.util.Properties;

public class MailServiceTest {

    MailService mailService = new MailServiceImpl(getJavaMailSender(), null);

    @Test
    public void sendMail() {
        boolean result =  mailService.sendEmailToUser("mpastuszka@gmail.com",
                "Hello",
                "Thanks for registration",
                "microbloge-course");

        Assert.assertTrue(result);
    }

    private JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setProtocol("smtp");

        mailSender.setUsername("");
        mailSender.setPassword("");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.quitwait", "false");

        return mailSender;
    }

}
