package labs;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Dishes burger = new Dishes(250.5, "Burger", 20, "FastFood");// there should be class "Meat"
		
		restaurant.getInfo();
		burger.getInfo();
		
		DisheType Soup = DisheType.Soup;
		 for(DisheType element: DisheType.values()) {
			 System.out.println(element);
		 };
	}

}
