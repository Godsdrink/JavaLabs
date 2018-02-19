package labs;

public class TouristTour {
	private int discount;
	private int quantity;
	private double price;
	private String NameOfTourist;
	private boolean vip = false;
	static private int TotalQuantity = 0;

	// default constructor
	TouristTour() {
		this.quantity = 100;
		this.discount = 30;
		this.price = 300;
		this.NameOfTourist = "Name Surname";
		TotalQuantity += quantity;
	}

	// constructor with 4 parameters
	TouristTour(int amount, int discount, double price, String NameOfTourist) {
		this.quantity = amount;
		this.discount = discount;
		this.price = price;
		this.NameOfTourist = NameOfTourist;
		TotalQuantity += quantity;
	}

	// constructor with 5 parameters
	TouristTour(int quantity, int discount, double price, String NameOfTourist, boolean vip) {
		this.quantity = quantity;
		this.discount = discount;
		this.price = price;
		this.NameOfTourist = NameOfTourist;
		this.vip = vip;
		TotalQuantity += quantity;
	}


	public int GetQuantity() {
		return this.quantity;
	}

	// method displays information about the object
	public String toString() {
		return "Name of tourist:" + this.NameOfTourist + ", discount:" + this.discount + ", Price:" + this.price
				+ ", vip:" + this.vip + ", Quantity: " + this.quantity;
	}

	// method displays the value of the static field
	public static void printStaticSum() {
		System.out.println("Static field from method printStaticSum: " + TotalQuantity);
	}

	// method displays the value of the static field
	public void printSum() {
		System.out.println("Static field from method printSum: " + TotalQuantity);
	}

	void resetValues(int quantity, int discount, double price, String NameOfTourist, boolean vip) {
		TotalQuantity -= this.quantity;
		TotalQuantity += quantity;
		this.quantity = quantity;
		this.discount = discount;
		this.price = price;
		this.NameOfTourist = NameOfTourist;
		this.vip = vip;

	}
}
