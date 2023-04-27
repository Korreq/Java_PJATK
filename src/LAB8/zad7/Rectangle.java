package LAB8.zad7;

public class Rectangle implements Figure{
    private int a,b;
    Rectangle(int a, int b){ this.a = a; this.b = b; }
    public int calculateArea(){ return a * b; }
    public int calculatePerimeter(){ return (2 * a) + (2 * b); }
}
