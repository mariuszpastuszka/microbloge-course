package pl.mpas.microbloge_course.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.microbloge_course.model.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLogin(String login);
}
