package demo;
import java.util.Scanner;
public class discount {
	static int discount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int m=sc.nextInt();
		System.out.println("Enter amount ");
		int a=sc.nextInt();
		switch(m)
		{
		case 1 : if(m>1000)
		{
		  double discount;
		  discount=a*0.8;
		  System.out.println("your total amount is : "+discount);
		}
		else
		{
			System.out.println("no discount");
		}
		break;
		case 2: if(a>2000)
		{
		  double discount;
		  discount=a*0.15;
		  System.out.println("your total amount is : "+discount);
		}
		else
		{
			System.out.println("no discount");
		}
		break;
		default
		:
			System.out.println("You didnt buy anything");
		}
	}

}
