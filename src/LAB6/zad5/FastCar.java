package LAB6.zad5;

import java.util.Objects;

public class FastCar extends Car{
    FastCar(String color, String manufacturer, int yearOfProduction){
        super(color,manufacturer,yearOfProduction);
    }
    public int accelerate(){ if(speed < 200) speed += 20; return speed; }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof FastCar)){
            return false;
        }
        return true;
    }
}
