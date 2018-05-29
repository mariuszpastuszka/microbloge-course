package pl.mpas.microbloge_course.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.microbloge_course.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
