package com.bridgelabz.employeepayrollspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayrollSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePayrollSpringApplication.class, args);
		String environment = context.getEnvironment().getProperty("environment");
		log.info("Employee Payroll Application Started in {} Environment", environment);
		log.info("Employee Payroll Application DB User is {} ", context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
