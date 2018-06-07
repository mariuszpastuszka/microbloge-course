package pl.mpas.microbloge_course.service.implementation;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import pl.mpas.microbloge_course.model.User;
import pl.mpas.microbloge_course.model.UserMessageSendInfo;
import pl.mpas.microbloge_course.repository.UserMessageSendInfoRepository;
import pl.mpas.microbloge_course.repository.UserPostRepository;
import pl.mpas.microbloge_course.repository.UserRepository;
import pl.mpas.microbloge_course.service.MailSenderJob;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MailSenderJobImpl implements MailSenderJob {
    private Executor executor;
    private JavaMailSender mailSender;
    private UserRepository userRepository;
    private UserPostRepository userPostRepository;
    private UserMessageSendInfoRepository timestampRepository;

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

        // TODO:MP - convert to one object
        List<UserMessageSendInfo> timestampsOfUsers = new ArrayList<>();
        timestampRepository.findAll().forEach(timestampsOfUsers::add);

        for (User user : userRepository.findAll()) {
            // hack
            Optional<LocalDateTime> userLastMessageSentTimestamp = timestampsOfUsers.get(0).getTimeOfLastSentMessage(user);
            if (userLastMessageSentTimestamp.isPresent()) {
                // send only not sent messages
            } else {
                // send all ones
            }

            timestampsOfUsers.get(0).setTimeOfLastSentMessageForUser(user, LocalDateTime.now());
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
