package com.employeedata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeedata.entity.Employeedata;
import com.employeedata.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
    @Autowired
	private EmployeeRepository employeeRepository;
	
    public Employeedata saveEmployee(Employeedata employee) {
    	return employeeRepository.save(employee);
    }
    
    public List<Employeedata> getAllEmployees(){
    	return employeeRepository.findAll();
    }
    
    public Optional<Employeedata> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    
    public void deleteEmployee(Integer id) {
    	employeeRepository.deleteById(id);
    }
}
