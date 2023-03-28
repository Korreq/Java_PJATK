package LAB5.zad3;

public class Zad3 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Honda("Silver");
        cars[1] = new BMW("Black");
        cars[2] = new Ford("Blue");
        for (Car car: cars){
            System.out.println(car.color + " " + car.manufacturer + " " + car.type);
        }
    }
}
