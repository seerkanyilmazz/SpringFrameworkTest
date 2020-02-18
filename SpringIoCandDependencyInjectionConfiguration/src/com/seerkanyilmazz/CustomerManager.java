package com.seerkanyilmazz;

public class CustomerManager implements ICustomerService {
	
	//Private olusturulan ICustomer Type'l� value'nin contructor'unun olusturulmas�.
	private ICustomerDal customerDal;
	
	//constructor
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
	}
}
