package werth.matt.SimpleSpring.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person;
    Plant plant;

    @Before
    public void setUp() throws Exception {
        plant = new Plant();
        person = new Person("Matt", "Werth", "matthewwerth@gmail.com");
    }


    @Test
    public void getId() {
        person.setId(1L);
        Long actual = person.getId();
        Long expected = 1L;

        System.out.println(actual);
        Assert.assertEquals("Test Set/Get ID", actual, expected);
    }

    @Test
    public void getFirstName() {
        String actual = person.getFirstName();
        String expected = "Matt";

        System.out.println(actual);
        Assert.assertEquals("Test Set/Get firstName", actual, expected);
    }


    @Test
    public void getLastName() {
        String actual = person.getLastName();
        String expected = "Werth";

        System.out.println(actual);
        Assert.assertEquals("Test Set/Get lastName", actual, expected);
    }


    @Test
    public void getEmail() {
        String actual = person.getEmail();
        String expected = "matthewwerth@gmail.com";

        System.out.println(actual);
        Assert.assertEquals("Test Set/Get email", actual, expected);
    }


    @Test
    public void getPlantShelf() {
        person.getPlantShelf().put(1L, plant);
        String actual = person.getPlantShelf().get(1L).toString();
        String expected = plant.toString();

        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

}