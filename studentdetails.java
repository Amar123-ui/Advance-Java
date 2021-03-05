package com.company;
import java.awt.*;

public class sstudentddetail {
    public static void main(String[] args) {
        Frame f= new Frame("details");
        Label l1,l2,l3,l4;
        l1 = new Label("Name= Parth Sharma");
        l1.setBounds(200,100,200,100);
        l2 = new Label("roll no=19100BTIT06586");
        l2.setBounds(400,100,200,100);
        l3 = new Label("branch=Information Technology");
        l3.setBounds(600,100,250,100);
        l4 = new Label("session:2021-2022");
        l4.setBounds(1000,100,400,100);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.setSize(1200,1400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
