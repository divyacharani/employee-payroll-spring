package com.bridgelabz.employeepayrollspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollspring.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollspring.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
	
	private List<EmployeePayrollData> empPayrollList = new ArrayList<>();

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return empPayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return empPayrollList.stream().filter(empData -> empData.getEmployeeId()==empId)
				.findFirst()
				.orElseThrow(() -> new EmployeePayrollException("Employee Not Found"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeeData = new EmployeePayrollData(empPayrollList.size()+1, employeePayrollDTO);
		empPayrollList.add(employeeData);
		return employeeData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeeData = this.getEmployeePayrollDataById(empId);
		employeeData.setName(employeePayrollDTO.name);
		employeeData.setSalary(employeePayrollDTO.salary);
		employeeData.setGender(employeePayrollDTO.gender);
		employeeData.setNote(employeePayrollDTO.note);
		employeeData.setProfilePic(employeePayrollDTO.profilePic);
		employeeData.setStartDate(employeePayrollDTO.startDate);
		employeeData.setDepartment(employeePayrollDTO.department);
		empPayrollList.set(empId-1, employeeData);
		return employeeData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		EmployeePayrollData employeeData = this.getEmployeePayrollDataById(empId);
		empPayrollList.remove(employeeData);
	}

}
