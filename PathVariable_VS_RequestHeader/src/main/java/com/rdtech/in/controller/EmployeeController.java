package com.rdtech.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.in.Model.EmployeeBean;

@RestController
public class EmployeeController {

	EmployeeBean employeeBean;
//	@GetMapping("/employee/{name}/{age}/{id}")
//	public EmployeeBean getEmployeedetails(@PathVariable String name, @PathVariable int age,@PathVariable int id)
//	{
//		employeeBean= new EmployeeBean(id,name,age);
//		return employeeBean;
//	}
	
	@GetMapping("/employee/{name}/{age}/{id}")
	public EmployeeBean getEmployeedetails(@RequestHeader String name, @RequestHeader int age,@RequestHeader int id)
	{
		employeeBean= new EmployeeBean(id,name,age);
		return employeeBean;
	}
}
