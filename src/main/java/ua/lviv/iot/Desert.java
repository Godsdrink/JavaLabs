package ua.lviv.iot;

public class Desert extends Dish {
    private double sugarContent;

    public Desert(double caloricContent, String dishName, double price, String typeOfMenu, double sugarContent) {
        super(caloricContent, dishName, price, typeOfMenu);
        this.sugarContent = sugarContent;
    }


    @Override
    public String toString() {
        return "Desert [sugarContent=" + sugarContent + ", getCaloricContent()=" + getCaloricContent()
                + ", getTypeOfMenu()=" + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()="
                + getDishName() + "]";
    }
}
