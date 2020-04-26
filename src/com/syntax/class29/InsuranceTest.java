package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		ArrayList<Insurance> insurance = new ArrayList<>();
		insurance.add(new Car("Geico","BMW"));
		insurance.add(new Pet("Liberty","English Bulldog"));
		insurance.add(new Health("Blue shield Blue cross"));
		
		
		for(Insurance x:insurance) {
			x.getQuote();
			x.cancelInsurance();
		}
		System.out.println("====================");
		
		for(int x=0; x<insurance.size();x++) {
		  insurance.get(x).getQuote();
		  insurance.get(x).cancelInsurance();
		}
		System.out.println("+++++++++++++++++++++++++");
		for(Iterator<Insurance> it = insurance.iterator();it.hasNext();) {
			Insurance element=it.next();
			element.getQuote();
			element.cancelInsurance();
		}
		
		
	}
}