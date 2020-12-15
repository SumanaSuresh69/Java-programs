
public class Fish {
	String breed;
	String color;
	String size;
	int ageInDays;
	double cost;
	
	//Java is adding default constructor
	//Fish() {  //default
	//
	//}
	
	//modifiers ClassName(param list){
	//initialize
	//}

	Fish() {  //no-arg constructor
		breed = "goldfish";
		color = "gold";
		size = "small";
		ageInDays = 150;
		cost = 50;
	}
	
	Fish(String inBreed, String inColor, String inSize, int inageInDays, double inCost){
		breed = inBreed;
		color = inColor;
		size = inSize;
		ageInDays = inageInDays;
		cost = inCost;
	}

	void swimming() {
		System.out.println("swimming using fins");
	}

	void breating() {
		System.out.println("breating through gills");
	}
}
