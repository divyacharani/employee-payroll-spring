package com.bridgelabz.employeepayrollspring.dto;

public class EmployeePayrollDTO {

	private String name;
	private long salary;
	
	public EmployeePayrollDTO(String name, long salary) {
		super();
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
