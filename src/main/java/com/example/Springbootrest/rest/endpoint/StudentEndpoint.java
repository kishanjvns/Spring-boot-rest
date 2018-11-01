package com.example.Springbootrest.rest.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class StudentEndpoint {
	Logger log = LoggerFactory.getLogger(StudentEndpoint.class);
	@GetMapping
	public ResponseEntity<String> getStudents(){
		throw new RuntimeException();
	}
}
