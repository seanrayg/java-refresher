
public class MainApp {

	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		// Plant plant2 = plant1; // same as new Plant()
		
		Plant plant2 = tree;
		
		plant2.grow();
		// plant2.sayHiTree(); // Error, it is the type of variable declares where to call methods
		
		doGrow(tree);
		
	}
	
	public static void doGrow(Plant plant) {
		
		plant.grow();
		
	}

}
