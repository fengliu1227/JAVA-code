package cpe552hw3a;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
        

/**
 * @author fengliu
 */
public class ButtonTest extends JFrame{
//    private int x;
//    private double y;
    private JTextField t;//= new JTextField("yoho")
    public String toString(){
        return "";
    
    }
    public ButtonTest(){
//        x = 0;
//        y = 2.5;
        JButton b = new JButton("ok");
        t = new JTextField();
        Container c = getContentPane();
        c.add(BorderLayout.NORTH, t);
        c.add(BorderLayout.SOUTH, b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                t.setText(t.getText()+"hello!");
                int count = Integer.parseInt((t.getText()));
                t.setText(count+1+"");
            }
        });
        b.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
            }
        });
     }
    public static void main(String args[]){
        new ButtonTest();
    
    }
    
}
