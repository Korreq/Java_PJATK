package LAB7.zad1;

import java.util.Scanner;
public class Zad1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        System.out.println("Press Enter to start");
        while (run) {
            scanner.nextLine();
            System.out.println("Enter your name, surname and date of birth");
            String name = scanner.nextLine();
            String surname = scanner.nextLine();
            int dateOfBirth = scanner.nextInt();
            try {
                Person person = new Person(name, surname, dateOfBirth);
                System.out.println(person);
                run = false;
            } catch (EmptyStringException ese) { System.out.println(ese.getMessage()); }
            catch (InvalidYearException iye){ System.out.println(iye); }
        }
    }
}
