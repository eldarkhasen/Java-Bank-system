import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddContact extends Container{

    private JButton backButton;
    private JButton addButton;
	private JLabel loginIn;
    private JTextField login;
	private JLabel passwordIn;
    private JPasswordField password;
	private JLabel nameIn;
	private JTextField name;
	private JLabel surnameIn;
	private JTextField surname;
	private JLabel cashIn;
	private JTextField cash;
	private JLabel lol;
	private JLabel lol1;
	private JLabel lol2;
	private JLabel err;

    String typeCash[] = {"KZT","USD","EUR"};

    private JComboBox typeCashBox;

    public AddContact(){
        
        setLayout(null);
        setSize(1000,800);
		err = new JLabel("ERROR!!!");
		err.setBounds(200,500,400,100);
		err.setForeground(Color.red);
		err.setVisible(false);
		add(err);
        loginIn = new JLabel("LOGIN: ");
		loginIn.setBounds(100,50,150,30);
		add(loginIn);
		lol = new JLabel("*");
		lol.setBounds(195,50,150,30);
		lol.setForeground(Color.red);
		add(lol);
		login = new JTextField();
        login.setBounds(200,50,150,30);
        add(login);
        
        passwordIn = new JLabel("PASSWORD: ");
        passwordIn.setBounds(100,100,150,30);
        add(passwordIn);
		lol = new JLabel("*");
		lol.setBounds(195,100,150,30);
		lol.setForeground(Color.red);
		add(lol);
		password = new JPasswordField();
        password.setBounds(200,100,150,30);
        add(password);
		
		nameIn = new JLabel("NAME: ");
		nameIn.setBounds(100,150,150,30);
		add(nameIn);
		
		name = new JTextField();
		name.setBounds(200,150,150,30);
		add(name);
		
		surnameIn = new JLabel("SURNAME: ");
		surnameIn.setBounds(100,200,150,30);
		add(surnameIn);
		
		surname = new JTextField();
		surname.setBounds(200,200,150,30);
		add(surname);
		
		cashIn = new JLabel("CASH: ");
		cashIn.setBounds(100,250,150,30);
		add(cashIn);
		lol = new JLabel("*");
		lol.setBounds(195,250,150,30);
		lol.setForeground(Color.red);
		add(lol);
		cash = new JTextField();
		cash.setBounds(200,250,150,30);
		add(cash);
       

       typeCashBox = new JComboBox(typeCash);
        typeCashBox.setBounds(360,250,150,30);
        add(typeCashBox);

        addButton = new JButton(" ADD ");
        addButton.setBounds(300,400,200,30);
        addButton.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                String loginValue = login.getText();
                String passwordValue = password.getText();
				String nameValue = name.getText();
				String surnameValue = surname.getText();
				String cashValue = cash.getText();
                String typeCashString = String.valueOf(typeCashBox.getSelectedItem());
                if(!loginValue.equals("")){
					 Main.addUser(loginValue,passwordValue,nameValue,surnameValue,cashValue,typeCashString);

                updateForm();

                Main.frame.addContact.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
                Main.frame.repaint();
				}else{
				err.setVisible(true);
               
				}
            }    
        
        });

        add(addButton);

        backButton = new JButton(" BACK ");
        backButton.setBounds(300,450,200,30);
        backButton.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                updateForm();
err.setVisible(false);
                Main.frame.addContact.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
                Main.frame.repaint();
                
            }    
        
        });
        add(backButton);
        repaint();
        
    }    

    private void updateForm(){

        login.setText("");        
        password.setText("");        
		name.setText("");
		surname.setText("");
		cash.setText("");

        typeCashBox.setSelectedIndex(0);

    }
    
}




