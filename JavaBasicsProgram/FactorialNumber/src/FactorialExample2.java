
public class FactorialExample2 {
	
	static int factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int number=5;//it is the number to calculate factorial
		
		fact=factorial(number);
		
		System.out.println("The factorial number of "+number+" is: "+fact);
		
		
	}

}
