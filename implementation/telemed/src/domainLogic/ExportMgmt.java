package domainLogic;

import persistenceLayer.InvoiceDAO;
import persistenceLayer.MedicalRecordDAO;
import persistenceLayer.PatientMonitoringDAO;
import persistenceLayer.SerializedInvoiceDAO;
import persistenceLayer.SerializedMedicalRecordDAO;
import persistenceLayer.SerializedPatientMonitoringDAO;
import persistenceLayer.SerializedUserDAO;
import persistenceLayer.UserDAO;
import telemed.AnonymizedDataQuery;
import telemed.Gender;
import telemed.Invoice;
import telemed.MedicalRecord;
import telemed.Prescription;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Manages all data exports
 */
public class ExportMgmt {

	/**
	 * Instance variables 
	 */	
	private UserDAO userdao;
	private InvoiceDAO invoicedao;
	private MedicalRecordDAO mrdao;
	private PatientMonitoringDAO pmdao;
	private MedicalRecordMgmt medicalRecordMgmt;
	private InvoiceMgmt invoiceMgmt;
	private UserMgmt userMgmt;
	
	
	/**
	 * Constructor
	 */	
	public ExportMgmt(){
		this.userdao = new SerializedUserDAO();
		this.invoicedao = new SerializedInvoiceDAO();
		this.mrdao = new SerializedMedicalRecordDAO();
		this.pmdao = new SerializedPatientMonitoringDAO();
		this.medicalRecordMgmt = new MedicalRecordMgmt();
		this.invoiceMgmt = new InvoiceMgmt();	
		this.userMgmt = new UserMgmt();
	}
	

	
	
	
	//*********************************** ACHTUNG: datatype for exports (methods below) to be discussed **************************************************
    //*********************************** return types still left "void" for the moment" ***************************************************************** 
	
	/**
	 * export all medical records
	 */
	public void exportAllMedicalRecords(String format) {
		List<MedicalRecord> list = medicalRecordMgmt.getAllMedicalRecords();
		if(format.equals("XLSX")){
			String[] columns = {"Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"};
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("MedicalRecords");

		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());

		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);

		        // Create a Row
		        Row headerRow = sheet.createRow(0);

		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
				
				for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(list.get(i).getPatientId());
					 row.createCell(1).setCellValue(list.get(i).getDoctorId());
					 row.createCell(2).setCellValue(list.get(i).getPrice());
					 row.createCell(3).setCellValue(list.get(i).getMedicalCondition().getName());
					 row.createCell(4).setCellValue(list.get(i).getDescription());
					 
					 Calendar date = list.get(i).getDate();
					 String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						
						
