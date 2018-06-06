package pl.mpas.microbloge_course.service.implementation;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import pl.mpas.microbloge_course.service.MailService;

public class MailServiceImpl implements MailService {

    private MailSender mailSender;
    private SimpleMailMessage templateMessage;

    @Override
    public String toString() {
        return "MailServiceImpl{" +
                "mailSender=" + mailSender +
                ", templateMessage=" + templateMessage +
                '}';
    }

    public MailServiceImpl(MailSender mailSender, SimpleMailMessage templateMessage) {
        this.mailSender = mailSender;
        this.templateMessage = templateMessage;
    }

    public void setMailSender(MailSender mailSender) {
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
            System.err.println(String.format("Error occurred during mail sending: [%s]", exception));
        }
        return result;
    }
}
