package com.nt.beans;

import java.util.Date;

public class WishMassageGenerator {
	private Date date;
	 
	public WishMassageGenerator(Date date) {
		System.out.println("WishMassageGenerator:: 1-param constructor");
		this.date=date;
		
	}

	// cotrl + Sift+ /
	  public void setDate(Date date) {
		  this.date = date;
		  System.out.println("WishMassageGenerator. setDate");
		  }
	 
	public String generateMassage(String user)
	{
		System.out.println("WishMassageGenerator. generateMassage()"+date);
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
