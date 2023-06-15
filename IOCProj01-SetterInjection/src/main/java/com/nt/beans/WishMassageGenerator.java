package com.nt.beans;

import java.util.Date;

public class WishMassageGenerator {
	private Date date;
	public WishMassageGenerator() {
		System.out.println("WishMassageGenerator:: o-param constructor");
		
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String generateMassage(String user)
	{
		System.out.println("WishMassageGenerator. generateMassage()");
		int hour=date.getHours();
		if (hour<12) {
			return"Good morning::"+user;
			
			
		} else if(hour<16){
return"Good Afternoon::"+user;
		}
		else if(hour<20){
			return"Good Evening::"+user;
					}
		else {
			return"Good Night::"+user;
		}
	}
	
	

}
