package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream3 {

	// Print common and uncommon elements
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("red", "blue", "blue", "green", "yellow1");
		List<String> list2 = Arrays.asList("red","red", "green", "green", "yellow");
		System.out.println("list1: " + list);
		System.out.println("list2: " +list2);
		
		Map<String, Long> result=list.stream()
		//.distinct()
		//.filter(list2::contains)
		.filter((a)->list2.contains(a))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
	}

}
