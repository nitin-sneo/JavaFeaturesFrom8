package java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsFiltering {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2,2, 3, 5, 5);

	    Map<Integer, Long> result = numbers.stream()
	      .filter(val -> val > 1)
	      .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
	    
	    System.out.println("map returned "+result);

	    //assertEquals(1, result.size());

	    result = numbers.stream()
	      .collect(Collectors.groupingBy(i -> i,
	        Collectors.filtering(val -> val > 3, Collectors.counting())));
	    System.out.println("map returned "+result);
	}

}
