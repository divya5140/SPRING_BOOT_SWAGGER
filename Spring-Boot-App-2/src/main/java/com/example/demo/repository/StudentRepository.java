package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
	 Student findStudentByStudentName(String studentName);

	    void removeStudentByStudentName(String studentName);

	    List<Student> findAllByStudentAgeBetween(int start, int end);

	    List<Student> findStudentByStudentNameIsStartingWith(String studentName);

	    List<Student> findByStudentNameContains(String studentName);

	    List<Student> findStudentByOrderByStudentName();

	    List<Student> findByStudentNameOrStudentAge(String name,int age);

	    List<Student> findAllByAdmissionDateAfter(Date date);

	    List<Student> findStudentByStudentAgeGreaterThan(int age);

	    List<Student> findStudentByStudentAgeIn(List<Integer> age);

	    List<Student> findStudentByStudentNameEndingWith(String studentName);

	    List<Student> findByStudentNameIgnoreCase(String studentName);
	}


