package ua.lviv.iot.model;

public class Meat extends Dish {


    private int timeToCook;


    public Meat(double caloricContent, final Integer id, final String dishName, double price, String typeOfMenu, int timeToCook) {
        super(caloricContent,id,dishName,price,typeOfMenu);
        this.timeToCook = timeToCook;

    }

    @Override
    public String toString() {
        return "Meat [timeToCook=" + timeToCook + ", getCaloricContent()=" + getCaloricContent() + ", getTypeOfMenu()="
                + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()=" + getDishName() + "]";
    }


}
