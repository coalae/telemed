package persistenceLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import telemed.User;

/**
* Methods to read and write User objects from/to a file.
* Implements the interfaces Serializable and UserDAO
*/
public class SerializedUserDAO implements UserDAO, Serializable {

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private String filepath;
	private ArrayList<User> userlist; 
	
	/**
	 * constructor
	 * @param filepath
	 */	
	public SerializedUserDAO() {
		this.filepath="userlist.ser"; 
		userlist=new ArrayList<User>();
	}
	
	
	// implement methods from interface UserDAO
	/**
	 * get userlist
	 * @return ArrayList
	 */
    @SuppressWarnings("unchecked")
	@Override
	public ArrayList<User> getUserList() {

		File datei = new File(filepath);

		if(datei.exists() && datei.canRead()) {
			try {
			FileInputStream fileinput = new FileInputStream(filepath);
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			
			if(objectinput!=null) {
				userlist = (ArrayList<User>) objectinput.readObject(); 
				objectinput.close();
				fileinput.close();  
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}else {
			userlist = new ArrayList<User>();
		}
		
		return userlist;
    
    }

    /**
     * get User object by ID
     * @param id
     * @return User
     */
	@Override
	public User getUserById(int id) {
		
		ArrayList<User> idsuchliste = getUserList();
		
		// if userId can be found, return User
		for(int i=0; i<idsuchliste.size();i++) {
			if(idsuchliste.get(i).getId()==id) {
				return idsuchliste.get(i);
			}
		}
		
		// if userId not found
		return null;
	}

	
	/**
	 * get a User by username
	 * @param username
	 * @return User
	 */
	@Override
	public User getUserByUsername(String username) {
		if(username==null || username.isEmpty() || username.equals("")) {
			return null;
		}
		
		ArrayList<User> suchliste = getUserList();
		
		for(int i=0; i<suchliste.size();i++) {
			if(suchliste.get(i).getUsername().equals(username)) {
				return suchliste.get(i);
			}
		}	
		return null;
	}

	/**
	 * add a new User
	 * @param user (User)
	 */
	@Override
	public void addUser(User user) {
					
		ArrayList<User> neueliste = new ArrayList<User>();
		neueliste.addAll(getUserList());
		neueliste.add(user);	
		
		try {
			FileOutputStream fileoutput = new FileOutputStream(filepath);
			ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
			objectoutput.writeObject(neueliste);
			objectoutput.close();
			fileoutput.close();  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 		
	}

	/**
	 * delete a User
	 * @param user (User)
	 */
	@Override
	public void deleteUser(User user) {
		if(user==null) {
			throw new IllegalArgumentException ("user is null, cannot be deleted!");
		}
		
		boolean checkUserToDeleteExists = false;
		for(int i=0; i<getUserList().size();i++){
			if ( (getUserList().get(i).getId() == (user.getId())) && (getUserList().get(i).getUsername() == (user.getUsername())) ){
				checkUserToDeleteExists=true;
			}
		}
		
		if (checkUserToDeleteExists) {
			ArrayList<User> neueliste = new ArrayList<User>();
			neueliste.addAll(this.getUserList());
			
			for(int i=0; i<neueliste.size();i++) {
				if(neueliste.get(i).getId() == (user.getId())) {
					neueliste.remove(neueliste.get(i));	 
				}
			}
			
			try {
				FileOutputStream fileoutput = new FileOutputStream(filepath);
				ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
				objectoutput.writeObject(neueliste);
				objectoutput.close();
				fileoutput.close();  
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			} 
		}
		else {
			throw new IllegalArgumentException ("user does not exist, cannot be deleted!");
		}		
	}

}
