// Fruit inherits Food, Fruit is child of Food, Food, is parent of Fruit
public class Fruit extends Food {

	// Calls the sell method in Food
	@Override
	public void sell() {
		
		System.out.println("fruit selling");
		
	}
	
	public void showBio() {
		
		System.out.println(getBio());
		
	}
	
}
