package werth.matt.SimpleSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import werth.matt.SimpleSpring.model.Plant;
import werth.matt.SimpleSpring.repository.PlantRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired // here when we create an instance of TreeService it is injected into TreeRepository.
    private PlantRepository plantRepository;

        LocalDate localDate = LocalDate.of(2015, 3, 2);

        private List<Plant> plants = new ArrayList<>(Arrays.asList(
                new Plant("Teddy", "41.40338, 2.17403",  "Cactus", LocalDate.of(2015, 3, 2)),
                new Plant("Martha", "41.40338, 2.17403", "Tree",  LocalDate.of(2015, 3, 2))
        ));

        public List<Plant> getPlants() {
            List<Plant> plants = new ArrayList<>();
            plantRepository.findAll().forEach(plants::add);
            return plants;
        }

        public Plant getPlantByID(Long id) {
            return plantRepository.findById(id).orElse(null);
        }

        public void addPlant(Plant plant) {
            plantRepository.save(plant);
        }

        public void updatePlant(Long id, Plant plant) {
            Optional<Plant> foundPlant = Optional.ofNullable(getPlantByID(id));
            plant.setId(foundPlant.get().getId());
            plantRepository.save(plant);
        }

        public void removePlant(Long id) {
            plantRepository.deleteById(id);
        }

}
