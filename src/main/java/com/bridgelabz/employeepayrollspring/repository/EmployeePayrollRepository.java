package com.bridgelabz.employeepayrollspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.employeepayrollspring.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer>{

}
