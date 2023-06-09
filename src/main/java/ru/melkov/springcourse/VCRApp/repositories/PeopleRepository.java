package ru.melkov.springcourse.VCRApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.melkov.springcourse.VCRApp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

    public Person findByName(String name);
}
