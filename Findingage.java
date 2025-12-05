package conditionalstatements;

import java.util.Scanner;

public class Findingage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		 if(age<=0 || age <=-0){
			System.out.println("Invalid age");
		 }
			else if(age==0 || age<=12 ) {
			System.out.println("Kid");
		}else if(age<=13 || age<=19) {
			System.out.println("Teenager");
		}else if(age<=20 || age<=40) {
			System.out.println("Youngster");
		}else if (age<=41 || age<=55) {
			System.out.println("Aged man");
		}else if(age<=56 || age<=70) {
			System.out.println("Old man");
		}else if(age<=0 || age <=-0){
			System.out.println("Invalid age");
		}
	}

}
