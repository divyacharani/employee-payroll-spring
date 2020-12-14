package com.bridgelabz.employeepayrollspring.model;

import java.util.List;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;

import lombok.Data;

public @Data class EmployeePayrollData {

	private int employeeId;
	private String name;
	private long salary;
	private String gender;
	private String startDate;
	private String note;
	private String profilePic;
	private List<String> department;
	
	
	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO empDTO) {
		this.employeeId = employeeId;
		this.name = empDTO.getName();
		this.salary = empDTO.getSalary();
		this.gender = empDTO.getGender();
		this.startDate = empDTO.getStartDate();
		this.note = empDTO.getNote();
		this.profilePic = empDTO.getProfilePic();
		this.department = empDTO.getDepartment();
	}
	
}
