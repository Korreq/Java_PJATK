package LAB2;

import java.util.Arrays;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość tablicy, a potem po kolei podawaj elementy tablicy");
        int size = input.nextInt();
        input.nextLine();
        String[] tab = new String[size];
        for(int i = 0; i < size;i++){
            System.out.print("tab["+i+"] = ");
            tab[i] = input.nextLine();
            System.out.println();
        }
        System.out.println(Arrays.toString(tab));
    }
}
