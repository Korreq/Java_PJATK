package LAB8.zad7;

public class Zad7 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(2,4),
                new Triangle(2,3,4,2),
                new Circle(4)
        };
        for ( Figure figure: figures ) {
            System.out.println(figure.calculateArea());
            System.out.println(figure.calculatePerimeter());
        }
    }
}
