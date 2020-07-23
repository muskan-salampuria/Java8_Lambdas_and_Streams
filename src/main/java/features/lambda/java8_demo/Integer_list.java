package features.lambda.java8_demo;

import java.util.Arrays;
import java.util.List;

public class Integer_list {
	public static void main(String []args) {
		List<Integer> numbers = Arrays.asList(1,56,10,70,20,45,89,65,74,69);
		double result = Integer_list.avg(numbers);
		System.out.println(result);
	}
	public static double avg(List<Integer> list){
		return list
				.stream()
				.mapToDouble(i -> (double)i)
				.average()
				.getAsDouble();
	}
}
