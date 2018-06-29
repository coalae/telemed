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

import telemed.Device;

/**
* Methods to read and write Device objects from/to a file.
* Implements the interfaces Serializable and DeviceDAO
*/
public class SerializedDeviceDAO implements DeviceDAO, Serializable {

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private String filepath;
	private ArrayList<Device> devicelist; 
	
	/**
	 * constructor
	 * @param filepath
	 */	
	public SerializedDeviceDAO() {
		this.filepath="devicelist.ser"; 
		devicelist=new ArrayList<Device>();
	}
	
	
	// implement methods from interface DeviceDAO
	/**
	 * get devicelist
	 * @return ArrayList
	 */
    @SuppressWarnings("unchecked")
	@Override
	public ArrayList<Device> getDeviceList() {
		File datei = new File(filepath);

		if(datei.exists()&& datei.canRead()) {
			try {
			FileInputStream fileinput = new FileInputStream(filepath);
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			
			if(objectinput!=null) {
				devicelist = (ArrayList<Device>) objectinput.readObject(); 
				objectinput.close();
				fileinput.close();  
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return devicelist;

   }

    
	/**
	 * add a new Device 
	 * @param dev
	 */
	@Override
	public void addDevice(Device dev) {

		ArrayList<Device> neueliste = new ArrayList<Device>();
		neueliste.addAll(getDeviceList());
		neueliste.add(dev);	
			
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

	
}
