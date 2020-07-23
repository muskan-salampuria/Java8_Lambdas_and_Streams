package features.lambda.java8_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList_Palindrome {
	public static void main(String []args) {
		List<String> wordList= Arrays.asList("aba","caa","date","lol","aabaa","abccba","abbca","dada","ddaadd");
		
		List<String> result=filterList(wordList);
		System.out.print(result);
	}
	
public static boolean checkPallindrome(String str) {
	String reverseString = new StringBuffer(str).reverse().toString();
	if(str.equals(reverseString)) {
		return true;
	}
	return false;
}
public static List<String> filterList(List<String> stringList) {
	return stringList.stream().filter(StringList_Palindrome::checkPallindrome).collect(Collectors.toList());
}
}
