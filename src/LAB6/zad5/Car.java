package LAB6.zad5;

import java.util.Objects;

public class Car {
    protected int speed = 0;
    private int yearOfProduction;
    private String color, manufacturer;
    Car(String color, String manufacturer, int yearOfProduction){
        this.color = color; this.manufacturer = manufacturer; this.yearOfProduction = yearOfProduction;
    }
    public int accelerate(){ if(speed < 140) speed += 20; return speed; }
    @Override
    public String toString(){ return color + " " + manufacturer + " produced in " + yearOfProduction; }
    @Override
    public boolean equals(Object o){
        Car c = (Car) o;
        return Objects.equals(color, c.color) && Objects.equals(manufacturer, c.manufacturer) && yearOfProduction == c.yearOfProduction;
    }
}
