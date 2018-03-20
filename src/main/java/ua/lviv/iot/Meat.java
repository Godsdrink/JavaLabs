package ua.lviv.iot;

public class Meat extends Dish {


    private int timeToCook;


    public Meat(double caloricContent, String dishName, double price, String typeOfMenu, int timeToCook) {
        super(caloricContent, dishName, price, typeOfMenu);
        this.timeToCook = timeToCook;
    }

    @Override
    public String toString() {
        return "Meat [timeToCook=" + timeToCook + ", getCaloricContent()=" + getCaloricContent() + ", getTypeOfMenu()="
                + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()=" + getDishName() + "]";
    }

}