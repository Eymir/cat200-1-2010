package RestOrdSystem.Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyFood extends JFrame {

	private JPanel contentPane;
	private JTextField NametextField;
	private JTextField TypetextField;
	private JTextField PricetextField;
	private JTextField QOHtextField;
	private JTextField MINtextField;
	private JTextArea DesctextArea ;
	private JLabel Picturelabel ;
	private FoddModel food;
	private Administrator admin;
	String picturename;
	String path="/image1/";

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	public void initialize(FoddModel model){
		
		NametextField.setText(model.getFoodName());
		TypetextField.setText(model.getFoodType());
		PricetextField.setText(new Double(model.getFoodPrice()).toString());
		QOHtextField.setText(new Integer(model.getFoodQoh()).toString());
		MINtextField.setText(new Integer(model.getFoodMin()).toString());
		DesctextArea.setText(model.getDescription());
		
		
		Picturelabel.setIcon(new ImageIcon(getClass().getResource(path+model.getPicture())));
	}
	
	
	public ModifyFood(Administrator ads,FoddModel model) {
		this.setVisible(true);
		this.setResizable(false);
		this.food=model;
		admin=ads;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 770, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFoodName = new JLabel("Food Name:");
		lblFoodName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodName.setBounds(56, 29, 77, 21);
		contentPane.add(lblFoodName);
		
		JLabel lblFoodType = new JLabel("Food Type:");
		lblFoodType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodType.setBounds(56, 90, 77, 21);
		contentPane.add(lblFoodType);
		
		JLabel lblFoodPrice = new JLabel("Food Price:");
		lblFoodPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodPrice.setBounds(56, 149, 77, 21);
		contentPane.add(lblFoodPrice);
		
		JLabel lblFoodQoh = new JLabel("Food QOH:");
		lblFoodQoh.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodQoh.setBounds(56, 210, 77, 21);
		contentPane.add(lblFoodQoh);
		
		JLabel lblFoodMin = new JLabel("Food Min:");
		lblFoodMin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodMin.setBounds(56, 271, 77, 21);
		contentPane.add(lblFoodMin);
		
		JLabel lblFoodPicture = new JLabel("Food Picture");
		lblFoodPicture.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodPicture.setBounds(521, 29, 77, 21);
		contentPane.add(lblFoodPicture);
		
		JLabel lblFoodDescription = new JLabel("Food Description:");
		lblFoodDescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodDescription.setBounds(23, 340, 121, 21);
		contentPane.add(lblFoodDescription);
		
		NametextField = new JTextField();
		NametextField.setBounds(152, 25, 121, 31);
		contentPane.add(NametextField);
		NametextField.setColumns(10);
		
		TypetextField = new JTextField();
		TypetextField.setColumns(10);
		TypetextField.setBounds(152, 86, 121, 31);
		contentPane.add(TypetextField);
		
		PricetextField = new JTextField();
		PricetextField.setColumns(10);
		PricetextField.setBounds(152, 145, 121, 31);
		contentPane.add(PricetextField);
		
		QOHtextField = new JTextField();
		QOHtextField.setColumns(10);
		QOHtextField.setBounds(152, 206, 121, 31);
		contentPane.add(QOHtextField);
		
		MINtextField = new JTextField();
		MINtextField.setColumns(10);
		MINtextField.setBounds(152, 267, 121, 31);
		contentPane.add(MINtextField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(154, 340, 179, 107);
		contentPane.add(scrollPane);
		
		DesctextArea = new JTextArea();
		scrollPane.setViewportView(DesctextArea);
		
		Picturelabel = new JLabel("");
		Picturelabel.setBounds(430, 74, 260, 200);
		contentPane.add(Picturelabel);
		
		JButton Updatebutton = new JButton("Update");
		Updatebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updatePicture();
			}
		});
		Updatebutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		Updatebutton.setBounds(509, 342, 103, 39);
		contentPane.add(Updatebutton);
		
		JButton ModifyButton = new JButton("Modify");
		ModifyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModifyOtherInfo();
			}
		});
		ModifyButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ModifyButton.setBounds(226, 487, 103, 39);
		contentPane.add(ModifyButton);
		
		JButton Exitbutton = new JButton("Exit");
		Exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		Exitbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		Exitbutton.setBounds(23, 487, 103, 39);
		contentPane.add(Exitbutton);
		NametextField.setEditable(false);
		initialize(model);
	}
	
	
	public void updatePicture(){
		   
		BufferedImage pictureImage=null;
		   ExampleFileFilter ext=new ExampleFileFilter("jpg");
		    
	          JFileChooser  fc=new JFileChooser();
	          fc.addChoosableFileFilter(ext);
	          fc.setAcceptAllFileFilterUsed(false);
	           int returnVal = fc.showSaveDialog(this);

	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	                File file = fc.getSelectedFile();
	               
	                picturename=file.getName();
	                food.setPicture(picturename);

	                  try {
			          pictureImage = ImageIO.read(file);
		               } catch (IOException e) {
			        e.printStackTrace();
			        }

		               Picturelabel.setIcon(new ImageIcon(pictureImage));
		               boolean flag=new FoodBusiness().updatePicture(food);
		               if(flag){
		            	   JOptionPane.showMessageDialog(null, "Update Successfully", "Successfully", JOptionPane.INFORMATION_MESSAGE);
		            	   admin.initializeFood();
		            	   
		            	   
		               }else{
		            	   JOptionPane.showMessageDialog(null, "Error, Fail", "Error", JOptionPane.ERROR_MESSAGE);
		               }
	            }
	      
	}
	
	
	public void ModifyOtherInfo(){
		
		food.setFoodName(NametextField.getText());
		food.setFoodType(TypetextField.getText());
		food.setFoodPrice(new Double(PricetextField.getText()).doubleValue());
		food.setFoodQoh(new Integer(QOHtextField.getText()).intValue());
		food.setFoodMin(new Integer(MINtextField.getText()).intValue());
		food.setDescription(DesctextArea.getText());
		
		boolean flag=new FoodBusiness().updateOtherInfo(food);
		 if(flag){
      	   JOptionPane.showMessageDialog(null, "Update Successfully", "Successfully", JOptionPane.INFORMATION_MESSAGE);
      	   admin.initializeFood();
      	   
      	   
         }else{
      	   JOptionPane.showMessageDialog(null, "Error, Fail", "Error", JOptionPane.ERROR_MESSAGE);
         }
		
		
	}
}


