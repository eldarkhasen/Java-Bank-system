import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GetMoney extends Container{
	
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	private JButton e;
	private JButton f;
	private JButton g;
	private JTextField m;
	private JButton Back;
	public int l;
	public String t;
	public int g1;
	public int o;
private JLabel err;
	public GetMoney(){
		setLayout(null);
setSize(1000,800);

a = new JButton("1000");
a.setBounds(0,50,200,60);
a.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                l = Integer.parseInt(Main.allUsers.get(Main.id).getCash());
				if(l>=1000){	l = l - 1000;
				t = String.valueOf(l);	
				Main.allUsers.get(Main.id).setCash(t);
			    Main.saveUsers();
				System.out.println(Main.allUsers.get(Main.id).getCash());
                Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();}else{err.setVisible(true);}
			
			  
				 
			}
        });
add(a);
err = new JLabel("ERROR!!!");
		err.setBounds(500,100,400,100);
		err.setForeground(Color.red);
		err.setVisible(false);
		add(err);
b = new JButton("2000");
b.setBounds(0,150,200,60);
b.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                l = Integer.parseInt(Main.allUsers.get(Main.id).getCash());
				if(l>=2000){
				l = l - 2000;
				t = String.valueOf(l);	
				Main.allUsers.get(Main.id).setCash(t);
			    Main.saveUsers();
				System.out.println(Main.allUsers.get(Main.id).getCash());
                Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();
			  
				}else{
					err.setVisible(true);
				}
			}
        });
add(b);

c = new JButton("5000");
c.setBounds(0,250,200,60);
c.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                l = Integer.parseInt(Main.allUsers.get(Main.id).getCash());
				l = l - 5000;
				t = String.valueOf(l);	
				Main.allUsers.get(Main.id).setCash(t);
			    Main.saveUsers();
				System.out.println(Main.allUsers.get(Main.id).getCash());
                Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
add(c);

d = new JButton("10 000");
d.setBounds(780,50,200,60);
d.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                l = Integer.parseInt(Main.allUsers.get(Main.id).getCash());
			if(l>=10000){	l = l - 10000;
				t = String.valueOf(l);	
				Main.allUsers.get(Main.id).setCash(t);
			    Main.saveUsers();
				System.out.println(Main.allUsers.get(Main.id).getCash());
                Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();}else{err.setVisible(true);}
			
			  
			  
				 
			}
        });
add(d); 

e = new JButton("15 000");
e.setBounds(780,150,200,60);
e.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                l = Integer.parseInt(Main.allUsers.get(Main.id).getCash());
				l = l - 15000;
				t = String.valueOf(l);	
				Main.allUsers.get(Main.id).setCash(t);
			    Main.saveUsers();
				System.out.println(Main.allUsers.get(Main.id).getCash());
                Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
add(e); 

f = new JButton("20 000");
f.setBounds(780,250,200,60);
f.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                l = Integer.parseInt(Main.allUsers.get(Main.id).getCash());
				if(l>=2000){	l = l - 20000;
				t = String.valueOf(l);	
				Main.allUsers.get(Main.id).setCash(t);
			    Main.saveUsers();
				System.out.println(Main.allUsers.get(Main.id).getCash());
                Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();}else{err.setVisible(true);}
			
			  
			  
				 
			}
        });
add(f); 
m = new JTextField("");
m.setBounds(780,350,200,40);
add(m);

g = new JButton("GET");
g.setBounds(780,450,200,30);
g.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
	 g1 = Integer.parseInt(m.getText());
	  l = Integer.parseInt(Main.allUsers.get(Main.id).getCash());
	  if(l>=g1){l = l - g1;
				t = String.valueOf(l);	
				Main.allUsers.get(Main.id).setCash(t);
			    Main.saveUsers();
				Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();
				}else{ 
					//JOptionPane.showMessageDialog(null, 30, "Error", 30);
				err.setVisible(true);
				}
				
}
});
add(g);
Back = new JButton("BACK");
		Back.setBounds(600,600,200,30);
		Back.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                
                 
			  
				err.setVisible(false);
				m.setText("");
                Main.frame.getmoney.setVisible(false);
                Main.frame.usermenu.setVisible(true);
                Main.frame.repaint();
			  
				 
			}
        });
		add(Back);



}}
