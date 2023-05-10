package LAB9.zad4;

import java.util.Comparator;

public class MaxSpeedComparator implements Comparator<Contestant> {
    public int compare(Contestant a, Contestant b){
        return a.getMaxSpeed() - b.getMaxSpeed();
    }
}
