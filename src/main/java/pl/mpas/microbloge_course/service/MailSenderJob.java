package pl.mpas.microbloge_course.service;

public interface MailSenderJob {
    void sendSubscribtionsAboutNewMessages();
    void sendSubscribtionsAboutNewComments();
}
