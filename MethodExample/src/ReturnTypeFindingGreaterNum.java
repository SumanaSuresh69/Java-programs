
public class ReturnTypeFindingGreaterNum {

	public static void main(String[] args) {
		int a = 54, b = 12, c = 64;
		ReturnTypeFindingGreaterNum ref = new ReturnTypeFindingGreaterNum();
		int res1 = ref.findGreaterNum(a, b, c);
		System.out.println(res1 + " is greater number among 54,12,64");
		int res2 = ref.findGreaterNum(50, 71, 15);
		System.out.println(res2 + " is greater number among 50,71,15");

	}

	int findGreaterNum(int a, int b, int c) {
		int result = 0;
		if (a > b) {
			if (a > c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			if (b > c) {
				result = b;
			} else {
				result = c;
			}
		}
		return result;
	}

}
