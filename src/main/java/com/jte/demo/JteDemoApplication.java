package com.jte.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(ResourceRuntimeHints.class)
public class JteDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JteDemoApplication.class, args);
	}

}
