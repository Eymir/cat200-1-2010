package RestOrdSystem.Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.Font;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Administrator extends JFrame {

	private JPanel contentPane;
	private JTextField yeartextField = new JTextField();
	private JTextField monthtextField=new JTextField();
	private JTextField datetextField=new JTextField();
	private int JTableindex=0;
	private JTextField TotaltextField = new JTextField();;
	private JTable adminJTable;
	private DefaultTableModel admindefault;
	private JTable foodJTable;
	private DefaultTableModel fooddefault;
	private JTable receiptJTable;
	private DefaultTableModel receiptdefault;
	private Vector admincolumn=new Vector();
	private Vector foodcolumn=new Vector();
	private Vector receiptcolumn=new Vector();
	private Vector alladmin,allfood,allreceipt;
	private JTabbedPane AdministratorTabbedPane;
	private JScrollPane AdministratorscrollPane;
	private JScrollPane FoodscrollPane;
	private JScrollPane ReceiptscrollPane;
	
	private JLabel Totallabel = new JLabel("Total:");;
	private JLabel yearlabel =new JLabel("year(yyyy):");;
	private JLabel monthlabel = new JLabel("Month(MM):");;
	private JLabel Datelabel = new JLabel("Date(dd):"); 
	private final JButton searchbutton = new JButton("Search");
	private JButton Addbutton = new JButton("Add");
	private JButton Modifybutton = new JButton("Modify");
	private JButton Deletebutton = new JButton("Delete");
	Administrator frame;
	

	/**
	 * Launch the application.
	 */
	public void launchFrame(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Administrator();
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
		admincolumn.add("User ID");
		admincolumn.add("User Password");
		
		
		foodcolumn.add("Food Name");
		foodcolumn.add("Food Type");
		foodcolumn.add("Food Price");
		foodcolumn.add("Food QOH");
		foodcolumn.add("Food Min");
		foodcolumn.add("Food Picture");
		foodcolumn.add("Food Description");
		
		receiptcolumn.add("Receipt Number");
		receiptcolumn.add("Receipt Date");
		receiptcolumn.add("Price Number");
		receiptcolumn.add("Price");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 794, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AdministratorTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		AdministratorTabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				JTableindex=AdministratorTabbedPane.getSelectedIndex();	
				if(JTableindex==2){
					yearlabel.setVisible(true);
					monthlabel.setVisible(true);
					Datelabel.setVisible(true);
					Totallabel.setVisible(true);
					searchbutton.setVisible(true);
					
					
					yeartextField.setVisible(true);
					monthtextField.setVisible(true);
					datetextField.setVisible(true);
					TotaltextField.setVisible(true);
					TotaltextField.setEditable(false);
					
					Addbutton.setEnabled(false);
					Modifybutton.setEnabled(false);
					Deletebutton.setEnabled(false);
				}else{
					yearlabel.setVisible(false);
					monthlabel.setVisible(false);
					Datelabel.setVisible(false);
					Totallabel.setVisible(false);
					searchbutton.setVisible(false);
					
					
					yeartextField.setVisible(false);
					monthtextField.setVisible(false);
					datetextField.setVisible(false);
					TotaltextField.setVisible(false);
					
					Addbutton.setEnabled(true);
					Modifybutton.setEnabled(true);
					Deletebutton.setEnabled(true);
					
				}
			}
		});
		AdministratorTabbedPane.setBounds(174, 80, 517, 273);
		contentPane.add(AdministratorTabbedPane);
		
		AdministratorscrollPane = new JScrollPane();
		AdministratorTabbedPane.addTab("Administrator", null, AdministratorscrollPane, null);
		
		FoodscrollPane = new JScrollPane();
		AdministratorTabbedPane.addTab("Food", null, FoodscrollPane, null);
		
		ReceiptscrollPane = new JScrollPane();
		AdministratorTabbedPane.addTab("Receipt", null, ReceiptscrollPane, null);
		Deletebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deleteAdminAction();
			}
		});
		
		
		Deletebutton.setBounds(553, 420, 89, 23);
		Deletebutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(Deletebutton);
		Modifybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JTableindex==0){
					modifyAdminAction();
				}
			}
		});
		
		
		Modifybutton.setBounds(423, 420, 89, 23);
		Modifybutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(Modifybutton);
		Addbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JTableindex==0){
					addAdminAction();				
					
				}if(JTableindex==1){
					addFoodAction();
				}
			}
		});
		
		
		Addbutton.setBounds(281, 420, 89, 23);
		Addbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(Addbutton);
		
		JButton CheckTablebutton = new JButton("Table Status");
		CheckTablebutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		CheckTablebutton.setBounds(25, 129, 120, 51);
		contentPane.add(CheckTablebutton);
		
		JButton SpecialFoodbutton = new JButton("Special Food");
		SpecialFoodbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		SpecialFoodbutton.setBounds(25, 250, 119, 51);
		contentPane.add(SpecialFoodbutton);
		
		
		Totallabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		Totallabel.setBounds(535, 364, 55, 29);
		contentPane.add(Totallabel);
		
		
		yearlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		yearlabel.setBounds(133, 27, 80, 29);
		contentPane.add(yearlabel);
		
		
		yeartextField.setBounds(212, 28, 86, 29);
		contentPane.add(yeartextField);
		yeartextField.setColumns(10);
		
		
		monthlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		monthlabel.setBounds(308, 34, 84, 14);
		contentPane.add(monthlabel);
		
		
		monthtextField.setBounds(393, 28, 86, 29);
		contentPane.add(monthtextField);
		monthtextField.setColumns(10);
		
		
		Datelabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		Datelabel.setBounds(489, 34, 70, 14);
		contentPane.add(Datelabel);
		
		
		datetextField.setBounds(567, 28, 86, 29);
		contentPane.add(datetextField);
		datetextField.setColumns(10);
		
		
		TotaltextField.setBounds(585, 364, 106, 29);
		contentPane.add(TotaltextField);
		TotaltextField.setColumns(10);
		searchbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		searchbutton.setBounds(667, 27, 89, 33);
		
		contentPane.add(searchbutton);
		
		
		
		initializeAdmin();
		initializeFood();
		initializeReceipt();
		this.setResizable(false);
	}
	
	
	public void initializeAdmin(){				
			
			alladmin=new AdministratorBusiness().returnAlladmin();
			admindefault=new DefaultTableModel(alladmin,admincolumn);
			adminJTable=new JTable(admindefault);
			
			adminJTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			adminJTable.setRowSelectionAllowed(true);
			if(!alladmin.isEmpty()){
				adminJTable.setRowSelectionInterval(0,0);
			}
			AdministratorscrollPane.setViewportView(adminJTable);		
	}
	
	
	public void initializeFood(){
		allfood=new FoodBusiness().returnallFood();
		fooddefault=new DefaultTableModel(allfood,foodcolumn);
		foodJTable=new JTable(fooddefault);
		
		
		if(!allfood.isEmpty()){
			foodJTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			foodJTable.setRowSelectionAllowed(true);
		    foodJTable.setRowSelectionInterval(0,0);
		}
		FoodscrollPane.setViewportView(foodJTable);
		
	}
	
	
	public void initializeReceipt(){
		allreceipt=new ReceiptBusiness().returnallReceipt();
		receiptdefault=new DefaultTableModel(allreceipt,receiptcolumn);
		receiptJTable=new JTable(receiptdefault);
		
		receiptJTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		receiptJTable.setRowSelectionAllowed(true);
		if(!allreceipt.isEmpty()){
		   receiptJTable.setRowSelectionInterval(0,0);
		}
		ReceiptscrollPane.setViewportView(receiptJTable);
		
	}
	
	public void addAdminAction(){
		new AddAdministrator(this);
	}
	
	public void modifyAdminAction(){
		int index=adminJTable.getSelectedRow();
		Vector admin=(Vector) alladmin.get(index);
		
		AdministratorModel ad=new AdministratorModel();
		ad.setUserID(admin.get(0).toString());
		ad.setPassword(admin.get(1).toString());
		new ModifyAddministrator(this,ad);
	}
	
	public void deleteAdminAction(){
		int index=adminJTable.getSelectedRow();
		Vector admin=(Vector) alladmin.get(index);
		
		AdministratorModel ad=new AdministratorModel();
		ad.setUserID(admin.get(0).toString());
		boolean flag=new AdministratorBusiness().deleteAdmin(ad);
		if(flag){
			JOptionPane.showMessageDialog(null, "delete Successfully", "Successfully", JOptionPane.INFORMATION_MESSAGE);
			initializeAdmin();
			
		}else{
			JOptionPane.showMessageDialog(null, "Error, Fail", "Error", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
	
	
	public void addFoodAction(){
		new AddFood(this);
	}
}