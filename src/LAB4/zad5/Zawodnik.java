package LAB4.zad5;

import java.util.concurrent.ThreadLocalRandom;

public class Zawodnik {
    private String name;
    private int minSpeed, maxSpeed;
    public int distance = 0;
    Zawodnik(String name, int minSpeed, int maxSpeed){
        this.name = name; this.minSpeed = minSpeed; this.maxSpeed = maxSpeed;
    }
    public void introduce(){ System.out.println("Jestem " + name + " biegam z prędkością " + minSpeed + " - " + maxSpeed + " km/h");}
    public void run(){ distance += ThreadLocalRandom.current().nextInt(minSpeed, maxSpeed + 1);}
}
