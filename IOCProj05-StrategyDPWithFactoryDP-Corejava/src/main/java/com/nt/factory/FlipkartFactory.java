package com.nt.factory;
import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;



public class FlipkartFactory {
		// static factory method supporting Factory patter
		public static Flipkart createFlipkart(String courierType)
		{
			// create Target Class obj
			Flipkart fpkt=new Flipkart();
			Courier  courier=null;
			//create dependent class obj based on given courier type
			if(courierType.equalsIgnoreCase("dtdc"))
				courier=new DTDC();
			else if(courierType.equalsIgnoreCase("bDart"))
				courier=new BlueDart();
			else
				throw new IllegalArgumentException(" invalid courier type");
			//set Dependent class obj to target class obj
			fpkt.setCourier(courier);
			return fpkt;
			
			
		

	}

}
