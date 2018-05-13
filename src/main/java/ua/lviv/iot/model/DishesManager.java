package ua.lviv.iot.model;

import ua.lviv.iot.persistence.dao.DishDao;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DishesManager extends Dish implements Serializable {
    private static Map<Integer, Dish> DishMap = new HashMap<>();
    private static List<Dish> dishList;
    @Inject
    public DishDao dishDao;

    public DishesManager() {

    }

    public static List<Dish> getDishList() {
        return dishList;
    }

    public Map<Integer, Dish> getDishMap() {
        return DishMap;
    }

    public final void addDishList(Integer id, Dish newDish) {
        DishMap.put(id, newDish);
    }

//    DishesManager(double caloricContent, String dishName, Integer id, double price, String typeOfMenu) {
//        super(caloricContent, dishName, id, price, typeOfMenu);
//    }

    public void addDish(Integer id, Dish newDish) {
        DishMap.put(id, newDish);
    }

    public Dish getDish(Integer id) {
        return dishDao.findById(id);
    }

    public void addDish(Dish dish) {
        dishDao.persist(dish);
    }

    public void updateDish(Dish dish) {
        dishDao.update(dish);
    }

    public void deleteDish(Integer id) {
        dishDao.delete(id);
    }
    // Searching dishes by menu
//    public final Map<Integer, Dish> searchByMenu(final String typeOfMenu) {
//        final Map<Integer, Dish> parameterDishList = new HashMap<>();
//        for (Map.Entry<Integer, Dish> houseDevice : DishMap.entrySet()) {
//            if (houseDevice.getValue().getTypeOfMenu().equalsIgnoreCase(typeOfMenu)) {
//                parameterDishList.put(Dish.getKey(), Dish.getValue());
//            }
//        }
//        return parameterDishList;
//    }

    public List<Dish> sortByCaloricContent(List<Dish> dishMapToSort) {
        dishMapToSort.sort((sortDevice1, sortDevice2) -> (int) (sortDevice1.getCaloricContent() - sortDevice2.getCaloricContent()));
        dishMapToSort.forEach((dish) -> System.out.println(dish));
        return dishMapToSort;
    }


    // printing info
    public void printByName() {
        for (int i = 0; i < getDishMap().size(); i++) {
            System.out.println(getDishMap().get(i).getDishName());
        }
    }

    public String printCaloricContent() {
        for (int i = 0; i < getDishMap().size(); i++) {
            System.out.println((getDishMap().get(i).getDishName()));
            System.out.println(getDishMap().get(i).getCaloricContent());
        }
        return null;
    }

    public void printTypeOfMenu() {
        for (int i = 0; i < getDishMap().size(); i++) {
            System.out.println(getDishMap().get(i).getTypeOfMenu());
        }
    }
}
