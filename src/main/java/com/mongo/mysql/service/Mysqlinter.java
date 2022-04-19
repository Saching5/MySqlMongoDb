package com.mongo.mysql.service;

import java.util.List;

import com.mongo.mysql.model.Employee;

public interface Mysqlinter {

	public List<Employee>getAll();
	
	public Employee addEmployee(Employee employee);
}
