
public class PatternNumber {

	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
// i=5 5>=1
// j=5 5>=5 print 5 space