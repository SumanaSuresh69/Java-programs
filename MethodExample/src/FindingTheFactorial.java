
public class FindingTheFactorial {

	public static void main(String[] args) {
		System.out.println("program to illustrate the factorial of number");

		int num1 = 5;
		findingFactorial(num1); // method calling

		int num2 = 4;
		findingFactorial(num2);

		int num3 = 6;
		findingFactorial(num3);

		System.out.println("End of program");

	}

	// accessmodifier static returntype methodname (parameters)
	static void findingFactorial(int num) { // called method //method signature
		System.out.println("method is called");
		int fact = 1;
		for (int i = 1; i <= num; i++)
			fact *= i;
		System.out.println("factorial of " + num + " is:" + fact);

		System.out.println("method completion execution");

	}

}
