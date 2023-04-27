package LAB8.zad4;

public class Zad4 {
    public static void main(String[] args) {
        String initialDirectory = "src\\LAB8\\zad4\\inbound", targetDirectory = "src\\LAB8\\zad4\\outbound";
        FileManipulation fileManipulation = new FileManipulation(initialDirectory, targetDirectory);
        fileManipulation.moveAndChangeFiles();


    }
}
