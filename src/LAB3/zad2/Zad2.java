package LAB3.zad2;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point origin = new Point();
        int x, y;
        System.out.println("Podaj x i y dla pierwszego punktu");
        Point point = new Point(input.nextInt(), input.nextInt());
        System.out.println("Podaj x i y dla drugiego punktu");
        x = input.nextInt(); y = input.nextInt();
        Point point2 = new Point(x, y);
        System.out.println("Dystans od (0,0) do ("+ x + "," + y + "): " + origin.dBV(x, y));
        System.out.println("Dystans od (" + x +","+ y + ") do (" + point.x + "," + point.y + "): " + point.dBP(point2));
    }
}
