package LAB11.zad5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DWFromDate implements ActionListener{
    JTextField textField; JButton button; JLabel label;
    DWFromDate(){
        JFrame frame = new JFrame("Day of the week from date");

        label = new JLabel("Enter date in format d-m-y (ex. 01-01-2001)");
        label.setBounds(15, 150, 400, 50);
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
        Date date = DWAsText.getDateFromString(textField.getText());
        if(event.getSource() == button){
            label.setText(DWAsText.getDayText(date));
        }
    }
}
