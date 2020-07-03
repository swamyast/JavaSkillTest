package interview.numbers;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt(); int arm=num;
		int rev=0;
		while(num!=0) {
			int temp=num%10;
			rev=temp*temp*temp+rev;
			num=num/10;
		}
		if(arm==rev)
		System.out.println("The given number is armstrong "+rev);
		
	}

}
