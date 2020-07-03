package interview.numbers;

public class Factorial {

	public static void main(String[] args) {
		int nums=fact(5);
		int num=5;
		System.out.println(nums);

		// Factorial by normal method
		int fac=1;
		while(num!=0) {
			fac=fac*num;
			num--;
		}
		System.out.println(fac);
	}
	// Factorial by recursive method
	static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		else
			return fact(n-1)*n;
	}
}
