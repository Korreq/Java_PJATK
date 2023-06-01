package LAB11.zad1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text implements ActionListener{
    JTextField textField; JButton button; JLabel label;
    Text(){
        JFrame frame = new JFrame("Celsius to Fahrenheit");

        label = new JLabel("Enter a number");
        label.setBounds(15, 150, 200, 50);
        button = new JButton("Submit");
        button.addActionListener(this);
        button.setBounds(15, 100, 200, 50);
        textField = new JTextField();
        textField.setBounds(15, 50, 200, 50);

        frame.add(textField);
        frame.add(label);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        String submit = textField.getText();
        if(event.getSource() == button){
            label.setText(String.valueOf((Integer.parseInt(submit) * 9/5) + 32));
        }
    }
}
