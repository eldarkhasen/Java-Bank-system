import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;

public class ListContact extends Container{

    private JButton backButton;    
    private String headers[] = {"ID", "LOGIN", "PASSWORD","NAME","SURNAME","CASH", "TYPECASH"};
    private JTable table;
    private JScrollPane pane;

    public ListContact(){
        
        setLayout(null);
        setSize(1000,800);

        table = new JTable();
        table.setBounds(0,0,600,300);

        pane = new JScrollPane(table);        
        updateTable();

        add(table);

        backButton = new JButton(" BACK ");
        backButton.setBounds(200,350,200,30);
        backButton.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                Main.frame.listContact.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
                Main.frame.repaint();
                
            }    
        
        });
        add(backButton);
        repaint();
        
    }    

    public void updateTable(){
        
        DefaultTableModel tableModel = new DefaultTableModel(0,0);
        tableModel.setColumnIdentifiers(headers);

        table.setModel(tableModel);

        Main.updateUsers();

        for(int i=0;i<Main.allUsers.size();i++){
				if(Main.allUsers.get(i).active==true){ 
				Vector <Object> row = new Vector<Object>();

            row.add(Main.allUsers.get(i).getId());
            row.add(Main.allUsers.get(i).getLogin());
            row.add(Main.allUsers.get(i).getPassword());
			row.add(Main.allUsers.get(i).getName());
			row.add(Main.allUsers.get(i).getSurname());
			row.add(Main.allUsers.get(i).getCash());
			row.add(Main.allUsers.get(i).getTypeCash());
            row.add(Main.allUsers.get(i).getActive());
            
            tableModel.addRow(row);}
          //System.out.println(Main.allUsers.get(i).getLogin());

        }
		
        repaint();

} }
    





