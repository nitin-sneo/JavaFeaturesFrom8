package java8;

import java.util.Arrays;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
        int[] a = new int[]{1,2,3,4,5};
        Arrays.stream(a).forEach(System.out::println);

	}

}
