package functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorEx {

	public static void main(String[] args) {
		//accepts two operand and produces result 
		BinaryOperator<Integer> f1=(x,y)->x+y;
		System.out.println(f1.apply(2, 3));
		
		Function<String,Integer> f2=s->s.length();
		
	}
}
