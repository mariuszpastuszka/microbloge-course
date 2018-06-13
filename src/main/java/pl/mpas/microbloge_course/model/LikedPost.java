package pl.mpas.microbloge_course.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.Objects;

@Entity
public class LikedPost {
    @Id
    long id;

    User who;
    @OneToOne
    UserPost likedPost;
    Date date;

    public LikedPost(User who, UserPost likedPost, Date date) {
        this.who = who;
        this.likedPost = likedPost;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikedPost likedPost1 = (LikedPost) o;
        return Objects.equals(who, likedPost1.who) &&
                Objects.equals(likedPost, likedPost1.likedPost) &&
                Objects.equals(date, likedPost1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(who, likedPost, date);
    }

    public User getWho() {
        return who;
    }

    public void setWho(User who) {
        this.who = who;
    }

    public UserPost getLikedPost() {
        return likedPost;
    }

    public void setLikedPost(UserPost likedPost) {
        this.likedPost = likedPost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LikedPost{" +
                "who=" + who +
                ", likedPost=" + likedPost +
                ", date=" + date +
                '}';
    }
}
