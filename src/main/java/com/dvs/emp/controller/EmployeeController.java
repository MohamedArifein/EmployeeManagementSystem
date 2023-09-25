package com.dvs.emp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvs.emp.pojo.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/emp")
	public List<Employee> getEmployee() {
		List<Employee> list = List.of(new Employee(1, "Emp A", 28),new Employee(2, "Emp B", 30),new Employee(3, "Emp C", 35));
		return list;
	}
}
