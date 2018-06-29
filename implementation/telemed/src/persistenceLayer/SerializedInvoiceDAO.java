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

import telemed.Invoice;

/**
* Methods to read and write Invoice objects from/to a file.
* Implements the interfaces Serializable and InvoiceDAO
*/
public class SerializedInvoiceDAO implements InvoiceDAO, Serializable {

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private String filepath;
	private ArrayList<Invoice> invoicelist; 
	
	/**
	 * constructor
	 * @param filepath
	 */	
	public SerializedInvoiceDAO() {
		this.filepath="invoicelist.ser"; 
		invoicelist=new ArrayList<Invoice>();
	}
	
	
	// implement methods from interface InvoiceDAO
	/**
	 * get invoicelist
	 * @return ArrayList
	 */
    @SuppressWarnings("unchecked")
	@Override
	public ArrayList<Invoice> getInvoiceList() {
		File datei = new File(filepath);

		if(datei.exists()&& datei.canRead()) {
			try {
			FileInputStream fileinput = new FileInputStream(filepath);
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			
			if(objectinput!=null) {
				invoicelist = (ArrayList<Invoice>) objectinput.readObject(); 
				objectinput.close();
				fileinput.close();  
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return invoicelist;

   }

    
	/**
	 * add a new Invoice 
	 * @param in  
	 */
	@Override
	public void addInvoice(Invoice in) {

		ArrayList<Invoice> neueliste = new ArrayList<Invoice>();
		neueliste.addAll(getInvoiceList());
		neueliste.add(in);	
			
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
	 * deletes the indicated Invoice
	 * @param in  
	 */
	@Override
	public void deleteInvoice(Invoice in) {

		if(in==null) {
			throw new IllegalArgumentException ("Invoice is null, cannot be deleted!");
		}
		
		boolean checkInvoiceToDeleteExists = false;
		for(int i=0; i<getInvoiceList().size();i++){
			if ( (getInvoiceList().get(i).getInvoiceID() == (in.getInvoiceID()))){
				checkInvoiceToDeleteExists=true;
			}
		}
		
		if (checkInvoiceToDeleteExists) {
			ArrayList<Invoice> neueliste = new ArrayList<Invoice>();
			neueliste.addAll(this.getInvoiceList());
			
			for(int i=0; i<neueliste.size();i++) {
				if(neueliste.get(i).getInvoiceID() == (in.getInvoiceID())) {
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
			throw new IllegalArgumentException ("Invoice does not exist, cannot be deleted!");
		}			
		
	}

	
	/**
	 * updates the indicated Invoice
	 * @param in
	 */
	@Override
	public void updateInvoice(Invoice in) {

		deleteInvoice(in);
		addInvoice(in);
		
	}

}
