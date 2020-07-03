package interview.numbers;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;int b=0; int c=1;int num = 0;
		while(num<10) {
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
			
			num++;
		}

	}

}
