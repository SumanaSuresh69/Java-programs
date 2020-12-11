
public class FindingOfNoIsPositive {

	public static void main(String[] args) {
		// main method called by JVM
		System.out.println("program to illustrate number is positive or negative");

		int num1 = 10;
		findingPositive(num1); // method calling

		int num2 = -25;
		findingPositive(num2);

		int num3 = 84;
		findingPositive(num3);

		System.out.println("End of program");

	}

	// accessmodifier static returntype methodname (parameters)
	static void findingPositive(int num) { // called method //method signature
		System.out.println("method is called");
		if (num > 0) {
			System.out.println(num + " is positive ");
		} else if (num < 0) {
			System.out.println(num + " is negative ");
		} else {
			System.out.println(num + "is neither positive nor negative");
		}
		System.out.println("method completion execution");

	}

}
