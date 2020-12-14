package com.bridgelabz.employeepayrollspring.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

	@NotEmpty(message = "Employee Name cannot be empty")
	@Pattern(regexp = "^[A-Z]{1}[a-zAZ\\s]{2,}$", message = "Employee Name Invalid")
	private String name;
	
	@Min(value = 500, message = "Minimum Salary should be 500")
	private long salary;
	
	public EmployeePayrollDTO(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
