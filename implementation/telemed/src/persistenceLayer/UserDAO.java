package persistenceLayer;

import java.util.ArrayList;

import telemed.User;

/**
* Methods to read and write User objects from/to a file.
*/
public interface UserDAO {
	
	/**
	 * get a list of all Users  
	 * @return ArrayList list of all Users
	 */
	public ArrayList<User> getUserList(); 
	

	/**
	 * search and return a User object by ID 
	 * @param id  
	 * @return User 
	 */
	public User getUserById(int id);
	
	
	/**
	 * search and return a User by username (unique)  
	 * @param username  
	 * @return User  
	 */
	public User getUserByUsername(String username);  
	
	
	/**
	 * add a new user 
	 * @param user  
	 */
	public void addUser(User user);  
	
	
	/**
	 * deletes the indicated user
	 * @param user  
	 */
	public void deleteUser(User user);
	
}


	


	


