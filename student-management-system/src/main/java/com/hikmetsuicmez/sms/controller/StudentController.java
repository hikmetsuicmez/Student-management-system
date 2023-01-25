package com.hikmetsuicmez.sms.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikmetsuicmez.sms.service.StudentService;

@RestController
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	
}
