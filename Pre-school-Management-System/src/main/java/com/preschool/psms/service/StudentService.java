package com.preschool.psms.service;

import java.util.List;

import org.springframework.ui.Model;

import com.preschool.psms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(String std_reg_No);
	
	Student updateStudent(Student student);
	
	

	
	

}



