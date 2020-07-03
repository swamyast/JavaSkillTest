package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {

	public static void main(String[] args) {
		// Takes one argument and returns boolean
		Predicate<Integer> even=x->x%2==0;
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> Leven=li.stream().filter(even).collect(Collectors.toList());
		System.out.println(Leven);
		List<Integer> Lodd=li.stream().filter(even.negate()).collect(Collectors.toList());
		System.out.println(Lodd);
	}

}
