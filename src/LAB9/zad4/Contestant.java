package LAB9.zad4;

public class Contestant{
    private String name, surname;
    private int number, maxSpeed;
    Contestant(String name, String surname, int number, int maxSpeed){
        this.name = name; this.surname = surname; this.number = number; this.maxSpeed = maxSpeed;
    }
    public String getName() { return name; }
    public String getSurname(){ return surname; }
    public int getNumber(){ return number; }
    public int getMaxSpeed(){ return maxSpeed; }

    @Override
    public String toString(){
        return name + " " + surname + " number: " + number + " max speed:" + maxSpeed;

    }
}
