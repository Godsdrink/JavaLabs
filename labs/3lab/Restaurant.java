package labs;

public class Restaurant {
	private int freePlaces = 50;
	private String restaurantName = " IndigoCafe ";
	private String restaurantAdress = " Getto 66 ";

	public int getFreePlaces() {
		return freePlaces;
	}

	public void setFreePlaces(int freePlaces) {
		this.freePlaces = freePlaces;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantAdress() {
		return restaurantAdress;
	}

	public void setRestaurantAdress(String restaurantAdress) {
		this.restaurantAdress = restaurantAdress;
	}

	public void getInformation() {
		System.out.println(getRestaurantName());
		System.out.println(getFreePlaces());
		System.out.println(getRestaurantAdress());
	}
	
}
