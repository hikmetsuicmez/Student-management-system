package com.hikmetsuicmez.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hikmetsuicmez.sms.entity.Student;
import com.hikmetsuicmez.sms.repository.StudentRepository;
import com.hikmetsuicmez.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return this.studentRepository.save(student);
	}

}
