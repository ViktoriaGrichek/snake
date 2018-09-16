package com.company;

import javax.swing.*;

public class Window extends JFrame {
    Window() {
        setVisible(true);
        setBounds(120, 120, 800, 600);
        setTitle("Snake Game");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().add(new Graphic());
    }
}
