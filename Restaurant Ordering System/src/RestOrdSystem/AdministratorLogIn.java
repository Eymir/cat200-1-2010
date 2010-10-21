package RestOrdSystem;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;


public class AdministratorLogIn extends JFrame {

	private JPanel contentPane;
	private JTextField usernametextField;
	private JTextField passwordtextField;
	private JButton confirm;
	private JButton cancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorLogIn frame = new AdministratorLogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdministratorLogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton username = new JButton("username");
		username.setBounds(25, 40, 112, 35);
		contentPane.add(username);
		
		usernametextField = new JTextField();
		usernametextField.setBounds(198, 43, 120, 28);
		contentPane.add(usernametextField);
		usernametextField.setColumns(10);
		
		JButton password = new JButton("password");
		password.setBounds(25, 112, 112, 35);
		contentPane.add(password);
		
		passwordtextField = new JTextField();
		passwordtextField.setBounds(198, 119, 120, 28);
		contentPane.add(passwordtextField);
		passwordtextField.setColumns(10);
		
		confirm = new JButton("confirm");
		confirm.setBounds(85, 199, 112, 35);
		contentPane.add(confirm);
		
		cancel = new JButton("cancel");
		cancel.setBounds(235, 199, 112, 35);
		contentPane.add(cancel);
	}
}
