package com.bridgelabz.employeepayrollspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollspring.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollspring.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollspring.repository.EmployeePayrollRepository;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
	
	@Autowired
	private EmployeePayrollRepository employeePayrollRepository;


	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return employeePayrollRepository.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return employeePayrollRepository.findById(empId)
										.orElseThrow(() -> new EmployeePayrollException("Employee with employeeId "+empId+" does not exists!"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeeData = new EmployeePayrollData(employeePayrollDTO);
		return employeePayrollRepository.save(employeeData);
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
		return employeePayrollRepository.save(employeeData);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		EmployeePayrollData employeeData = this.getEmployeePayrollDataById(empId);
		employeePayrollRepository.delete(employeeData);
	}

}
