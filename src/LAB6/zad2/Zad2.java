package LAB6.zad2;

public class Zad2 {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order(12);
        Position bread = new Position("Bread", 2,1.87);
        Position apple = new Position("Apple", 8,1);
        order2.addPosition(bread);
        order2.addPosition(apple);
        System.out.println(order1);
        System.out.println(order2);
    }
}
