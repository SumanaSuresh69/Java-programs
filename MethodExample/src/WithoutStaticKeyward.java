
public class WithoutStaticKeyward {

	public static void main(String[] args) { // calling method
		// main method called by JVM
		System.out.println("program to illustrate number is even or odd");
		WithoutStaticKeyward ref = new WithoutStaticKeyward();

		int num1 = 10;
		ref.findingEven(num1); // method calling

		int num2 = 65;
		ref.findingEven(num2);

		int num3 = 84;
		ref.findingEven(num3);

		System.out.println("End of program");

	}

	// accessmodifier static returntype methodname (parameters)
	void findingEven(int num) { // called method //method signature
		System.out.println("method is called");
		if (num % 2 == 0) {
			System.out.println(num + " is even ");
		} else {
			System.out.println(num + " is odd ");
		}
		System.out.println("method completion execution");

	}

}
