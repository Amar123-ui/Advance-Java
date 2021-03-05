package com.company;

import java.awt.*;
import javax.swing.JFrame;

class MyCanvas extends Canvas{

    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("C:\\Users\\hp\\Desktop");
        g.drawImage(i, 400,400,this);

    }
    public static void main(String[] args) {
        MyCanvas m=new MyCanvas();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);
    }

}