package LAB3.zad3;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TV tv = new TV(1, 1, false);
        int ex = 1;
        Remote rm = new Remote(tv);
        while(ex == 1){
            System.out.println("p - włączenie telewizora, -= - zmniejszanie/zwiększanie dźwięku, [] - zmniejszanie/zwiększanie kanałów, q - zakończenie programu");
            switch (input.nextLine()){
                case "q" -> ex++;
                case "-" -> rm.changeVol(false);
                case "=" -> rm.changeVol(true);
                case "[" -> rm.changeCh(false);
                case "]" -> rm.changeCh(true);
                case "p" -> rm.switchTV();
            }
            System.out.print("Status telewizora: ");
            if(rm.teleVision.isOn) System.out.println("On"); else System.out.println("Off");
            System.out.println("Dźwięk: " + rm.teleVision.volume +"/10");
            System.out.println("Kanał: " + rm.teleVision.channel);
        }
    }
}
