
public class FactorialExample {

	public static void main(String[] args) {
		int i, fact = 1;
		int num = 5;
		for (i = 1; i <= num; i++)
			fact *= i;
		System.out.println("factorial of " + num + " is:" + fact);

	}

}
// i=1 1<=5 fact =1*1=1
// i=2 2<=5 fact =1*2=2
// i=3 3<=5 fact =2*3=6
// i=4 4<=5 fact =6*4=24
// i=5 5<=5 fact =24*5=120