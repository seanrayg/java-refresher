
public class Tree extends Plant {

	@Override
	public void grow() {
		
		System.out.println("Tree growing.");
		
	}
	
	// Will not be visible to Plant plant2 = tree, method must be existing in the parent class
	public void sayHiTree() {
		
		System.out.println("Hi, I'm Tree.");
		
	}
	
}
