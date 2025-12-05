package demo;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time between 1 to 24 ");
		int time=sc.nextInt();
		System.out.println(Time.printTime( time));
	}
	public static String printTime(int time) {
		if(time >=1 && time<= 12)
			return "am";
		else if(time > 12 && time<=24 )
			return "pm";
		else
			return "invalid input";
			
	}
}
