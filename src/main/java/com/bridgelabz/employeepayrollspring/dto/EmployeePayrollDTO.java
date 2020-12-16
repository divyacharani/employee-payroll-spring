package com.bridgelabz.employeepayrollspring.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.ToString;

public @ToString class EmployeePayrollDTO {

	@NotEmpty(message = "Employee Name cannot be empty")
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee Name Invalid")
	public String name;
	
	@Min(value = 500, message = "Minimum Salary should be 500")
	public long salary;
	
	@Pattern(regexp = "male|female", message = "Gender should be male or female")
	public String gender;
	
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	@NotNull(message = "Start Date should not be Empty")
	@PastOrPresent(message = "Start Date should not be future date")
	public LocalDate startDate;
	
	@NotBlank(message = "Note cannot be Empty")
	public String note;
	
	@NotBlank(message = "ProfilePic cannot be Empty")
	public String profilePic;
	
	@NotNull(message = "Department cannot be Empty")
	public List<String> department;
	
	public EmployeePayrollDTO( String name, long salary, String gender, LocalDate startDate, String note, String profilePic, List<String> department) {
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
