package LAB6.zad1;

public class Worker {
    private String name, surname;
    private double salary;
    Worker(String name, String surname, double salary){
        this.name = name; this.surname = surname; this.salary = salary;
    }
    public double getSalary(){ return salary; }
}
