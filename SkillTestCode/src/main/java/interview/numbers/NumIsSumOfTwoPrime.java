package interview.numbers;

public class NumIsSumOfTwoPrime {

	public static void main(String[] args) {
	 int num=34;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(isPrime(i)) {
				int j=num-i;
				if(isPrime(num-i)) {
					System.out.println(num+" = "+ i +" +"+ j);
					flag=true;
				}
			}
			if(!flag) {
				System.out.println("The number is not sum of prime numbers");
			}
		}
	}
	public static boolean isPrime(int num) {
		boolean flag =true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;

	}
}
