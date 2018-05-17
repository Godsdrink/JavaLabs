package labs;

public class Main {

	public static void main(String[] args) {
		// 3 objects
		TouristTour egypt = new TouristTour();
		TouristTour canada = new TouristTour(40, 50, 60.5, "Name Surname");
		TouristTour japan = new TouristTour(70, 80, 90.5, "Name Surname", true);
		// data about objects
		egypt.resetValues(10, 20, 30.5, "Endy Goover", true);
		canada.resetValues(40, 50, 60.5, "Steve Nuke", false);
		japan.resetValues(70, 80, 90.5, "Bob Devil", false);
		// output object data
		System.out.println(egypt.toString());
		System.out.println(canada.toString());
		System.out.println(japan.toString());

		System.out.println("");

		egypt.printSum();
		canada.printSum();
		japan.printSum();

		System.out.println("");

		TouristTour.printStaticSum();
		
	}
}
