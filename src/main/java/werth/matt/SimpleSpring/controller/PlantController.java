package werth.matt.SimpleSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import werth.matt.SimpleSpring.model.Plant;
import werth.matt.SimpleSpring.service.PlantService;


import java.util.List;

@RestController
public class PlantController {

    @Autowired
    private PlantService plantService; //for dependency injection

    @GetMapping("/plants")
    public List<Plant> getPlants() {
        return plantService.getPlants();
    }

    @GetMapping("/plants/{id}")
    public Plant getPlantByID(@PathVariable Long id) {
        return plantService.getPlantByID(id);
    }

    @PostMapping("/plants")
    public void addPlant(@RequestBody Plant plant) {
        plantService.addPlant(plant);
    }

    @PutMapping("/plants/{id}")
    public void updatePlant(@RequestBody Plant plant, @PathVariable Long id) {
        plantService.updatePlant(id, plant);
    }

    @DeleteMapping("/plants/{id}")
    public void deletePlant(@PathVariable Long id) {
        plantService.removePlant(id);
    }
}
