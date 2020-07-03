package interview.numbers;

public class PrimeNum {

	public static void main(String[] args) {
		int num=12;
		Boolean isPrime=true;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("The number is prime "+num);
		}
		else
			System.out.println("The number is not prime "+num);
	}

}
