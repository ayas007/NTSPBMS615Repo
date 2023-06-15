package com.nt.test;

import com.nt.comp.BudgetCar;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportsCar;
import com.nt.factory.CarFactory;

public class BusinessManCustomer3 {
	public static void main(String[] args) {
		 Car car=CarFactory.createCar("Luxory", "TS08 EN 6688");
		 car.drive();
		 System.out.println("----------------------------");
	}

}
