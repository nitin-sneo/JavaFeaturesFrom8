package java8;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfEx {

	public static void main(String[] args) {

		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(1);
		liczby.add(2); 
		liczby.add(3);
		liczby.add(4);
		liczby.removeIf(x->x%2==0);
		liczby.forEach(System.out::println);
		
	}

}
