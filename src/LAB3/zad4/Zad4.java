package LAB3.zad4;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fan fan = new Fan();
        fan.desc();
        System.out.println("Podaj kolejno: tryb(LOW,MEDIUM,HIGH,OFF), promień wiatraka i jego kolor");
        String mode = input.nextLine();
        int radius = input.nextInt();
        input.nextLine();
        String color = input.nextLine();
        Fan fan1 = new Fan(Fan.Mode.valueOf(mode), radius, color);
        fan1.desc();
    }
}
