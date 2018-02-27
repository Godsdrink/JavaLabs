package labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DishesManager extends Dish {
	public ArrayList<Dish> dishesList = new ArrayList<>();

	DishesManager() {
		// System.out.println("OK");
	}

	public void addDish(Dish burger) {

		dishesList.add(burger);
	}

	// Searching dishes by menu
	public Dish searchByMenu(String typeOfMenu) {
		for (int i = 0; i < dishesList.size(); i++) {
			if (dishesList.get(i).getTypeOfMenu().equals(typeOfMenu)) {
				return (dishesList.get(i));
			}
		}
		return null;
	}

	// sort by calorie
	public ArrayList<Dish> sortByCalorie() {
		Collections.sort(dishesList, new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				if (o1.getCaloricContent() < o2.getCaloricContent())
					return -1;
				if (o1.getCaloricContent() > o2.getCaloricContent())
					return 1;
				return 0;
			}
		});
		return dishesList;

	}

	// printing info
	public void printByName() {
		for (int i = 0; i < dishesList.size(); i++) {
			System.out.println(dishesList.get(i).getDishName());
		}
	}

	public String printCaloricContent() {
		for (int i = 0; i < dishesList.size(); i++) {
			System.out.println((dishesList.get(i).getDishName()));
			System.out.println(dishesList.get(i).getCaloricContent());
		}
		return null;
	}

	public void printTypeOfMenu() {
		for (int i = 0; i < dishesList.size(); i++) {
			System.out.println(dishesList.get(i).getTypeOfMenu());
		}
	}

	public void printAll() {
		printByName();
		System.out.println(" ");
		printCaloricContent();
		System.out.println(" ");
		printTypeOfMenu();
		System.out.println(" ");

	}

	
	
}
