package com.bridgelabz.employeepayrollspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollspring.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Mark", 20000)));
		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData employeeData = new EmployeePayrollData(1, new EmployeePayrollDTO("Mark", 20000));
		return employeeData;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeeData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeeData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeeData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeeData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		
	}
	
	

}
