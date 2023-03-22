package LAB4.zad2;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        System.out.println("Podaj minimalny i maksymalny przedział losowanej liczby");
        int min = input.nextInt(), max = input.nextInt();
        guessNumber.game(min, max);
    }
}
