package interview.numbers;

public class HighestLowest {

	public static void main(String[] args) {
		int arr[]= {1,4,2,6,8,9,7};
		int max=arr[0];int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max+"  "+min);
		
	}

}
