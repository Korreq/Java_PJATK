package LAB11.zad6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JButton[] buttons = {new JButton("C"),new JButton("0"), new JButton("1"), new JButton("2"), new JButton("3"),
            new JButton("4"), new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"),
            new JButton("9"), new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/"),
            new JButton("=")
    };
    JLabel label = new JLabel(); JFrame frame = new JFrame("Calculator"); JPanel panel = new JPanel();
    String a = "", b = "", operator = "", text;
    Calculator(){
        label.setBounds(0,450,100,50);
        panel.add(label);
        for (JButton button: buttons) {
            panel.add(button);
            button.addActionListener(this);
        }
        panel.setLayout(new GridLayout(6,3));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocation(50,50);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
    private String valueFromOperator(String operator){
        int value = 0;
        if(b.equals("")){ b = "0"; }
        switch (operator) {
            case "+" -> value = Integer.parseInt(a) + Integer.parseInt(b);
            case "-" -> value = Integer.parseInt(a) - Integer.parseInt(b);
            case "*" -> value = Integer.parseInt(a) * Integer.parseInt(b);
            case "/" -> { if (!b.equals("0")){ value = Integer.parseInt(a) / Integer.parseInt(b); } }
            default -> { if(!a.equals("")){ value = Integer.parseInt(a); } }
        }
        return Integer.toString(value);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String s = event.getActionCommand();
        switch (s) {
            case "C" -> text = operator = a = b = "";
            case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" -> {
                if (operator.equals("")) { a += s; } else { b += s; }
            }
            case "+", "-", "*", "/" -> {
                if (!operator.equals("")) { a = valueFromOperator(operator); b = ""; }
                operator = s;
            }
            case "=" -> {
                a = valueFromOperator(operator);
                operator = b = "";
            }
        }
        label.setText(a+operator+b);
    }
}
