package LAB5.zad1;

public class Dog extends Animal{
    Dog(String color) {
        super(color);
        name = "Pies";
        sound = "Hau";
    }
    void superMakeSound(){
        super.makeSound();
    }
    @Override
    void makeSound() {
        System.out.println(name + " koloru " + color + " robi " + sound);
    }
}
