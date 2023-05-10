package LAB9.zad1.person;

public class InvalidYearException extends RuntimeException{
    public InvalidYearException() {}
    @Override
    public String toString(){ return "Declared year is less than 1900 or more than 2023"; }
}
