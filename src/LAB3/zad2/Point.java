package LAB3.zad2;

public class Point {
    int x, y;
    public double dBV(int x, int y){ return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));}
    public double dBP(Point point){ return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));}
    public Point(){ x = 0; y = 0; }
    public Point(int x, int y){ this.x = x; this.y = y; }
}
