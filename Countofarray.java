package arraydemo;
import java.util.Scanner;
public class Countofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();

		        int arr[] = new int[n];
		        System.out.println("Enter array elements:");
		        for(int i=0; i<n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int count = 0;
		        for(int i=0; i<n-1; i++) {
		            if(arr[i] == arr[i+1]) {
		                count++;
		            }
		        }

		        System.out.println("Count of adjacent same elements = " + count);
		    }
	
	}


