package LAB4.zad5;

public class Zad5 {
    public static void main(String[] args) {
        int winnerId = -1;
        Zawodnik[] contestants = { new Zawodnik("Robert", 2, 12), new Zawodnik("Janusz", 4, 10), new Zawodnik("Tadeusz", 6, 8)};
        while (contestants[0].distance < 50 && contestants[1].distance < 50 && contestants[2].distance < 50){
            for(int i = 0; i < 3; i++){
                contestants[i].run();
                if(contestants[i].distance >= 50){
                    winnerId = i;
                    break;
                }
            }
        }
        contestants[winnerId].introduce();
    }
}
