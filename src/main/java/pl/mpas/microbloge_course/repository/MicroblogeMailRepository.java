package pl.mpas.microbloge_course.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.microbloge_course.model.MicroblogeMail;

public interface MicroblogeMailRepository extends CrudRepository<MicroblogeMail, Long> {
}
