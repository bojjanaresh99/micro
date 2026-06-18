package com.employeedata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeedata.entity.Employeedata;

@Repository
public interface EmployeeRepository extends JpaRepository<Employeedata, Integer> {

}
