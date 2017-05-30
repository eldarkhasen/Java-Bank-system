import java.io.*;
public class User implements Serializable{

    public int id;
    public String login;
    public String password;
	public String name;
	public String surname;
    public String cash;
	public String typeCash;
	public boolean active;

    public User(){

    }
    
    public User(int id, String login, String password,String name,String surname ,String cash,String typeCash,boolean active){
        this.id = id;
        this.login = login;
        this.password = password;
		this.name = name;
		this.surname = surname;
        this.cash = cash;
		this.active = active;
		this.typeCash = typeCash;
		
    }
	
	
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
    
    public void setCash(String cash){
        this.cash = cash;
    }  
    public void setActive(boolean active){
        this.active = active;
    } 	
	
	public void setTypeCash(String typeCash){
		this.typeCash = typeCash;
	}
    
    public int getId(){
        return this.id;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public String getPassword(){
        return this.password;
    }
	
	public String getName(){
		return this.name;
	}
	
	public String getSurname(){
		return this.surname;
	}
    
    public String getCash(){
        return this.cash;
    }
	
	public String getTypeCash(){
		return this.typeCash;
	}
	public boolean getActive(){
        return this.active;
    }

    
}





