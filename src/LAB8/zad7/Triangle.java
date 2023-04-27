package LAB8.zad7;

public class Triangle implements Figure{
    private int a,b,c,h;
    Triangle(int a, int b, int c, int h){ this.a = a; this.b = b; this.c = c; this.h = h; }
    public int calculateArea(){ return (a * h)/2; }
    public int calculatePerimeter(){ return a + b + c; }
}
