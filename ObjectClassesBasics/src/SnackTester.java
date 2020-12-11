
public class SnackTester {

	public static void main(String[] args) {
		Snack cobra = new Snack();
		cobra.color = "black";
		cobra.lifeSpan = 50;
		cobra.breed = "Cobra";
		cobra.lengthInMeters = 1;

		System.out.println("details of Cobra");
		System.out.println("color of Cobra :" + cobra.color);
		System.out.println("lifespan of Cobra :" + cobra.lifeSpan);
		System.out.println("breed of Cobra :" + cobra.breed);
		System.out.println("length of Cobra :" + cobra.lengthInMeters);

		Snack rattleSnack = new Snack();
		rattleSnack.color = "dusty";
		rattleSnack.lifeSpan = 25;
		rattleSnack.breed = "RattleSnack";
		rattleSnack.lengthInMeters = 1.5;

		System.out.println("\n");
		System.out.println("details of rattleSnack");
		System.out.println("color of rattleSnack :" + rattleSnack.color);
		System.out.println("lifespan of rattleSnack :" + rattleSnack.lifeSpan);
		System.out.println("breed of rattleSnack :" + rattleSnack.breed);
		System.out.println("length of rattleSnack :" + rattleSnack.lengthInMeters);

	}

}
