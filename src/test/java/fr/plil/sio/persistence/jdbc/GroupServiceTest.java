package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Group;
import fr.plil.sio.persistence.api.GroupService;
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
public class GroupServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private GroupService groupService;

    @Test
    public void testCreateAndFindByName() {
        groupService.create("group1");
        Group group2 = groupService.findByName("group1");
        assertNotNull(group2);
        assertNotNull(group2.getName());
        assertEquals("group1", group2.getName());
    }

    @Test
    public void addUsersAndCheckIfPresent() {
        Group group1 = groupService.create("group1");
        User user1 = userService.create("user1");
        User user2 = userService.create("user2");
        groupService.addUser(group1, user1);
        groupService.addUser(group1, user2);
        Group group2 = groupService.findByName("group1");
        assertNotNull(group2);
        assertNotNull(group2.getName());
        assertEquals("group1", group2.getName());
        assertEquals(2, group2.getUsers().size());
    }

    @Test
    public void deleteGroupDoesNotDeleteUsers() {
        Group group1 = groupService.create("group1");
        User user1 = userService.create("user1");
        User user2 = userService.create("user2");
        groupService.addUser(group1, user1);
        groupService.addUser(group1, user2);
        groupService.delete(group1);
        assertNotNull(userService.findByName("user1"));
        assertNotNull(userService.findByName("user2"));
    }

}
