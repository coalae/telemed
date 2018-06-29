package domainLogic;

import persistenceLayer.DeviceDAO;
import persistenceLayer.SerializedDeviceDAO;
import telemed.Device;
import telemed.DeviceType;
import telemed.TelemedFactory;

/**
 * Manages the functionalities of the Device 
 */
public class DeviceMgmt {

	/**
	 * Instance variables 
	 */	
	private DeviceDAO devicedao;
	private TelemedFactory factory;

	
	/**
	 * Constructor
	 */	
	public DeviceMgmt(){
		this.devicedao = new SerializedDeviceDAO();
		factory = TelemedFactory.eINSTANCE;
	}
	
	
	/**
	 * add a device to a patient (for a specific medical record case)
	 * role: doctor adds the device by clicking the button "add device" in the medical record details view
	 * @param DeviceType (enum)
	 * @param patientId
	 * @param medicalRecordId
	 */
	public boolean addDevice(DeviceType type, int patientId, int medicalRecordId) {
		
		// Added dummyId 0 and change later in SerializedDeviceDAO
		Device device = factory.createDevice();
		device.setId(devicedao.getDeviceList().size() + 1);
		device.setType(type);
		device.setPatientId(patientId);
		device.setMedicalRecordId(medicalRecordId);
		devicedao.addDevice(device);
		return true;
		
	}
	
	/**
	 * gets the last assigned device id
	 * @return int lastDeviceId
	 */
	public int getLastDeviceID() {
		return devicedao.getDeviceList().size() - 1;
	}

	
}