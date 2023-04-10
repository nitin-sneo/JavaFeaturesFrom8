package com.java16;

import java.util.Calendar;

public class PatternMatching {

	//Before Java 16 Pattern Matching
	public static double priceOldBefore(Vehicle v) {
        if (v instanceof Car) {
            Car c = (Car) v;
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle) {
            Bicycle b = (Bicycle) v;
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }
	
	//After Java 16 Pattern Matching
	public static double priceOldAfter(Vehicle v) {
		if (v instanceof Car c) {
            return 10000 - c.kilomenters * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle b) {
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }
	
	public static void main(String[] args) {
		System.out.println("Before Java 16 -- Pattern Matching Instance of");
		double priceOld = PatternMatching.priceOldBefore(new Car("4567","1498",200L,2012L));
		System.out.println("The price is "+priceOld);
		
		System.out.println("After Java 16 -- Pattern Matching Instance of");
		priceOld = PatternMatching.priceOldAfter(new Car("1234","1497",100L,2010L));
		System.out.println("The price is "+priceOld);
		
	}

}
