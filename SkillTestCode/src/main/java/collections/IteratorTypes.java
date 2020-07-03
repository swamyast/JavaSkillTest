package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTypes {
	public static void main(String[] args) {
		ArrayList<String> shows=new ArrayList<String>();
		shows.add("Game of throws");shows.add("cricket");
		shows.add("Football");shows.add("Hockey");
		
		// Iterate using  for loop
		for(int i=0;i<shows.size();i++) {
			System.out.println(shows.get(i));
		}
		
		System.out.println("----------------Iterate using for each loop");
		for(String s:shows) {
			System.out.println(s);
		}
		System.out.println("----------------using Lambda ForEach method");
		shows.forEach(show->System.out.println(show));
		
		System.out.println("----------------using Lambda forEachRemaining method");
		Iterator<String> str=shows.iterator();
		str.forEachRemaining(show->System.out.println(show));
		
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		System.out.println("----------------using List iterator previous method in reverse order");
		ListIterator<String> sl=shows.listIterator(shows.size());
		while(sl.hasPrevious()) {
			System.out.println(sl.previous());
		}
	}
}
