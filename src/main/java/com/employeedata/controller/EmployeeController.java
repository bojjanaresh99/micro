package com.employeedata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeedata.entity.Employeedata;
import com.employeedata.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addemployee")
	public Employeedata saveEmployees(@RequestBody Employeedata employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/Allemployees")
	public List<Employeedata> Allemployees(){
		return employeeService.getAllEmployees();
	}
	
	 @GetMapping("/get/{id}")
	    public Optional<Employeedata> getEmployeeById(@PathVariable Integer id) {
	        return employeeService.getEmployeeById(id);
	    }
	
	  // Delete Employee
	    @DeleteMapping("/delete/{id}") 
	    public String deleteEmployee(@PathVariable Integer id) {

	        employeeService.deleteEmployee(id); 

	        return "Employee Deleted Successfully";
	    }
}
