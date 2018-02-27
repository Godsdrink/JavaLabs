package labs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// initialization of objects
		Meat burger = new Meat(200, "Burger", 200, "FastFood", 20);
		Soup tomatoSoup = new Soup(100, "TomatoSoup", 5, "Soup", 1);
		Desert icecream = new Desert(410.9, "Ice-cream", 17, "Desert", 150);
		SideDish potatoes = new SideDish(200.5, "Potatoes", 100, "SideDish", 100);
		Soup cheeseSoup = new Soup(130.3, "CheeseSoup", 120, "Soup", 5);

		DishesManager disheManager = new DishesManager();
		disheManager.addDish(burger);
		disheManager.addDish(tomatoSoup);
		disheManager.addDish(icecream);
		disheManager.addDish(potatoes);
		disheManager.addDish(cheeseSoup);

		System.out.println("1) ������� �� ������ ����������� ����������");
		System.out.println("2) ������� ����� �� ����� ����");
		System.out.println("3) �������� ���������� ��� ��������");
		System.out.println("4) �������� ���� ��*���� ����� Soup");
		System.out.println("5) �������� ���� ��*���� ����� Meat");
		System.out.println("6) �������� ���� ��*���� ����� Desert");
		System.out.println("7) �������� ���� ��*���� ����� SideDish");
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		int number = 0;

		do {
			number = reader.nextInt(); // Scans the next token of the input as an int.
			switch (number) {

			case 1:
				number = 1;// ����� �� �������� ����������
				disheManager.sortByCalorie();
				disheManager.printCaloricContent();
				break;
			case 2: // ���� �� ����� ����
				number = 2;
				Scanner read = new Scanner(System.in); // Reading from System.in
				System.out.println("Enter a TypeOfMenu: ");
				String word = read.next(); // Scans the next token of the input as an int.

				System.out.println(disheManager.searchByMenu(word));
				break;
			case 3: // ���������� ��� ��������
				number = 3;
				disheManager.getInformation();

				break;
			case 4:// �������� ���� ��*���� ����� soup
				number = 4;
				System.out.println(cheeseSoup.toString());
				break;
			case 5: // �������� ���� ��*���� ����� meat
				number = 5;
				System.out.println(burger.toString());
				break;
			case 6: // �������� ���� ��*���� ����� desert
				number = 6;
				System.out.println(icecream.toString());
				break;
			case 7: // �������� ���� ��*���� ����� SideDish
				number = 7;
				System.out.println(potatoes.toString());
				break;

			}
		} while (number != 0);
	};
}
