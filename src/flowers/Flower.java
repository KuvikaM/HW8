package flowers;

import java.io.Serializable;

/**
 * Created by Liongate on 15.08.2017.
 */
public class Flower implements Serializable {
    int price;

    Flower(){

    price = 0;

    }



    public void show() {
        System.out.print("Это цветок");
    }
    protected int countFlower;
}
