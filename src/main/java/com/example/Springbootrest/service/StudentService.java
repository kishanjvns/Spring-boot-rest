package com.example.Springbootrest.service;

import com.example.Springbootrest.model.Student;

public interface StudentService {
	public Student findById(String id);
	public Student saveStudent(Student student);
}
