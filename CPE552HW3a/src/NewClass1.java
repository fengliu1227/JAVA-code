
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewClass1 extends JFrame{
    private StringBuilder sb = new StringBuilder();
    private int ab = 0;
    public NewClass1(int w, int h ){
        setSize(w,h);
        setTitle("test");
        Container c = getContentPane();
        JTextField j = new JTextField("0");
        JButton a = new JButton("ok");
        c.add(BorderLayout.CENTER,a);
        c.add(BorderLayout.NORTH, j);
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                j.setText(++ab+"");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public static void main(String args[]){
        new NewClass1(500,600);
    }
}
