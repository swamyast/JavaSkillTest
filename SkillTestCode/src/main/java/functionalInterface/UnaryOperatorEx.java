package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
	public static void main(String[] args) {
		
		// accepts one operand and produces result of same operand type.
		UnaryOperator<String> f=x->x.toUpperCase();
		System.out.println(f.apply("test"));
		
		// replaceall is one example of using unary operator
		List<String> str=new ArrayList<String>();
		str.add("Java");str.add("Python");str.add("VB");str.add("Selenium");
		str.replaceAll(x->x+" Program");
		System.out.println(str);
	}

}
