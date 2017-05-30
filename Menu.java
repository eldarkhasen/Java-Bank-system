import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends Container{
	private JButton Admin;
	private JButton User;
	private ImageIcon image;
	private JLabel label1;
	public Menu(){
		setLayout(null);
        setSize(1000,800);
		
		image = new ImageIcon(getClass().getResource("wel.jpg"));
		label1 = new JLabel(image);
		label1.setBounds(10,10,902,341);
		add(label1);
		
		Admin = new JButton("ADMIN");
		Admin.setBounds(350,400,200,40);
		 Admin.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
               

                Main.frame.menu.setVisible(false);
                Main.frame.admin.setVisible(true);
                Main.frame.repaint();
                
            }    
        
        });
		add(Admin);
		
		User = new JButton("USER");
		User.setBounds(350,500,200,40);
		 User.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
               

                Main.frame.menu.setVisible(false);
                Main.frame.user.setVisible(true);
                Main.frame.repaint();
                
            }    
        
        });
		add(User);
		
	}
} 