package LAB5.zad2;

import java.util.Arrays;

public class Bookshop extends Shop{
    public Bookshop(String address, int size){
        super(address, size);
    }
    private final String[] products = {"Book1","Book2","Book3"};

    private String superGetInformation(){
        return super.getInformation();
    }
    @Override
    public String getInformation(){
        return superGetInformation() + "\nList of products: " + Arrays.toString(products);
    }
}
