package conditionalstatements;

public class diffrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= 3;
		int num2= 3;
		
		if(num1 == 6 || num2 == 6) {
			System.out.println("True");
		}else if(num1 + num2 == 6){
			System.out.println("True"); 
		}else if(num1 == 6 && num2 ==  6) {
			System.out.println("false");
		}else {
			System.out.println("false");
		}
	}

}
