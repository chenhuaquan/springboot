package com.bigdata.simpleneo4j;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import com.bigdata.simpleneo4j.bean.Person;

@SpringBootApplication
@EnableNeo4jRepositories
public class SimpleNeo4jApplication {

    private final static Logger log = LoggerFactory.getLogger(SimpleNeo4jApplication.class);
    
	public static void main(String[] args) {
		SpringApplication.run(SimpleNeo4jApplication.class, args);
		System.exit(0);
	}

	   @Bean
	    CommandLineRunner demo(PersonRepository personRepository) {
	       return args -> {
	           log.info("commander runner：" + personRepository);
	           
	            personRepository.deleteAll();

	            Person greg = new Person("Greg");
	            Person roy = new Person("Roy");
	            Person craig = new Person("Craig");	 
	            Person garden = new Person("Garden");     
                
	            
	            List<Person> team = Arrays.asList(greg, roy, craig);
	            log.info("Before linking up with Neo4j...");
	            
	            team.stream().forEach(person -> log.info("\t" + person.toString()));
	            
	            personRepository.save(greg);
	            personRepository.save(roy);
	            personRepository.save(craig);
                personRepository.save(garden);
	            

	            greg = personRepository.findByName(greg.getName());
	            greg.worksWith(roy);
	            greg.worksWith(craig);
	            personRepository.save(greg);
	            
	            craig = personRepository.findByName(craig.getName());
	            craig.worksWith(garden);
	            personRepository.save(craig);
	            
	            
	            team.stream().forEach(person -> log.info("\t" + person.toString()));
	            
	       };
	   }
	     
}
