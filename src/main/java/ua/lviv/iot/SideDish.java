package ua.lviv.iot;

public class SideDish extends Dish {
    private double volume;

    public SideDish(double caloricContent, String dishName, double price, String typeOfMenu, double volume) {
        super(caloricContent, dishName, price, typeOfMenu);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SideDish [volume=" + volume + ", getCaloricContent()=" + getCaloricContent() + ", getTypeOfMenu()="
                + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()=" + getDishName() + "]";
    }

}

