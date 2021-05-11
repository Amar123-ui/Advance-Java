package com.company;

import java.awt.*;
import java.awt.event.*;

class Frameclose extends Frame
{
    public static void main(String[] args)
    {
       Frameclose c1=new Frameclose();

       c1.setTitle("Click to Close");
       c1.setSize(500,450);
       c1.setVisible(true);
       c1.addWindowListener(new NewClass());
    }
}
class NewClass extends WindowAdapter {
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
