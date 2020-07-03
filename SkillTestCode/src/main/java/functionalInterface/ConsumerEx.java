package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {
		// Represents a function which accepts single argument but produces no result
		// only accept() method is present
		Consumer<String> test=(x)-> System.out.println(x);
		test.accept("Welcome");
		System.out.println(test);
		
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7);
		li.stream().filter(x->x%2==0).forEach(System.out::println);
		System.out.println("The Odd numbers are");
		li.stream().filter(x->x%2!=0).forEach(System.out::println);
		li.stream().map(x->x*10).forEach(System.out::println);
	}

}
