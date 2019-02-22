package com.etiqa.studentmodule.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiqa.studentmodule.model.Student;
import com.etiqa.studentmodule.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}

}