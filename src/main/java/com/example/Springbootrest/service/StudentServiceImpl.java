package com.example.Springbootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springbootrest.model.Student;
import com.example.Springbootrest.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student findById(String id) {
		return studentRepository.findOne(id);
	}
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
