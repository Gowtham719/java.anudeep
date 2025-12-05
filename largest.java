package demo;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 100;
		int c = 300;
		int d = 450;
		int e = 690;
		
		String data= ((a>b)&&(a>c)&&(a>d)&&(a>e))?a+"a is large":((b>c)&&(b>d)&&(b>e))?b+"b is large":((c>d)&&(c>e))?c+"c is large":((d>e))?d+"d is large":e+" e is large";
		System.out.println(data);
		
	}

}