import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeleteContact extends Container{
	    private JButton backButton;
		private JLabel Id;
		private JTextField inID;
		private JLabel Name;
		private JLabel Surname;
		private JButton Delete;
		private JButton Find;
		
		
		public static int l= 0;
		public DeleteContact(){
			setLayout(null);
            setSize(600,500);
			
			Id = new JLabel("INSERT ID: ");
			Id.setBounds(100,50,150,30);
			add(Id);
			
			inID = new JTextField();
			inID.setBounds(200,50,150,30);
			add(inID);
			
			Name = new JLabel("");
			Name.setBounds(100,100,150,30);
			add(Name);
			
			Surname = new JLabel("");
			Surname.setBounds(100,150,150,30);
			add(Surname);
			
			Find = new JButton("FIND");
			Find.setBounds(50,400,150,30);
			Find.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					find();
				}
			});
			add(Find);
			
			Delete = new JButton("Delete");
			Delete.setBounds(250,350,150,30);
			Delete.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(l>=0){
				Main.allUsers.get(l).active = false;
				Main.saveUsers();
				Main.frame.listContact.updateTable();
				
			}
			updateForm();
				}
			});
			add(Delete);
			
			backButton = new JButton("BACK");
			backButton.setBounds(250,400,150,30);
			        backButton.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                

                Main.frame.deleteContact.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
                Main.frame.repaint();
                
            }    
        
        });
			add(backButton);
			

        
        }
		
		public void find(){
			String id = inID.getText();
			int i = Integer.parseInt(id);
			int s = Main.allUsers.size()+1;
			
			
			if(i>0&& i<s){
				l = i-1;
				if(Main.allUsers.get(l).active == true){
					Name.setText(Main.allUsers.get(l).name);
					Surname.setText(Main.allUsers.get(l).surname);
				}
			}
			
		}
		  private void updateForm(){

        Name.setText("");        
        Surname.setText(""); 
       inID.setText("");		

        

    }
		
	
		
		
       
		}
		  
	
 