package interview.strings;

public class Palindrome {

	public static void main(String[] args) {
		String str="aba";
		String rev="";
		StringBuilder b=new StringBuilder();

		
		for(int i=str.length()-1;i>=0;i--) {
			
		b=b.append(str.charAt(i));
		}
		
		if(str.equals(b)) {
			System.out.println("Palindrome "+b);
		}
		else System.out.println("Not palindrome "+b);

	}

}
