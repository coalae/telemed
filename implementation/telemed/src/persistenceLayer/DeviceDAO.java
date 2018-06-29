package persistenceLayer;

import java.util.ArrayList;

import telemed.Device;

/**
* Methods to read and write Device objects from/to a file.
*/
public interface DeviceDAO {

	/**
	 * get a list of all Devices  
	 * @return ArrayList list of all Devices
	 */
	public ArrayList<Device> getDeviceList(); 
	
	
	/**
	 * add a new Device 
	 * @param dev  
	 */
	public void addDevice(Device dev);  
	
	
	
}
