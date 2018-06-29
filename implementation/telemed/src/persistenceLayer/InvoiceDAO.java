package persistenceLayer;

import java.util.ArrayList;

import telemed.Invoice;

/**
* Methods to read and write Invoice objects from/to a file.
*/
public interface InvoiceDAO {
	
	/**
	 * get a list of all Invoices  
	 * @return ArrayList list of all Invoices
	 */
	public ArrayList<Invoice> getInvoiceList(); 
	
	
	/**
	 * add a new Invoice 
	 * @param in  
	 */
	public void addInvoice(Invoice in);  
	
	
	/**
	 * deletes the indicated Invoice
	 * @param in  
	 */
	public void deleteInvoice(Invoice in);
	
	
	/**
	 * updates the indicated Invoice
	 * @param in
	 */
	public void updateInvoice(Invoice in);

}
