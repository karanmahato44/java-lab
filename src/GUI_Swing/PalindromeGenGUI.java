package GUI_Swing;

//a 'palindrome "generator" ' ????

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeGenGUI extends JFrame implements ActionListener {
    JTextField inputField;
    JTextField resultFiled;
    JButton button;
    public PalindromeGenGUI() {
        this.setTitle("Palindrome Generator");
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputField = new JTextField(20);
        resultFiled = new JTextField(20);
        button = new JButton("Palindrome");
        button.addActionListener(this);

        this.add(inputField);
        this.add(resultFiled);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {

            String input = inputField.getText();
            String subString = input.substring(0, input.length() - 1);
            String reverse =  new StringBuilder(subString).reverse().toString();
            String result = input + reverse;
            resultFiled.setText(result);
        }
    }
    public static void main(String[] args) {
        new PalindromeGenGUI();
    }
}
