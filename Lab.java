import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
//import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Lab {
    private String s;
    private int count;
    private final JFrame frame;
    JTextPane textPane;
//    JLabel lbH;
    JButton bOK;
    
    public static void main(String[] args){
        Lab f = new Lab("Swing Counter");
        
    }
    public Lab(String name){
        
        frame= new JFrame(name); 
        count =0;
        s="0";

        frame.setSize(450,100);
        frame.setLocation(500, 280);
        frame.setText("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textPane = new JTextPane();
        textPane.setBounds(20,20,300,20);
        textPane.setText(s);
        frame.add(textPane);
        
//        lbH = new JLabel(s); 
//        lbH.setBounds(20,20,36,14);
//        frame.add(lbH);
        
        bOK = new JButton("Count");
        bOK.setBounds(340, 18, 89, 23);
        
        bOK.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evt){
                    count++;
                    s=String.valueOf(count);
//                    lbH.setText(s);
                    textPane.setText(s);
                    
                }
        });
        
        frame.add(bOK);
        
        frame.setVisible(true);
        
    }  
}