package werth.matt.SimpleSpring.repository;

import org.springframework.data.repository.CrudRepository;
import werth.matt.SimpleSpring.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
