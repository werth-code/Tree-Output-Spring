package werth.matt.SimpleSpring.repository;

import org.springframework.data.repository.CrudRepository;
import werth.matt.SimpleSpring.model.Plant;
import werth.matt.SimpleSpring.model.Tree;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
