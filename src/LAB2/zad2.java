package LAB2;

import java.util.Arrays;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        zad2 ZAD = new zad2();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość tablicy, a potem pierwszy element tablicy");
        int size = input.nextInt();
        int[] tab = new int[size];
        tab[0] = input.nextInt();
        for(int i = 1; i < size;i++) tab[i] = ((tab[i-1]+2)%2 == 0) ? tab[i-1] + 2 : tab[i-1] + 1;
        System.out.println(Arrays.toString(tab));
        System.out.println("Min: "+ZAD.min_arr(tab));
        System.out.println("Max: "+ZAD.max_arr(tab, size));
        System.out.println("Suma: "+ZAD.sum_arr(tab, size));
        System.out.println("Średnia: "+ZAD.avg_arr(tab, size));
        System.out.println("Mediana: "+ZAD.med_arr(tab, size));
    }
    public int min_arr(int[] arr){
        return arr[0];
    }
    public int max_arr(int[] arr, int size){
        return arr[size-1];
    }
    public int sum_arr(int[] arr, int size){
        int sum = 0;
        for(int i = 0; i < size;i++) sum += arr[i];
        return sum;
    }
    public double avg_arr(int[ ] arr, int size){
        return (double) sum_arr(arr, size)/size;
    }
    public double med_arr(int[] arr, int size){
        return (size % 2 == 0)? arr[size/2] + arr[(size/2)-1] : arr[size/2];
    }
}
