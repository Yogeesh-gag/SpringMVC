package com.jsp.spring_mvc_studentdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc_studentdb.entity.Student;
import com.jsp.spring_mvc_studentdb.repository.StudentRepository;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public ModelAndView addStudent(Student student) {
		// Saving the Student object into the database
		studentRepository.addProduct(student);
		
		/*
		 * ModelAndView mav=new ModelAndView(); mav.setViewName("index.jsp"); return mav;
		 * 
		 */
		return new ModelAndView("index.jsp");
		
	}

	public ModelAndView displayAllStudents() {
	
		//Fetching Students Details From Database
		List<Student> students=studentRepository.findAllStudents();
		
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("DisplayAllStudents.jsp");
//		mav.addObject("studentList",students);	
		return new ModelAndView("DisplayAllStudents.jsp").addObject("studentList",students);
	}
	
	public ModelAndView findStudentById(int studentId) {
		Student student=studentRepository.findStudentById(studentId);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UpdateStudent.jsp");
		mav.addObject("studentObject",student);
		
		return mav;
	}

	public ModelAndView updateStudent(Student student) {
		//update the Student record in the database
		studentRepository.updateStudent(student);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:displayAllStudents");
		return mav;
	}

	public ModelAndView deleteStudentById(int studentId) {
		studentRepository.deleteStudentById(studentId);
		
		return new ModelAndView("redirect:displayAllStudents");
	}
}
