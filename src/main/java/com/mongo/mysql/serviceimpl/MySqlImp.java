package com.mongo.mysql.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.mysql.model.Employee;
import com.mongo.mysql.repo.MySqlRepo;
import com.mongo.mysql.service.Mysqlinter;

@Service
public class MySqlImp implements Mysqlinter {
	
	@Autowired
	private MySqlRepo mySqlRepo;
	
	@Override
	public List<Employee> getAll() {
		return  (List<Employee>) mySqlRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		mySqlRepo.save(employee);
		return employee;
	}

}
