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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField userNameJField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args){
		new LogIn();
	}
	/**
	 * Create the frame.
	 */
	public LogIn() {
		
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch (ClassNotFoundException e) {}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
		catch (UnsupportedLookAndFeelException e) {}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(460, 280);
		setLocationRelativeTo(null);
		setTitle("Restaurant Ordering System - Administrator");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(85, 68, 90, 30);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("  Password:");
		lblPassword.setBounds(85, 108, 90, 30);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblPassword);
		
		userNameJField = new JTextField();
		userNameJField.setBounds(175, 70, 190, 30);
		contentPane.add(userNameJField);
		userNameJField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 110, 190, 30);
		contentPane.add(passwordField);
		
		JButton CancelJButton = new JButton("Cancel");
		CancelJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userNameJField.setText("");
				passwordField.setText("");
			}
		});
		CancelJButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		CancelJButton.setBounds(175, 149, 90 ,27);
		contentPane.add(CancelJButton);		
		userNameJField.requestFocus();		
		JButton ConfirmJButton = new JButton("Confirm");
		ConfirmJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
					AdministratorModel admin=new AdministratorModel();
					admin.setUserID(userNameJField.getText());	
					admin.setPassword(new String(passwordField.getPassword()));
					
					boolean flag=new AdministratorBusiness().judgeLogIn(admin);
					
					if(flag){				
						new Administrator().launchFrame();
						dispose();
				
					}else{
						JOptionPane.showMessageDialog(null, "Username or Password Incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
					}
			
			}
		});
		ConfirmJButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ConfirmJButton.setBounds(274, 149, 90 ,27);
		contentPane.add(ConfirmJButton);
		
		setVisible(true);
		setResizable(false);
	}
}
