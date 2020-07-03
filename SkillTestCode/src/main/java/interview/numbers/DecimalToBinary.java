package interview.numbers;

public class DecimalToBinary {

	public static void main(String[] args) {
		int num=15; int i=1;long bin=0;
		while(num!=0) {
			int temp=num%2;
			num=num/2;
			bin=bin+temp*i;
			i*=10;
			
		}
		System.out.println(bin);

	}

}
