package com.company;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

class _1xl extends JFrame {

    private static int width = 550, height = 550;

    public _1xl() {
        super("Smiley face");
        setSize(width, height);
        setLocation(600, 350);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.yellow);
        g.fillOval(25, 35, 500, 500);

        g.setColor(Color.black);
        g.fillOval(150, 150, 50, 50);
        g.fillOval(350, 150, 50, 50);

        //Draw a black ellipse first, then a yellow ellipse
        g.fillOval(180, 350, 200, 100);
        g.setColor(Color.yellow);
        g.fillOval(180, 330, 200, 80);
//		g.fillOval(180, 320, 200, 100);


    }

    public static void main(String[] args) {

        new _1xl();
    }
}