					 row.createCell(5).setCellValue(date_);
					 row.createCell(6).setCellValue(list.get(i).getRecordId());
					 
					 
					final int index = i;
					List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(index).getRecordId()).collect(Collectors.toList());
					if (presList != null && presList.size() > 0)
						if (presList.get(0).isOrdered())
							row.createCell(7).setCellValue("Ordered");
						else
							row.createCell(7).setCellValue("Not Ordered");
					else
						row.createCell(7).setCellValue("No Prescription");
				}
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }

		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("AllMedicalrecords.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();

		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("AllMedicalrecords.xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("AllMedicalRecords.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader("Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"));
			) {
				for (int i = 0; i < list.size(); i++) {
					 
					Calendar date = list.get(i).getDate();
					String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
					
					String val;
					final int index = i;
					List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(index).getRecordId()).collect(Collectors.toList());
					if (presList != null && presList.size() > 0)
						if (presList.get(0).isOrdered())
							val = "Ordered";
						else
							val = "Not Ordered";
					else
						val = "No Prescription";
					
					
						csvPrinter.printRecord(
								list.get(i).getPatientId(),
								list.get(i).getDoctorId(),
								list.get(i).getPrice(),
								list.get(i).getMedicalCondition().getName(),
								list.get(i).getDescription(),
								date_,
								list.get(i).getRecordId(),
								val
						);
					 						
				}
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("AllMedicalRecords.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	/**
	 * export medicalrecord by recordId
	 * @param id
	 */
	public void exportMedicalRecordByRecordId(int id, String format, Rectangle rectangle) {
		 MedicalRecord mr = medicalRecordMgmt.getMedicalRecordByRecordId(id);
		if(format.equals("XLSX")){
			String[] columns = {"Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"};
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("MedicalRecords");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
		        
				
					 Row row = sheet.createRow(1);
					 row.createCell(0).setCellValue(mr.getPatientId());
					 row.createCell(1).setCellValue(mr.getDoctorId());
					 row.createCell(2).setCellValue(mr.getPrice());
					 row.createCell(3).setCellValue(mr.getMedicalCondition().getName());
					 row.createCell(4).setCellValue(mr.getDescription());
					 
					 Calendar date = mr.getDate();
					 String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						
						
					 row.createCell(5).setCellValue(date_);
					 row.createCell(6).setCellValue(mr.getRecordId());
					 
					 
					List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == id).collect(Collectors.toList());
					if (presList != null && presList.size() > 0)
						if (presList.get(0).isOrdered())
							row.createCell(7).setCellValue("Ordered");
						else
							row.createCell(7).setCellValue("Not Ordered");
					else
						row.createCell(7).setCellValue("No Prescription");
			
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("medicalrecord" + id + ".xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("medicalrecord" + id + ".xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("JPG")) {
			// capture the whole screen
		    BufferedImage screencapture;
			try {
				screencapture = new Robot().createScreenCapture(rectangle);
				File file = new File("MedicalRecord" +  id + ".jpg"); 
				ImageIO.write(screencapture, "jpg", file);
				java.awt.Desktop.getDesktop().open(new File("MedicalRecord" +  id + ".jpg"));
			} 
			catch (Exception ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			Calendar date = mr.getDate();
			String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			
			String val;
			List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == id).collect(Collectors.toList());
			if (presList != null && presList.size() > 0)
				if (presList.get(0).isOrdered())
					val = "Ordered";
				else
					val = "Not Ordered";
			else
				val = "No Prescription";
			
			try (
				BufferedWriter writer = Files.newBufferedWriter(Paths.get("MedicalRecord" +  id + ".csv"));
				CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
			                    .withHeader("Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"));
			 ) {
				csvPrinter.printRecord(
						mr.getPatientId(),
						mr.getDoctorId(),
						mr.getPrice(),
						mr.getMedicalCondition().getName(),
						mr.getDescription(),
						date_,
						mr.getRecordId(),
						val
				);
			 	csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("MedicalRecord" +  id + ".csv"));
			 }
			 catch ( Exception e) {
				 e.printStackTrace();
			 }		
		}
	}
	
	
	/**
	 * export medical records by patientId
	 * @param patientId
	 */
	public void exportMedicalRecordByPatientId(int patientId, String format) {
		List<MedicalRecord> list = medicalRecordMgmt.getMedicalRecordByPatientId(patientId);
		if(format.equals("XLSX")){
			String[] columns = {"Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"};
			
			// TODO
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("MedicalRecords");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
		        
				
				for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(list.get(i).getPatientId());
					 row.createCell(1).setCellValue(list.get(i).getDoctorId());
					 row.createCell(2).setCellValue(list.get(i).getPrice());
					 row.createCell(3).setCellValue(list.get(i).getMedicalCondition().getName());
					 row.createCell(4).setCellValue(list.get(i).getDescription());
					 
					 Calendar date = list.get(i).getDate();
					 String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						
						
					 row.createCell(5).setCellValue(date_);
					 row.createCell(6).setCellValue(list.get(i).getRecordId());
					 
					 
					final int index = i;
					List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(index).getRecordId()).collect(Collectors.toList());
					if (presList != null && presList.size() > 0)
						if (presList.get(0).isOrdered())
							row.createCell(7).setCellValue("Ordered");
						else
							row.createCell(7).setCellValue("Not Ordered");
					else
						row.createCell(7).setCellValue("No Prescription");
				}
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("PersonalRecords.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("PersonalRecords.xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("PersonalRecords.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader("Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"));
			) {
				for (int i = 0; i < list.size(); i++) {
					 
					Calendar date = list.get(i).getDate();
					String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
					
					String val;
					final int index = i;
					List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(index).getRecordId()).collect(Collectors.toList());
					if (presList != null && presList.size() > 0)
						if (presList.get(0).isOrdered())
							val = "Ordered";
						else
							val = "Not Ordered";
					else
						val = "No Prescription";
					
					
						csvPrinter.printRecord(
								list.get(i).getPatientId(),
								list.get(i).getDoctorId(),
								list.get(i).getPrice(),
								list.get(i).getMedicalCondition().getName(),
								list.get(i).getDescription(),
								date_,
								list.get(i).getRecordId(),
								val
						);
					 						
				}
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("PersonalRecords.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * export all invoices
	 */
	public void exportAllInvoices(String format) {
		String[] columns = {"Invoice ID", "Patient ID", "Invoice Date", "Due Date", "Price", "Creditor ID" , "Creditor Type", "Topic", "Payment"};
		 List<Invoice> list = invoiceMgmt.getAllInvoices();
		 
		if(format.equals("XLSX")){
				
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("AllInvoices");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
				
				for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(list.get(i).getInvoiceID());
					 row.createCell(1).setCellValue(list.get(i).getPatientId());
					 
					 Calendar invoiceDate = list.get(i).getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(2).setCellValue(invoiceDate_);
					 
					 Calendar dueDate = list.get(i).getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(3).setCellValue(dueDate_);
					 
					 row.createCell(4).setCellValue(list.get(i).getPrice());
					 row.createCell(5).setCellValue(list.get(i).getCreditorId());				 
					 row.createCell(6).setCellValue(userMgmt.getUserType(list.get(i).getCreditorId()));			 
					 row.createCell(7).setCellValue(list.get(i).getTopic());
					 
					 String paymentInfo;
					 if (list.get(i).isPaid()) {
							Calendar date = list.get(i).getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
					 row.createCell(8).setCellValue(paymentInfo);
					 
				}
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("AllInvoices.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("AllInvoices.xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("AllInvoices.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader(columns));
			) {
				for (int i = 0; i < list.size(); i++) {
					
					 Calendar invoiceDate = list.get(i).getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 
					 Calendar dueDate = list.get(i).getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 
					 String paymentInfo;
					 if (list.get(i).isPaid()) {
							Calendar date = list.get(i).getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
										
						csvPrinter.printRecord(
								list.get(i).getInvoiceID(),
								list.get(i).getPatientId(),
								invoiceDate_,
								dueDate_,
								list.get(i).getPrice(),
								list.get(i).getCreditorId(),
								userMgmt.getUserType(list.get(i).getCreditorId()),
								list.get(i).getTopic(),
								paymentInfo
						);
					 						
				}
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("AllInvoices.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * export invoice by invoiceId
	 * @param invoiceId
	 */
	public void exportInvoiceByInvoiceId(int invoiceId, String format, Rectangle rectangle) {
		Invoice invoice = invoiceMgmt.getInvoiceByInvoiceId(invoiceId);
		String[] columns = {"Invoice ID", "Patient ID", "Invoice Date", "Due Date", "Price", "Creditor ID" , "Creditor Type", "Topic", "Payment"};
		
		if(format.equals("XLSX")){
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("AllInvoices");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
				
					 Row row = sheet.createRow(1);
					 row.createCell(0).setCellValue(invoice.getInvoiceID());
					 row.createCell(1).setCellValue(invoice.getPatientId());
					 
					 Calendar invoiceDate = invoice.getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(2).setCellValue(invoiceDate_);
					 
					 Calendar dueDate = invoice.getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(3).setCellValue(dueDate_);
					 
					 row.createCell(4).setCellValue(invoice.getPrice());
					 row.createCell(5).setCellValue(invoice.getCreditorId());				 
					 row.createCell(6).setCellValue(userMgmt.getUserType(invoice.getCreditorId()));			 
					 row.createCell(7).setCellValue(invoice.getTopic());
					 
					 String paymentInfo;
					 if (invoice.isPaid()) {
							Calendar date = invoice.getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
					 row.createCell(8).setCellValue(paymentInfo);
					
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("Invoice" +  invoiceId + ".xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("Invoice" +  invoiceId + ".xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("JPG")) {
			// capture the whole screen
		    BufferedImage screencapture;
			try {
				screencapture = new Robot().createScreenCapture(rectangle);
				File file = new File("Invoice" +  invoiceId + ".jpg"); 
				ImageIO.write(screencapture, "jpg", file);
				java.awt.Desktop.getDesktop().open(new File("Invoice" +  invoiceId + ".jpg"));
			} 
			catch (Exception ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("Invoice" +  invoiceId + ".csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader(columns));
			) {
									
					 Calendar invoiceDate = invoice.getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 
					 Calendar dueDate = invoice.getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 
					 String paymentInfo;
					 if (invoice.isPaid()) {
							Calendar date = invoice.getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
										
						csvPrinter.printRecord(
								invoice.getInvoiceID(),
								invoice.getPatientId(),
								invoiceDate_,
								dueDate_,
								invoice.getPrice(),
								invoice.getCreditorId(),
								userMgmt.getUserType(invoice.getCreditorId()),
								invoice.getTopic(),
								paymentInfo
						);
					 
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("Invoice" +  invoiceId + ".csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * export invoice(s) by patientId
	 * @param patientId
	 */
	public void exportInvoiceByPatientId(int patientId, String format) {
		String[] columns = {"Invoice ID", "Patient ID", "Invoice Date", "Due Date", "Price", "Creditor ID" , "Creditor Type", "Topic", "Payment"};
		List<Invoice> list = invoiceMgmt.getInvoiceByPatientId(patientId);
		
		if(format.equals("XLSX")){
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("PersonalInvoices");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
				
				for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(list.get(i).getInvoiceID());
					 row.createCell(1).setCellValue(list.get(i).getPatientId());
					 
					 Calendar invoiceDate = list.get(i).getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(2).setCellValue(invoiceDate_);
					 
					 Calendar dueDate = list.get(i).getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(3).setCellValue(dueDate_);
					 
					 row.createCell(4).setCellValue(list.get(i).getPrice());
					 row.createCell(5).setCellValue(list.get(i).getCreditorId());				 
					 row.createCell(6).setCellValue(userMgmt.getUserType(list.get(i).getCreditorId()));			 
					 row.createCell(7).setCellValue(list.get(i).getTopic());
					 
					 String paymentInfo;
					 if (list.get(i).isPaid()) {
							Calendar date = list.get(i).getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
					 row.createCell(8).setCellValue(paymentInfo);
					 
				}
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("PersonalInvoices.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("PersonalInvoices.xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("PersonalInvoices.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader(columns));
			) {
				for (int i = 0; i < list.size(); i++) {
					
					 Calendar invoiceDate = list.get(i).getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 
					 Calendar dueDate = list.get(i).getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 
					 String paymentInfo;
					 if (list.get(i).isPaid()) {
							Calendar date = list.get(i).getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
										
						csvPrinter.printRecord(
								list.get(i).getInvoiceID(),
								list.get(i).getPatientId(),
								invoiceDate_,
								dueDate_,
								list.get(i).getPrice(),
								list.get(i).getCreditorId(),
								userMgmt.getUserType(list.get(i).getCreditorId()),
								list.get(i).getTopic(),
								paymentInfo
						);
					 						
				}
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("PersonalInvoices.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * export invoice(s) by creditorId
	 * @param creditoId
	 */
	public void exportInvoiceByCreditorId(int creditorId, String format) {
		String[] columns = {"Invoice ID", "Patient ID", "Invoice Date", "Due Date", "Price", "Creditor ID" , "Creditor Type", "Topic", "Payment"};
		List<Invoice> list = invoiceMgmt.getInvoiceByCreditorId(creditorId);
		
		if(format.equals("XLSX")){
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("CreditorInvoice");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
		       
		        for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(list.get(i).getInvoiceID());
					 row.createCell(1).setCellValue(list.get(i).getPatientId());
					 
					 Calendar invoiceDate = list.get(i).getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(2).setCellValue(invoiceDate_);
					 
					 Calendar dueDate = list.get(i).getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 row.createCell(3).setCellValue(dueDate_);
					 
					 row.createCell(4).setCellValue(list.get(i).getPrice());
					 row.createCell(5).setCellValue(list.get(i).getCreditorId());				 
					 row.createCell(6).setCellValue(userMgmt.getUserType(list.get(i).getCreditorId()));			 
					 row.createCell(7).setCellValue(list.get(i).getTopic());
					 
					 String paymentInfo;
					 if (list.get(i).isPaid()) {
							Calendar date = list.get(i).getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
					 row.createCell(8).setCellValue(paymentInfo);
		        }			
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("CreditorInvoice.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("CreditorInvoice.xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("CreditorInvoice.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader(columns));
			) {
				for (int i = 0; i < list.size(); i++) {
					
					 Calendar invoiceDate = list.get(i).getInvoiceDate();
					 String invoiceDate_ = invoiceDate.get(Calendar.YEAR) + "-" + invoiceDate.get(Calendar.MONTH) + "-" + invoiceDate.get(Calendar.DAY_OF_MONTH);
					 
					 Calendar dueDate = list.get(i).getDueDate();
					 String dueDate_ = dueDate.get(Calendar.YEAR) + "-" + dueDate.get(Calendar.MONTH) + "-" + dueDate.get(Calendar.DAY_OF_MONTH);
					 
					 String paymentInfo;
					 if (list.get(i).isPaid()) {
							Calendar date = list.get(i).getPaidDate();
							paymentInfo = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						}
						else
							paymentInfo = "Not paid yet";
										
						csvPrinter.printRecord(
								list.get(i).getInvoiceID(),
								list.get(i).getPatientId(),
								invoiceDate_,
								dueDate_,
								list.get(i).getPrice(),
								list.get(i).getCreditorId(),
								userMgmt.getUserType(list.get(i).getCreditorId()),
								list.get(i).getTopic(),
								paymentInfo
						);
					 						
				}
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("CreditorInvoice.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * export medical records by doctorId
	 * @param doctorId
	 */
	public void exportMedicalRecordByDoctorId(int doctorId, String format) {
		List<MedicalRecord> list = medicalRecordMgmt.getMedicalRecordByDoctorId(doctorId);
		if(format.equals("XLSX")){
			String[] columns = {"Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"};
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("MedicalRecords");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
				
				for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(list.get(i).getPatientId());
					 row.createCell(1).setCellValue(list.get(i).getDoctorId());
					 row.createCell(2).setCellValue(list.get(i).getPrice());
					 row.createCell(3).setCellValue(list.get(i).getMedicalCondition().getName());
					 row.createCell(4).setCellValue(list.get(i).getDescription());
					 
					 Calendar date = list.get(i).getDate();
					 String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
						
						
					 row.createCell(5).setCellValue(date_);
					 row.createCell(6).setCellValue(list.get(i).getRecordId());
					 
					 
					final int index = i;
					List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(index).getRecordId()).collect(Collectors.toList());
					if (presList != null && presList.size() > 0)
						if (presList.get(0).isOrdered())
							row.createCell(7).setCellValue("Ordered");
						else
							row.createCell(7).setCellValue("Not Ordered");
					else
						row.createCell(7).setCellValue("No Prescription");
				}
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("MedicalRecordsDoc" + doctorId + ".xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("MedicalRecordsDoc" + doctorId + ".xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("AllMedicalRecords.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader("Patient ID", "Doctor ID", "Price", "Medical Condition", "Description", "Date", "Record ID", "Prescription"));
			) {
				for (int i = 0; i < list.size(); i++) {
					 
					Calendar date = list.get(i).getDate();
					String date_ = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
					
					String val;
					final int index = i;
					List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(index).getRecordId()).collect(Collectors.toList());
					if (presList != null && presList.size() > 0)
						if (presList.get(0).isOrdered())
							val = "Ordered";
						else
							val = "Not Ordered";
					else
						val = "No Prescription";
					
					
						csvPrinter.printRecord(
								list.get(i).getPatientId(),
								list.get(i).getDoctorId(),
								list.get(i).getPrice(),
								list.get(i).getMedicalCondition().getName(),
								list.get(i).getDescription(),
								date_,
								list.get(i).getRecordId(),
								val
						);
					 						
				}
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("AllMedicalRecords.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * export anonymized data query by year of birth
	 * @param birthyear
	 */
	public void exportAnonymizedDataQueryByYearOfBirth(int birthyear, String format) {
		List<AnonymizedDataQuery> list = medicalRecordMgmt.getAnonymizedMedicalDataByYearOfBirth(birthyear);
		String[] columns = {"Gender", "Year of Birth", "Medical Condition", "Height", "Weight", "City"};
		if(format.equals("XLSX")){
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("AnonymizedData");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));		        
		        
				for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(list.get(i).getGender().getName());
					 row.createCell(1).setCellValue(list.get(i).getBirthYear());
					 row.createCell(2).setCellValue(list.get(i).getMedicalCondition().getName());
					 row.createCell(3).setCellValue(list.get(i).getHeight());
					 row.createCell(4).setCellValue(list.get(i).getWeight());
					 row.createCell(5).setCellValue(list.get(i).getCity());			 
				}
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("AnonymizedDataCollectionByYearOfBirth.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("AnonymizedDataCollectionByYearOfBirth.xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("AnonymizedDataCollectionByYearOfBirth.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader(columns));
			) {
										
				 for (int i = 0; i < list.size(); i++) {
						csvPrinter.printRecord(
								list.get(i).getGender().getName(),
								list.get(i).getBirthYear(),
								list.get(i).getMedicalCondition().getName(),
								list.get(i).getHeight(),
								list.get(i).getWeight(),
								list.get(i).getCity()
						);
				 }	 
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("AnonymizedDataCollectionByYearOfBirth.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * export anonymized data query by gender
	 * @param gender
	 */
	public void exportAnonymizedDataQueryByGender(Gender gender, String format) {
		String[] columns = {"Gender", "Year of Birth", "Medical Condition", "Height", "Weight", "City"};
        List<AnonymizedDataQuery> list = medicalRecordMgmt.getAnonymizedMedicalDataByGender(gender);
        
		if(format.equals("XLSX")){			
			
			try {
				Workbook workbook = new XSSFWorkbook();
				
				/* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
				
		        CreationHelper createHelper = workbook.getCreationHelper();
		        
		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("AnonymizedData");
	
		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        headerFont.setBold(true);
		        headerFont.setFontHeightInPoints((short) 14);
		        headerFont.setColor(IndexedColors.BLUE.getIndex());
	
		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        headerCellStyle.setFont(headerFont);
	
		        // Create a Row
		        Row headerRow = sheet.createRow(0);
	
		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }
		        
		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
				
				for (int i = 0; i < list.size(); i++) {
					 Row row = sheet.createRow(i+1);
					 row.createCell(0).setCellValue(gender.getName());
					 row.createCell(1).setCellValue(list.get(i).getBirthYear());
					 row.createCell(2).setCellValue(list.get(i).getMedicalCondition().getName());
					 row.createCell(3).setCellValue(list.get(i).getHeight());
					 row.createCell(4).setCellValue(list.get(i).getWeight());
					 row.createCell(5).setCellValue(list.get(i).getCity());			 
				}
				
				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }
	
		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("AnonymizedDataCollectionByGender.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();
	
		        // Closing the workbook
		        workbook.close();
		        
		        java.awt.Desktop.getDesktop().open(new File("AnonymizedDataCollectionByGender.xlsx"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (format.equals("CSV")){
			try (
					BufferedWriter writer = Files.newBufferedWriter(Paths.get("AnonymizedDataCollectionByGender.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
				                    .withHeader(columns));
			) {
										
				 for (int i = 0; i < list.size(); i++) {
						csvPrinter.printRecord(
								list.get(i).getGender().getName(),
								list.get(i).getBirthYear(),
								list.get(i).getMedicalCondition().getName(),
								list.get(i).getHeight(),
								list.get(i).getWeight(),
								list.get(i).getCity()
						);
				 }	 
				csvPrinter.flush();
			 	writer.close();
			 	java.awt.Desktop.getDesktop().open(new File("AnonymizedDataCollectionByGender.csv"));
				
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
		}
	}	
}

