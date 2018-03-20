package ua.lviv.iot;
public class Soup extends Dish {
    private int ingridients;



    public Soup(double caloricContent, String dishName, double price, String typeOfMenu, int ingridients) {
        super(caloricContent, dishName, price, typeOfMenu);
        this.ingridients = ingridients;
    }

    @Override
    public String toString() {
        return "Soup [ingridients=" + ingridients + ", getCaloricContent()=" + getCaloricContent() + ", getTypeOfMenu()="
                + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()=" + getDishName() + "]";
    }

}
