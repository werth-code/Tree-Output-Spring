package werth.matt.SimpleSpring.model;

import java.util.HashMap;
import java.util.Map;

public class PlantShelf {
    private Map<Long, Plant> plants;

    PlantShelf() {
        plants = new HashMap<>();
    }

    public Map<Long, Plant> getPlantShelf() {
        return plants;
    }

    public void setPlantShelf(Map<Long, Plant> plants) {
        this.plants = plants;
    }
}
