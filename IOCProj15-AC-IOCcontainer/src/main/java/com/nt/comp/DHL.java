package com.nt.comp;
//DHL.java [Dependent class1]
public class DHL implements Courier {

	
	public DHL()
	{
		System.out.println("DHL :: 0-param consturctor");
	}
	@Override
	public String deliver(int oid) {
	 
		return oid + "order id order is delivered by DHL";
	}

}
