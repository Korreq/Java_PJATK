package LAB6.zad2;

public class Position {
    private String productName;
    private int count;
    private double pricePerPiece;
    Position(String productName, int count, double pricePerPiece){
        this.productName = productName; this.count = count; this.pricePerPiece = pricePerPiece;
    }
    double calculateValue(){ return pricePerPiece * count; }
    @Override
    public String toString(){
        return productName + " $" + String.format("%.2f", pricePerPiece) + " " + count + " $" + String.format("%.2f", calculateValue());
    }
}
