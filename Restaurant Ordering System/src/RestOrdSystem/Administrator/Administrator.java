package RestOrdSystem.Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Administrator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public void launchFrame(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrator frame = new Administrator();
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
	public Administrator() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 772, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane AdministratorTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		AdministratorTabbedPane.setBounds(174, 80, 517, 273);
		contentPane.add(AdministratorTabbedPane);
		
		JScrollPane AdministratorscrollPane = new JScrollPane();
		AdministratorTabbedPane.addTab("Administrator", null, AdministratorscrollPane, null);
		
		JScrollPane FoodscrollPane = new JScrollPane();
		AdministratorTabbedPane.addTab("Food", null, FoodscrollPane, null);
		
		JScrollPane ReceiptscrollPane = new JScrollPane();
		AdministratorTabbedPane.addTab("Receipt", null, ReceiptscrollPane, null);
		
		JButton Deletebutton = new JButton("Delete");
		Deletebutton.setBounds(553, 420, 89, 23);
		Deletebutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(Deletebutton);
		
		JButton Modifybutton = new JButton("Modify");
		Modifybutton.setBounds(423, 420, 89, 23);
		Modifybutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(Modifybutton);
		
		JButton Addbutton = new JButton("Add");
		Addbutton.setBounds(281, 420, 89, 23);
		Addbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(Addbutton);
		
		JButton CheckTablebutton = new JButton("Table Status");
		CheckTablebutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		CheckTablebutton.setBounds(24, 99, 120, 51);
		contentPane.add(CheckTablebutton);
		
		JButton SpecialFoodbutton = new JButton("Special Food");
		SpecialFoodbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		SpecialFoodbutton.setBounds(25, 219, 119, 51);
		contentPane.add(SpecialFoodbutton);
		
		JLabel Totallabel = new JLabel("Total:");
		Totallabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		Totallabel.setBounds(535, 364, 55, 29);
		contentPane.add(Totallabel);
		
		JTextPane TotaltextPane = new JTextPane();
		TotaltextPane.setBounds(602, 364, 89, 29);
		contentPane.add(TotaltextPane);
		
		JLabel yearlabel = new JLabel("year(yyyy):");
		yearlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		yearlabel.setBounds(174, 27, 80, 29);
		contentPane.add(yearlabel);
		
		textField = new JTextField();
		textField.setBounds(246, 28, 86, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel monthlabel = new JLabel("Month(MM):");
		monthlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		monthlabel.setBounds(342, 34, 84, 14);
		contentPane.add(monthlabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(423, 28, 86, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Datelabel = new JLabel("Date(dd):");
		Datelabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		Datelabel.setBounds(519, 35, 71, 14);
		contentPane.add(Datelabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(585, 28, 86, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
