package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	// HAS - A Property type Interface
	private Courier courier;
	
	public Flipkart()
	{
		System.out.println("Flipkart :: 0-param consturctor");
	}

 

	//setter method
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String shopping(String items[],float prices[])
	{
		// cal billAmt
		float billAmt=0.0f;
		for (int i = 0; i < items.length; i++) 
			billAmt=billAmt+prices[i];
			//ganrate order id
			int oid=new Random().nextInt(10000);
			//use courier for Shipping
			String status=courier.deliver(oid);
			String finalMsg=Arrays.toString(items)+"are pruchsed with prices"+Arrays.toString(prices)+"The generated billAmount is::"+billAmt;
			
			return finalMsg+":::"+status;
		
	}
	
}
