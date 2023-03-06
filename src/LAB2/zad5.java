package LAB2;

import java.util.Arrays;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        zad5 ZAD = new zad5();
        Scanner input = new Scanner(System.in);
        int[][] tab1, tab2;
        System.out.println("Podaj szerokość i wysokość pierwszej macierzy");
        int rows1 = input.nextInt(), columns1 = input.nextInt();
        tab1 = new int[columns1][rows1];
        System.out.println("Podaj szerokość i wysokość drugiej macierzy");
        int rows2 = input.nextInt(), columns2 = input.nextInt();
        tab2 = new int[columns2][rows2];
        ZAD.write_array(tab1, rows1, columns1);
        ZAD.write_array(tab2, rows2, columns2);
        ZAD.draw_arr(ZAD.sum_array(tab1, rows1, columns1, tab2, rows2, columns2));
    }
    public int[][] write_array(int[][] arr, int rows, int columns){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dane dla macierzy");
        for(int j = 0; j < columns; j++){
            for (int i = 0; i < rows; i++){
                arr[j][i] = input.nextInt();
            }
        }
        return arr;
    }
    public int[][] sum_array(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        int[][] sum_array;
        if(r1 != r2 || c1 != c2) return sum_array = new int[0][0];
        sum_array = new int[c1][r1];
        for(int j = 0; j < c1; j++){
            for(int i = 0; i < r1; i++){
                sum_array[j][i] = arr1[j][i] + arr2[j][i];
            }
        }
        return sum_array;
    }
    public void draw_arr(int[][] arr){
        for (int[] array : arr) System.out.println(Arrays.toString(array));
    }
}
