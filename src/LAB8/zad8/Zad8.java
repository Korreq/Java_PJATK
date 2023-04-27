package LAB8.zad8;

import java.util.Arrays;

public class Zad8 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Renard", "Zając", "s60270"),
                new Student("Sulisław", "Pawłowski", "s85012"),
                new Student("Asia", "Ostrowska", "s68081"),
                new Student("Sobiesław", "Kozłowski", "s03321"),
                new Student("Alojzy", "Gorski", "s72032"),
                new Student("Dominika", "Nowak", "s42010"),
        };
        Arrays.sort(students);
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}
