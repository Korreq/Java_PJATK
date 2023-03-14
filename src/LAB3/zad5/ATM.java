package LAB3.zad5;

import java.util.Scanner;

public class ATM {
    Account [] accounts = new Account[10];
    private void initAcnts(){
        for(int i = 0; i < 10; i++){ accounts[i] = new Account(i);}
    }
    private double chckBal(int id){ return accounts[id].balance; }
    private void chngBal(int id, boolean isDep, double value){
        if(isDep){ accounts[id].balance += value; }
        else{ accounts[id].balance -= value;}
    }
    public void menu(){
        int ex = 1, curId;
        initAcnts();
        Scanner input = new Scanner(System.in);
        while (ex == 1){
            System.out.println("Enter an Id or Exit(99)");
            curId = input.nextInt();
            if(curId < 10 && curId > -1){
                while (ex == 1){
                    System.out.println("\n\n\nMain menu");
                    System.out.println("1: check balance\n2: withdraw\n3: deposit\n4: exit");
                    System.out.println("Enter a choice:");
                    switch (input.nextInt()) {
                        case 4 -> ex++;
                        case 1 -> {
                            System.out.print("The balance is ");
                            System.out.printf("%.2f",chckBal(curId));
                            System.out.println();}
                        case 2 -> {
                            System.out.println("How much to withdraw");
                            chngBal(curId, false, input.nextDouble());
                        }
                        case 3 -> {
                            System.out.println("How much to deposit");
                            chngBal(curId, true, input.nextDouble());
                        }
                    }
                }
                --ex;
            }
            else ex++;
        }
    }
}
