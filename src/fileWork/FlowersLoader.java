package fileWork;

import flowers.Flower;
import flowers.FlowerStore;
import flowers.Rose;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;

/**
 * Created by Liongate on 15.08.2017.
 */
public class FlowersLoader {

    private FlowersLoader(){};

    public static Flower[] load(String fileName){
            try {
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream oin = new ObjectInputStream(fis);
                Flower[] flowers = (Flower[]) oin.readObject();
                return flowers;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

    }

