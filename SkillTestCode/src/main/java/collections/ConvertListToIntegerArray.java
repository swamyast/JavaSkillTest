package collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToIntegerArray {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(1);ls.add(4);ls.add(3);ls.add(2);
		
		Integer[] arr=ls.toArray(new Integer[ls.size()]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
