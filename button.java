package com.company;
import java.awt.*;
import java.awt.event.*;
    class MyButton extends Frame implements ActionListener
    {
        Button b1;
        MyButton(){
            this.setLayout(null);
            b1=new Button("red");
            this.add(b1);
            b1.addActionListener(this);
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
            b1.setBounds(150,100,100,50);
        }
        //end of constructor
        public void actionPerformed(ActionEvent ae){
            String str=ae.getActionCommand();//gives the label
            if(str.equals("Yellow"))this.setBackground(Color.yellow);
        }
        public static void main(String[] args){
            MyButton m=new MyButton();
            m.setSize(400,400);
            m.setTitle("Button Event");
            m.setVisible(true);
        }
    }

