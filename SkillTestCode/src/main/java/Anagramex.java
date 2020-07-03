import java.util.Arrays;

public class Anagramex {
	public static void main(String[] args) {
		String s="helo";
		String t="hold";
		
		String s1=retString(s);
		String s2=retString(t);
		if(s1.contentEquals(s2)) {
			System.out.println("The given strings are anagrams");
		}
		else
			System.out.println("The given strings are not anagrams");
		
	}
	
	public static String retString(String str) {
		char arr[]=str.toLowerCase().toCharArray();
		Arrays.parallelSort(arr);
		return String.valueOf(arr);
	}

}
