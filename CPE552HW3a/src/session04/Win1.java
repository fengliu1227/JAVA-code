package session04;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author fengliu
 */
public class Win1 extends JFrame{
    /**
     *  create a button
     * @param fg
     * @param bg
     * @param w
     * @param h 
     */
    public Win1(Color fg, Color bg, int w, int h){
        setSize(w,h);
        Container c = getContentPane();
        c.setBackground(bg);
        c.setForeground(fg);
        JButton b = new JButton("testing");
        b.addActionListener(new MyListener());
     /** b.addActionListener(new ActionListener()){
     *   public void adctionPerformed(ActionEvent e){
     *    System.out.println("hello");
     *}
     *
     } 
  */    
        
        c.add(BorderLayout.WEST,b);
        b = new JButton("ok");
        c.add(BorderLayout.CENTER,b);
        JPanel p = new JPanel();
        p.setBackground(new Color (205,0,150));
        c.add(BorderLayout.CENTER,p);
        p.setLayout(new GridLayout(4,4, 10,10));
        String[] labels = {
            "1","2","3","+",
            "4","5","6","-"
        };
        for (int i = 0; i<16; i++){
            b = new JButton(i+"*");
            p.add(b);
        
        }
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2,1));
        p2.add(p);
        JTextArea ta = new JTextArea();
        Font f = new Font ("Times",Font.PLAIN, 24);
        ta.setFont(f);
        p2.add(ta);
        c.add(BorderLayout.CENTER, p2);
        
    /** JTextField t = new JTextField();
     *  t.setBackground(Color.BLACK);
     *  t.set
     *  c.add(BorderLayout.NORTH, t);
     */ 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String args[]){
        new Win1(Color.BLACK,Color.RED, 800, 800);
      //  new Win1(Color.WHITE,Color.BLUE, 600, 600);

    }
}


class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
     System.out.println("hello");
    }

}