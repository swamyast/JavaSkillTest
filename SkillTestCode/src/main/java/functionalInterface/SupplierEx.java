package functionalInterface;

import java.util.function.Supplier;

public class SupplierEx {
	public static void main(String[] args) {
		// takes no arguments but returns the result. get() method
		Supplier<String> supl=()-> "I am a suppier";
		System.out.println(supl.get());
	}

}
