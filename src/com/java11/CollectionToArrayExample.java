package com.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayExample {

	public static void main(String[] args) {

		List<String> namesList = Arrays.asList("Joe", "Julie");
		// Old way
		System.out.println("*****************Before Java 8*********************");

		String[] names = namesList.toArray(new String[namesList.size()]);
		System.out.println(names.length);
		// New way
		System.out.println("*****************Before Java 11*********************");
		names = namesList.toArray(String[]::new);
		System.out.println(names.length);
	}

}
