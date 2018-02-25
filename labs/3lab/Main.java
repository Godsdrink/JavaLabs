package labs;

public class Main {

	public static void main(String[] args) {
		// initialization of objects
		Dishes burger = new Dishes(250.5, "Burger", 20, "FastFood");
		Dishes tomatoSoup = new Dishes(100, "TomatoSoup", 5, "Soup");
		Dishes icecream = new Dishes(410.9, "Ice-cream", 17, "Desert");
		Dishes potatoes = new Dishes(200.5, "Potatoes", 100, "SideDish");
		Dishes milk = new Dishes(300.8, "Milk", 25, "Drink");
		
		DishesManager disheManager = new DishesManager();
		// adding objects to ArrayList
		disheManager.addDishe(burger);
		disheManager.addDishe(tomatoSoup);
		disheManager.addDishe(icecream);
		disheManager.addDishe(potatoes);
		disheManager.addDishe(milk);
		//Sort
		disheManager.sortByCalorie();
		// printing info
		disheManager.printAll();
		System.out.println("Відсортовано по калорійності:");
		disheManager.toString();

	};
}
