package werth.matt.SimpleSpring.repository;

import org.springframework.data.repository.CrudRepository;
import werth.matt.SimpleSpring.model.PlantData;

public interface PlantDataRepository extends CrudRepository<PlantData, Long> {
}
