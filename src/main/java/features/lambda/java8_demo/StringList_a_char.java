package features.lambda.java8_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList_a_char {
	public static List<String> search(List<String> list){
		return list.stream()
				.filter(s -> s.startsWith("a"))
				.filter(s -> s.length()==3)
				.collect(Collectors.toList());
	}
	public static void main(String []args) {
		List<String> names = Arrays.asList("abc","bac","add","app","aass","papa","dad","ant","aunty","ask");
		List<String> result = StringList_a_char.search(names);
		System.out.println(result);
	}
}
