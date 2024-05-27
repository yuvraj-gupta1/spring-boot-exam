package com.exam.db;

import org.springframework.stereotype.Component;

@Component
public class MongoConn implements DBOperation{
	@Override
	public String getDBConnection() {
		// TODO Auto-generated method stub
		return "INSIDE MONGO";
	}
}
