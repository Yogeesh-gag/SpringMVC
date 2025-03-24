package com.jsp.spring_mvc_studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc_studentdb.entity.Student;
import com.jsp.spring_mvc_studentdb.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path="/add-student" , method = RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		studentService.addStudent(student);

		ModelAndView mv=new ModelAndView();		
		mv.setViewName("redirect:/index.jsp");
		return mv;
		
	}
	@RequestMapping(path = "/displayAllStudents",method = RequestMethod.GET)
	public ModelAndView displayStudents() {
		return studentService.displayAllStudents();
	}
	@RequestMapping(path = "/find-student-by-id",method = RequestMethod.GET)
	public ModelAndView findStudentById(@RequestParam int studentId) {
		return studentService.findStudentById(studentId);
	}
	@RequestMapping(path = "/delete-student-by-id",method = RequestMethod.GET)
	public ModelAndView deleteStudentById(@RequestParam int studentId) {
		return studentService.deleteStudentById(studentId);
	}
	@RequestMapping(path = "/save-update-student",method = RequestMethod.POST)
	public ModelAndView updateStudent(Student student) {
		return studentService.updateStudent(student);
	}

}
