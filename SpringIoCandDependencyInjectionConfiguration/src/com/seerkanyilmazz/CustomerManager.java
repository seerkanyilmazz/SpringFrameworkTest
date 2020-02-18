package com.seerkanyilmazz;

public class CustomerManager implements ICustomerService {
	
	//Private olusturulan ICustomer Type'lý value'nin contructor'unun olusturulmasý.
	private ICustomerDal customerDal;
	
	//constructor
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
	}
}
