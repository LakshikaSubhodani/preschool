package com.preschool.psms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.preschool.psms.entity.Student;
import com.preschool.psms.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student/students";
	}
	
	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		return "student/create_student";	
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";	
	}
	
	@GetMapping("/students/edit{std_reg_No}")
	public String editStudentDetails(@PathVariable String std_reg_No, Model model) {
		model.addAttribute("student",studentService.getStudentById(std_reg_No));
		return "student/edit_student";
		}
	
}
