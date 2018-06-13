package pl.mpas.microbloge_course.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

@Entity
public class UserMessageSendInfo {
    @Id
    private long id;
    private User user;
    private LocalDateTime lastMessageSentTimestamps;

    public UserMessageSendInfo(User user, LocalDateTime lastMessageSentTimestamps) {
        this.lastMessageSentTimestamps = lastMessageSentTimestamps;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getLastMessageSentTimestamps() {
        return lastMessageSentTimestamps;
    }

    public void setLastMessageSentTimestamps(LocalDateTime lastMessageSentTimestamps) {
        this.lastMessageSentTimestamps = lastMessageSentTimestamps;
    }
}
