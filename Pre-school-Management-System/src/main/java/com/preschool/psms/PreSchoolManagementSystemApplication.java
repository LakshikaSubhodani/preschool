package com.preschool.psms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.preschool.psms.entity.Student;
import com.preschool.psms.repository.StudentRepository;

@SpringBootApplication
public class PreSchoolManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PreSchoolManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1=new Student();
		studentRepository.save(student1);
		*/
	}
	
	//any one can remove this comment only for testing
	//test egit anyone can delete
	
}
