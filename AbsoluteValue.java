package conditionalstatements;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int nums = 0;
		if(num < 0) {
			num = -num;
		}
		
		System.out.println("Absolute value : " + num);
		
	}

}
