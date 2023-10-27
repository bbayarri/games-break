package repositories;

import data.Purchase;
import data.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UsersRepositoryTest {

    @Test
    public void login_with_valid_username_and_password_should_return_user() {
        //Arrange
        UsersRepository usersRepository = new UsersRepository();
        User expectedUser = new User(1504L, "BRIAN_BAYARRI", "abc123", "Brian", "Bayarri", 350.50, "2022/12/10");

        //Act
        User user = usersRepository.login("BRIAN_BAYARRI", "abc123");

        //Assert
        assertEquals(1504L, user.getId());
    }

    @Test
    public void login_with_invalid_username_and_password_should_return_null() {
        //Arrange
        UsersRepository usersRepository = new UsersRepository();

        //Act
        User user = usersRepository.login("INVALID_USER", "pa$$word");

        //Assert
        assertNull(user);
    }

}