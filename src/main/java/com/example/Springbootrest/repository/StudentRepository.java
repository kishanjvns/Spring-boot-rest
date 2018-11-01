package com.example.Springbootrest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Springbootrest.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
    @Query("select s from Student s where s.id=:id")
	public Student findOne(@Param("id")  String id);
}
