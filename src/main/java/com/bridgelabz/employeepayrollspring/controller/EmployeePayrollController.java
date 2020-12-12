package com.bridgelabz.employeepayrollspring.controller;

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

@RestController
@RequestMapping("/employeePayroll")
public class EmployeePayrollController {
	
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		EmployeePayrollData employeeData = new EmployeePayrollData(1, new EmployeePayrollDTO("Mark", 20000));
		ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", employeeData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		EmployeePayrollData employeeData = new EmployeePayrollData(1, new EmployeePayrollDTO("Mark", 20000));
		ResponseDTO responseDTO = new ResponseDTO("Get Call for ID Successful", employeeData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeeData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data Successfully ", employeeData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeeData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data Successfully ", employeeData);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted id: "+empId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}

}
