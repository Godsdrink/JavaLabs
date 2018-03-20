package ua.lviv.iot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DishesManager extends Dish {

    private List<Dish> dishesList = new ArrayList<>();

    public List<Dish> getDishesList() {
        return dishesList;
    }



    public DishesManager() {
        // System.out.println("OK");

    }


    public void addDish(Dish dish) {

        dishesList.add(dish);
    }

    // Searching dishes by menu
    public List<Dish> searchByMenu(String typeOfMenu) {

        List<Dish> resultDishes = new LinkedList<>();
        for (Dish dish : dishesList) {
            if (dish.getTypeOfMenu().equals(typeOfMenu)) {
                resultDishes.add(dish);
            }
        }
        return resultDishes;
    }

    // sort by calorie
    public List<Dish> sortByCalorie(List<Dish> dishes) {
        dishes.sort(Comparator.comparing(Dish::getCaloricContent));
        return dishes;
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


}
