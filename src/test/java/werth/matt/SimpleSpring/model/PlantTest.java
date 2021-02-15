package werth.matt.SimpleSpring.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PlantTest {

    Plant plant;

    @Before
    public void setUp() throws Exception {
        plant = new Plant("Planty", "10.00, 20.00", "Cactus", LocalDate.now());
    }


    @Test
    public void getId() {
        plant.setId(1L);
        Long actual = plant.getId();
        Long expected = 1L;

        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getName() {
        String actual = plant.getName();
        String expected = "Planty";

        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getLocation() {
        String actual = plant.getLocation();
        String expected = "10.00, 20.00";

        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getPlantType() {
        String actual = plant.getPlantType();
        String expected = "Cactus";

        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getDatePlanted() {
        String actual = plant.getDatePlanted().toString();
        String expected = LocalDate.now().toString();

        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
}