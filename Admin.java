import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends Container{
	private JLabel login;
	private JTextField loginText;
	
	private JLabel password;
	private JPasswordField passwordText;
	
	private JButton Enter;
	private JButton Back;
	private JLabel err;
	
	public String l;
	public String p;
	
	public Admin(){
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
			    
			   if(l.equals("admin")|| p.equals("admin")){
				
                Main.frame.admin.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
                Main.frame.repaint();
			   }else{
				   err.setVisible(true);
			   }
				}
				 
        
        });
		add(Enter);
		
		Back = new JButton("BACK");
		Back.setBounds(420,450,200,30);
		Back.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			  
				
                Main.frame.admin.setVisible(false);
                Main.frame.menu.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
		add(Back);
		
		

}}
