import java.util.Arrays;
import java.util.Scanner;
public class LAB1 {
    Scanner input = new Scanner(System.in);
    public void z1(){ System.out.println(((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5)); }
    public void z2(){
        System.out.println("Wpisz temperaturę w stopniach Celsjusza, a program zwróci ją w Fahrenheitach");
        double af = input.nextInt();
        af *= 9.0 / 5;
        System.out.println( af + 32 );
    }
    public void z3(){
        double mtk = 1.609;
        System.out.println("Miles   Kilometers");
        for(int i = 1; i < 11; i++) {
            double mmtk = mtk * (i);
            System.out.print(i + "       ");
            System.out.format("%.3f", mmtk);
            System.out.println();
        }
    }
    public void z4(){
        int id_s = 0, max_p = 0, p;
        String[][] students;
        System.out.println("Podaj ilość studentów:");
        int size = input.nextInt();
        students = new String[size][2];
        System.out.println("Podaj imię studenta, a potem ilość jego punktów");
        for(int i = 0; i < size; i++){
            students[i][0] = input.next();
            p = input.nextInt();
            students[i][1] = String.valueOf(p);
            if (p > max_p){ max_p = p; id_s = i;}
        }
        System.out.println(students[id_s][0] + ": " + students[id_s][1]);
    }
    public void z5(){
        int[] triangle = new int[3];
        System.out.println("Podaj 3 boki, a program zwróci czy powstaje trójkąt");
        for (int i = 0; i < 3; i++) { triangle[i] = input.nextInt();}
        Arrays.sort(triangle);
        if((triangle[0] + triangle[1]) > triangle[2]) System.out.println("Tak");
        else System.out.println("Nie");
    }
    public void z6(){
        System.out.println("Podaj liczbę a program wypisze który to dzień tygodnia");
        int number = input.nextInt();
        switch (number) {
            case 1 -> System.out.println("Poniedziałek");
            case 2 -> System.out.println("Wtorek");
            case 3 -> System.out.println("Środa");
            case 4 -> System.out.println("Czwartek");
            case 5 -> System.out.println("Piątek");
            case 6 -> System.out.println("Sobota");
            case 7 -> System.out.println("Niedziela");
            default -> System.out.println("Błąd");
        }
    }
    public void z7(){
        System.out.println("Podaj dwie litery a program sprawdzi która jest późniejsza");
        char l1 = input.next().charAt(0), l2 = input.next().charAt(0);
        l1 = Character.toUpperCase(l1); l2 = Character.toUpperCase(l2);
        int a_l1 = l1, a_l2 = l2;
        if(a_l1 > a_l2) System.out.println(l1 + " Jest późniejsza");
        else if (a_l1 == a_l2) System.out.println("litery są identyczne");
        else System.out.println(l2 + " Jest późniejsza");
    }
    public void z8(){
        int temp;
        int[] numbers = new int[3];
        System.out.println("Podaj 3 liczby, a program posegreguje je malejąco");
        for (int i = 0; i < 3; i++) numbers[i] = input.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if (j != 2) {
                    if (numbers[j] < numbers[j + 1]) {
                        temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
        }
        for(int x : numbers) System.out.print(x+" ");
        System.out.println();
    }
    public void z9(){
        System.out.println("Podaj dwa punkty:");
        int x1 = input.nextInt(), y1 = input.nextInt(), x2 = input.nextInt(), y2 = input.nextInt();
        double sum = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("Długość między punktami wynosi:" + sum);
    }
    public void z10(){
        System.out.println("Gra w Kamień(0), Papier(1) i Nożyce(2) wybierz numer");
        int randomNum = (int) (Math.random() * 3), a = input.nextInt();
        System.out.println("Wybrałeś: "+a+" Przeciwnik wybrał: "+randomNum);
        if(a - randomNum == 1 || a - randomNum == -2) System.out.println("Wygrałeś");
        else if (a - randomNum == 0) System.out.println("Remis");
        else System.out.println("Przegrałeś");

    }
    public static void main(String[] args) {
        LAB1 lab = new LAB1();
        int choice, exit = 0;
        while(exit == 0){
            System.out.println("0 - Wyjście, 1 - Z1, 2 - Z2, 3 - Z3, 4 - Z4, 5 - Z5, 6 - Z6, 7 - Z7, 8 - Z8, 9 - Z9, 10 - Z10");
            choice = lab.input.nextInt();
            switch (choice) {
                case 0 -> exit += 1;
                case 1 -> lab.z1();
                case 2 -> lab.z2();
                case 3 -> lab.z3();
                case 4 -> lab.z4();
                case 5 -> lab.z5();
                case 6 -> lab.z6();
                case 7 -> lab.z7();
                case 8 -> lab.z8();
                case 9 -> lab.z9();
                case 10 -> lab.z10();
            }
        }
    }
}