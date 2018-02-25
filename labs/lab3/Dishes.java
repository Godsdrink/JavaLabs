package labs;

public class Dishes {
	 public double caloricContent = 0;
	public String typeOfMenu;
	private double price;
	private String dishName; 
public double getCaloricContent() {
		return caloricContent;
	}
	public void setCaloricContent(double caloricContent) {
		this.caloricContent = caloricContent;
	}
	public String getTypeOfMenu() {
		return typeOfMenu;
	}
	public void setTypeOfMenu(String typeOfMenu) {
		this.typeOfMenu = typeOfMenu;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	// constructor with all parameters
	Dishes(double caloricContent, String dishName, double price, String typeOfMenu){
		this.caloricContent = caloricContent ;
		this.dishName = dishName;
		this.price = price;
		this.typeOfMenu = typeOfMenu; 
		
	}
	// constructor without parameters
	Dishes(){
		this.caloricContent = 0 ;
		this.dishName = "dishName";
		this.price = 0;
		this.typeOfMenu = "typeOfMenu"; 
		
	}
public void getInfo() {
	System.out.println(getTypeOfMenu());
	System.out.println(getCaloricContent());
	System.out.println(getPrice());
	System.out.println(getDishName());
	
}
}
