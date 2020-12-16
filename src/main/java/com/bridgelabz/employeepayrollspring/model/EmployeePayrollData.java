package com.bridgelabz.employeepayrollspring.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.CollectionTable;
import javax.persistence.JoinColumn;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name="employee_payroll")
public @Data class EmployeePayrollData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "name")
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	
	@ElementCollection
	@CollectionTable(name="employee_department", joinColumns = @JoinColumn(name="id"))
	@Column(name = "department")
	private List<String> department;
	
	
	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO empDTO) {
		this(empDTO);
		this.employeeId = employeeId;
	}
	
	public EmployeePayrollData(EmployeePayrollDTO empDTO) {
		this.name = empDTO.name;
		this.salary = empDTO.salary;
		this.gender = empDTO.gender;
		this.startDate = empDTO.startDate;
		this.note = empDTO.note;
		this.profilePic = empDTO.profilePic;
		this.department = empDTO.department;
	}
	
}
