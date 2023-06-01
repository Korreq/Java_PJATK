package LAB11.zad2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber implements ActionListener{
    JTextField textField; JButton button; JLabel label; JPanel panel;
    int winningNumber;
    GuessNumber(){
        winningNumber = (int) ((Math.random() * (10 - 1)) + 1);
        JFrame frame = new JFrame("Guess Number");

        label = new JLabel("Enter a number from 1 to 10");
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
        int submit = Integer.parseInt(textField.getText());
        if(event.getSource() == button){
            if(submit > winningNumber){ label.setText("Too high"); }
            else if (submit < winningNumber) { label.setText("Too low"); }
            else{ label.setText("You guessed right!"); }
        }
    }
}
