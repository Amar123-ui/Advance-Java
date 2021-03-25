package com.company;
import javax.swing.*;
import java.awt.*;
public class TabbedEx extends JFrame {
    TabbedEx() {
        Container c1 = getContentPane();
        JTabbedPane jt = new JTabbedPane();
        jt.addTab("Capitals", new Capital());
        jt.addTab("Country", new Country());

        c1.add(jt);
    }

    public static void main(String[] args) {
        TabbedEx ob = new TabbedEx();
        ob.setSize(400, 400);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Capital extends JFrame
{
    Capital()
    {
        JButton b1=new JButton("BMW");
        add(b1);
    }

}
class Country extends JPanel
{
    void Capital()
    {
        JButton b2=new JButton("Pagani");
        add(b2);
    }
}
