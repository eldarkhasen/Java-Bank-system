import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends Container{
    
    private JButton addContactButton;
    private JButton listContactButton;
    private JButton exitButton;
	private JButton deleteContactButton;
    
    public MainMenu(){
        
        setLayout(null);
        setSize(1000,800);
        
        addContactButton = new JButton(" ADD NEW CONTACT ");
        addContactButton.setBounds(200,50,200,30);
        addContactButton.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                Main.frame.mainMenu.setVisible(false);
                Main.frame.addContact.setVisible(true);
                Main.frame.repaint();
                
            }    
        
        });
        add(addContactButton);

        listContactButton = new JButton(" LIST CONTACT ");
        listContactButton.setBounds(200,150,200,30);
        listContactButton.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){

                Main.frame.mainMenu.setVisible(false);
                Main.frame.listContact.updateTable();
                Main.frame.listContact.setVisible(true);
                Main.frame.repaint();

            }
        });
        add(listContactButton);
		
		deleteContactButton = new JButton("DELETE CONTACT ");
        deleteContactButton.setBounds(200,250,200,30);
        deleteContactButton.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                
                Main.frame.mainMenu.setVisible(false);
                Main.frame.deleteContact.setVisible(true);
                Main.frame.repaint();
                
            }    
      
        });
        add(deleteContactButton);
        
        exitButton = new JButton(" EXIT ");
        exitButton.setBounds(200,350,200,30);
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                System.exit(0);
                
            }
        });
        add(exitButton);
        
        repaint();
        
    }
    
}