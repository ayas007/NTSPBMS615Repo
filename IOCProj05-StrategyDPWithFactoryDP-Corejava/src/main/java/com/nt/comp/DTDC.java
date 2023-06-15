package com.nt.comp;
// DTDC java  ( dependent class 1)
public class DTDC implements Courier {

	
	public DTDC()
	{
		System.out.println("DTDC :: 0-param consturctor");
	}
	@Override
	public String deliver(int oid) {
	 
		return oid+ " order id order is delivered by DTDC ";
	}

}
