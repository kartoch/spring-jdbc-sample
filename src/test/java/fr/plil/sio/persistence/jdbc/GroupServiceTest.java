package fr.plil.sio.persistence.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JdbcApplication.class)
public class GroupServiceTest {

    @Test
    public void testCreateGroupAndFindByName() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateGroupFailsWhenNameNull() {
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateFailsWhenSameGroupUserAlreadyPresent() {
    }

    public void testDeleteGroup() {
    }

    public void testDeleteGroupIfNotFound() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteGroupFailsIfNameNull() {
    }

    @Test
    public void deleteGroupDoesDeleteUsers() {
    }

    public void testFindByNameIfUserNotFound() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByNameFailsIfNameNull() {
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


    /**
     * Remove a right associated with a group.
     *
     * @param groupName the name of the group.
     * @param right     the right to remove
     * @return true if right is removed from the group, false if teh right was not present in the group.
     * @throws IllegalArgumentException if groupName or right is null, or if group or right cannot be found.
     */

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
