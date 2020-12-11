
public class FindGrade {

	public static void main(String[] args) {
		float percentage = 78.9f;
		if (percentage > 100 || percentage < 0)
			System.out.println("you  have given o wrong percentage");

		if (percentage >= 85)
			System.out.println("you have got A grade");

		else if (percentage >= 65 && percentage <= 84)
			System.out.println("you have got B grade");

		else if (percentage >= 35 && percentage <= 64)
			System.out.println("you have got C grade");

		else
			System.out.println("you have got D grade");
	}

}
