package eightJava;

import java.util.stream.Stream;

public class MapStream {
	public static void main(String[] args) {
		String[] arr= {"Tom","harry","oak"};
		Stream<String> st=Stream.of(arr);
		st.map(x->x.toUpperCase()).forEach(System.out::println);
		//st.map(x->x.length()).forEach(System.out::print);
	}
}
