package RestOrdSystem.Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddAdministrator extends JFrame {

	private JPanel contentPane;
	private JTextField UserIDtextField;
	private JPasswordField passwordField;
	private JPasswordField AgainpasswordField;
	
	JButton Cancelbutton = new JButton("Cancel");
	JButton Confirmbutton = new JButton("Confirm");

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AddAdministrator(final Administrator ads) {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 455, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserId.setBounds(35, 27, 85, 30);
		contentPane.add(lblUserId);
		
		UserIDtextField = new JTextField();
		UserIDtextField.setBounds(193, 28, 119, 30);
		contentPane.add(UserIDtextField);
		UserIDtextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(35, 91, 74, 23);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 88, 119, 30);
		contentPane.add(passwordField);
		
		JLabel lblPleaseInputAgain = new JLabel("Please input again:");
		lblPleaseInputAgain.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPleaseInputAgain.setBounds(35, 141, 130, 30);
		contentPane.add(lblPleaseInputAgain);
		
		AgainpasswordField = new JPasswordField();
		AgainpasswordField.setBounds(193, 142, 119, 30);
		contentPane.add(AgainpasswordField);
		
		
		Cancelbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserIDtextField.setText("");
				passwordField.setText("");
				AgainpasswordField.setText("");
				
			}
		});
		Cancelbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		Cancelbutton.setBounds(102, 235, 89, 37);
		contentPane.add(Cancelbutton);
		Confirmbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userID=UserIDtextField.getText();
				String password=new String(passwordField.getPassword());
				String again=new String(AgainpasswordField.getPassword());
				if(password.compareTo(again) != 0){
					JOptionPane.showMessageDialog(null, "user password is not same", "Error", JOptionPane.ERROR_MESSAGE);
				}else{
					AdministratorModel ad=new AdministratorModel();
					ad.setUserID(userID);
					ad.setPassword(password);
					boolean flag=new AdministratorBusiness().insterAdministrator(ad);
					if(flag){
						JOptionPane.showMessageDialog(null, "Insert Successfully", "Successfully", JOptionPane.INFORMATION_MESSAGE);
						ads.initializeAdmin();
						dispose();
					}else{
						JOptionPane.showMessageDialog(null, "Error, Fail", "Error", JOptionPane.ERROR_MESSAGE);
						dispose();
					}
				}
			}
		});
		
		
		Confirmbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		Confirmbutton.setBounds(246, 235, 89, 37);
		contentPane.add(Confirmbutton);
	}
}
