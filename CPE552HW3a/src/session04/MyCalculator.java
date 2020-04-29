
package session04;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * @author fengliu
 */

public class MyCalculator extends JFrame{
    private StringBuilder sb = new StringBuilder();
    private double first;
    private double second;
    private double result;
    private int x;
    
    public MyCalculator(Color fg, Color bg, int w, int h ){
        setSize(w,h);
        setTitle("calculator");
        Container c = getContentPane();
        
        c.setBackground(bg);
        c.setForeground(fg);
        
        JTextField jtf = new JTextField(); 
        jtf.disable();
        jtf.setPreferredSize(new Dimension(this.getWidth(),100));
        jtf.setFont(new Font("times",Font.PLAIN,24));
        c.add(BorderLayout.NORTH,jtf);
        
        JPanel a = new JPanel();
        a.setBackground(new Color(115,115,115));
        c.add(BorderLayout.CENTER,a);
        a.setLayout(new GridLayout(4,4,5,5));
        
        JButton[] nums = new JButton[16];
        String[] labels = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            ".","0","=","+"
        };
        for(int i = 0; i < 16; i++){
            nums[i] = new JButton(labels[i]);
            String text = labels[i];
            nums[i].setFont(new Font("Times",Font.PLAIN, 24));
            a.add(nums[i]);

   
            if(i==3){//                       除法
                nums[i].setForeground(Color.RED);
                nums[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){

                    x=3;
                    first=Double.parseDouble(sb.toString());
                    jtf.setText("/");
                    sb=new StringBuilder();
                }      
             });
         }
            
            
            if(i==7){                        // 乘法
                nums[i].setForeground(Color.RED);
                nums[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    x=7;
                    first=Double.parseDouble(sb.toString());
                    jtf.setText("*");
                    sb=new StringBuilder();
                }     
             }); 
            }
            
            if(i==11){                       //减法
                nums[i].setForeground(Color.RED);
                nums[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    x=11;
                    first=Double.parseDouble(sb.toString());
                    jtf.setText("-");
                    sb=new StringBuilder();
                }     
             }); 
            }
            
            if(i==12){                       //小数点
                nums[i].setForeground(Color.RED);
                nums[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    sb.append(".");
                    jtf.setText(sb.toString());
                }     
             }); 
            }
            
//            if(i==13){                       //0
//                nums[i].addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e){
//                    sb.append(text);
//                    jtf.setText("0");
//                }     
//             }); 
//            }
            
            if(i==15){                      //加法 
                nums[i].setForeground(Color.RED);
                nums[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    x=15;
                    first=Double.parseDouble(sb.toString());
                    jtf.setText("+");
                    sb=new StringBuilder();
                }     
             }); 
            }
            
            if(i==14){                      //等于
                nums[i].setForeground(Color.RED);
                nums[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(x==3){
                        second=Double.parseDouble(sb.toString());
                    result=first/second;
                    }
                    else if (x==7){
                        second=Double.parseDouble(sb.toString());
                    result=first*second;
                    }
                    else if(x==11){
                        second=Double.parseDouble(sb.toString());
                    result=first-second;
                    }
                    else if(x==15){
                        second=Double.parseDouble(sb.toString());
                    result=first+second;
                    }
                    jtf.setText(result+""); 
                }    
             });    
            }
//            else{
            else if(i!=3 && i!=7 && i!=11 && i!=15 && i!=12) {    //1到9
              nums[i].setForeground(Color.BLUE);
              nums[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    sb.append(text);
                    jtf.setText(sb.toString());
                }     
             }); 
            }
        }
        
        
        
        JPanel b = new JPanel();
        c.add(BorderLayout.WEST,b);
        b.setLayout(new GridLayout(2,1,5,5));
        JButton[] Commend = new JButton[2];
        String commend[]  = { 
            "C","AC"
        };
        for(int j = 0; j < 2 ; j++){
            Commend[j] = new JButton(commend[j]);
            String text2 = Commend[j].getText();
            b.add(Commend[j]);
            Commend[j].setFont(new Font("Times",Font.PLAIN, 24));  
            
            if(j==0){                          //删除输入的数值
            Commend[j].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    sb = new StringBuilder();
                    jtf.setText("");
                }     
             });
            }
            else{                          //初始化
            Commend[j].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    sb = new StringBuilder();
                    jtf.setText("");
                    first = 0;
                    second = 0;
                }     
             });
            }
        }
     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    public static void main(String args[]){
        new MyCalculator (Color.BLACK, Color.WHITE, 400, 600);
    }
}
        

