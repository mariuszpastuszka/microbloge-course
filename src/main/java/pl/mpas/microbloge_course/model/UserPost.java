package pl.mpas.microbloge_course.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
public class UserPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String postHeader;

    public String getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(String postHeader) {
        this.postHeader = postHeader;
    }

    private String note;
    private LocalDateTime creationDate;
    private PostStatus postStatus;
    private PostType postType;
    private User postAuthor;

    public UserPost() {
        // empty
    }

    public UserPost(String note, LocalDateTime creationDate, PostStatus postStatus, PostType postType, User postAuthor) {
        this.note = note;
        this.creationDate = creationDate;
        this.postStatus = postStatus;
        this.postType = postType;
        this.postAuthor = postAuthor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus) {
        this.postStatus = postStatus;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public User getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(User postAuthor) {
        this.postAuthor = postAuthor;
    }

    @Override
    public String toString() {
        return "UserPost{" +
                "note='" + note + '\'' +
                ", creationDate=" + creationDate +
                ", postStatus=" + postStatus +
                ", postType=" + postType +
                ", postAuthor=" + postAuthor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPost userPost = (UserPost) o;
        return Objects.equals(note, userPost.note) &&
                Objects.equals(creationDate, userPost.creationDate) &&
                postStatus == userPost.postStatus &&
                postType == userPost.postType &&
                Objects.equals(postAuthor, userPost.postAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note, creationDate, postStatus, postType, postAuthor);
    }
}
