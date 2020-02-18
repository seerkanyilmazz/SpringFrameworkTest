package com.seerkanyilmazz;

public class MySqlCustomerDal implements ICustomerDal {

	//String Enjection test
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
		
		System.out.println("Email: " + this.connectionString);
		//Database test
		System.out.println("MySQl Database is added");
	}

}
