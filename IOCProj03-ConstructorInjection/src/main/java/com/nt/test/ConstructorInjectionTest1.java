package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMassageGenerator;

public class ConstructorInjectionTest1 {

	public static void main(String[] args) {
		FileSystemResource res=new FileSystemResource("C:\\SpringBoot\\IOCProj03-ConstructorInjection\\applicationContext.xml");
	 XmlBeanFactory factory=new XmlBeanFactory(res);
		
	//	Object obj=factory.getBean("wmg");
		WishMassageGenerator generator=factory.getBean("wmg",WishMassageGenerator.class);
		String result=generator.generateMassage("raja");
		System.out.println("wish Massage is::"+result);



	}

}
