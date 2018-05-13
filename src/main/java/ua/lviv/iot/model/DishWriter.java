package ua.lviv.iot.model;

import java.io.*;
import java.util.List;

public class DishWriter {

    public void writeToFile(final List<Dish> dishList) throws IOException {
        File file = new File("myfile.csv");
        if (!file.exists()){
            file.createNewFile();
        }

        try (OutputStream stream = new FileOutputStream(file);
             PrintWriter writer = new PrintWriter(stream); ){



            for (Dish dish : dishList) {
                writer.println(dish.getHeaders());
                writer.println(dish.toCSV());
                writer.println("");
            }
            writer.close();
        }
        catch (IOException e) {
            throw e;
        }

    }
}
