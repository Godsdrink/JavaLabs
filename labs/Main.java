package labs;

public class Main {

	public static void main(String[] args) {
		// 3 objects
		TouristTour Egypt = new TouristTour();
		TouristTour Canada = new TouristTour();
		TouristTour Japan = new TouristTour();
		// data about objects
		Egypt.resetValues(10, 20, 30.5, "Endy Goover", true);
        Canada.resetValues(40, 50, 60.5, "Steve Nuke",false);
        Japan.resetValues(70, 80, 90.5, "Bob Devil", false);
        //output object data
		System.out.println(Egypt.toString());
		System.out.println(Canada.toString());
		System.out.println(Japan.toString());	
		
		System.out.println("");
		
		Egypt.printSum();
		Canada.printSum();
		Japan.printSum();
		
		System.out.println("");
		
		Egypt.printStaticSum();
		Canada.printStaticSum();
		Japan.printStaticSum();
	}
	}


