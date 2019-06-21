package javakoans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//thanks to https://www.youtube.com/watch?v=Yacu1yUktjY&t=383s Venkat Subramaniam
public class BStreams {

	public static void main(String ar[]) {
		
		List<Integer> numbers = Arrays.asList(11,12,13,14,56, 15,15,15,32);
		
		//Java 8 
		filterNumbersInJava8(numbers);		
		limitToFirst5NumbersJava8();		
		skip5NumbersJava8();
		
		//Java 8 problems limit and skip are incconsistent takes the number unlike filter predicate
		
		//java 9
		//break		
		takeWhile(numbers);
		dropWhile(numbers);	
		
		
		//IntRange Looping with iterate, replacing traditional forLoop
		IntStream.iterate(0, i -> i <= 5, i -> i + 1)
		.forEach(System.out::println);
		

	}

	private static void dropWhile(List<Integer> numbers) {
		numbers.stream()
		.dropWhile(e -> e<55)
		.forEach(System.out::println);
		System.out.println(numbers);
	}

	private static void takeWhile(List<Integer> numbers) {
		//breaks when the value does not meet condition
		numbers.stream()
		.takeWhile(e -> e<55)
		.forEach(System.out::println);
		System.out.println(numbers);
	}

	private static void skip5NumbersJava8() {
		List<Integer> numbers;
		numbers = Arrays.asList(11,12,13,14,15,15,15,32);
		numbers.stream()
		.skip(5)
		.forEach(System.out::println);
		printNumbers(numbers);
	}

	private static void limitToFirst5NumbersJava8() {
		List<Integer> numbers;
		numbers = Arrays.asList(11,12,13,14,15,15,15,32);
		numbers.stream()
		.limit(5)
		.forEach(System.out::println);
		printNumbers(numbers);
	}

	//printing numbers greater than 55 using filter
	private static void filterNumbersInJava8(List<Integer> numbers) {
		numbers.stream()
		.filter(e -> e>55)
		.forEach(System.out::println);
		System.out.println(numbers);		
		printNumbers(numbers);
	}

	private static void printNumbers(List<Integer> numbers) {
		System.out.println("----------------------------------------------------------------");
	}
}
