package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.factory.CarFactory;

public class ProfessionalCustomer1 {
	public static void main(String[] args) {
		 Car car=CarFactory.createCar("budget", "TS08 EN 6688");
		 car.drive();
		 System.out.println("----------------------------");
	}

}
