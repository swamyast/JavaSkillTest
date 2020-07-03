package interview.numbers;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num=1111;double sum = 0; int t=1;int i=0;
		while(num!=0) {

			int temp=(int) (num%10);
			num=num/10;
			sum=sum+Math.pow(2, i);
			i++;
		}
		
		System.out.print((int)sum);
	}
}
