package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.User;
import fr.plil.sio.persistence.api.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JdbcApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCreateAndFindByName() {
        final String name = "blabla";
        User user1 = userService.create(name);
        User user2 = userService.findByName(name);
        assertNotNull(user1);
        assertNotNull(user2);
        assertNotNull(user1.getName());
        assertNotNull(user2.getName());
        assertNotNull(user1.getGroup());
        assertNotNull(user2.getGroup());
        assertEquals(user1.getName(), user2.getName());
        assertEquals(user1.getGroup(), user2.getGroup());
    }
}
