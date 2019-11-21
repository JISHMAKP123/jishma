package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.beans.Student;
import com.example.demo.repository.StudentRepo;



@Controller

public class StudentController {
	
		@Autowired
		private StudentRepo repo;
		@GetMapping("/student")
		public String showPage() {
			return "home";
		}
		@PostMapping("student/insert")
		public String goToSuccess(Student student,Model model) {
			System.out.print(student.getUsername());
			System.out.println(student.getPassword());
			model.addAttribute("name",student.getUsername());
			repo.save(student);
			System.out.print("inserted");
			return "success";
		}
		@GetMapping("allstudent/view")
		public String allView(Model model) {
			List<Student> studentList=new ArrayList<Student>();
			studentList=repo.findByName("jishma");
			model.addAttribute("studentList", studentList);
			return "view";
		}
		
	}


