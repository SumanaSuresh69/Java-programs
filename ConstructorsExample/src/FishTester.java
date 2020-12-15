
public class FishTester {

	public static void main(String[] args) {
		Fish goldfish = new Fish();
		System.out.println("Breed: " + goldfish.breed);
		System.out.println("Lifespan: " + goldfish.ageInDays);
		System.out.println("Color: " + goldfish.color);
		System.out.println("Cost: " + goldfish.cost);
		System.out.println("Size: " + goldfish.size);

		System.out.println("========= ");
		Fish shark = new Fish("Shark", "Grey", "Medium", 1000, 120.00);

		System.out.println("Breed: " + shark.breed);
		System.out.println("Lifespan: " + shark.ageInDays);
		System.out.println("Color: " + shark.color);
		System.out.println("Cost: " + shark.cost);
		System.out.println("Size: " + shark.size);

		Fish starfish = new Fish();
		System.out.println("Breed: " + starfish.breed);
		System.out.println("Lifespan: " + starfish.ageInDays);
		System.out.println("Color: " + starfish.color);
		System.out.println("Cost: " + starfish.cost);
		System.out.println("Size: " + starfish.size);

	}

}
