class Car {
	
	String color;
	String manufacturer;
	
}


public class MainApp {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.color = "blue";
		car1.manufacturer = "honda";
		
		System.out.println("Your car: " + car1.color + " " + car1.manufacturer);
		
	}
	
}
