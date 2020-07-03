package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReadOnlyCollection {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(1);ls.add(2);ls.add(3);ls.add(4);

		List<Integer> lsro=new ArrayList<Integer>(ls);
		lsro=Collections.unmodifiableList(ls);
		try {
			lsro.set(0, 11);
		}
		catch(UnsupportedOperationException le) {
			le.printStackTrace();
		}
		
		Set<Integer> s= new HashSet<Integer>(ls);
		Set<Integer> sro= Collections.unmodifiableSet(s);
		try {
			sro.add(6);
		}
		catch(UnsupportedOperationException se) {
			se.printStackTrace();
		}

	}
}