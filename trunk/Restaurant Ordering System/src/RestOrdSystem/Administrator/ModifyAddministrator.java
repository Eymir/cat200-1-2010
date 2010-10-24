package RestOrdSystem.Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyAddministrator extends JFrame {

	private JPanel contentPane;
	private JTextField UserIDtextField= new JTextField();
	private JPasswordField passwordField = new JPasswordField();
	private JPasswordField AgainpasswordField = new JPasswordField();
	


	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ModifyAddministrator(final Administrator ads, final AdministratorModel model) {
		setVisible(true);		
		UserIDtextField.setEditable(false);
		UserIDtextField.setText(model.getUserID());		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 468, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserId = new JLabel("User ID:");
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserId.setBounds(109, 32, 64, 26);
		contentPane.add(lblUserId);
		
		
		UserIDtextField.setBounds(195, 30, 130, 32);
		contentPane.add(UserIDtextField);
		UserIDtextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(96, 100, 77, 26);
		contentPane.add(lblPassword);
		
		
		passwordField.setBounds(195, 98, 130, 32);
		contentPane.add(passwordField);
		
		JLabel lblInputPasswordAgain = new JLabel("Input password again:");
		lblInputPasswordAgain.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInputPasswordAgain.setBounds(40, 163, 155, 26);
		contentPane.add(lblInputPasswordAgain);
		
		
		AgainpasswordField.setBounds(195, 161, 130, 32);
		contentPane.add(AgainpasswordField);
		
		JButton Cancelbutton = new JButton("Cancel");
		Cancelbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				passwordField.setText("");
				AgainpasswordField.setText("");
				
			}
		});
		Cancelbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		Cancelbutton.setBounds(84, 265, 89, 32);
		contentPane.add(Cancelbutton);
		
		JButton ConfirmButton = new JButton("Confirm");
		ConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password=new String(passwordField.getPassword());
				String again=new String(AgainpasswordField.getPassword());
				if(password.compareTo(again) != 0){
					JOptionPane.showMessageDialog(null, "user password is not same", "Error", JOptionPane.ERROR_MESSAGE);
				}else{
					model.setPassword(password);
					boolean flag=new AdministratorBusiness().updatePassword(model);
					if(flag){
						JOptionPane.showMessageDialog(null, "Update Successfully", "Successfully", JOptionPane.INFORMATION_MESSAGE);
						ads.initializeAdmin();
						dispose();
					}else{
						JOptionPane.showMessageDialog(null, "Error, Fail", "Error", JOptionPane.ERROR_MESSAGE);
						dispose();
					}
					
				}
			}
		});
		ConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ConfirmButton.setBounds(236, 266, 89, 31);
		contentPane.add(ConfirmButton);
	}

}
