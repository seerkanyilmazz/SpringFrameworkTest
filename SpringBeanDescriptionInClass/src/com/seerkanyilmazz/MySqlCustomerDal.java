package com.seerkanyilmazz;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal {


	@Value("${database.connection}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


	@Override
	public void add() {
	
		System.out.println("Connection String: " + this.connectionString);
				
		System.out.println("MySQl Database is added");
	}

}
