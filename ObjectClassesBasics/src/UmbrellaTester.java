
public class UmbrellaTester {

	public static void main(String[] args) {
		Umbrella thing = new Umbrella();
		thing.brand = "Camel";
		thing.color = "Black";
		thing.design = "2 foldings";
		thing.circumferenceInCm = 70;
		thing.Price = 200.00;
		
		System.out.println("brand for umbrella: "+ thing.brand);
		
		Umbrella thing2 = new Umbrella();
		
		System.out.println("brand for umbrella2: "+ thing2.brand);
		System.out.println("color for umbrella2: "+ thing2.color);
		System.out.println("design for umbrella2: "+ thing2.design);
		System.out.println("circumference umbrella2: "+ thing2.circumferenceInCm);
		System.out.println("price for umbrella2: "+ thing2.Price);

	}

}
