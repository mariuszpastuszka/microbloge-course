package pl.mpas.microbloge_course.model;

import java.time.LocalDateTime;
import java.util.Map;

public class UserMessageSendInfo {
    private Map<User, LocalDateTime> lastMessageSentTimestamp;

    public UserMessageSendInfo(Map<User, LocalDateTime> lastMessageSentTimestamp) {
        this.lastMessageSentTimestamp = lastMessageSentTimestamp;
    }
}
