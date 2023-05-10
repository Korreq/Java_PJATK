package LAB9.zad2;

public class Zad2 {
    public static void main(String[] args) {
        Slownik<Integer, String> slownik = new Slownik<>(5);
        slownik.dodaj(0,"A");
        slownik.dodaj(1,"B");
        slownik.dodaj(2,"C");
        slownik.dodaj(0,"D");
        System.out.println( slownik );
        System.out.println( slownik.czyZawiera(1) + " " + slownik.czyZawiera(3) );
        System.out.println( slownik.wielkosc() );
    }
}
