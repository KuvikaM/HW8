package fileWork;

import flowers.Flower;

import java.io.FileWriter;

/**
 * Created by Liongate on 15.08.2017.
 */
public class FlowersSaver {

private FlowersSaver(){}

    public static void save(String fileName, Flower[] flowers){
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("" + flowers.length + "\n");
            for (Flower value : flowers) {
                writer.write("" + value + " ");
            }
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }


    }


}
