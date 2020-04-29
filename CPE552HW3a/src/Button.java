
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fengliu
 */
public class Button {
    public static void main(String args[]){
        JButton b = new JButton();
        b.setVisible(true);
        b.addActionListener(new MyObj());
    }
    
}

class MyObj implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("pressed");
    }
}
