package LAB6.zad5;

public class Zad5 {
    public static void main(String[] args) {
        Car car1 = new Car("Black", "Renault", 2020);
        FastCar car2 = new FastCar("Black", "Renault", 2020);
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));
    }
}
