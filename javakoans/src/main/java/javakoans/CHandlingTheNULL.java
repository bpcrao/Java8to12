package javakoans;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


// Effective java says do not return null use empty collection 

//if u have to retunr object returns null but thats bad tooo can cause null pointer exception
// Null is smell 
// compile time error is ideal with java 8 we have optional
public class CHandlingTheNULL {

	public static void main(String ar[]) {

		List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 56, 15, 15, 15, 32);
		
		//java 8
		Optional<Integer> data = numbers.stream()
		.filter(e -> e>57)
		.findFirst();
		
		System.out.println(data.isPresent()?data.get(): "null");
		
		System.out.println(data.get());
		
		/**
		 * null
				Exception in thread "main" java.util.NoSuchElementException: No value present
					at java.base/java.util.Optional.get(Optional.java:148)
					at javakoans.CHandlingTheNULL.main(CHandlingTheNULL.java:26)
		 */
		
		//Improved Which c can be replaced by
		data.ifPresentOrElse(e->System.out.println(e), ()-> System.out.println("null"));		
		//consumer takes input does something with it 
		
	}
}
