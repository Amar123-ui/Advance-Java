package com.company;
import java.awt.*;
public class javalabel {
    javalabel()
    {
        Frame f = new Frame("checkbox example");
        Checkbox checkbox1 = new Checkbox("c");
        checkbox1.setBounds(100,100,100,50);
        Checkbox checkbox2 = new Checkbox("c++",true);
        checkbox2.setBounds(100,150,50,150);
        Checkbox checkbox3 = new Checkbox("php");
        checkbox3.setBounds(100,150,50,50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(checkbox3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new javalabel();
    }
}
