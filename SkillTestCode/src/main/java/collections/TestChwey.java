package collections;

import java.util.ArrayList;
import java.util.List;

public class TestChwey {
	
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);l.add(3);l.add(5);l.add(7);
		int k=3;
		String f=searchNum(l, k);
		System.out.println(f);
	}
	
	public static String searchNum(List<Integer> arr, int k) {
		String search=null;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)==k) {
				search="The integer is found";
				break;
			}
			else
				search="The number is not found";
		}
		return search;
		
	}

}
