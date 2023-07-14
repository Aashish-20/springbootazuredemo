package com.azure.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Jwtauthentication1Application {
	
	@Autowired
	private EmpRepo empRepo;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empRepo.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return empRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(Jwtauthentication1Application.class, args);
	}

}
