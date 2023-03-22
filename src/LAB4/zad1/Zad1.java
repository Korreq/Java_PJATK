package LAB4.zad1;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fraction fraction = new Fraction();
        System.out.println("Podaj dwa ułamki zaczynając od pierwszego licznika i mianownika");
        int numeratorA = input.nextInt(), denominatorA = input.nextInt(), numeratorB = input.nextInt(), denominatorB = input.nextInt();
        System.out.println("Wybierz jedną z opcji:\n 0 - Dodawanie, 1 - Odejmowanie, 2 - Mnożenie, 3 - Dzielenie\n");
        int option = input.nextInt();
        fraction.displayFraction(numeratorA, denominatorA, numeratorB, denominatorB, option);
    }
}