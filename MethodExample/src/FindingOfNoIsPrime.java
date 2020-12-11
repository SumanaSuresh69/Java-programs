
public class FindingOfNoIsPrime {

	public static void main(String[] args) {
		System.out.println("program to illustrate number is prime number");

		int num1 = 20;
		findingPrime(num1); // method calling

		int num2 = 10;
		findingPrime(num2);

		int num3 = 7;
		findingPrime(num3);

		System.out.println("End of program");

	}

	// accessmodifier static returntype methodname (parameters)
	static void findingPrime(int num) { // called method //method signature
		System.out.println("method is called");
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

		System.out.println("method completion execution");
	}

}
