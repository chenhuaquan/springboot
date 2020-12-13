package com.bigdata.simplebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBatchApplication.class, args);
		
		System.exit(SpringApplication.exit(SpringApplication.run(SimpleBatchApplication.class, args)));
	}

}
