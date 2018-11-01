package com.example.Springbootrest.rest.endpoint;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springbootrest.model.Student;
import com.example.Springbootrest.rest.exception.RecordCreationException;
import com.example.Springbootrest.rest.exception.StudentNotFoundException;
import com.example.Springbootrest.service.StudentService;

@RestController
@RequestMapping("v1")
public class StudentEndpoint {
	Logger log = LoggerFactory.getLogger(StudentEndpoint.class);
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET,value="/{id}",produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Student> getStudents(@PathVariable("id")String id){
		Student student=studentService.findById(id);
		if(student==null)
			throw new StudentNotFoundException();
		return  ResponseEntity.ok(student);
	}
	
	@RequestMapping(method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){
		student=studentService.saveStudent(student);
		if("".equalsIgnoreCase(student.getId()) || null==student.getId())
			throw new RecordCreationException();
		return  ResponseEntity.ok(student);
	}
}
