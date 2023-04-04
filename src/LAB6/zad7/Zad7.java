package LAB6.zad7;

public class Zad7 {
    public int sumOfArrays(int[]... arr){
        int sum = 0;
        for (int[] values: arr) {
            for (int value: values) {
                sum += value;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Zad7 zad7 = new Zad7();
        int[] arr1 = {1,2,3,4,5,6,7,8,9}, arr2 = {9,8,7,6,5,4,3,2,1}, arr3 = {0,1,9,2,8,3,7,4,6,5};
        System.out.println(zad7.sumOfArrays(arr1,arr2,arr3));
    }
}
