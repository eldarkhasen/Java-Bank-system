import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class UserMenu extends Container{
	
	
	private JButton SeeBalance;
	private JButton Back;
	private JButton GetMoney;
	private JButton transfer;
	public String l;
	public String p;
	
	public UserMenu(){
		setLayout(null);
		setSize(1000,800);
	
	SeeBalance = new JButton("SEE BALANCE");
	SeeBalance.setBounds(300,100,200,40);
		SeeBalance.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			  
				
                Main.frame.usermenu.setVisible(false);
                Main.frame.seebalance.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
	
	add(SeeBalance);
	GetMoney = new JButton("GET MONEY");
	GetMoney.setBounds(300,200,200,40);
		GetMoney.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			  
				
                Main.frame.usermenu.setVisible(false);
                Main.frame.getmoney.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
	
	add(GetMoney);
	
transfer = new JButton("TRANSFER");
	transfer.setBounds(300,300,200,40);
		transfer.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			  
				
                Main.frame.usermenu.setVisible(false);
                Main.frame.transfer.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
	
	add(transfer);
	
	
	Back = new JButton("BACK");
		Back.setBounds(500,460,200,30);
		Back.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			  
				
                Main.frame.usermenu.setVisible(false);
                Main.frame.menu.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
		add(Back);
	
		
		}}