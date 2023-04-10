package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("franz", "ferdinandz", "fiel", "vom", "pferd");
		Predicate<String> p=s->s.equals("franz");
		list1.stream().filter(s->p.test(s)).forEach(System.out::println);
		System.out.println("*************************and or isEqual*************************************************");
		List<Integer> list2 = Arrays.asList(1,2,3,4,15);
		//Predicate<Integer> x=s->s>2;
		Predicate<Integer>n=Predicate.isEqual(5);
		list2.stream().filter(s->n.test(s)).forEach(System.out::println);
		System.out.println("*********************and*****************************************************************");
		Predicate<Integer> x1=s->s>2;
		//Predicate<Integer> n1=x1.and(s->s<5);
		Predicate<Integer> n1=x1.or(s->s<5);
		list2.stream().filter(s->n1.test(s)).forEach(System.out::println);
		System.out.println("*********************negate*****************************************************************");
		Predicate<String> neg=p.negate();
		list1.stream().filter(s->neg.test(s)).forEach(System.out::println);
		//Comparator
		//Comparable
	}

}
