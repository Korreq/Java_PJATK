package LAB8.zad3;

public class Zad3 {
    public static void main(String[] args) {
        String directory = "src\\LAB8\\zad3\\basedir";
        AnalyzeDirectory analyzeDirectory = new AnalyzeDirectory(directory);
        analyzeDirectory.findBiggestDirectory();
    }
}
