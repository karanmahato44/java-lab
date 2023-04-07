package GUI_Swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MoveShrek extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    public MoveShrek() {
        icon = new ImageIcon("shrek.png");
        label = new JLabel();
        label.setBounds(0, 0, 200, 200);
        label.setIcon(icon);

        this.add(label);
        this.addKeyListener(this);

        this.setTitle("Move Shrek");
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY()); break;
            case 's': label.setLocation(label.getX(), label.getY()+10); break;
            case 'd': label.setLocation(label.getX()+10, label.getY()); break;
            case 'w': label.setLocation(label.getX(), label.getY()-10); break;
        }
    }
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed key: " + e.getKeyChar() + " Keycode: " + e.getKeyCode());
    }
    public void keyReleased(KeyEvent e) {
        // foo
    }

    public static void main(String[] args) {
        new MoveShrek();
    }

}

