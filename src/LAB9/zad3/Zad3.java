package LAB9.zad3;

import java.io.File;

public class Zad3 {
    public static void main(String[] args) {
        Slownik<String, String> dictionary = Slownik.wczytajSlownik(new File("src\\LAB9\\zad3\\text.txt"));
        System.out.println(dictionary);
    }
}