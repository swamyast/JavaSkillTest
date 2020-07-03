package interview;

public class SingleTon {
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		return new SingleTon();
	}
	public void test() {
		System.out.println("Its single ton class");
	}

	public static void main(String[] args) {
		SingleTon s=getInstance();
	}

}
