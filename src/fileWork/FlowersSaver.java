package fileWork;

import flowers.Flower;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

/**
 * Created by Liongate on 15.08.2017.
 */
public class FlowersSaver {

private FlowersSaver(){}

    public static void saveObj(String fileName, Flower[] flowers)

    {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(flowers);
            oos.flush();
            oos.close();
            }

         catch (Exception e){
            e.printStackTrace();
        }


    }

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
