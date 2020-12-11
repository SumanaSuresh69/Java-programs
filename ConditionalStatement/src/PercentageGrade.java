
public class PercentageGrade {

	public static void main(String[] args) {
		System.out.println("program to illustrate marks range for the grade");
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("your percentage is between 85 to 100");
			break;
		case 'B':
			System.out.println("your percentage is between 65 to 84");
			break;
		case 'C':
			System.out.println("your percentage is between 45 to 64");
			break;
		case 'D':
			System.out.println("your percentage is below 35");
			break;
		default:
			System.out.println("grade E");
			break;
		}

	}

}
