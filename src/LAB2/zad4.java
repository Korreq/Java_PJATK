package LAB2;

import java.util.Arrays;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        zad4 ZAD = new zad4();
        Scanner input = new Scanner(System.in);
        int[][] tab;
        System.out.println("Podaj szerokość i wysokość macierzy");
        int rows = input.nextInt(), columns = input.nextInt();
        tab = new int[columns][rows];
        System.out.println("Wpisz do macierzy liczby");
        for(int j = 0; j < columns; j++){
            for (int i = 0; i < rows; i++){
                tab[j][i] = input.nextInt();
            }
        }
        ZAD.draw_arr(tab);
    }
    public void draw_arr(int[][] arr){
        for (int[] array : arr) System.out.println(Arrays.toString(array));
    }
}
