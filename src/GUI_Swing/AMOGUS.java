package GUI_Swing;

import java.awt.*;
import javax.swing.*;

class AMOGUS {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        ImageIcon img = new ImageIcon("amogus.png");
        frame.setIconImage(img.getImage());

        JPanel r1 = new JPanel();
        r1.setBackground(Color.red);
        r1.setBounds(100, 0, 200, 100);

        JPanel b1 = new JPanel();
        b1.setBackground(Color.blue);
        b1.setBounds(100, 100, 200, 100);

        JPanel r2 = new JPanel(); // vertical strip before backpack
        r2.setBackground(Color.red);
        r2.setBounds(300, 0, 100, 500);


        JPanel r3 = new JPanel();
        r3.setBackground(Color.red);
        r3.setBounds(100, 200, 200, 200);

        JPanel r4 = new JPanel();
        r4.setBackground(Color.red);
        r4.setBounds(100, 400, 100, 100);

        JPanel r5 = new JPanel(); // backpack
        r5.setBackground(Color.red);
        r5.setBounds(400, 100, 100, 250);

        frame.setTitle("sus");
        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(r4);
        frame.add(r5);
        frame.add(b1);

        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}