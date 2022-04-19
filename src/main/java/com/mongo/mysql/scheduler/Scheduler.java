package com.mongo.mysql.scheduler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mongo.mysql.model.Emp;
import com.mongo.mysql.model.Employee;
import com.mongo.mysql.repo.MongoRepo;
//import com.mongo.mysql.repo.MongoRepo;
import com.mongo.mysql.repo.MySqlRepo;

@Component
public class Scheduler {

//	@Autowired
//	private Servicess ss;
//	
	@Autowired
	private MongoRepo mongoRepo;

	@Autowired
	private MySqlRepo mySqlRepo;
//	
//	
	Emp emp;

	@Scheduled(cron = "0 * * ? * *")
	public void getRecordsDetails() {
//		List<Employee> findAll = (List<Employee>) mySqlRepo.findAll();
		List<Employee> findAll = (List<Employee>) mySqlRepo.findAll();
		for (Employee e : findAll) {
			System.err.println(e.toString());
//			emp.setId(e.getId());
//			emp.setName(e.getName());
			emp = (Emp) Obj.objectMapper(e);

			mongoRepo.save(emp);
		}

//	@Scheduled(cron = "*/15 * * * * *")
//	public void getRecords() {
//		List<Employee> findAll = (List<Employee>) ss.findAll();
//
//		for(Employee e:findAll) {
//			System.out.println(e.toString());
//			
//			ss.save(e);
//		}
//	}

	}
}
