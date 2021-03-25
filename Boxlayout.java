package com.company;
import java.awt.*;
import javax.swing.*;
public class Boxlayout extends Frame
{
    private static final int X_AXIS =0 ;
    Button buttons[];

    Boxlayout()
    {
        buttons=new Button[5];

        for(int i=0;i<5;i++)
        {
            buttons[i]=new Button("BMW"+(i+1));

            add(buttons[i]);
        }
        setLayout(new BoxLayout(this,Boxlayout.X_AXIS));
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Boxlayout cb=new Boxlayout();
    }
}
