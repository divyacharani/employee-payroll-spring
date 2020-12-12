package com.bridgelabz.employeepayrollspring.service;

import java.util.List;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollspring.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	
	List<EmployeePayrollData> getEmployeePayrollData();
	
	EmployeePayrollData getEmployeePayrollDataById(int empId);
	
	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
	
	EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
	
	void deleteEmployeePayrollData(int empId);
}
