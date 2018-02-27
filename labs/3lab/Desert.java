package labs;

public class Desert extends Dish {
	private double sugarContent;

	public Desert(double caloricContent, String dishName, double price, String typeOfMenu, double sugarContent) {
		super(caloricContent, dishName, price, typeOfMenu);
		this.sugarContent = sugarContent;
	}

	public double getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(double sugarContent) {
		this.sugarContent = sugarContent;
	}

	@Override
	public String toString() {
		return "Desert [sugarContent=" + sugarContent + ", getCaloricContent()=" + getCaloricContent()
				+ ", getTypeOfMenu()=" + getTypeOfMenu() + ", getPrice()=" + getPrice() + ", getDishName()="
				+ getDishName() + "]";
	}
}
