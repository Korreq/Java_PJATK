package LAB8.zad2;

public class Zad2 {
    public static void main(String[] args) {
        String file = "src\\LAB8\\zad2\\Input";
        ReadFile readFile = new ReadFile(file);
        System.out.println(readFile.sumOfEvenLines());
    }


}
