package LAB11.zad3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReverseString implements ActionListener{
    JTextField textField; JButton button; JLabel label;
    ReverseString(){
        JFrame frame = new JFrame("Reverse of text");

        label = new JLabel("Enter text");
        label.setBounds(15, 150, 200, 50);
        button = new JButton("Submit");
        button.addActionListener(this);
        button.setBounds(15, 100, 200, 50);
        textField = new JTextField();
        textField.setBounds(15, 50, 400, 50);

        frame.add(textField);
        frame.add(label);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(textField.getText()).reverse();
        if(event.getSource() == button){
            label.setText(stringBuilder.toString());
        }
    }
}