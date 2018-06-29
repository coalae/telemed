package presentationAndApplicationLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.Gender;
import telemed.User;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class AnonymizedDataOptions extends JFrame{


	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private JTextField textFieldYearOfBirth;

	/**
	 * Create the application.
	 */
	public AnonymizedDataOptions(User user) {
		this.user = user;
		setVisible(true);
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][grow][][][][grow]", "[][][][][][][][][][][][][][]"));
		
		// logout upon click of button "Logout"
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBackground(new Color(128, 0, 0));
		getContentPane().add(btnLogout, "cell 9 0");
		
		JLabel lblAnonymizedDataOptions = new JLabel("Anonymized Data Options");
		lblAnonymizedDataOptions.setForeground(Color.BLUE);
		lblAnonymizedDataOptions.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblAnonymizedDataOptions, "cell 5 1,alignx center");
		
		JLabel lblGetMedicalData = new JLabel("Get medical data by gender:");
		lblGetMedicalData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblGetMedicalData, "cell 5 4");
		
		// get medical data by gender
		JComboBox cbMedicalDataByGender = new JComboBox();
		cbMedicalDataByGender.setModel(new DefaultComboBoxModel<Gender>(Gender.values()));
		getContentPane().add(cbMedicalDataByGender, "cell 5 5,growx");
		
		
		JButton btnGetDataByGender = new JButton("Get medical data by gender");
		btnGetDataByGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGetDataByGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new GatherAnonymizedData(user, ((Gender)cbMedicalDataByGender.getSelectedItem()), -1);
			}
		});
		getContentPane().add(btnGetDataByGender, "cell 5 6,growx");
		
		// get medical data by year of birth
		JButton btnGetMedicalDataByYearOfBirth = new JButton("Get medical data by year of birth");
		btnGetMedicalDataByYearOfBirth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int yearOfBirth = Integer.parseInt(textFieldYearOfBirth.getText());
					setVisible(false);
					new GatherAnonymizedData(user, null, yearOfBirth);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,
	            		    "Only Integer allowed for year of Birth!",
	            		    "Anonymized Data Options Information",
	            		    JOptionPane.ERROR_MESSAGE); 
				}
			}
		});
		
		JLabel lblGetMedicalDataByYearOfBirth = new JLabel("Get medical data by year of birth");
		lblGetMedicalDataByYearOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblGetMedicalDataByYearOfBirth, "cell 5 8");
		
		textFieldYearOfBirth = new JTextField();
		textFieldYearOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldYearOfBirth, "cell 5 9,growx");
		textFieldYearOfBirth.setColumns(10);
		btnGetMedicalDataByYearOfBirth.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnGetMedicalDataByYearOfBirth, "cell 5 10");
		
	
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 9 13,growx");
	}

}
