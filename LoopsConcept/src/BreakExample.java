
public class BreakExample {

	public static void main(String[] args) {
		System.out.println("program to illustrate the break statement");
		int i;
		for (i = 1; i <= 10; i++)
			if (i == 5) {
				break;
			}

		System.out.println("i= " + i);

	}

}
