package com.mongo.mysql.repo;

import org.springframework.data.repository.CrudRepository;

import com.mongo.mysql.model.Employee;


public interface MySqlRepo extends CrudRepository<Employee, Long> {
	
}
