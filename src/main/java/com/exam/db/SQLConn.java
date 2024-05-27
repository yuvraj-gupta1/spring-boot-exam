package com.exam.db;

import org.springframework.stereotype.Component;

@Component
public class SQLConn implements DBOperation{
	@Override
	public String getDBConnection() {
		// TODO Auto-generated method stub
		return "INSIDE SQL";
	}
}
