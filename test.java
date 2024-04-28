import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class test{
  public static void main(String[] args) {
 
    
  
            // FlowLayout example
            JFrame frame = new JFrame("FlowLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
           
            JPanel panel = new JPanel();
            JButton b1 = new JButton("sandra");
            panel.setBackground(Color.GREEN);
            panel.add(b1 );
            frame.add(panel, BorderLayout.NORTH);
            
          /////
          JPanel panel1= new JPanel( );
          JButton b2 = new JButton("terzic");
          panel1.add(b2);
          panel1.setBackground(Color.BLUE);
          frame.add(panel1,BorderLayout.SOUTH);

          JPanel panel2 = new JPanel();
          JButton b3 = new JButton("tahar");

          panel2.add(b3);
          panel2.setBackground(Color.ORANGE);
          panel2.setBorder(BorderFactory.createEmptyBorder(10,10, 010, 10));
          frame.add(panel2,BorderLayout.CENTER);
    
            frame.setVisible(true);
    
            // // GridLayout example
            // JFrame frame1 = new JFrame("GridLayout Example");
            // frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // frame1.setSize(400, 200);
            // frame1.setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns
            // frame1.add(new JButton("www"));
            // frame1.add(new JButton("www"));
            // frame1.add(new JButton("www"));
            // frame1.add(new JButton("www"));
            // frame1.add(new JButton("www"));
    
            // frame1.setVisible(true);
    
            // // BorderLayout example
            // JFrame frame2 = new JFrame("BorderLayout Example");
            // frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // frame2.setSize(400, 200);
            // frame2.setLayout(new BorderLayout());
            // frame2.add(new JButton("North"), BorderLayout.NORTH);
            // frame2.add(new JButton("East"), BorderLayout.EAST);
            // frame2.add(new JButton("West"), BorderLayout.WEST);
            // frame2.add(new JButton("South"), BorderLayout.SOUTH);
            // frame2.add(new JButton("Center"), BorderLayout.CENTER);
    
            // frame2.setVisible(true);
        }
    }
    
