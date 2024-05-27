package com.exam.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exam.db.DBOperation;
import com.exam.db.MongoConn;
import com.exam.db.SQLConn;

@Configuration
public class AppConfig {

	@Bean
	@Qualifier("sql")
	public DBOperation sql() {
		return new SQLConn();
	}
	
	@Bean
	@Qualifier("mongo")
	public DBOperation mongo() {
		return new MongoConn();
	}
}
