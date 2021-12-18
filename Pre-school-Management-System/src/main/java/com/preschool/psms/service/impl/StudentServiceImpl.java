package com.preschool.psms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.preschool.psms.entity.Student;
import com.preschool.psms.repository.StudentRepository;
import com.preschool.psms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
		
	}

	@Override
	public Student getStudentById(String std_reg_No) {
		// TODO Auto-generated method stub
		return studentRepository.findById(std_reg_No).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}








}
