package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> L1=new ArrayList<Integer>();
		L1.add(4);L1.add(1);L1.add(2);L1.add(3);
		
		Collections.sort(L1);
		System.out.println(L1);
		
		Collections.sort(L1, (i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		System.out.println(L1);
	}

}
