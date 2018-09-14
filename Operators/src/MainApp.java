
public class MainApp {

	public static void main(String[] args) {
		
		solve(12.0, 20, 8);

	}
	
	static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double total_cost = meal_cost + (meal_cost * ((double) tip_percent / 100)) + (meal_cost * ((double) tax_percent / 100));
        
        System.out.println(Math.round(total_cost));

    }

}
