package ua.lviv.iot.model;

public class SideDish extends Dish {
    private double volume;

    public SideDish(double caloricContent,final Integer id, final String dishName, double price, String typeOfMenu, double volume) {
        super(caloricContent,id,dishName,price,typeOfMenu);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SideDish [volume=" + volume + ", getCaloricContent()=" + getCaloricContent() + ", getTypeOfMenu()="
                + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()=" + getDishName() + "]";
    }

}

