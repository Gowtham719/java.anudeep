package arraydemo;
import java.util.Scanner;
public class subarray {


	    public static void main(String[] args) {
	        int arr[] = {10, 20, 30, 40, 50, 60, 70};
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter start index: ");
	        int n = sc.nextInt();

	        System.out.print("Enter end index: ");
	        int m = sc.nextInt();

	        subarray.subArray(arr, n, m);
	    }

	    public static void subArray(int arr[], int n, int m) {
	        for (int i = n; i < m; i++) {
	            System.out.println(arr[i]);
	        }
	    }
	}