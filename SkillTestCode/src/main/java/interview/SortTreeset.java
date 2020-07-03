package interview;

import java.util.TreeSet;

public class SortTreeset {

	public static void main(String[] args) {
		
		TreeSet<Integer> T1= new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0);
		
		T1.add(2);T1.add(5);T1.add(1);T1.add(9);T1.add(6);
		System.out.println(T1);
		
		int[] arr= {2,4,1,8,7};
		for(int i:arr) {
			T1.add(i);
		}
	System.out.println(T1);
	}

}
 