package pl.mpas.microbloge_course.service.implementation;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import pl.mpas.microbloge_course.model.User;
import pl.mpas.microbloge_course.repository.UserPostRepository;
import pl.mpas.microbloge_course.repository.UserRepository;
import pl.mpas.microbloge_course.service.MailSenderJob;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MailSenderJobImpl implements MailSenderJob {
    private Executor executor;
    private JavaMailSender mailSender;
    private UserRepository userRepository;
    private UserPostRepository userPostRepository;

    public MailSenderJobImpl() {
        executor = Executors.newFixedThreadPool(4);
        mailSender = getDefaultMailSender();
    }

    public MailSenderJobImpl(Executor executor, JavaMailSender mailSender) {
        this.executor = executor;
        this.mailSender = mailSender;
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setUserPostRepository(UserPostRepository userPostRepository) {
        this.userPostRepository = userPostRepository;
    }

    @Override
    public void sendSubscribtionsAboutNewMessages() {
        // pobranie adresatow
        for (User user : userRepository.findAll()) {

        }

        // pobranie info o nowych wiadomosciach od ostatnie wysylki
        // skomponowanie wiadomosci
        // wysylka
    }

    @Override
    public void sendSubscribtionsAboutNewComments() {

    }

    private JavaMailSender getDefaultMailSender() {
        // TODO:MP remember to configure to default state
        return new JavaMailSenderImpl();
    }
}
