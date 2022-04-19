package com.mongo.mysql.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.mysql.model.Emp;


public interface MongoRepo extends MongoRepository<Emp, Long> {

	
}
