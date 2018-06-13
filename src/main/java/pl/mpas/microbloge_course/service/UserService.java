package pl.mpas.microbloge_course.service;

import com.google.common.base.Preconditions;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.mpas.microbloge_course.dao.UserDAO;
import pl.mpas.microbloge_course.model.RegistrationResult;
import pl.mpas.microbloge_course.model.User;
import pl.mpas.microbloge_course.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// TODO:MP change into interface
@Service
public class UserService {
//    private static Logger log = LogManager.getLogger(UserService.class);

//    private UserDAO userDAO;
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService() {
        // empty
    }

    public RegistrationResult registerNewUser(User newUser) {
//        Preconditions.checkNotNull(newUser, "null!!!");
//        log.debug("registerNewUser()");

        RegistrationResult result = RegistrationResult.REG_SUCCESS;

        if (userRepository.existsById(newUser.getId())) {
//            log.debug("user already exists: " + newUser);
            return RegistrationResult.REG_USER_ALREADY_EXISTS;
        }


        return result;
    }

    public boolean deleteAccount(User userAccount) {
//        log.debug("deleteAccount: " + userAccount);

        if (userRepository.existsById(userAccount.getId())) {
            userRepository.delete(userAccount);
            return true;
        } else {
//            log.debug("trying to delete non existent user!!!");
        }

        return false;
    }

    public List<User> findAllRegisteredUsers() {
        List<User> result = new ArrayList<>();
        userRepository.findAll().forEach(result::add);

        return result;
    }
}
