package pl.mpas.microbloge_course.service.implementation;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import pl.mpas.microbloge_course.service.MailSenderJob;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MailSenderJobImpl implements MailSenderJob {
    private Executor executor;
    private JavaMailSender mailSender;

    public MailSenderJobImpl() {
        executor = Executors.newFixedThreadPool(4);
        mailSender = getDefaultMailSender();
    }

    public MailSenderJobImpl(Executor executor, JavaMailSender mailSender) {
        this.executor = executor;
        this.mailSender = mailSender;
    }

    @Override
    public void sendMessages() {

    }

    private JavaMailSender getDefaultMailSender() {
        // TODO:MP remember to configure to default state
        return new JavaMailSenderImpl();
    }
}
