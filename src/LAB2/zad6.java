package LAB2;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        zad6 ZAD = new zad6();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int n1 = input.nextInt(), n2 = input.nextInt();
        System.out.println("NWD: "+ZAD.NWD(n1, n2));
    }
    public int NWD(int number1, int number2){
        while(number1 != number2){
            if(number1 > number2) number1 -= number2;
            else number2 -= number1;
        }
        return number1;
    }
}
