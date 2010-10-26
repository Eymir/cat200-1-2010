package RestOrdSystem.Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AddFood extends JFrame {

	private JLabel Picturelabel = null;
	private JPanel contentPane;
	private JTextField NametextField;
	private JTextField TypetextField;
	private JTextField PricetextField;
	private JTextField QOHtextField;
	private JTextField MINtextField;
	private JTextArea DescriptiontextArea;
	private Administrator ads;
	private String picturename;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public AddFood(Administrator ads) {
		this.ads=ads;
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 717, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFoodName = new JLabel("Food Name:");
		lblFoodName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodName.setBounds(63, 24, 86, 20);
		contentPane.add(lblFoodName);
		
		NametextField = new JTextField();
		NametextField.setBounds(159, 21, 103, 29);
		contentPane.add(NametextField);
		NametextField.setColumns(10);
		
		JLabel lblFood = new JLabel("Food Type:");
		lblFood.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFood.setBounds(63, 72, 86, 20);
		contentPane.add(lblFood);
		
		JLabel lblFoodPrice = new JLabel("Food Price:");
		lblFoodPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodPrice.setBounds(63, 120, 86, 20);
		contentPane.add(lblFoodPrice);
		
		JLabel lblFoodQoh = new JLabel("Food QOH:");
		lblFoodQoh.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodQoh.setBounds(63, 165, 86, 20);
		contentPane.add(lblFoodQoh);
		
		JLabel lblMin = new JLabel("Food Min:");
		lblMin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMin.setBounds(63, 209, 86, 20);
		contentPane.add(lblMin);
		
		JLabel lblFoodDescription = new JLabel("Food Description:");
		lblFoodDescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodDescription.setBounds(26, 264, 123, 20);
		contentPane.add(lblFoodDescription);
		
		JLabel lblFoodPicture = new JLabel("Food Picture");
		lblFoodPicture.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFoodPicture.setBounds(477, 24, 86, 20);
		contentPane.add(lblFoodPicture);
		
		TypetextField = new JTextField();
		TypetextField.setColumns(10);
		TypetextField.setBounds(159, 69, 103, 29);
		contentPane.add(TypetextField);
		
		PricetextField = new JTextField();
		PricetextField.setColumns(10);
		PricetextField.setBounds(159, 117, 103, 29);
		contentPane.add(PricetextField);
		
		QOHtextField = new JTextField();
		QOHtextField.setColumns(10);
		QOHtextField.setBounds(159, 162, 103, 29);
		contentPane.add(QOHtextField);
		
		MINtextField = new JTextField();
		MINtextField.setColumns(10);
		MINtextField.setBounds(159, 210, 103, 29);
		contentPane.add(MINtextField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(159, 264, 173, 97);
		contentPane.add(scrollPane);
		
		DescriptiontextArea = new JTextArea();
		scrollPane.setViewportView(DescriptiontextArea);
		
		Picturelabel = new JLabel("");
		Picturelabel.setBounds(399, 72, 260, 200);
		contentPane.add(Picturelabel);
		
		JButton UploadButton = new JButton("Upload");
		UploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				uploadPicture();
			}
		});
		UploadButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		UploadButton.setBounds(474, 315, 103, 29);
		contentPane.add(UploadButton);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			      dispose();
			}
		});
		ExitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ExitButton.setBounds(63, 393, 89, 35);
		contentPane.add(ExitButton);
		
		JButton Addbutton = new JButton("Add");
		Addbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addAction();
			}
		});
		Addbutton.setFont(new Font("Tahoma", Font.BOLD, 12));
		Addbutton.setBounds(261, 392, 89, 35);
		contentPane.add(Addbutton);
	}
	
	public void uploadPicture(){
		
		BufferedImage pictureImage=null;		
		
	        ExampleFileFilter ext=new ExampleFileFilter("jpg");
	    
	          JFileChooser  fc=new JFileChooser();
	          fc.addChoosableFileFilter(ext);
	          fc.setAcceptAllFileFilterUsed(false);
	           int returnVal = fc.showSaveDialog(this);

	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	                File file = fc.getSelectedFile();
	                picturename=file.getName();
	               

	                  try {
			          pictureImage = ImageIO.read(file);
		               } catch (IOException e) {
			        e.printStackTrace();
			        }

		               Picturelabel.setIcon(new ImageIcon(pictureImage));
	            }
	}
	
	public void addAction(){
		
		FoddModel food=new FoddModel();
		
		food.setFoodName(NametextField.getText());
		food.setFoodType(TypetextField.getText());
		food.setFoodPrice(new Double(PricetextField.getText()).doubleValue());
		food.setFoodQoh(new Integer(QOHtextField.getText()).intValue());
		food.setFoodMin(new Integer(MINtextField.getText()).intValue());
		food.setDescription(DescriptiontextArea.getText());
		food.setPicture(picturename);
		
		boolean flag=new FoodBusiness().insertFood(food);
		if(flag){
			JOptionPane.showMessageDialog(null, "Insert Successfully", "Successfully", JOptionPane.INFORMATION_MESSAGE);
			ads.initializeFood();
			dispose();
		}else{
			JOptionPane.showMessageDialog(null, "Error, Fail", "Error", JOptionPane.ERROR_MESSAGE);
			dispose();
		}
		
	}
}
