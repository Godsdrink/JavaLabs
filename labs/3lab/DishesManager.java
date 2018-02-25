package labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DishesManager {
	public ArrayList<Dishes> DishesList = new ArrayList<>();

	DishesManager() {
		// System.out.println("OK");
	}

	public void addDishe(Dishes burger) {

		DishesList.add(burger);
	}

	// Searching dishes by menu
	public Dishes searchByMenu(String typeOfMenu) {
		for (int i = 0; i < DishesList.size(); i++) {
			if (DishesList.get(i).getTypeOfMenu().equals(typeOfMenu)) {
				return (DishesList.get(i));
			}
		}
		return null;
	}
//sort by calorie
	public ArrayList<Dishes> sortByCalorie() {
		Collections.sort(DishesList, new Comparator<Dishes>() {
			@Override
			public int compare(Dishes o1, Dishes o2) {
				if (o1.getCaloricContent() < o2.getCaloricContent())
					return -1;
				if (o1.getCaloricContent() > o2.getCaloricContent())
					return 1;
				return 0;
			}
		});
		return DishesList;

	}
// printing info
	public void printByName() {
		for (int i = 0; i < DishesList.size(); i++) {
			System.out.println(DishesList.get(i).getDishName());
		}
	}

	public String printCaloricContent() {
		for (int i = 0; i < DishesList.size(); i++) {
			System.out.println(DishesList.get(i).getCaloricContent());
		}
		return null;
	}

	public void printTypeOfMenu() {
		for (int i = 0; i < DishesList.size(); i++) {
			System.out.println(DishesList.get(i).getTypeOfMenu());
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
	//method to String now give info about fields
	 @Override
	    public String toString()
	    {
	        return this.printCaloricContent();
	    }
}
