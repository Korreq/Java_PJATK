package LAB8.zad6;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 0;
        while (exit != 1){
            System.out.println("Enter your time (hours and minutes)");
            CalculateDate calculateDate = new CalculateDate(scanner.nextInt(), scanner.nextInt());
            System.out.println("Choose from which city you want to receive the current date");
            System.out.println("0)Exit 1)Phoenix/Arizona/USA 2)Beijing/China 3)Nuuk/Greenland");
            switch (scanner.nextInt()){
                case 0 -> exit++;
                case 1 -> calculateDate.showDateInDifferentTimeZone(-9);
                case 2 -> calculateDate.showDateInDifferentTimeZone(6);
                case 3 -> calculateDate.showDateInDifferentTimeZone(-4);
            }
        }
    }
}
