package com.etiqa.studentmodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.etiqa.studentmodule.model.Student;
import com.etiqa.studentmodule.service.StudentService;

@Controller
@RequestMapping(value="/student")
public class StudentController {

 @Autowired
 StudentService studentService;
 
 /* =============================== Get Student List ===============================*/
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("student_list");
  List<Student> studentList = studentService.getAllStudents();
  model.addObject("studentList", studentList);
  
  return model;
 }
 
/* ================================ Add Student =====================================*/
 
 @RequestMapping(value="/addStudent/", method=RequestMethod.GET)
 public ModelAndView addStudent() {
  ModelAndView model = new ModelAndView();
  
  Student student = new Student();
  model.addObject("studentForm", student);
  model.setViewName("student_form");
  
  return model;
 }
 
 /* ================================ Update Student ==================================*/
 
 @RequestMapping(value="/updateStudent/{id}", method=RequestMethod.GET)
 public ModelAndView editStudent(@PathVariable long id) {
  ModelAndView model = new ModelAndView();
  
  Student student = studentService.getStudentById(id);
  model.addObject("studentForm", student);
  model.setViewName("student_form");
  
  return model;
 }
 
 @RequestMapping(value="/saveStudent", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("studentForm") Student student) {
	 studentService.saveOrUpdate(student);
  
  return new ModelAndView("redirect:/student/list");
 }
 
 /* =============================== Delete Student ====================================*/
 
 @RequestMapping(value="/deleteStudent/{id}", method=RequestMethod.GET)
 public ModelAndView delete(@PathVariable("id") long id) {
	 studentService.deleteStudent(id);
  
  return new ModelAndView("redirect:/student/list");
 }
}