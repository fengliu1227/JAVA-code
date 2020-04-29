import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
     * @author Feng Liu
 */
class Graph extends JPanel {
    public Graph() {
    }
    public void paint(Graphics g) {
        g.drawLine(0, 0, 200, 200);
    }
}

public class Grapher extends JFrame {
    public Grapher() {
        super("Grapher");
        Container c = getContentPane();
        c.add(new Graph(), BorderLayout.CENTER);
        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("Dying");
                        System.exit(0);
                    }
                }
        );
        setSize(600,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Grapher();
    }
}
