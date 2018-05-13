package ua.lviv.iot;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DishesManagerTest {
//    private static final DishesManager dishesManager = new DishesManager();
//    private static final DishWriter writer = new DishWriter();
//    private static final File file = new File("myfile.csv");
//    private static final Dish burger = new Meat(200, 1, "Burger", 200, "FastFood", 20);
//    private static final Dish tomatoSoup = new Soup(100, 2, "TomatoSoup", 5, "Soup", 1);
//    private static final Dish icecream = new Desert(410.9, 3, "Ice-cream", 17, "Desert", 150);
//    private static final Dish potatoes = new SideDish(200.5, 4, "Potatoes", 100, "SideDish", 100);
//    private static final Dish cheeseSoup = new Soup(130.3, 5, "CheeseSoup", 120, "Soup", 5);
//    private Map<Integer, Dish> testMap = new HashMap<>();
//    private List<Dish> dishList = new LinkedList<>(dishesManager.getDishMap().values());
//    private List<Dish> testList = new LinkedList<>();
//
//    @BeforeAll
//    static void addToList() {
//        dishesManager.addDishList(burger.getId(), burger);
//        dishesManager.addDishList(tomatoSoup.getId(), tomatoSoup);
//        dishesManager.addDishList(icecream.getId(), icecream);
//        dishesManager.addDishList(potatoes.getId(), potatoes);
//        dishesManager.addDishList(cheeseSoup.getId(), cheeseSoup);
//
//    }
//
//    @org.junit.Test
//    public void addDishList() {
////        assertEquals(burger, dishesManager.getDishMap().get(1));
//        System.out.println(burger);
//        System.out.println(dishesManager.getDishMap().get(1));
//    }
//
//
//    @org.junit.Test
//    public void searchByMenu() {
//        testMap = dishesManager.searchByMenu(tomatoSoup.getTypeOfMenu());
//        assertEquals(1, testMap.size());
//        assertEquals(tomatoSoup, testMap.get(tomatoSoup.getId()));
//        testMap = dishesManager.searchByMenu(burger.getTypeOfMenu());
//        assertEquals(2, testMap.size());
//        assertEquals(burger, testMap.get(burger.getId()));
//        assertEquals(icecream, testMap.get(icecream.getId()));
//        testMap = dishesManager.searchByMenu(" ");
//        assertEquals(0, testMap.size());
//    }
////    public void searchByMenu() {
////        List<Dish> expectedDishes = dishesManager.searchByMenu("Soup");
////        assertEquals(expectedDishes.size(), 2);
////        assertEquals(expectedDishes.get(0).getDishName(), "TomatoSoup");
////
////    }
//
//    @org.junit.Test
//    public void sortByCaloricContent() {
//        testList = new LinkedList<>(dishesManager.sortByCaloricContent(dishList));
//        assertEquals(12, testList.size());
//        assertEquals(burger, testList.get(0));
//        assertEquals(tomatoSoup, testList.get(1));
//        assertEquals(icecream, testList.get(2));
//        assertEquals(cheeseSoup, testList.get(3));
//        assertEquals(potatoes, testList.get(4));
//    }
////    public void sortByCalorie() {
////
////        List<Dish> expectedDishes = dishesManager.sortByCalorie(dishesManager.getDishesList());
////        assertEquals(expectedDishes.get(0).getCaloricContent(), 100, 0.001);
////        assertEquals(expectedDishes.get(4).getCaloricContent(), 410.9,0.001);
////    }
//
//    @org.junit.Test
//    public void printByName() {
//        dishesManager.printByName();
//        assertEquals("dishName", dishesManager.getDishName());
//    }
//
//    @org.junit.Test
//    public void printCaloricContent() {
//        dishesManager.printCaloricContent();
//        assertEquals(0.1, dishesManager.getCaloricContent(), 0);
//    }
//
//    @org.junit.Test
//    public void printTypeOfMenu() {
//        dishesManager.printTypeOfMenu();
//        assertEquals("typeOfMenu", dishesManager.getTypeOfMenu());
//    }
//
//    @Test
//    public void WriterTest() throws IOException {
//        dishesManager.addDishList(burger.getId(), burger);
//        dishesManager.addDishList(tomatoSoup.getId(), tomatoSoup);
//        dishesManager.addDishList(icecream.getId(), icecream);
//        dishesManager.addDishList(potatoes.getId(), potatoes);
//        dishesManager.addDishList(cheeseSoup.getId(), potatoes);
//        DishWriter dishWriter = new DishWriter();
//        dishWriter.writeToFile(DishesManager.getDishList());
//    }
}