package ua.lviv.iot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DishWriter {

    public final void writeToFile(final List<Dish> dishes) {
        try (PrintWriter writer = new PrintWriter("staff.csv")) {
            for (Dish dish : dishes) {
                writer.println(dish.getHeaders());
                writer.println(dish.toCSV());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
