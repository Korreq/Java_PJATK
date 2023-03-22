package LAB4.zad3;

public class Cards {
    private enum Color { CLUBS, DIAMONDS, HEARTS, SPADES }
    private enum Rank { R2 , R3 , R4, R5, R6, R7, R8, R9, R10, JACK, QUEEN, KING, ACE }
    Color color; Rank rank;
    Cards(int indexColor, int indexRank){
        this.color = Color.values()[indexColor];
        this.rank = Rank.values()[indexRank];
    }
    @Override
    public String toString(){ return rank + " OF " + color; }
}
