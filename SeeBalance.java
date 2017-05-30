import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SeeBalance extends Container{
	
	private JButton see;
	private JLabel result;
	private JLabel result1;
	private JButton Back;
	public String l;
	public String t;
	public int o;
	
	public SeeBalance(){
		setLayout(null);
setSize(1000,800);

	

					

    
	result = new JLabel("PRESS");
	result.setBounds(100,100,200,40);
    add(result);
	
	result1 = new JLabel("TO SEE");
	result1.setBounds(200,100,200,40);
    add(result1);
	
	
	
	see = new JButton("SEE BALANCE");
		see.setBounds(100,150,200,30);
		see.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			    t = Main.allUsers.get(Main.id).getCash();
				result.setText(t);
				
				l = Main.allUsers.get(Main.id).getTypeCash();
				result1.setText(l);
				
				
         
			  
				 
			}
        });
		add(see);
	
	
	
		Back = new JButton("BACK");
		Back.setBounds(500,460,200,30);
		Back.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                result1.setText("TO SEE");
				result.setText("PRESS");
			  
				System.out.println(Main.id);
				System.out.println(Main.allUsers.get(Main.id).getCash());
                Main.frame.seebalance.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
		add(Back);
}}