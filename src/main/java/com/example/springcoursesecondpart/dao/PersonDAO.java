package com.example.springcoursesecondpart.dao;

import com.example.springcoursesecondpart.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 23, "Tom@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 18, "Bob@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Mike", 42, "Mike@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Katy", 36, "Katy@mail.ru"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person) {
        Person personToUpdate = show(id);
        personToUpdate.setName(person.getName());
        personToUpdate.setAge(person.getAge());
        personToUpdate.setEmail(person.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId()==id);
    }
}
