package fr.plil.sio.persistence.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JdbcApplication.class)
public class UserServiceTest {

    @Test
    public void testCreateAndFindByName() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateFailsWhenNameNull() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateFailsWhenGroupNameNull() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateFailsWhenGroupDoesNotExist() {
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateFailsWhenSameNameUserAlreadyPresent() {
    }

    public void testDeleteUser() {
    }

    public void testDeleteUserIfNotFound() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteUserFailsIfNameNull() {
    }

    public void testFindUserByNameIfUserNotFound() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindUserByNameFailsIfNameNull() {
    }

    public void testIsUserHasExactRight() {
    }

    public void testIsUserHasRightByParents() {
    }

    public void testIsUserHasNotTheExactRight() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsUserHasRightFailsWhenUsernameNull() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsUserHasRightFailsWhenRightNull() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsUserHasRightFailsWhenRightNotInDatabase() {
    }
}
