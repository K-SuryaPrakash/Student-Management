package com.example.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.crud.model.Student;
import com.example.crud.service.StudentService;



@Controller
public class StudentController {
	@Autowired
	StudentService ob1;
	@GetMapping("/insert")
	public String get(){
		return "index";
	}
	@PostMapping("abc")
	public String get1(Student ob2){
		ob1.savefile(ob2);
		return "success";
	}
	@GetMapping("/select")
	public String get2(Model m)
	{
		m.addAttribute("abcd", ob1.get());
		return "select";
	}
	@GetMapping("/delete/{id}")
	public String get3(@PathVariable int id)
	{
		ob1.get2(id);
		return "view";
	}
	@GetMapping("/part/{id}")
	public String get4(@PathVariable int id,Model m) {
		Optional<Student> p=ob1.get3(id);
				if(p.isPresent())
				{
					m.addAttribute("abcd", p.get());
					return "view";
				}
				else
				{
					return "error";
				}
	}
	

}
