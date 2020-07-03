package interview.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
	public static void main(String[] args) {
		String s="helo";
		String a="eloh";
		
		
		String s1=setRet(s);
		String s2=setRet(a);
		
		if(s1.contentEquals(s2)) {
			System.out.println("anagram");
		}
				
	}
	public static String setRet(String s) {
		char arr[]=s.toLowerCase().toCharArray();
		Arrays.sort(arr);
		return String.valueOf(arr);	
	}
}
