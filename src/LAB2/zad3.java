package LAB2;

import java.util.Arrays;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        zad3 ZAD = new zad3();
        System.out.println("Podaj rozmiar dwóch tablic, a potem zaczynając od pierwszej ich liczby");
        Scanner input = new Scanner(System.in);
        int size1 = input.nextInt(), size2 = input.nextInt();
        int[] tab1 = new int[size1], tab2 = new int[size2];
        for(int i = 0; i < size1; i++) tab1[i] = input.nextInt();
        for(int i = 0; i < size2; i++) tab2[i] = input.nextInt();
        System.out.println(Arrays.toString(tab1)+" + "+Arrays.toString(tab2)+" -> "+Arrays.toString(ZAD.sum_arr(tab1, size1, tab2, size2)));
    }
    public int[] sum_arr(int[] arr1,int size1, int[] arr2, int size2){
        int[] sum_arr;
        if(size1 == size2) sum_arr = new int[size1];
        else return sum_arr = new int[0];
        for(int i = 0; i < size1;i++) sum_arr[i] = arr1[i] + arr2[i];
        return sum_arr;
    }

}
