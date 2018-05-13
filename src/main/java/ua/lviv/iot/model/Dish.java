package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
public class Dish {
//    private static Dish value;
//    private static Integer key;
    @Column(name = "caloricContent")
    public double caloricContent;
    @Column(name = "typeOfMenu")
    public String typeOfMenu;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "dishName")
    private String dishName;

    @Column(name = "price")
    private double price;

    public Dish() {
    }

    // constructor with all parameters
    public Dish(double caloricContent, final Integer id,  String dishName, double price, String typeOfMenu) {
        super();
        this.caloricContent = caloricContent;
        this.dishName = dishName;
        this.price = price;
        this.typeOfMenu = typeOfMenu;
        this.id = id;
    }

    public Dish(double caloricContent, String typeOfMenu, double price, String dishName) {
        this.caloricContent = caloricContent;
        this.typeOfMenu = typeOfMenu;
        this.price = price;
        this.dishName = dishName;
        this.id = id;

    }

//    public Dish getValue() {
//        return this;
//    }
//
//    public static Integer getKey() {
//        return key;
//    }

    public double getCaloricContent() {
        return caloricContent;
    }

    public void setCaloricContent(double caloricContent) {
        this.caloricContent = caloricContent;
    }

    public String getTypeOfMenu() {
        return typeOfMenu;
    }

//        // constructor without parameters
//        Dish(double caloricContent, Integer id, String dishName, double price, String typeOfMenu) {
//            this.caloricContent = 0.1;
//            this.dishName = "dishName";
//            this.price = 0;
//            this.typeOfMenu = "typeOfMenu";
//            this.id = 1;

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

    public String getHeaders() {
        return ("caloricContent, dishName, price, typeOfMenu");
    }

    public String toCSV() {
        return getCaloricContent() + "," + getDishName() + "," + getPrice() + "," + getTypeOfMenu();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
//        public void getInfo() {
//            System.out.println(getTypeOfMenu());
//            System.out.println(getCaloricContent());
//            System.out.println(getPrice());
//            System.out.println(getDishName());
//
//        }


