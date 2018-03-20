package ua.lviv.iot;



import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class DishesManagerTest {
    DishesManager dishesManager;
    List<DishesManager> menu = new LinkedList<>();


    Meat burger = new Meat(200, "Burger", 200, "FastFood", 20);
    Soup tomatoSoup = new Soup(100, "TomatoSoup", 5, "Soup", 1);
    Desert icecream = new Desert(410.9, "Ice-cream", 17, "Desert", 150);
    SideDish potatoes = new SideDish(200.5, "Potatoes", 100, "SideDish", 100);
    Soup cheeseSoup = new Soup(130.3, "CheeseSoup", 120, "Soup", 5);


    @Before
    public void setUp() {
        dishesManager = new DishesManager();
        dishesManager.addDish(burger);
        dishesManager.addDish(tomatoSoup);
        dishesManager.addDish(icecream);
        dishesManager.addDish(potatoes);
        dishesManager.addDish(cheeseSoup);

    }

    @org.junit.Test
    public void addDish() {
        Soup soup = new Soup(130.3D, "CheeseSoup", 120.0D, "Soup", 5);
        dishesManager.addDish(soup);
        assertEquals(true, dishesManager.getDishesList().contains(soup));


    }

    @org.junit.Test
    public void searchByMenu() {
        List<Dish> expectedDishes = dishesManager.searchByMenu("Soup");
        assertEquals(expectedDishes.size(), 2);
        assertEquals(expectedDishes.get(0).getDishName(), "TomatoSoup");

    }

    @org.junit.Test
    public void sortByCalorie() {

        List<Dish> expectedDishes = dishesManager.sortByCalorie(dishesManager.getDishesList());
        assertEquals(expectedDishes.get(0).getCaloricContent(), 100, 0.001);
        assertEquals(expectedDishes.get(4).getCaloricContent(), 410.9,0.001);
    }

    @org.junit.Test
    public void printByName() {
        dishesManager.printByName();
        assertEquals("dishName", dishesManager.getDishName());
    }

    @org.junit.Test
    public void printCaloricContent() {
        dishesManager.printCaloricContent();
        assertEquals(0.1, dishesManager.getCaloricContent(), 0);
    }

    @org.junit.Test
    public void printTypeOfMenu() {
        dishesManager.printTypeOfMenu();
        assertEquals("typeOfMenu", dishesManager.getTypeOfMenu());
    }
@Test
   public void WriterTest(){
    dishesManager.addDish(burger);
    dishesManager.addDish(tomatoSoup);
    dishesManager.addDish(icecream);
    dishesManager.addDish(potatoes);
    dishesManager.addDish(cheeseSoup);
     DishWriter dishWriter = new DishWriter();
     dishWriter.writeToFile(dishesManager.getDishesList());
}
}