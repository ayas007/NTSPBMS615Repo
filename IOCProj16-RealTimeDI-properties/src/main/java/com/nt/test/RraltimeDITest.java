 package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RraltimeDITest {

	public static void main(String[] args) {
		// create IOC  container
	 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContaxt.xml");
		//get SpringBean class obj
		MainController controller=ctx.getBean("controller",MainController.class);
		//read input as String value And store them into EmployeeVO class object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name::");
		String name=sc.next();
		System.out.println("Enter Employee desg::");
		String desg=sc.next();
		System.out.println("Enter Employee besicSalary::");
		String basicSalary=sc.next();
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(name);
		vo.setDesg(desg);
		vo.setBasicSalary(basicSalary);
		//invoke method
		try {
			String result=controller.processEmployee(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}//main

}//class
