package java8;

import java.util.Arrays;
import java.util.List;

/*********************
 * Array List iterating,sorting, converting and printing using Streams
 * 
 * ******************/
public class JavaStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("franz", "ferdinandz", "fiel", "vom", "pferd");
		list.stream()
		.map(String::toLowerCase)
	    .filter(name -> name.startsWith("f"))
	    .filter(f->f.endsWith("z"))
	    //.map(String::toUpperCase)
	    .sorted()
	    .forEach(System.out::println);
	}

}
