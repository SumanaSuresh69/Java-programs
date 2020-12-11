
public class GlassTester {

	public static void main(String[] args) {
		System.out.println("starting program");
		Glass steelGlass = new Glass(); // instance of glass
		steelGlass.material = "Steel";
		steelGlass.shape = "Cone";
		steelGlass.lengthInCm = 10;
		steelGlass.volumeInMl = 200;

		System.out.println("Glass material: " + steelGlass.material);
		System.out.println("Glass shape: " + steelGlass.shape);
		System.out.println("Glass length: " + steelGlass.lengthInCm);
		System.out.println("Glass volume: " + steelGlass.volumeInMl);

		String drink = "Buttermilk"; // method called
		steelGlass.drinking(drink);

		System.out.println("ending program");

	}

}
