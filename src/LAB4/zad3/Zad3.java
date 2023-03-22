package LAB4.zad3;

public class Zad3 {
    public static void main(String[] args) {
        String[] suit = new String[52];
        int count = 0;
        for(int i = 0; i < 13; i++){
            for(int j = 0; j < 4; j++){
                Cards cards = new Cards(j,i);
                suit[count] = cards.toString();
                count++;
            }
        }
        for (String card : suit) { System.out.println(card); }
    }
}
