package LAB6.zad2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private int maxSize;
    private Position[] positions = {
      new Position("Keyboard", 5,10.99),
      new Position("CD", 30,1.05),
      new Position("USB drive", 3,21.87),
      new Position("Speakers", 1,32),
      new Position("Keyboard", 5,10.99),
      new Position("TV", 1,199.99),
      new Position("MP3 player", 20,4.59),
      new Position("Watch", 4,20.20),
      new Position("Controller", 10,12.99),
      new Position("Charger", 2,7),
    };
    private List<Position> positionsList = Arrays.asList(positions);
    private LinkedList<Position> positionsLinkedList = new LinkedList<Position>(positionsList);
    Order(int maxSize){ this.maxSize = maxSize; }
    Order(){ maxSize = 10; }
    public void addPosition(Position position){
        positionsLinkedList.add(position);
        positions = positionsLinkedList.toArray(new Position[0]);
        positionsList = Arrays.asList(positions);
    }
    private double calculateOrderValue(){
        double sum = 0;
        for(int i = 0; i < maxSize && i < positions.length; i++){
            sum += positions[i].calculateValue();
        }
        return sum;
    }
    @Override
    public String toString(){
        StringBuilder positionsDisplay = new StringBuilder();
        for(int i = 0; i < maxSize && i < positions.length; i++){
            positionsDisplay.append(positions[i]).append("\n");
        }
        return "Order:\n"+ positionsDisplay + "\nTotal: " + String.format("%.2f",calculateOrderValue());
    }
}
