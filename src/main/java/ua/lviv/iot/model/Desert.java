package ua.lviv.iot.model;

public class Desert extends Dish {
    private double sugarContent;

    public Desert(double caloricContent, final Integer id, final String dishName, double price, String typeOfMenu, double sugarContent) {
        super(caloricContent,id,dishName,price,typeOfMenu);
        this.sugarContent = sugarContent;
    }


    @Override
    public String toString() {
        return "Desert [sugarContent=" + sugarContent + ", getCaloricContent()=" + getCaloricContent()
                + ", getTypeOfMenu()=" + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()="
                + getDishName() + "]";
    }
}
