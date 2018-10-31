package com.example.Springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.example.Springbootrest"})
public class SpringBootRestApplication {

	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
