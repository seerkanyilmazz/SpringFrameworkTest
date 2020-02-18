package com.seerkanyilmazz;

public class MsSqlCustomerDal implements ICustomerDal {

	//String Enjection
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	//Interface ýle override edilmesi gereken test metod.
	@Override
	public void add() {
		//String Enjection test
		System.out.println("Connection String: " + this.connectionString);
		
		//Database Test
		System.out.println("MsSQL database is added.");
	}

}
