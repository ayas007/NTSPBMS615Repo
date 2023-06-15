package com.nt.comp;

public class BudgetCar extends Car {
private String regNo;

	public BudgetCar(String regNo) {
	super();
	System.out.println("BudgetCar::1-param construtor");
	this.regNo = regNo;
}

	@Override
	public void drive() {
		System.out.println("Driving Budget Car ");

	}

}
