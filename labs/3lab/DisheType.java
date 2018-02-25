package labs;

public enum DisheType {

	Soup,Meat,SideDish,Desert,Drink;


public void getInfo() {
for(DisheType element: DisheType.values()) {
	 System.out.println(element);
}
}
}