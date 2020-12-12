package com.bigdata.simpleneo4j;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.bigdata.simpleneo4j.bean.Person;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
    Person findByName(String name);
    List<Person> findByTeammatesName(String name);
}
