package LAB10.zad3;

public class Zad3 {
    public static void main(String[] args) {
        String text = "Ala ma kota, kot ma Alę";
        CountWordsInText countWordsInText = new CountWordsInText(text);
        System.out.println(countWordsInText.countWordsInText());
    }
}
