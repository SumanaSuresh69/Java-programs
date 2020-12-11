
public class SwitchStatementExample {

	public static void main(String[] args) {
		System.out.println("program to illustrate switch statement");
		char alphabet = 'O';
		switch (alphabet) {
		case 'A':
			System.out.println("A is a vowel");
			break;
		case 'E':
			System.out.println("E is a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'O':
			System.out.println("O is a vowel");
			break;
		case 'U':
			System.out.println("U is a vowel");
			break;
		default:
			System.out.println("alphabet is not an vowel");
		}
		System.out.println("end of the program");
	}

}
