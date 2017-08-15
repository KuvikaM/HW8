package flowers;

/**
 * Created by Liongate on 15.08.2017.
 */
public class FlowerStore {

    public Flower[] sell(int roseCount , int chamomileCount , int tulipCount)
    {

        int size = roseCount + chamomileCount + tulipCount;

        Flower [] flowers = new Flower[size];

        int j = 0 ;

        for (int i = 0 ; i < roseCount ; i++)
        {
            flowers[j] = new Rose();
            j++;
        }

        for (int i = 0 ; i < chamomileCount ; i++)
        {
            flowers[j] = new Chamomile();
            j++;
        }

        for (int i = 0 ; i < tulipCount ; i++)
        {
            flowers[j] = new Tulip();
            j++;
        }

        return flowers;

    }


    public Flower[] sellSequence(int roseCount , int chamomileCount , int tulipCount)
    {
        int i=0;
        int counterRose = 0;
        int counterChamomile = 0;
        int counterTulip = 0;

        int size = roseCount + chamomileCount + tulipCount;

        Flower [] flowers = new Flower[size];


        while (i < flowers.length)
        {
            if(counterRose < roseCount) {
                flowers[i++] = new Rose();
                counterRose++;}

            if (counterChamomile < chamomileCount) {
                flowers[i++] = new Chamomile();
                counterChamomile++;}


            if (counterTulip < tulipCount) {
                flowers[i++] = new Tulip();
                counterTulip++;}

        }

        return flowers;

    }

    public static void executeInstanceOfFlowers(Flower[] flowers) {
        for(Flower arrayElement : flowers) {

            arrayElement.show();
            System.out.print(" , ");
        }
    }

}
