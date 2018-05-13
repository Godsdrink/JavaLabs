package ua.lviv.iot.model;

public class Soup extends Dish {
    private int ingridients;


    public Soup(double caloricContent, final Integer id, final String dishName, double price, String typeOfMenu, int ingridients) {
        super(caloricContent,id,dishName,price,typeOfMenu);
        this.ingridients = ingridients;
    }

    @Override
    public String toString() {
        return "Soup [ingridients=" + ingridients + ", getCaloricContent()=" + getCaloricContent() + ", getTypeOfMenu()="
                + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()=" + getDishName() + "]";
    }

}
