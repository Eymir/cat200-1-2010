package RestOrdSystem;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class OrderPopUp extends JFrame {
	
    public OrderPopUp() {
        init();
    }//default constructor end
    
    private JLayeredPane jLayeredPane1;
    private JLabel backLabel;
    protected JLabel foodNameLabel;
    protected JLabel foodPictLabel;
    private JLabel priceLabel;
    private JLabel rmLabel;
    protected JTextField priceTextField;
    private JLabel quantityJLabel;
    private JSpinner quantityJSpinner;
    private JLabel descriptionLabel;
    private JScrollPane descriptionScrollPane;
    protected JTextArea descriptionTextArea;
    private JButton okButton;
    private JButton cancelButton;
    
    private void init() {

    	//background
        jLayeredPane1 = new JLayeredPane();
        backLabel = new JLabel();
        
        //top left component
        foodNameLabel = new JLabel();
        foodPictLabel = new JLabel();
        
        //top right component
        priceLabel = new JLabel();
        rmLabel = new JLabel();
        priceTextField = new JTextField();
        quantityJLabel = new JLabel();
        quantityJSpinner = new JSpinner();
        
        //mid component
        descriptionLabel = new JLabel();
        descriptionScrollPane = new JScrollPane();
        descriptionTextArea = new JTextArea();
        
        //bottom component
        okButton = new JButton();
        cancelButton = new JButton();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Pop Up");
        setMinimumSize(new Dimension(500, 420));
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        priceTextField.setEditable(false);
        priceTextField.setFont(new Font("Tahoma", 0, 18)); 
        priceTextField.setHorizontalAlignment(JTextField.CENTER);
        priceTextField.setBounds(320, 60, 150, 50);
        jLayeredPane1.add(priceTextField, JLayeredPane.DEFAULT_LAYER);

        rmLabel.setFont(new Font("Tahoma", 1, 15));
        rmLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rmLabel.setText("RM");
        rmLabel.setBounds(260, 60, 60, 50);
        jLayeredPane1.add(rmLabel, JLayeredPane.DEFAULT_LAYER);

        priceLabel.setFont(new Font("Tahoma", 1, 15));
        priceLabel.setText("Price");
        priceLabel.setBounds(260, 30, 130, 30);
        jLayeredPane1.add(priceLabel, JLayeredPane.DEFAULT_LAYER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new Font("Comic Sans MS", 0, 14));
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setTabSize(1);
        descriptionTextArea.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        descriptionScrollPane.setViewportView(descriptionTextArea);

        descriptionScrollPane.setBounds(10, 250, 480, 70);
        jLayeredPane1.add(descriptionScrollPane, JLayeredPane.DEFAULT_LAYER);

        descriptionLabel.setFont(new Font("Tahoma", 1, 15));
        descriptionLabel.setText("Description");
        descriptionLabel.setBounds(10, 230, 100, -1);
        jLayeredPane1.add(descriptionLabel, JLayeredPane.DEFAULT_LAYER);

        foodPictLabel.setHorizontalAlignment(SwingConstants.CENTER);
        foodPictLabel.setText("<no data>");
        foodPictLabel.setBounds(10, 40, 240, 180);
        jLayeredPane1.add(foodPictLabel, JLayeredPane.DEFAULT_LAYER);

        foodNameLabel.setFont(new Font("Tahoma", 1, 15)); 
        foodNameLabel.setText("<no data>");
        foodNameLabel.setBounds(10, 10, 480, 30);
        jLayeredPane1.add(foodNameLabel, JLayeredPane.DEFAULT_LAYER);

        quantityJLabel.setFont(new Font("Tahoma", 1, 15));
        quantityJLabel.setText("Quantity");
        quantityJLabel.setBounds(260, 120, 210, 30);
        jLayeredPane1.add(quantityJLabel, JLayeredPane.DEFAULT_LAYER);

        quantityJSpinner.setFont(new Font("Tahoma", 0, 24));
        quantityJSpinner.setModel(new SpinnerNumberModel(1, 1, 99, 1));
        quantityJSpinner.setBounds(260, 160, 120, 60);
        jLayeredPane1.add(quantityJSpinner, JLayeredPane.DEFAULT_LAYER);

        okButton.setFont(new Font("Tahoma", 0, 14));
        okButton.setText("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(120, 340, 110, 40);
        jLayeredPane1.add(okButton, JLayeredPane.DEFAULT_LAYER);

        cancelButton.setFont(new Font("Tahoma", 0, 14)); 
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        cancelButton.setBounds(270, 340, 110, 40);
        jLayeredPane1.add(cancelButton, JLayeredPane.DEFAULT_LAYER);

        backLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backLabel.setIcon(new ImageIcon(getClass().getResource("/image1/BlueBackground_1_500x400.jpg"))); 
        backLabel.setBounds(0, 0, 500, 400);
        jLayeredPane1.add(backLabel, JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 500, 400);
        
    }//init end

    boolean sameName = false;
    double totalPriceDbl = 0;

    private void okButtonActionPerformed(ActionEvent evt) {

        //get selected food price from oracle-------------------------------------------
        try {
            CustomerMenu.rs = CustomerMenu.stmt.executeQuery("INSERT INTO KITCHENTABLE ("
                    + "KIT_ORD_NO, TABLE_NO, FOOD_NAME, FOOD_QN, FOOD_STATUS) VALUES ("
                    + "KIT_ORD_NO_SEQ.NEXTVAL, "
                    + CustomerMenu.tableNoJTextField.getText() + ", "
                    + "'" + foodNameLabel.getText() + "', "
                    + quantityJSpinner.getValue() + ", "
                    + "'Pending'"
                    + ")");

            CustomerMenu.rs = CustomerMenu.stmt.executeQuery("INSERT INTO ORDERTABLE ("
                    + "ORDER_NO, RECEIPT_NO, ORD_FOOD_NAME, ORD_FOOD_QN) VALUES ("
                    + "ORDER_NO_SEQ.NEXTVAL, "
                    + CustomerMenu.receiptNumber + ", "
                    + "'" + foodNameLabel.getText() + "', "
                    + quantityJSpinner.getValue()
                    + ")");
        }
        catch (SQLException e) {
            System.err.println("ordered food insertion failed : " + e.getMessage());
        }//try catch end----------------------------------------------------------------

        DecimalFormat df = new DecimalFormat("0.00");

        for (int a=0;a<CustomerMenu.orderFoodNameVec.size();a++) {
            if (CustomerMenu.orderFoodNameVec.elementAt(a)==foodNameLabel.getText()) {
                int tempNewQn = (Integer)CustomerMenu.orderFoodQnVec.get(a)+(Integer)quantityJSpinner.getValue();
                CustomerMenu.orderFoodQnVec.set(a,tempNewQn);
                CustomerMenu.orderFoodPriceVec.set(a,df.format(Double.valueOf(priceTextField.getText())*tempNewQn));
                sameName = true;
            }
        }//for end

        if (sameName == false) {
            CustomerMenu.orderFoodNameVec.addElement(foodNameLabel.getText());
            CustomerMenu.orderFoodQnVec.addElement(quantityJSpinner.getValue());
            CustomerMenu.orderFoodPriceVec.addElement(df.format(Double.valueOf(priceTextField.getText())*(Integer)quantityJSpinner.getValue()));
        }

        //set up a table with empty values inside---------------------------------------
        Vector tempTableColVec = new Vector();
        Vector tableHeaderVec = new Vector(3);
        for (int a=0;a<CustomerMenu.orderFoodNameVec.size();a++) {
            Vector tempTableRowVec = new Vector(3);
            for (int b=0;b<3;b++) {
                tempTableRowVec.addElement("");
            }//for end
            tempTableColVec.addElement(tempTableRowVec);
            tempTableRowVec.clear();
        }//for end

        tableHeaderVec.addElement("Food Name");
        tableHeaderVec.addElement("Quantity");
        tableHeaderVec.addElement("Price");

        CustomerMenu.orderJTable.setModel(new DefaultTableModel(
                tempTableColVec,tableHeaderVec) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        CustomerMenu.orderJTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        //----------------------------------------------------------------------------------

        for (int a=0;a<tempTableColVec.size();a++) {
            CustomerMenu.orderJTable.setValueAt(CustomerMenu.orderFoodNameVec.elementAt(a), a, 0);
            CustomerMenu.orderJTable.setValueAt(CustomerMenu.orderFoodQnVec.elementAt(a), a, 1);
            CustomerMenu.orderJTable.setValueAt(CustomerMenu.orderFoodPriceVec.elementAt(a), a, 2);

            totalPriceDbl += Double.valueOf((String)CustomerMenu.orderFoodPriceVec.get(a));
        }//for end

        CustomerMenu.totalPriceJTextField.setText(df.format(totalPriceDbl));

        dispose();
    }//okButtonActionPerformed end

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        dispose();
        
    }//cancelButtonActionPerformed end
    
    //main function for this class
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPopUp().setVisible(true);
            }
        });
    }//main end

}//class OrderPopUp end
