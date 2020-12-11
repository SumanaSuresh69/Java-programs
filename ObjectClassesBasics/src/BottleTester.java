
public class BottleTester {

	public static void main(String[] args) {
		Bottle prestigeBottle = new Bottle();
		prestigeBottle.material = "Steel";
		prestigeBottle.shape = "Rectangle";
		prestigeBottle.heightInInches = 5.2;

		System.out.println("details of prestige bottle");
		System.out.println("material of prestige bottle :" + prestigeBottle.material);
		System.out.println("shape of prestige bottle :" + prestigeBottle.shape);
		System.out.println("height of prestige bottle :" + prestigeBottle.heightInInches);

		Bottle miltonBottle = new Bottle();
		miltonBottle.material = "plastic";
		miltonBottle.shape = "square";
		miltonBottle.heightInInches = 5.3;

		System.out.println("\n");
		System.out.println("details of milton bottle");
		System.out.println("material of milton bottle :" + miltonBottle.material);
		System.out.println("shape of milton bottle :" + miltonBottle.shape);
		System.out.println("height of milton bottle :" + miltonBottle.heightInInches);
	}

}
