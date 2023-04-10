package com.java14;

import java.time.Month;

public class SwitchExpression {

	public static void main(String[] args) {
        int days = 0;
        Month month = Month.APRIL;

        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER :
                days = 31;
                break;
            case FEBRUARY :
                days = 28;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER :
                days = 30;
                break;
            default:
                throw new IllegalStateException();
        }
        
        System.out.println("Days for "+month+" are "+days);
        
        Month month2 = Month.FEBRUARY;
        //New way from Java 14
        days = switch (month2) {
        case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
        case FEBRUARY -> 28;
        case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
        default -> throw new IllegalStateException();
        
    };
    System.out.println("Days for "+month2+" are "+days);
    }

}
