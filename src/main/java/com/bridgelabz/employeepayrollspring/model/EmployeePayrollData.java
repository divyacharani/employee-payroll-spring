package com.bridgelabz.employeepayrollspring.model;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;

public class EmployeePayrollData {

	private int employeeId;
	private String name;
	private long salary;
	
	
	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO empDTO) {
		this.employeeId = employeeId;
		this.name = empDTO.getName();
		this.salary = empDTO.getSalary();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	
}
