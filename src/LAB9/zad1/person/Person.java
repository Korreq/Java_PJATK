package LAB9.zad1.person;

public class Person {
    private String name, surname;
    private final int dateOfBirth;
    public Person(String name, String surname, int dateOfBirth){
        checkPersonalInformation(name, surname, dateOfBirth);
        this.name = name; this.surname = surname; this.dateOfBirth = dateOfBirth;

    }
    private void checkPersonalInformation(String name, String surname, int dateOfBirth){
        if(name.isEmpty()){ throw new EmptyStringException("Name is empty");}
        else if(surname.isEmpty()){ throw new EmptyStringException("Surname is empty");}
        else if(dateOfBirth < 1900 || dateOfBirth > 2023){ throw new InvalidYearException();}
    }
    @Override
    public String toString(){
        return String.format("Name: %s, Surname: %s, Date of Birth: %d", name, surname, dateOfBirth);
    }
}
