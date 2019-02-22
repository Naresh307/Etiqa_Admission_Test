package com.etiqa.studentmodule.service;

import java.util.List;

import com.etiqa.studentmodule.model.Student;


public interface StudentService {

	 public List<Student> getAllStudents();
	 
	 public Student getStudentById(long id);
	 
	 public void saveOrUpdate(Student student);
	 
	 public void deleteStudent(long id);
	}