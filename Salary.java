package demo;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basic=15000.250;
		double hra=1000.500;
		double da=500.25;
		double total=basic+hra+da;
		System.out.println("total salary="+total);
		double tax=total*10/100;
		System.out.println("tax is="+tax);
		double netsalary=total-tax;
		System.out.println("Net salary is="+netsalary);
	}

}
