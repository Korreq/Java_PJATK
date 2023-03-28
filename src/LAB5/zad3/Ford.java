package LAB5.zad3;

public class Ford extends Car{
    private boolean isMakingSmallCars = false;
    Ford(String color){
        super(color);
        manufacturer = "Ford";
        type = "big pickup truck";
    }
}
