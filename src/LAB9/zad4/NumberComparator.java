package LAB9.zad4;

import java.util.Comparator;

public class NumberComparator implements Comparator<Contestant> {
    public int compare(Contestant a, Contestant b){
        return a.getNumber() - b.getNumber();
    }
}
