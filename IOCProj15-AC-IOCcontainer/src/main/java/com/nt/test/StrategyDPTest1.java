package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;


public class StrategyDPTest1 {
	
	public static void main(String[] args) {
	 //create ioc container
	//	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(" com/nt/cfgs/applicationContext.xml");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(" applicationContext.xml");
		 
		//target class obj
	/*	Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the b method
		String resultMsg=fpkt.shopping(new String[] {"Shirt", "trouser","glasses"},new float[] {5564.98f,5487.43f,6782.43f});
		System.out.println(resultMsg);
		//close containtenr
		ctx.close();
		*/
	}

}
