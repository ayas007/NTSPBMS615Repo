package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest1 {

	public static void main(String[] args)  throws Exception{
		
		
		Class c1=Class.forName(args[0]);
	 
		Constructor cons[]=c1.getDeclaredConstructors();
		
		Object obj1=cons[0].newInstance();
		System.out.println(obj1);
		System.out.println("--------------------------------");
		
		Object obj2=cons[1].newInstance(100,"india");
		System.out.println(obj2);
		
	}

}
