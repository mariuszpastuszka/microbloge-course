package pl.mpas.microbloge_course.service;

import org.junit.Assert;
import org.junit.Test;
import pl.mpas.microbloge_course.dao.UserDAO;
import static pl.mpas.microbloge_course.model.RegistrationResult.*;
import pl.mpas.microbloge_course.model.User;
import pl.mpas.microbloge_course.repository.UserRepository;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    UserRepository dummyRepository = mock(UserRepository.class);
    UserService userService = new UserService(dummyRepository);
    User newUser = new User("mariusz.p@gmail.com", "password", "password");

    @Test
    public void registerNewUser_positiveCase() {
        newUser = new User("mariusz.p@gmail.com", "password", "password");

        when(dummyRepository.existsById(newUser.getId())).thenReturn(false);

        Assert.assertEquals(REG_SUCCESS, userService.registerNewUser(newUser));
    }

    @Test
    public void registerNewUser_alreadyExists() {
        when(dummyRepository.existsById(newUser.getId())).thenReturn(true);
        Assert.assertEquals(REG_USER_ALREADY_EXISTS, userService.registerNewUser(newUser));
    }

    @Test
    public void registerNewUser_passwordMissmatch() {

    }

    @Test
    public void deleteUser_success() {
        when(dummyRepository.existsById(newUser.getId())).thenReturn(true);

        Assert.assertEquals(true, userService.deleteAccount(newUser));
    }

    @Test
    public void deleteUser_notExist() {
        when(dummyRepository.existsById(newUser.getId())).thenReturn(true);

        Assert.assertEquals(false, userService.deleteAccount(newUser));
    }
}
