package com.company;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.event.*;

public class lookandfeel {
    
    public static class LookFeel extends JFrame implements ItemListener
    {
        //private static Object LookFeel;
        JButton b;
        JCheckBox cb;
        JRadioButton me, mo, wi;
        ButtonGroup bg;
        Container c;

        void LookFeel() {
            Container c = this.getContentPane();
            c.setLayout(null);

            b = new JButton("Button");
            JCheckBox ch = new JCheckBox("CheckBox");
            JTextField t = new JTextField("TEXT", 20);

            me = new JRadioButton("Metal");
            mo = new JRadioButton("Motif");
            wi = new JRadioButton("Windows");

            bg = new ButtonGroup();
            bg.add(me);
            bg.add(mo);
            bg.add(wi);

            b.setBounds(100, 50, 75, 40);
            cb.setBounds(100, 100, 100, 40);
            t.setBounds(100, 150, 100, 40);
            me.setBounds(50, 250, 100, 30);
            mo.setBounds(150, 250, 100, 30);
            wi.setBounds(250, 250, 100, 30);

            c.add(b);
            c.add(cb);
            c.add(t);
            c.add(me);
            c.add(mo);
            c.add(wi);

            me.addItemListener(this);
            mo.addItemListener(this);
            wi.addItemListener(this);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        // public Container getContentPane() {
        // }

        public void itemStateChanged(ItemEvent IE1) {
            try {
                if(me.getModel().isSelected())
                    UIManager.setLookAndFeel("Javax.swing.plaf.metal.MetalLookAndFeel");
                if(mo.getModel().isSelected())
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                if(wi.getModel().isSelected())
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

                SwingUtilities.updateComponentTreeUI(c);
            } catch (Exception e) {}
        }

        public static void main(String[] args) {
            LookFeel lf =new LookFeel();
            lf.setTitle("LookAndFeel");
            lf.setSize(400, 400);
            lf.setVisible(true);
        }

    }
}
