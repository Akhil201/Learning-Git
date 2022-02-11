package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		
		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		
		return employeesList;
    }
	@GetMapping("/")
    public List<Employee> addEmployee() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		
		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		
		return employeesList;
    }
}
