
public class BulbTester {

	public static void main(String[] args) {
		Bulb light = new Bulb();
		light.color = "White";
		light.brand = "Bajaj";

		System.out.println("details of light");
		System.out.println("color of light :" + light.color);
		System.out.println("brand of light :" + light.brand);

		Bulb torch = new Bulb();
		torch.color = "Yello";
		torch.brand = "Philips";

		System.out.println("\n");
		System.out.println("details of Torch");
		System.out.println("color of torch :" + torch.color);
		System.out.println("brand of torch :" + torch.brand);

	}

}
