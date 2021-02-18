package werth.matt.SimpleSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import werth.matt.SimpleSpring.model.PlantData;
import werth.matt.SimpleSpring.repository.PlantDataRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlantDataService {
    @Autowired // here when we create an instance of TreeService it is injected into TreeRepository.
    private PlantDataRepository plantRepository;

    public List<PlantData> getPlants() {
        List<PlantData> plants = new ArrayList<>();
        plantRepository.findAll().forEach(plants::add);
        return plants;
    }

    public PlantData getPlantByID(Long id) {
        return plantRepository.findById(id).orElse(null);
    }

    public void addPlant(PlantData plant) {
        plantRepository.save(plant);
    }

    public void updatePlant(Long id, PlantData plant) {
        Optional<PlantData> foundPlant = Optional.ofNullable(getPlantByID(id));
        plant.setId(foundPlant.get().getId());
        plantRepository.save(plant);
    }

    public void removePlant(Long id) {
        plantRepository.deleteById(id);
    }
}
