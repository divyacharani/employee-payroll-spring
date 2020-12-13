package com.bridgelabz.employeepayrollspring;

import java.util.logging.LogRecord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayrollSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollSpringApplication.class, args);
		log.info("Employee Payroll Application Started");
	}

}
