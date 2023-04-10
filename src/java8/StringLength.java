package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {

	public static void main(String[] args) {

		// Count string length > than
		List<String> strList = Arrays.asList("bc", ":", "bcd", "", "def", "jk");
		long count= strList.stream()
				.filter(b->b!=null && b.length()>3)
				.count();
		System.out.println(count);
		
		
		//Count String which starts with a
		List<String> startWith=strList.stream().map(String::toLowerCase)
		.filter(x->x.startsWith("a"))
		.collect(Collectors.toList());
		startWith.forEach(System.out::println);
		
		//Create a List with String more than 2 characters
		List<String> greaterThan2=strList.stream()
		.filter(b->b!=null && b.length()>2)
		.collect(Collectors.toList());
		greaterThan2.forEach(System.out::println);
		
		//Convert String to uppercase and Join them with coma
		String collectJoin=strList.stream()
		.map(s->s.toUpperCase())
		.collect(Collectors.joining(",","{","]"));
		System.out.println("Joined String "+collectJoin);
		
		//Create a List of the square of all distinct numbers
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		numbers.stream()
		.distinct()
		.map(a->a*a)		
		.forEach(System.out::println);

		


	}

}
