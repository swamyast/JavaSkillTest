package functionalInterface;

import java.util.function.Function;

public class FunctionEx {
	public static void main(String[] args) {
		Function<String,Integer> f1=x->x.length();
		System.out.println(f1.apply("test"));
		
		Function<Integer,Integer> f2=x->x*2;
		
		Function<String, Integer> i=f1.andThen(f2);
		System.out.println(i.apply("tes"));
	}

}
