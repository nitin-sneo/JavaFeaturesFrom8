package java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArrayEx {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("a", "b", "c");
		Object[] stringArray = (Object[]) stringStream.toArray();
		Arrays.stream(stringArray).forEach(System.out::println);
	}

}
