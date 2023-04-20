package LAB7.zad3;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        String number = "0", divider = "1";
        int result = 0;
        boolean run1 = true, run2 = true;
        while (run1) {
            try {
                number = JOptionPane.showInputDialog(null, "Type divisor");
                int fromString = convertToInteger(number);
                run1 = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Divisor must be a number");
            }
        }
        while(run2){
            try{
                divider = JOptionPane.showInputDialog(null, "Type divider");
                int fromString = convertToInteger(divider);
                run2 = false;
            } catch (NumberFormatException nfe){ JOptionPane.showMessageDialog(null,"Divider must be a number");}
        }
        try{
            result = convertToInteger(number)/convertToInteger(divider);
            JOptionPane.showMessageDialog(null, String.format("Result of division is %d", result));
        }
        catch (ArithmeticException ae){ JOptionPane.showMessageDialog(null, "Can't divide by 0");}
    }
    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }
}
