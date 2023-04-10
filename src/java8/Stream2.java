package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {

	public static <R> void main(String[] args) {

		int[] a1= new int[] {1,2,3,4,5};
		int[] a2= new int[] {5,7,1,8,9};
		
//		List<int[]> list1=Arrays.asList(a1);
//		List<int[]> list2=Arrays.asList(a2);
		
		int[] output =Arrays.stream(a1)
				.map(d->d)
			.filter((a)->a>2).toArray();
		
		Stream<Integer> s1 = IntStream.of( a1 ).boxed();
		  Stream<Integer> s2 = IntStream.of( a2 ).boxed();
		  IntStream ss2  = Stream.concat( s1, s2 ).distinct().mapToInt(i ->  (Integer) i);
		  
				  //ss2.collect( Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		 // System.out.println(aa);
//				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
//				//(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
//			
			
		//.collect(null, null, null)
		Arrays.stream(output).forEach(System.out::println);
		
		int[] a = {1, 2, 3, 4, 8, 5, 7, 9, 6, 0};
	    int[] b = {0, 2, 11, 12, 5, 6, 8};
	    int[] merged = IntStream
	        .concat(IntStream.of(a), IntStream.of(b))
	        .distinct()
	        .sorted()
	        .toArray();
	    System.out.println(Arrays.toString(merged));
		
		

	}

}
