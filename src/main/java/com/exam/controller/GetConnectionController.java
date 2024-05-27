package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.db.DBOperation;
import com.exam.db.SQLConn;

@RestController
public class GetConnectionController {
	
	@Autowired
	@Qualifier("mongo")
	private DBOperation dbOperation;
	
	
	@GetMapping("/getConnection")
	String getConnection() {
		return dbOperation.getDBConnection();
	}
	
}
