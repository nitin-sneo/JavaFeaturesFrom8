package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {

		String str= "Nitin Bhalerao";  
		Map<String, Long> result = Arrays
				.stream(str.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);  

		List<String> str1=Arrays.asList("ABC","CDE","FGH","ABC");
		Map<String, Long> output=str1.stream()
				//.map(String::toLowerCase)
				.collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()));
		
		

	}

}
