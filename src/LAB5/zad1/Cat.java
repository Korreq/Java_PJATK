package LAB5.zad1;

public class Cat extends Animal{
    Cat( String color){
        super(color);
        name = "Kot";
        sound = "Miau";
    }
    void superMakeSound(){
        super.makeSound();
    }
    @Override
    void makeSound() {
        System.out.println(name + " koloru " + color + " robi " + sound);
    }
}
