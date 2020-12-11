
public class NumberOfDigits {
	public static void main(String[] args) {
		System.out.println("program to illustrate number of digits");
		int count = 0, num = 346;
		do {
			num /= 10;
			++count;
		} while (num != 0);
		System.out.println("number of digits: " + count);
	}
}
