package demo;
import java.util.Scanner;
public class arraydeclare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter"+size+"elements");
		for (int i=0;i<size;i++) {
			System.out.println("Element"+(i+1)+":");
			num[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<size;i++) {
			System.out.println("Element"+(i+1)+":"+num[i]);
		}
		sc.close();
	}

}
