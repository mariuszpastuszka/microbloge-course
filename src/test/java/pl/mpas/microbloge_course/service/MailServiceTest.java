package pl.mpas.microbloge_course.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import pl.mpas.microbloge_course.service.implementation.MailServiceImpl;

import java.io.*;
import java.util.Properties;

@PropertySource({"classpath:application.properties"})
public class MailServiceTest {
    @Value("${spring.datasource.username}")
    String value;
    MailService mailService = new MailServiceImpl(getJavaMailSender(), null);

    @Test
    public void sendMail() {
        boolean result =  mailService.sendEmailToUser("mpastuszka@gmail.com",
                "Hello",
                "Thanks for registration",
                "microbloge-course");

        Assert.assertTrue(result);
    }

    @Test
    public void readContentOfLocalResource() {
        InputStream in = getClass().getResourceAsStream("/attachment/file.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        try {
            String line;
            while (null != (line = reader.readLine())) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String current = new File( "." ).getCanonicalPath();
            System.out.println(current);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        String port;
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

    /*
            <property name="host"><value>smtp.gmail.com</value></property>
        <property name="port"><value>587</value></property>
        <property name="protocol"><value>smtp</value></property>
        <property name="username"><value>${mail.username}</value></property>
        <property name="password"><value>${mail.password}</value></property>
        <property name="javaMailProperties">
            <props>
                <prop key="mail.smtp.auth">true</prop>
                <prop key="mail.smtp.starttls.enable">true</prop>
                <prop key="mail.smtp.quitwait">false</prop>
            </props>
        </property>
     */
}
