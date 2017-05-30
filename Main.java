import java.util.*;
import java.io.*;

public class Main{

	public static ArrayList<User> allUsers = new ArrayList<User>();
	public static MainFrame frame;
	public static int id = 0;

	public static void main(String[] args) {
		
		frame = new MainFrame();
        frame.setVisible(true);

	}

	public static void updateUsers(){

		try{

			ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("memory.data"));
			allUsers = (ArrayList<User>)inStream.readObject();
			inStream.close();

		}catch(Exception e){
			System.out.println("No memory data exists!!!");
		}

	}

	public static void saveUsers(){

		try{

			ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.data"));
			outStream.writeObject(allUsers);
			outStream.close();

		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public static void addUser(String login, String password,String name,String surname,String cash,String typecash){

		updateUsers();
		User u = new User(allUsers.size()+1,login,password,name,surname,cash,typecash,true);
		
		allUsers.add(u);
		saveUsers();

	}

}






