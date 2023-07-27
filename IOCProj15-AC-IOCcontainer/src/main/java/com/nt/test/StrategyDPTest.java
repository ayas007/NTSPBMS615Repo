package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comp.Flipkart;


public class StrategyDPTest {
	
	public static void main(String[] args) {
	 //create ioc container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 
		//target class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the b method
		String resultMsg=fpkt.shopping(new String[] {"Shirt", "trouser","glasses"},new float[] {5564.98f,5487.43f,6782.43f});
		System.out.println(resultMsg);
		//close containtenr
		ctx.close();
	}

}
