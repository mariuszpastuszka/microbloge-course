package pl.mpas.microbloge_course.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public enum PostStatus {
    NEW,
    EDITED;

    @Id
    private int id;
}
