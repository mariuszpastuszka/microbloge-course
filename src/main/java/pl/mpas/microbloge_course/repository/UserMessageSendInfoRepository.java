package pl.mpas.microbloge_course.repository;

import org.springframework.data.repository.CrudRepository;
import pl.mpas.microbloge_course.model.UserMessageSendInfo;

public interface UserMessageSendInfoRepository extends CrudRepository<UserMessageSendInfo, Long> {
}
