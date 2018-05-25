package pl.mpas.microbloge_course.service;

import com.google.common.base.Preconditions;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import pl.mpas.microbloge_course.dao.UserDAO;
import pl.mpas.microbloge_course.model.RegistrationResult;
import pl.mpas.microbloge_course.model.User;

public class UserService {
    private static Logger log = LogManager.getLogger(UserService.class);

    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserService() {
        // empty
    }

    // TODO: finish it
    public RegistrationResult registerNewUser(User newUser) {
        Preconditions.checkNotNull(newUser, "null!!!!");
        log.debug("registerNewUser()");

        RegistrationResult result = RegistrationResult.REG_SUCCESS;

        if (userDAO.checkIfUserExists(newUser)) {
            log.debug("user already exists: " + newUser);
            return RegistrationResult.REG_USER_ALREADY_EXISTS;
        }


        return result;
    }

    public void deleteAccount(User userAccount) {

    }
}
