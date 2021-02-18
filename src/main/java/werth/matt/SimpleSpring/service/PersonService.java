package werth.matt.SimpleSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import werth.matt.SimpleSpring.model.Person;
import werth.matt.SimpleSpring.model.Plant;
import werth.matt.SimpleSpring.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired // here when we create an instance of TreeService it is injected into TreeRepository.
    private PersonRepository personRepository;

    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    public Person getPersonByID(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

//    public void addPlantToShelf(Long id, Plant plant) {     // // TODO: 2/16/21 this method may need some work!
//        Optional<Person> foundPerson = Optional.ofNullable(getPersonByID(id));
//        foundPerson.get().getPlantShelf().put(plant.getId(), plant);
//    }

    public void updatePerson(Long id, Person person) {
        Optional<Person> foundPerson = Optional.ofNullable(getPersonByID(id));
        person.setId(foundPerson.get().getId());
        personRepository.save(person);
    }

    public void removePerson(Long id) {
        personRepository.deleteById(id);
    }

}
