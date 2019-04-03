package com.sanl.agenda.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Back4gendaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Back4gendaApiApplication.class, args);
	}
}
