package werth.matt.SimpleSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import werth.matt.SimpleSpring.model.Person;
import werth.matt.SimpleSpring.service.PersonService;


import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/users")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/users/{id}")
    public Person getPersonByID(@PathVariable Long id) {
        return personService.getPersonByID(id);
    }

    @PostMapping("/users")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @PutMapping("/users/{id}")
    public void updatePerson(@RequestBody Person person, @PathVariable Long id) {
        personService.updatePerson(id, person);
    }

    @DeleteMapping("/users/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.removePerson(id);
    }
}
