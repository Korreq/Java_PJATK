package LAB9.zad4;

import java.util.Comparator;

public class NameComparator implements Comparator<Contestant> {
    public int compare(Contestant a, Contestant b){
        return a.getName().compareTo(b.getName());
    }
}
