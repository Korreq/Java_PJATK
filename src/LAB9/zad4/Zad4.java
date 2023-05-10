package LAB9.zad4;

import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args) {
        NameComparator sortByName = new NameComparator();
        NumberComparator sortByNumber = new NumberComparator();
        MaxSpeedComparator sortBySpeed = new MaxSpeedComparator();
        Contestant[] contestants = {
                new Contestant("Dorothy", "McFall",425,10),
                new Contestant("James", "Mercado",310,24),
                new Contestant("Frances", "Pannell",217,15),
                new Contestant("Guy", "Bell",532,25),
                new Contestant("Maxine", "Graham",334,8),
                new Contestant("Cameron", "Robinette",513,13)
        };
        System.out.println(Arrays.toString(contestants));
        Arrays.sort(contestants, sortByName);
        System.out.println(Arrays.toString(contestants));
        Arrays.sort(contestants, sortByNumber);
        System.out.println(Arrays.toString(contestants));
        Arrays.sort(contestants, sortBySpeed);
        System.out.println(Arrays.toString(contestants));
    }
}
