
public class ArithmeticOperatorsTester {

	public static void main(String[] args) {
		System.out.println("begin of the program");
		ArithmeticOperations operations = new ArithmeticOperations();
		int a = 10, b= 20;
		int result = operations.addition(a,b); //method call
		System.out.println("Result of a: " + a + " b: " + b + " is " + result);
		
		int p = 12, q = 81, r = 9;
		int result2 = operations.addition(p,q,r); //method call
		System.out.println("Result of adding p: " + p + " q: " + q + " r: " + r + " is " + result2);
		
		double result3 = operations.addition(15.00,75.23); //method call
		System.out.println("Result of numbers: " + result3);
		System.out.println("End of program"); 


	}

}
