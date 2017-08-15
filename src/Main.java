import flowers.Flower;
import flowers.FlowerStore;

/**
 * Created by Liongate on 15.08.2017.
 */
public class Main {




    public static void main(String[] args) {

        FlowerStore store = new FlowerStore();
        System.out.println("Total purse: " + store.getPurse());

        Flower[] flowers =  store.sell(2,3,4);

       store.executeInstanceOfFlowers(flowers);
        System.out.println();
        System.out.println("Total purse: "+ store.getPurse());;

        Flower[] flowers1 = store.sellSequence(2,0,5);

        store.executeInstanceOfFlowers(flowers1);
        System.out.println();
        System.out.println("Total purse: "+ store.getPurse());

    }
}
