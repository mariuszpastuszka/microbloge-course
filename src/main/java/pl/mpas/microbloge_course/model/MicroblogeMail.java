package pl.mpas.microbloge_course.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class MicroblogeMail {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateOfMailSending() {
        return dateOfMailSending;
    }

    public void setDateOfMailSending(LocalDateTime dateOfMailSending) {
        this.dateOfMailSending = dateOfMailSending;
    }

    @Id

    long id;
    private String address;
    private String mailTheme;
    private String mailNote;
    private LocalDateTime dateOfMailSending;

    public MicroblogeMail() {
    }

    public MicroblogeMail(String address, String mailTheme, String mailNote) {
        this.address = address;
        this.mailTheme = mailTheme;
        this.mailNote = mailNote;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMailTheme() {
        return mailTheme;
    }

    public void setMailTheme(String mailTheme) {
        this.mailTheme = mailTheme;
    }

    public String getMailNote() {
        return mailNote;
    }

    public void setMailNote(String mailNote) {
        this.mailNote = mailNote;
    }

    @Override
    public String toString() {
        return "MicroblogeMail{" +
                "address='" + address + '\'' +
                ", mailTheme='" + mailTheme + '\'' +
                ", mailNote='" + mailNote + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MicroblogeMail that = (MicroblogeMail) o;
        return Objects.equals(address, that.address) &&
                Objects.equals(mailTheme, that.mailTheme) &&
                Objects.equals(mailNote, that.mailNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, mailTheme, mailNote);
    }
}
