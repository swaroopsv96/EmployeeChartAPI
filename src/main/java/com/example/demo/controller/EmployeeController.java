package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.Employeerepo;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
@Autowired	
private Employeerepo repo;

@GetMapping("/employees")
public List<Employee> getdetails()
{
	return repo.findAll();
}

@PostMapping("/employees")
public Employee createEmployee(@RequestBody Employee employee)
{
	return repo.save(employee);
}

}
