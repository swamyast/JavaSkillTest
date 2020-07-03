package interview;

public class ArraySort {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int iarr[]= {1,3,2,8,6};
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=i+1;j<iarr.length;j++) {
				if(iarr[i]<iarr[j]) {
					int temp=iarr[i];
					iarr[i]=iarr[j];
					iarr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<iarr.length;i++) {
			System.out.println(iarr[i]);
		}
	}

}
