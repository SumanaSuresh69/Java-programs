
public class PatternMethod {

	public static void main(String[] args) {
		System.out.println("program to illustrate the pattern");

		int num1 = 5;
		findingPattern(num1); // method calling

		int num2 = 4;
		findingPattern(num2);

		int num3 = 6;
		findingPattern(num3);

		System.out.println("End of program");

	}

	// accessmodifier static returntype methodname (parameters)
	static void findingPattern(int num) { // called method //method signature
		System.out.println("method is called");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
