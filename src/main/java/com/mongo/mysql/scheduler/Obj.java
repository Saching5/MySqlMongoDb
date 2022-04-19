package com.mongo.mysql.scheduler;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongo.mysql.model.Emp;

public class Obj {
	public static Object objectMapper(Object object) {

		ObjectMapper mapper = new ObjectMapper();
		// mapper.disable DeserializationFeature means what we are suggesting to map
		// thats only gets mapped...
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);//
		Emp emp = mapper.convertValue(object, Emp.class);

		return emp;
	}
}
