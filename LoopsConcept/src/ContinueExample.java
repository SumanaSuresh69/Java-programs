
public class ContinueExample {

	public static void main(String[] args) {
		System.out.println("program to illustrate the continue statement");
		int i = 1, n = 5;
		while (i <= 10) {
			if (i % n == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;

		}

		System.out.println("end of program");

	}

}
