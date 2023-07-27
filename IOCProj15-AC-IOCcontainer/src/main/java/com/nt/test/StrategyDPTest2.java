package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;


public class StrategyDPTest2 {
	
	public static void main(String[] args) {
	 //create ioc container
	 DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	 reader.loadBeanDefinitions("applicationContext.xml");
	 System.out.println("BF Container created...");
		//target class obj
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		//invoke the b method
	/*	String resultMsg=fpkt.shopping(new String[] {"Shirt", "trouser","glasses"},new float[] {5564.98f,5487.43f,6782.43f});
		System.out.println(resultMsg);
	 */
	}//main

}//class
