package LAB10.zad1;

import java.util.ArrayList;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);
        integerList.add(5);
        integerList.add(5);
        DuplicatesInList.showDuplicates(integerList);
        DuplicatesInList.deleteDuplicates(integerList);
        System.out.println(integerList);
    }
}
