package LAB5.zad1;

public class Animal {
    protected String name, color, sound;
    void makeSound(){ System.out.println("Nazwa: " + name + " Kolor: " + color + " Dźwięk zwierzęcia: "+sound); }
    public Animal(String color){ name = "Zwierze"; this.color = color; sound = ""; }


}
