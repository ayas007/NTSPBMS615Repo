package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMassageGenerator;

public class ConstructorInjectionTest2 {

	public static void main(String[] args) {
	//	FileSystemResource res=new FileSystemResource("C:\\SpringBoot\\IOCProj03-ConstructorInjection\\applicationContext.xml");
		// create IOC container
	 DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	 //get target spring bean class object
		WishMassageGenerator generator=factory.getBean("wmg",WishMassageGenerator.class);
		//invoke the b methed
		String result=generator.generateMassage("raja");
		System.out.println("wish Massage is::"+result);



	}

}
