package LAB8.zad7;

import static java.lang.Math.round;

public class Circle implements Figure{
    private int r;
    Circle(int r){ this.r = r;}
    public int calculateArea(){ return (int) Math.round(Math.PI * r * r); }
    public int calculatePerimeter(){ return (int) Math.round(Math.PI * 2 * r); }

}
