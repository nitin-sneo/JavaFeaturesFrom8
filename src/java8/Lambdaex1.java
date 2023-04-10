package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambdaex1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
		//int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y)).forEach(System.out::println);
		System.out.println(sum);
		System.out.println("*****************************************************************");
		
		//New way:
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		list1.stream().map((x) -> x*x).forEach(System.out::println);
		
		char[] cc = new char[] {'A','B','A'};
		//Stream<Character> cStream = Stream.of(cc);
		Stream<Character> cStream = IntStream.range(0, cc.length).mapToObj(i -> cc[i]);
//		String str = "kakatua parrot is a bird";
//	    String abc=cc.();
//	    System.out.println(abc.toString());
	    
	   Map<Character, Long> ss= cStream.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));	  
       System.out.println(ss);
       Stream<Character> ss2 = new String(cc).chars().mapToObj(i ->  (char) i);
       Map<Character, Long> ss3=ss2.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));	  
       System.out.println(ss3);
       
   
	}

}
