package LAB3.zad6;

public class Character {
    Character(int hp, int dmg, int armor, boolean isDead, String name){
        this.hp = hp; this.dmg = dmg; this.armor = armor; this.isDead = isDead; this.name = name;
    }
    int hp, dmg, armor;
    String name;
    boolean isDead;
    public void status(){
        System.out.println( name + "\nPunkty życia: " + hp );
    }
    public int diceRoll(){ return (int) (Math.random() * (20 - 1)) + 1;}
}
