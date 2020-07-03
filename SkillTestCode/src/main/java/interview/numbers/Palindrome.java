package interview.numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int actualNum=num;
		int rev=0;
		
		while(num!=0) {
			int temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);
		if(actualNum==rev) {
			System.out.println("The given number is palindrome");
		}
	}
	

}
