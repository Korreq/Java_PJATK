package LAB5.zad2;

public class Shop {
    protected String address;
    protected int size;
    public String getInformation(){ return "Address: " + address + " Size: " + size + "m2"; }
    protected Shop(String address, int size){
        this.address = address; this.size = size;
    }
}
