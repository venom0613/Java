package Project.Myproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100 );
        label.setBackground(Color.blue);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-1, label.getY());
                break;
            case 'w' : label.setLocation(label.getX(), label.getY()-1);
                break;
            case 's' : label.setLocation(label.getX(), label.getY()-1);
                break;
            case 'd': label.setLocation(label.getX(), label.getY()-1);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 1, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 1);
                break;
            case 39:
                label.setLocation(label.getX(), label.getY() - 1);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() - 1);
                break;

        }
    }

        @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You relesed key char" + e.getKeyChar());
        System.out.println("You relesed key code" + e.getKeyCode());

    }
}
