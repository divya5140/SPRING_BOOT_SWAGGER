package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Student;

public interface StudentService {

	 Student saveStudent(Student student);
	    Student getById(int studentId);

	    Student updateStudent(Student student,int studentId);

	    List<Student> getAllStudents();

	    void deleteById(int studentId);

	    Student findByStudentName(String studentName);

	    void deleteByStudentName(String studentName);

	    List<Student> findAllByStudentAge(int start,int end);

	    List<Student> findStudentByStudentNameStartingWith(String studentName);

	    List<Student> findAllStudentOrderByStudentName();

	    List<Student> findStudentNameContains(String studentName);

	    List<Student> getAllStudentPaginated(int pageNo,int pageSize);

	    List<Student> getAllStudentsAfter(String date);

	    List<Student> getAllStudentAgeGreaterThan(int age);

	    List<Student> getAllStudentByStudentNameOrAge(String studentName, int age);

	    List<Student> getAllStudentAgeIn(List<Integer> ageList);

	    List<Student> getStudentNameEnding(String studentName);

	    List<Student> getStudenNameIgnoreCase(String studentName);

}
