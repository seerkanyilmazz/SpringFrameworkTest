package com.seerkanyilmazz;

public class OracleCustomerDal implements ICustomerDal {
	
	//String enjection test
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	//Test method
	public void add() {
		
		//String enjection test
		System.out.println("Connection String: " + this.connectionString);
		
		//Database test
		System.out.println("Oracle Database is added");
	}
}
