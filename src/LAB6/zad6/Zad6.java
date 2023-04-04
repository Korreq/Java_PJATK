package LAB6.zad6;

public class Zad6 {
    public String concentrateStrings(int index, String... text){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < text.length; i += index){
            stringBuilder.append(text[i]).append(" ");
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Zad6 zad6 = new Zad6();
        System.out.println(zad6.concentrateStrings(2,"Ala", "nie", "ma", "test" , "kota i", "psa", "papugę"));
    }
}
