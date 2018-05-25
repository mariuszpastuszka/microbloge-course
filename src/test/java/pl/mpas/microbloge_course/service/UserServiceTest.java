package pl.mpas.microbloge_course.service;

import org.junit.Assert;
import org.junit.Test;
import pl.mpas.microbloge_course.dao.UserDAO;
import static pl.mpas.microbloge_course.model.RegistrationResult.*;
import pl.mpas.microbloge_course.model.User;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    UserDAO dummyDAO = mock(UserDAO.class);
    UserService userService = new UserService(dummyDAO);
    User newUser = new User("mariusz.p@gmail.com", "password", "password");

    @Test
    public void registerNewUser_positiveCase() {
        newUser = new User("mariusz.p@gmail.com", "password", "password");

        when(dummyDAO.checkIfUserExists(newUser)).thenReturn(false);

        Assert.assertEquals(REG_SUCCESS, userService.registerNewUser(newUser));
    }

    @Test
    public void registerNewUser_alreadyExists() {
        when(dummyDAO.checkIfUserExists(newUser)).thenReturn(true);
        Assert.assertEquals(REG_USER_ALREADY_EXISTS, userService.registerNewUser(newUser));
    }

    @Test
    public void registerNewUser_passwordMissmatch() {

    }
}
