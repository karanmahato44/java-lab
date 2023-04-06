package GUI_Swing;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

class MouseAdapterDemo extends JFrame {
    JLabel mousePositionLabel;
    public MouseAdapterDemo() {
        this.setTitle("Mouse Adapter Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mousePositionLabel = new JLabel("Mouse Position:");
        this.add(mousePositionLabel, BorderLayout.SOUTH);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePositionLabel.setText("Mouse Position: " + e.getX() + ", " + e.getY());
            }
        });

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
