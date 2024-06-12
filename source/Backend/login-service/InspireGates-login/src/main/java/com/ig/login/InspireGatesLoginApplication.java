package com.ig.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ig.login"})
public class InspireGatesLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(InspireGatesLoginApplication.class, args);
	}

}
