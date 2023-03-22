package LAB4.zad2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    private int desiredNumber(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public void game(int min, int max){
        Scanner input = new Scanner(System.in);
        int number = desiredNumber(min, max), tries = 0;
        System.out.println("Program wybrał liczbę z podanego przedziału, podaj ją aby wygrać");
        while (tries < 5){
            tries++;
            int choice = input.nextInt();
            if(choice < number) System.out.println("Za mała");
            else if (choice > number) System.out.println("Za duża");
            else { System.out.println("Zgadłeś liczbę"); break; }
        }
        if(tries < 5) System.out.println("Ilość prób: " + tries);
        else System.out.println("Nie udało ci się odgadnąć liczby " + number);
    }
}
