package com.bridgelabz.employeepayrollspring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollspring.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollspring.dto.ResponseDTO;
import com.bridgelabz.employeepayrollspring.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollspring.service.IEmployeePayrollService;

@RestController
@RequestMapping("/employeePayroll")
public class EmployeePayrollController {
	
	@Autowired
	private IEmployeePayrollService employeePayrollService;
	
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		List<EmployeePayrollData> empDataList = employeePayrollService.getEmployeePayrollData();
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", empDataList);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollDataById(@PathVariable("empId") int empId){
		EmployeePayrollData employeeData = employeePayrollService.getEmployeePayrollDataById(empId);
		ResponseDTO responseDTO = new ResponseDTO("Get Call for ID Successful", employeeData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid @RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeeData = employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data Successfully ", employeeData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId, @Valid @RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeeData = employeePayrollService.updateEmployeePayrollData(empId, employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data Successfully ", employeeData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		employeePayrollService.deleteEmployeePayrollData(empId);
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted id: "+empId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

}
