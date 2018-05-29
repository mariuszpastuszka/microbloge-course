package pl.mpas.microbloge_course.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.microbloge_course.model.UserPost;

public interface UserPostRepository extends CrudRepository<UserPost, Long> {
}
