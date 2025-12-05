package arraydemo;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int arr[]= {12,22,11,43};
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum="+sum);
	}

}
