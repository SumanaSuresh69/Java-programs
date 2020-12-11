
public class IfElseExample {

	public static void main(String[] args) {
		System.out.println("program to illustrate greater number among 3 numbers");
		int a = 20, b = 30, c = 40;
		if (a > b) {
			if (a > c) {
				System.out.println("a value is greater");
			} else {
				System.out.println("c value is greater");
			}
		} else {
			if (b > c) {
				System.out.println("b value is greater");
			} else {
				System.out.println("c value is greater");
			}
		}

	}

}
