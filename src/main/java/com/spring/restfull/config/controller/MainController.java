package com.spring.restfull.config.controller;


import com.spring.restfull.model.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainController {
	
	private List<Student> liste = new ArrayList<Student>();
	
	@GetMapping(value = "/sport")
	public String getMain() {
		return "HI My Sport...";
	}
	
	@PostConstruct
	public void start() {
		
		Student st1 = new Student(1, "Rachid", "0101010101");
		Student st2 = new Student(2, "Amel",   "0202020202");
		Student st3 = new Student(3, "ASSIA",  "0030303030");
		Student st4 = new Student(4, "Aya",    "0404040404");
		Student st5 = new Student(5, "Zouz",   "0505050505");
		 liste.add(st1);liste.add(st2);
		 liste.add(st3); liste.add(st4); liste.add(st5);
		
	}

	@GetMapping(value = "/students")
	public List<Student> getStudents(){
		 return liste;
	}
	
	@GetMapping(value= "/getStudent/{id}")
	public Student getStudentById(@PathVariable("id") int id) { 
		 return liste.get(id - 1);
	}
}
