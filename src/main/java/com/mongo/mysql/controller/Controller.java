package com.mongo.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.mysql.model.Employee;
import com.mongo.mysql.serviceimpl.MySqlImp;

@RestController
public class Controller {

	@Autowired
	private MySqlImp mySqlImp;
	
	
	@GetMapping("/employee")
	public List<Employee> findAlll() {
		return mySqlImp.getAll();
	}
	
	@PostMapping("/emp")
	public Employee addEmployee(@RequestBody() Employee employee) {
		return (mySqlImp.addEmployee(employee));
		
	}
}
