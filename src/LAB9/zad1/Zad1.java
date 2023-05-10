package LAB9.zad1;

import LAB9.zad1.person.Person;

import java.util.Random;

public class Zad1 {
    public int roll(){
        Random random = new Random();
        return random.nextInt(6 - 1) + 1   ;
    }
    public static void main(String[] args) {
        Zad1 zad = new Zad1();
        Lista<Integer> listOfIntegers = new Lista<>(4);
        Lista<String> listOfStrings = new Lista<>(4);
        Lista<Person> listOfPeople = new Lista<>(4);

        for(int i = 0; i < 6; i++) listOfIntegers.dodaj(zad.roll());
        System.out.println( listOfIntegers );
        System.out.println( listOfIntegers.czyZawiera(2) + " " + listOfIntegers.czyZawiera(-1) );
        System.out.println( listOfIntegers.zwrocIndeks(6) + " " + listOfIntegers.zwrocOstatniIndeks(-1) );
        System.out.println( listOfIntegers.zwrocElement(0) + " " + listOfIntegers.zwrocElement(-1) );
        listOfIntegers.podmienElement(0, zad.roll());
        listOfIntegers.podmienElement(-1, zad.roll());
        System.out.println( listOfIntegers );

        listOfStrings.dodaj("dDmYq");
        listOfStrings.dodaj("5Hnle");
        listOfStrings.dodaj("ExY7m");
        listOfStrings.dodaj("dDmYq");
        listOfStrings.dodaj("6I9cF");
        System.out.println(listOfStrings);
        System.out.println( listOfStrings.czyZawiera("5Hnle") + " " + listOfStrings.czyZawiera("a") );
        System.out.println( listOfStrings.zwrocIndeks("dDmYq") + " " + listOfStrings.zwrocOstatniIndeks("dDmYq") );
        System.out.println( listOfStrings.zwrocElement(0) + " " + listOfStrings.zwrocElement(-1) );
        listOfStrings.podmienElement(3, "A");
        listOfStrings.podmienElement(-1, "A");
        System.out.println(listOfStrings);

        Person[] people = {
                new Person("Świętosław","Rutkowski", 1947),
                new Person("Łucja","Dudek", 1983),
                new Person("Rafał","Ostrowski", 1944),
                new Person("Łucja","Dudek", 1983),
                new Person("Kasia","Zielinska", 1942)
        };
        for (Person person: people) { listOfPeople.dodaj(person); }
        System.out.println(listOfPeople);
        System.out.println( listOfPeople.czyZawiera(people[0]) + " " + listOfPeople.czyZawiera(people[4]) );
        System.out.println( listOfPeople.zwrocIndeks(people[1]) + " " + listOfPeople.zwrocOstatniIndeks(people[1]) );
        System.out.println( listOfPeople.zwrocElement(0) + " " + listOfPeople.zwrocElement(-1));
        listOfPeople.podmienElement(3, people[4]);
        listOfPeople.podmienElement(-1, people[0]);
        System.out.println(listOfPeople);
    }
}
