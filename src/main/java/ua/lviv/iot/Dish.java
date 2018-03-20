package ua.lviv.iot;
    public abstract class Dish  {
        public double caloricContent;
        public String typeOfMenu;
        private double price;
        private String dishName;

        public double getCaloricContent() {
            return caloricContent;
        }



        public String getTypeOfMenu() {
            return typeOfMenu;
        }



        public double getPrice() {
            return price;
        }



        public String getDishName() {
            return dishName;
        }



        // constructor with all parameters
        Dish(double caloricContent, String dishName, double price, String typeOfMenu) {
            this.caloricContent = caloricContent;
            this.dishName = dishName;
            this.price = price;
            this.typeOfMenu = typeOfMenu;

        }

        // constructor without parameters
        Dish() {
            this.caloricContent = 0.1;
            this.dishName = "dishName";
            this.price = 0;
            this.typeOfMenu = "typeOfMenu";

        }
        public String getHeaders() {
            return("caloricContent, dishName, price, typeOfMenu");
        }
        public  String toCSV (){
            return getCaloricContent()+","+ getDishName()+","+getPrice()+","+getTypeOfMenu();
        }

//        public void getInfo() {
//            System.out.println(getTypeOfMenu());
//            System.out.println(getCaloricContent());
//            System.out.println(getPrice());
//            System.out.println(getDishName());
//
//        }
}

