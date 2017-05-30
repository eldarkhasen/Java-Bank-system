import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class EnterUser extends Container{
	private JLabel login;
	private JTextField loginText;
	
	
	private JLabel password;
	private JPasswordField passwordText;
	
	private JButton Enter;
	private JButton Back;
	private JLabel err;
	
	public String l;
	public String p;
	public int o;
	
	public EnterUser(){
		setLayout(null);
		setSize(1000,800);
		err = new JLabel("ERROR!!!");
		err.setBounds(100,50,200,50);
		err.setVisible(false);
		add(err);
		
		login = new JLabel("INSERT LOGIN: ");
		login.setBounds(200,200,200,30);
		add(login);
		loginText = new JTextField();
		loginText.setBounds(200,250,200,30);
		add(loginText);
		
		password = new JLabel("INSERT PASSWORD: ");
		password.setBounds(200,300,200,30);
		add(password);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(200,360,200,30);
		add(passwordText);
		
		Enter = new JButton("ENTER");
		Enter.setBounds(200,450,200,30);
		Enter.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
               l = loginText.getText();
			   p = passwordText.getText();
			   for(int i=0;i<Main.allUsers.size();i++){
				if(Main.allUsers.get(i).active==true){ 
				Vector <Object> row = new Vector<Object>();
			    
			   if(l.equals(Main.allUsers.get(i).getLogin())&& p.equals(Main.allUsers.get(i).getPassword())){
				   Main.id = i;
				   
				o = Main.allUsers.get(i).getId();
				o = Main.frame.seebalance.o;
                Main.frame.user.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();
			   }else{
				   err.setVisible(true);
			   }
				}
			}}
        
        });
		add(Enter);
		
		Back = new JButton("BACK");
		Back.setBounds(410,450,200,30);
		Back.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			  
				
                Main.frame.user.setVisible(false);
                Main.frame.menu.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
		add(Back);
		
		

}}