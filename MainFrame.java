import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    
    public MainMenu mainMenu;
    public AddContact addContact;
    public ListContact listContact;
	public DeleteContact deleteContact;
	public Admin admin;
	public EnterUser user;
    public Menu menu;
	public UserMenu usermenu;
	public SeeBalance seebalance;
	public GetMoney getmoney;
	public Transfer transfer;
    public MainFrame(){
        
        setLayout(null);
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		menu = new Menu();
		menu.setLocation(0,0);
		add(menu);
		
		admin = new Admin();
        admin.setLocation(0,0);
        admin.setVisible(false);
		add(admin);
		
		usermenu = new UserMenu();
		usermenu.setLocation(0,0);
		usermenu.setVisible(false);
		add(usermenu);
		
		user = new EnterUser();
        user.setLocation(0,0);
        user.setVisible(false);
		add(user);
		
		seebalance = new SeeBalance();
		seebalance.setLocation(0,0);
		seebalance.setVisible(false);
		add(seebalance);
		
		getmoney = new GetMoney();
		getmoney.setLocation(0,0);
		getmoney.setVisible(false);
		add(getmoney);
		
		
		mainMenu = new MainMenu();
        mainMenu.setLocation(0,0);
        mainMenu.setVisible(false);
		add(mainMenu);

        addContact = new AddContact();
        addContact.setLocation(0,0);
        addContact.setVisible(false);
        add(addContact);
        
        listContact = new ListContact();
        listContact.setLocation(0,0);
        listContact.setVisible(false);
        add(listContact);
		
		deleteContact = new DeleteContact();
        deleteContact.setLocation(0,0);
        deleteContact.setVisible(false);
        add(deleteContact);
		
		transfer = new Transfer();
        transfer.setLocation(0,0);
        transfer.setVisible(false);
        add(deleteContact);
		
	

        repaint();
        
    }
    
}