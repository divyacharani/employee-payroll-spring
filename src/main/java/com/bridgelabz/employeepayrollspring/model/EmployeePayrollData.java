package com.bridgelabz.employeepayrollspring.model;

import java.time.LocalDate;
import java.util.List;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;

import lombok.Data;

public @Data class EmployeePayrollData {

	private int employeeId;
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	private List<String> department;
	
	
	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO empDTO) {
		this.employeeId = employeeId;
		this.name = empDTO.name;
		this.salary = empDTO.salary;
		this.gender = empDTO.gender;
		this.startDate = empDTO.startDate;
		this.note = empDTO.note;
		this.profilePic = empDTO.profilePic;
		this.department = empDTO.department;
	}
	
}
