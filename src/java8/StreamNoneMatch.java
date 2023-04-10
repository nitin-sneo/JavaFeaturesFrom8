package java8;

import java.util.stream.Stream;

public class StreamNoneMatch {

	public static void main(String[] args) {

		// Creating a Stream of strings
        // Custom input strings are passed as arguments
        Stream<String> stream
            = Stream.of("CSE", "C++", "Jav", "DS");
  
        // Now using Stream noneMatch(Predicate predicate)
        // and later storing the boolean answer as
        boolean answer
            = stream.noneMatch(str -> (str.length() == 4));
  
        // Printing the boolean value on the console
        System.out.println(answer);
	}

}
