package LAB5.zad2;

import java.util.Arrays;

public class Bakery extends Shop{
    public Bakery(String address, int size){
        super(address, size);
    }
    private final String[] products = {"Bread","Cake","Cookies"};
    private String superGetInformation(){
        return super.getInformation();
    }
    @Override
    public String getInformation(){
        return superGetInformation() + "\nList of products: " + Arrays.toString(products);
    }
}
