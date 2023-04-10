package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyString {

	public static void main(String[] args) {

		//Count if the List contains any ""
		List<String> strList = Arrays.asList("abc", " ", "bcd", "", "defg", "jk");
		int count=(int) strList.stream()
				//.filter(b->b!=null && b.equals(""))
				.filter(x->x!=null && x.isEmpty())
		.count();
		System.out.println(count);
		
		//Remove empty Strings from list
				List<String> removeEmpty=strList.stream().map(String::toLowerCase)
						.filter(x->x!=null && !x.isBlank())
						.collect(Collectors.toList());
				removeEmpty.forEach(System.out::println);

	}

}
