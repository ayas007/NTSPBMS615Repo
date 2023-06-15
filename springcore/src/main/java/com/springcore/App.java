package com.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     ApplicationContext contaxt= new ClassPathXmlApplicationContext("studentContext.xml");
     Student student1=(Student) contaxt.getBean("student1");
     System.out.println(student1);
    }
    
}
