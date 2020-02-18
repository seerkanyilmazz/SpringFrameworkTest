package com.seerkanyilmazz;

//import org.springframework.stereotype.Component;
//
//@Component("database")
public class MySqlCustomerDal implements ICustomerDal {


	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
	

		System.out.println("MySQl Database is added");
	}

}
