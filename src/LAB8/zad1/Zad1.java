package LAB8.zad1;

public class Zad1 {
    public static void main(String[] args) {
        String catalogName = "src\\LAB8\\zad1\\exercise";
        CreateFileDir createFileDir = new CreateFileDir(catalogName);
        createFileDir.create("1", true);
        createFileDir.create("2", true);
        createFileDir.create("3", true);
        createFileDir.create("f1.txt", false);
        createFileDir.create("f2.txt", false);
        createFileDir.create("f3.txt", false);
        InformationProvider informationProvider = new InformationProvider(catalogName);
        informationProvider.displayInformation();
    }
}
