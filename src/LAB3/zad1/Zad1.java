package LAB3.zad1;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość boku kwadratu");
        Square sqr = new Square(input.nextInt());
        System.out.println("Obwód: "+ sqr.perimeter() + "\nPole: "+ sqr.area());
    }
}
