package interview.strings;

import java.util.HashMap;

public class CountChar {

	public static void main(String[] args) {
		String s="Goodtest";
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		for(int i=0;i<=s.length()-1;i++) {
			if(h.containsKey(s.charAt(i))) {
				int count=h.get(s.charAt(i));
				h.put(s.charAt(i), count+1);	
			}
			else
				h.put(s.charAt(i), 1);
		}
		System.out.println(h);
	}
}

