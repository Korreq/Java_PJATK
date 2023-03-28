package LAB5.zad2;

public class Zad2 {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop("3414 Dogwood Road", 30);
        Bakery bakery = new Bakery("1717 Metz Lane", 15);
        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}
