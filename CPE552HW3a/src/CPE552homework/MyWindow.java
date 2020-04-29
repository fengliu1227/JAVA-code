import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

interface ActionListener {
    public void actionPerformed(ActionEvent e);
}

interface AdjustmentListener {
    public void adjustmentValueChanged(AdjustmentEvent e);
}


public class MyWindow extends JFrame {
    private JPanel p;

    public MyWindow() {
        super();
        setSize(100,100);
        JButton a = new JButton("a");
        JScrollBar s = new JScrollBar();
        Container c = getContentPane();
        p = new JPanel();
        c.add(BorderLayout.NORTH,this.p);
        this.p.add(a);
        this.p.add(s);
        a.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                a.setBackground(Color.BLUE);
            }
        });

        s.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("hello");
            }
        });
    }
}