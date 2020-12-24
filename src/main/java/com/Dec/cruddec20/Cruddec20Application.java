package com.Dec.cruddec20;

import com.Dec.cruddec20.controller.UsersController;
import com.Dec.cruddec20.repository.UsersJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Cruddec20Application {

	public static void main(String[] args) {
		SpringApplication.run(Cruddec20Application.class, args);
	}

}
