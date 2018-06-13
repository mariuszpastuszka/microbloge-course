package pl.mpas.microbloge_course.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public enum PostType {
    NOTE,
    COMMENT,
    FORWARDED_NOTE;

    @Id
    @GeneratedValue
    private int id;
}
