package fr.plil.sio.persistence.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JdbcApplication.class)
public class RightServiceTest {

    @Test
    public void testCreateParentRightAndFindOne() {

    }

    @Test
    public void testCreateTwoParentRightsWithSameNameAndFindByName() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateFailsIfNameNull() {

    }

    @Test
    public void testCreateSiblingRightAndFindOne() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateSiblingFailsIfNameNull() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateSiblingFailsIfParentNull() {

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateSiblingFailsIfParentNotInDatabase() {

    }

    @Test
    public void testDeleteParentRight() {
    }

    @Test
    public void testDeleteSiblingRight() {
    }


    @Test
    public void testDeleteParentAndSiblingRights() {
    }

    @Test
    public void testDeleteRightIfNotFound() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteRightFailsIfRightNull() {
    }

    @Test
    public void testFindByName() {
    }

    @Test
    public void testFindSeveralByName() {
    }

    @Test
    public void testFindByNameIfNameNotFound() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByNameFailsIfNameNull() {
    }

    @Test
    public void testFindOne() {
    }

    @Test
    public void testFindOneIfIdNotFound() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindOneFailsIfIdNull() {
    }
}
