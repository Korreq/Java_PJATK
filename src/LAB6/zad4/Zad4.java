package LAB6.zad4;

public class Zad4 {
    public static void main(String[] args) {
        Time time1 = new Time(12,39);
        Time time2 = new Time(9, 72);
        System.out.println(time2);
        System.out.println(time1.addSubtractTime(time2,false));
        System.out.println(time2.multiplyTime(3));

    }
}
