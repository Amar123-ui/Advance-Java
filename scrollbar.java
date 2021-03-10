package com.company;

import java.awt.*;
class scrollbar extends Frame
{
    scrollbar()
    {
        setLayout(new FlowLayout());
        Label labelblHor =new Label("Horizontal Scrollbar");
        Scrollbar sl = new Scrollbar(Scrollbar.HORIZONTAL,50,10,0,100);
        Label labelver =new Label("Vertical Scrollbar");
        Scrollbar s2 = new Scrollbar(Scrollbar.VERTICAL,10,5,0,10);
        add(labelblHor); add(sl);
        add(labelver); add(s2);
    }
}
class ScrollBarJavaExample
{
    public static void main(String args[])
    {
        scrollbar frame = new scrollbar();
        frame.setTitle("Scrollbar in Java Example");
        frame.setSize(520,200);
        frame.setVisible(true);
    }
}