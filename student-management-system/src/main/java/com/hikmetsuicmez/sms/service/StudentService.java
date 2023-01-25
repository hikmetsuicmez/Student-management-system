package com.hikmetsuicmez.sms.service;

import java.util.List;

import com.hikmetsuicmez.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
}
