package werth.matt.SimpleSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import werth.matt.SimpleSpring.model.Plant;
import werth.matt.SimpleSpring.model.PlantData;
import werth.matt.SimpleSpring.service.PlantDataService;
import werth.matt.SimpleSpring.service.PlantService;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PlantDataController {
    @Autowired
    private PlantDataService plantService; //for dependency injection

    @GetMapping("/plant")
    public List<PlantData> getPlants() {
        return plantService.getPlants();
    }

    @GetMapping("/plant/{id}")
    public PlantData getPlantByID(@PathVariable Long id) {
        return plantService.getPlantByID(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/plant")
    public void addPlant(@RequestBody PlantData plant) {
        plantService.addPlant(plant);
    }

    @PutMapping("/plant/{id}")
    public void updatePlant(@RequestBody PlantData plant, @PathVariable Long id) {
        plantService.updatePlant(id, plant);
    }

    @DeleteMapping("/plant/{id}")
    public void deletePlant(@PathVariable Long id) {
        plantService.removePlant(id);
    }
}
