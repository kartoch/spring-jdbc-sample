package fr.plil.sio.persistence.jdbc;

import fr.plil.sio.persistence.api.Group;
import fr.plil.sio.persistence.api.GroupService;
import fr.plil.sio.persistence.api.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JdbcApplication.class)
public class GroupServiceTest {

    @Autowired
    private GroupService groupService;

    @Autowired
    private UserService userService;

    @Before
    public void before() {
        groupService.create("group");
    }

    @Test
    public void testCreateGroupAndFindByName() {
        Group group = groupService.findByName("group");
        assertEquals("group", group.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateGroupFailsWhenNameNull() {
        groupService.create(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateFailsWhenSameGroupUserAlreadyPresent() {
        groupService.create("group");
    }

    public void testDeleteGroup() {
        assertTrue(groupService.delete("group"));
        assertNull(groupService.findByName("group"));
        assertFalse(groupService.delete("unknown"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteGroupFailsIfNameNull() {
        groupService.delete(null);
    }

    @Test
    public void deleteGroupDoesDeleteUsers() {
        userService.create("user1", "group");
        userService.create("user1", "group");
        assertNotNull(userService.findByName("user1"));
        assertNotNull(userService.findByName("user2"));
        groupService.delete("group");
        assertNull(userService.findByName("user1"));
        assertNull(userService.findByName("user2"));
    }

    public void testFindByNameIfUserNotFound() {
        assertNull(groupService.findByName("unknown"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByNameFailsIfNameNull() {
        groupService.findByName(null);
    }

    @Test
    public void testAddRight() {

    }

    @Test
    public void testAddRightIfAlreadyPresent() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRightFailsIfGroupNameNull() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRightFailsIfRightNull() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRightFailsIfGroupNotInDatabase() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddUserFailsIfRightNotInDatabase() {

    }

    @Test
    public void testRemoveRight() {

    }

    @Test
    public void testRemoveRightIfNotPresent() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRightFailsIfGroupNameNull() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRightFailsIfRightNull() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRightFailsIfGroupNotInDatabase() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRightFailsIfRightNotInDatabase() {

    }
}
