package com.seerkanyilmazz;

import org.springframework.beans.factory.annotation.Value;

public class MsSqlCustomerDal implements ICustomerDal {


	@Value("${local}")
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
		//Database Test
		System.out.println("MsSQL database is added");
	}

}
