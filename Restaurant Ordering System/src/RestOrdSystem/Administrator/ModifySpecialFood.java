package RestOrdSystem.Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifySpecialFood extends JFrame {

	private JPanel contentPane;
	private JTextField PricetextField = new JTextField();;
	
	JComboBox specialFoodcomboBox = new JComboBox();
	JLabel Picturelabel = new JLabel("");
	
	FoddModel specialmodel=new FoddModel();
	
	private Administrator admin;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ModifySpecialFood(Administrator ads) {
		
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch (ClassNotFoundException e) {}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
		catch (UnsupportedLookAndFeelException e) {}
		
		admin=ads;
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPictureName = new JLabel("Picture Name:");
		lblPictureName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPictureName.setBounds(38, 36, 109, 25);
		contentPane.add(lblPictureName);
		specialFoodcomboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				specialfoodnamechange();
			}
		});
		
	
		specialFoodcomboBox.setBounds(157, 31, 159, 37);
		contentPane.add(specialFoodcomboBox);
		
		JLabel lblFoodPicture = new JLabel("Food Picture:");
		lblFoodPicture.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodPicture.setBounds(35, 294, 98, 37);
		contentPane.add(lblFoodPicture);
		
		JLabel lblFoodName = new JLabel("Food Price:");
		lblFoodName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodName.setBounds(54, 124, 79, 30);
		contentPane.add(lblFoodName);
		
		
		PricetextField.setBounds(157, 122, 159, 37);
		contentPane.add(PricetextField);
		PricetextField.setColumns(10);
		
		
		Picturelabel.setBounds(160, 213, 260, 200);
		contentPane.add(Picturelabel);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		ExitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ExitButton.setBounds(89, 476, 103, 37);
		contentPane.add(ExitButton);
		
		JButton ConfirmButton = new JButton("Confirm");
		ConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConfirmAction();
			}
		});
		ConfirmButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ConfirmButton.setBounds(302, 476, 103, 37);
		contentPane.add(ConfirmButton);
		
	
		setNameToCombox();
	}
	
	
	public void setNameToCombox(){
		specialFoodcomboBox.addItem(" ");
		LinkedList<String> foodname=new FoodBusiness().returnSpecialFoodList();
		int index=0;
		for(index=0;index<foodname.size();index++){
			specialFoodcomboBox.addItem(foodname.get(index));
		}
	}
	
	public void specialfoodnamechange(){
		String path="/image1/";
		
		specialmodel.setFoodName(specialFoodcomboBox.getSelectedItem().toString());
		specialmodel=new FoodBusiness().returnPricePicture(specialmodel);
		PricetextField.setText(new Double(specialmodel.getFoodPrice()).toString());
		if(specialFoodcomboBox.getSelectedIndex() != 0){
		   Picturelabel.setIcon(new ImageIcon(getClass().getResource(path+specialmodel.getPicture())));
		}
	}
	
	public void ConfirmAction(){
		specialmodel.setFoodPrice(new Double(PricetextField.getText()).doubleValue());
		boolean flag=new FoodBusiness().updateSpecialFood(specialmodel);
		 if(flag){
      	   JOptionPane.showMessageDialog(null, "Update Successfully", "Successfully", JOptionPane.INFORMATION_MESSAGE);
      	   admin.initializeFood();
		 }else{
			 JOptionPane.showMessageDialog(null, "Error, Fail", "Error", JOptionPane.ERROR_MESSAGE);
		 }
		
		
	}
}
