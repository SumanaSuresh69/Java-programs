
public class DigitSum {

	public static void main(String[] args) {
		int n = 456, sum = 0;
		for (sum = 0; n != 0; n /= 10) {
			sum += n % 10;
		}
		System.out.println("sum of digits " + sum);

	}

}
