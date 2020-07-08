package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.AppService;

@RestController
public class MyRestApp {
 
	@Autowired
	private AppService service;  
	@GetMapping("/hello")
	public String sayHello(){
		
	return "welcome to my app";	
	}
	
	
	@PostMapping("/feedback")
	public String userFeedback(@RequestParam ("empname")String empname,@RequestParam ("email")String email,@RequestParam ("comp")String comp,@RequestParam ("country")String country,@RequestParam ("comments") String comments){
		Employee e = new Employee(empname,email,comp,country, comments);
			boolean data = service.addUser(e);
			
			if(data){
			return "Feedback Submitted Successfully";
			}
			else{
			return "Feedback could not be Added";
	}
	}
}
