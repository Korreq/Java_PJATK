package LAB4.zad4;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Coin {
    double coinFlip(int times){
        int countHeads = 0, flip;
        for( int i = 0; i < times; i++){
            flip = ThreadLocalRandom.current().nextInt(0,2);
            if(flip == 0) countHeads++;
        }
        return (double) countHeads / times;
    }
}
