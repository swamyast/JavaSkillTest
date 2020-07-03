package interview.numbers;

public class PowerConcept {
	public static void main(String[] args) {
		int num=3;
		int exponent=3;
		int res=1;
		while(exponent!=0) {
			res=res*num;
			exponent--;
		}
		System.out.println(res);
		System.out.println(Math.pow(2, 3));
	}

}
