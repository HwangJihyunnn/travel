package com.demo.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Travel2Application {

	public static void main(String[] args) {
		SpringApplication.run(Travel2Application.class, args);
	}

}