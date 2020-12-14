package com.bridgelabz.employeepayrollspring.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class EmployeePayrollDTO {

	@NotEmpty(message = "Employee Name cannot be empty")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Invalid")
	private String name;
	
	@Min(value = 500, message = "Minimum Salary should be 500")
	private long salary;
	private String gender;
	private String startDate;
	private String note;
	private String profilePic;
	private List<String> department;
	public EmployeePayrollDTO( String name, long salary, String gender, String startDate, String note, String profilePic, List<String> department) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.startDate = startDate;
		this.note = note;
		this.profilePic = profilePic;
		this.department = department;
	}
	
	
}
