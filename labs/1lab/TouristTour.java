package labs;

public class TouristTour {
	private int discount;
	private int quantity;
	private double price;
	private String nameOfTourist;
	private boolean vip = false;
	static private int totalQuantity = 0;

	// default constructor
	TouristTour() {
		this.quantity = 100;
		this.discount = 30;
		this.price = 300;
		this.nameOfTourist = "Name Surname";
		totalQuantity += quantity;
	}

	// constructor with 4 parameters
	TouristTour(int amount, int discount, double price, String nameOfTourist) {
		this.quantity = amount;
		this.discount = discount;
		this.price = price;
		this.nameOfTourist = nameOfTourist;
		totalQuantity += quantity;
	}

	// constructor with 5 parameters
	TouristTour(int quantity, int discount, double price, String nameOfTourist, boolean vip) {
		this.quantity = quantity;
		this.discount = discount;
		this.price = price;
		this.nameOfTourist = nameOfTourist;
		this.vip = vip;
		totalQuantity += quantity;
	}


	public int GetQuantity() {
		return this.quantity;
	}

	// method displays information about the object
	public String toString() {
		return "Name of tourist:" + this.nameOfTourist + ", discount:" + this.discount + ", Price:" + this.price
				+ ", vip:" + this.vip + ", Quantity: " + this.quantity;
	}

	// method displays the value of the static field
	public static void printStaticSum() {
		System.out.println("Static field from method printStaticSum: " + totalQuantity);
	}

	// method displays the value of the static field
	public void printSum() {
		System.out.println("Static field from method printSum: " + totalQuantity);
	}

	void resetValues(int quantity, int discount, double price, String nameOfTourist, boolean vip) {
		totalQuantity -= this.quantity;
		totalQuantity += quantity;
		this.quantity = quantity;
		this.discount = discount;
		this.price = price;
		this.nameOfTourist = nameOfTourist;
		this.vip = vip;

	}
}
