package LAB11.zad4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;

public class DisplayFlags {
    JLabel[] labels = new JLabel[3]; JFrame frame; JPanel panel = new JPanel();
    BufferedImage picture; HashSet<Integer> integerList = new HashSet<>(); Random random = new Random();
    String location = "src\\LAB11\\zad4\\Flags\\";
    String[] images = {"andorra.jpg", "kazakhstan.jpg", "marshallislands.jpg", "newzealand.jpg", "peru.jpg", "bahrain.jpg", "brazil.jpg", "cyprus.jpg", "iraq.jpg", "lesotho.jpg"};
    DisplayFlags() throws IOException{
        while (integerList.size() < 3){ integerList.add(random.nextInt(10)); }
        int iterator = 0;
        for(int number : integerList){
            picture = ImageIO.read(new File(location+images[number]));
            labels[iterator] = new JLabel(new ImageIcon(picture));
            panel.add(labels[iterator]);
            iterator++;
        }
        frame = new JFrame("Flags");
        panel.setBounds(0,0,600,600);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
