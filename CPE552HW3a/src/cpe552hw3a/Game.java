package cpe552hw3a;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * @author fengliu
 */      
public class Game extends JFrame {
    private void buildMenus() {
        JMenuBar mb = new JMenuBar();
        mb.setPreferredSize(new Dimension(this.getWidth(),20));
        JMenu m = new JMenu("File");
        JMenuItem mi = new JMenuItem("New");
        m.add(mi);
        mi.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Hello");
                    }        
        });
        mi = new JMenuItem("Quit");
        mi.addActionListener(
                new ActionListener() {  // Game$1
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );
        m.add(mi);
        mb.add(m);
        setJMenuBar(mb);
        
//       JPanel sa = new JPanel();
//       sa.setPreferredSize(new Dimension(this.getWidth(),40));
//       sa.setBackground(Color.WHITE);
//       Container ca = getContentPane();
//       ca.add(BorderLayout.NORTH,sa);
//       JTextField j1 = new JTextField();
//       j1.setPreferredSize(new Dimension(this.getWidth()/2,30));
//       sa.add(BorderLayout.CENTER,j1);
//       j1.disable();
       
    }
    public Game() {
        super("Chess");
        setSize(800,840);
        buildMenus();
        GameBoard b = new GameBoard();
        b.setBackground(Color.ORANGE);
        Container c = getContentPane();
        c.add(BorderLayout.CENTER, b);
        setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
       Game g = new Game(); 
    }
}

class GameBoard extends JPanel {
    private int board[][];
    private int d = 25;
    private final int box = 40;
    public GameBoard() {
        MoveListener m = new MoveListener();
        addMouseListener(m);
        addMouseMotionListener(m);
    }
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = box; i < this.getWidth() ; i += box){
             g.drawLine(i, 40, i, 760);
        }
            for(int j = box; j < this.getHeight(); j+= box){
            g.drawLine(40, j, 760, j);
        }
    }
    
    private class MoveListener implements MouseListener, MouseMotionListener {
        private int lastX, lastY;
        private int d = 25;
        public int nums = 0;
        int board[][] = new int [19][19];
        @Override
        public void mousePressed(MouseEvent e) {
//                Graphics g = getGraphics();
//                g.setColor(nums%2==0? Color.BLACK:Color.WHITE);
//                g.fillOval(e.getX()-d/2, e.getY()-d/2, d,d);
//            nums++;
        }
        @Override
        public void mouseDragged(MouseEvent e) {
//            Graphics g = getGraphics();
//            g.setXORMode(Color.WHITE);
//            g.drawOval(lastX-d/2, lastY-=d/2, d,d);
//            g.drawOval(e.getX()-d/2, e.getY()-d/2, d,d);
//            lastX = e.getX(); lastY = e.getY();
            
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            Graphics g = getGraphics();
            g.setColor(nums %2 == 0 ? Color.BLACK : Color.WHITE);
            int X = e.getX()-d/2;
            int Y = e.getY()-d/2;
            double a = (e.getX()+box/2)/box;
            double b = (e.getY()+box/2)/box;
            int aint = (int)a;
            int bint = (int)b;

            if(e.getX()>20 && e.getX()<=780 && e.getY()>20 && e.getY()<=780){
//            if( nums%2 == 1 && board[aint-2][bint-1] == 2 && board[aint-1][bint-2] == 2 && 
//                    board[aint][bint-1] == 2 && board[aint-1][bint] == 2 ){
//                
//            } 
//            
//            else {
//
//            }
                if(board[aint-1][bint-1]==0){
                    g.fillOval(aint*box-d/2, bint*box-d/2, d, d);
                    nums++;
                }
                else{
     //               System.out.println("unavaliable");
                }
                if(nums%2==1){
     //               System.out.println("Time for Player1(BLACK)    Steps:"+nums);
                    board[aint-1][bint-1]=1;//black 1 white 2
                    
               }
                else{
      //              System.out.println("Time for Player2(WHITE)    Steps:"+nums);
                    board[aint-1][bint-1]=2;//black 1 white 2
                }
            }
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
        @Override
        public void mouseMoved(MouseEvent e) {
        }
        @Override
        public void mouseClicked(MouseEvent e) {
//                        Graphics g = getGraphics(); //GameBoard.this.getGraphics()
////            g.setXORMode(Color.WHITE);
////GRID SNAP            int x = e.getX() / 100 * 100;
//            g.drawOval(lastX-d/2, lastY-d/2, d,d);
//            lastX = e.getX(); lastY = e.getY();
        }
      
    }

}



