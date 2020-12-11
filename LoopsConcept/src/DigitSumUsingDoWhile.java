
public class DigitSumUsingDoWhile {

	public static void main(String[] args) {
		int n = 45, sum = 0;
		do {
			sum += n % 10;
			n /= 10;
		} while (n != 0);
		System.out.println("sum of digits " + sum);

	}

}
