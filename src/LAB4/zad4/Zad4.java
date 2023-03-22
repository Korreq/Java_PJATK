package LAB4.zad4;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Coin coin = new Coin();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilość rzutów monetą");
        int times = input.nextInt();
        double headsPercentage = coin.coinFlip(times) * 100;
        System.out.printf("%.1f", headsPercentage);
        System.out.print("% orzeł | ");
        System.out.printf("%.1f", (100 - headsPercentage));
        System.out.print("% rzeszka dla " + times + " rzutów.");
    }
}
