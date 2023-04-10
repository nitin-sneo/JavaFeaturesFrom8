package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		Function<Integer,Double> fi=s->s*2.0;
		list2.stream().map(q->fi.apply(q)).forEach(System.out::println);
	}

}
