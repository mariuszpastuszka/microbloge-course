package pl.mpas.microbloge_course.service.implementation;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import pl.mpas.microbloge_course.service.MailService;

public class MailServiceImpl implements MailService {

    private JavaMailSender mailSender;
    private SimpleMailMessage templateMessage;

    @Override
    public String toString() {
        return "MailServiceImpl{" +
                "mailSender=" + mailSender +
                ", templateMessage=" + templateMessage +
                '}';
    }

    public MailServiceImpl(JavaMailSender mailSender, SimpleMailMessage templateMessage) {
        this.mailSender = mailSender;
        this.templateMessage = templateMessage;
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void setTemplateMessage(SimpleMailMessage templateMessage) {
        this.templateMessage = templateMessage;
    }

    @Override
    public boolean sendEmailToUser(String address, String title, String message, String from) {
        boolean result = true;
        SimpleMailMessage newMailMessage = new SimpleMailMessage();
        newMailMessage.setTo(address);
        newMailMessage.setSubject(title);
        newMailMessage.setText(message);
        newMailMessage.setFrom(from);

        try {
            mailSender.send(newMailMessage);
        } catch (MailException exception) {
            result = false;
            System.err.println(String.format("Error occurred during mail sending: [%s]", exception));
        }
        return result;
    }

    @Override
    public boolean sendEmailToUserWithAttachment(String address, String title, String message, String from, String resourcePath) {
        boolean result = true;

        return result;
    }
}
