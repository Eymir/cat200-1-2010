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

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField userNameJField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
					frame.setResizable(false);
		
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 457, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(32, 24, 88, 30);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(32, 89, 72, 24);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblPassword);
		
		userNameJField = new JTextField();
		userNameJField.setBounds(140, 23, 144, 35);
		contentPane.add(userNameJField);
		userNameJField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 89, 144, 35);
		contentPane.add(passwordField);
		
		JButton CancelJButton = new JButton("Cancel");
		CancelJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userNameJField.setText("");
				passwordField.setText("");
			}
		});
		CancelJButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		CancelJButton.setBounds(66, 189, 103, 35);
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
						JOptionPane.showMessageDialog(null, "username or password has problem", "Error", JOptionPane.ERROR_MESSAGE);
					}
			
			}
		});
		ConfirmJButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ConfirmJButton.setBounds(224, 189, 96, 35);
		contentPane.add(ConfirmJButton);
	}
}