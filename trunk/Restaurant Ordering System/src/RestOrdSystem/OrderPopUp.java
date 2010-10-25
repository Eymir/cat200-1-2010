package RestOrdSystem;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class OrderPopUp extends JFrame {
	
	int tbNo;
	
    public OrderPopUp(int tbno) {
    	tbNo = tbno;
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
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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

        //insert ordered food detail into oracle-------------------------------------------
        try {
        	SystemMain.rs = SystemMain.stmt.executeQuery("INSERT INTO KITCHENTABLE ("
                    + "KIT_ORD_NO, TABLE_NO, FOOD_NAME, FOOD_QN, FOOD_STATUS) VALUES ("
                    + "KIT_ORD_NO_SEQ.NEXTVAL, "
                    + Integer.toString(tbNo) + ", "
                    + "'" + foodNameLabel.getText() + "', "
                    + quantityJSpinner.getValue() + ", "
                    + "'Pending'"
                    + ")");

        	SystemMain.rs = SystemMain.stmt.executeQuery("INSERT INTO ORDERTABLE ("
                    + "ORDER_NO, RECEIPT_NO, ORD_FOOD_NAME, ORD_FOOD_QN) VALUES ("
                    + "ORDER_NO_SEQ.NEXTVAL, "
                    + "(SELECT MAX(RECEIPT_NO) FROM RECEIPTTABLE WHERE TABLE_NO = "+Integer.toString(tbNo)+"), "
                    + "'" + foodNameLabel.getText() + "', "
                    + quantityJSpinner.getValue()
                    + ")");
        }
        catch (SQLException e) {
            System.err.println("ordered food insertion failed : " + e.getMessage());
        }//try catch end----------------------------------------------------------------

        if (tbNo==1) assignIntoVector(Table.orderFoodNameVec1, Table.orderFoodQnVec1, Table.orderFoodPriceVec1, CustomerMenu.orderJTable1, CustomerMenu.totalPriceJTextField1);
        else if (tbNo==2) assignIntoVector(Table.orderFoodNameVec2, Table.orderFoodQnVec2, Table.orderFoodPriceVec2, CustomerMenu.orderJTable2, CustomerMenu.totalPriceJTextField2);
        else if (tbNo==3) assignIntoVector(Table.orderFoodNameVec3, Table.orderFoodQnVec3, Table.orderFoodPriceVec3, CustomerMenu.orderJTable3, CustomerMenu.totalPriceJTextField3);
        else if (tbNo==4) assignIntoVector(Table.orderFoodNameVec4, Table.orderFoodQnVec4, Table.orderFoodPriceVec4, CustomerMenu.orderJTable4, CustomerMenu.totalPriceJTextField4);
        else if (tbNo==5) assignIntoVector(Table.orderFoodNameVec5, Table.orderFoodQnVec5, Table.orderFoodPriceVec5, CustomerMenu.orderJTable5, CustomerMenu.totalPriceJTextField5);
        else if (tbNo==6) assignIntoVector(Table.orderFoodNameVec6, Table.orderFoodQnVec6, Table.orderFoodPriceVec6, CustomerMenu.orderJTable6, CustomerMenu.totalPriceJTextField6);
        else if (tbNo==7) assignIntoVector(Table.orderFoodNameVec7, Table.orderFoodQnVec7, Table.orderFoodPriceVec7, CustomerMenu.orderJTable7, CustomerMenu.totalPriceJTextField7);
        else if (tbNo==8) assignIntoVector(Table.orderFoodNameVec8, Table.orderFoodQnVec8, Table.orderFoodPriceVec8, CustomerMenu.orderJTable8, CustomerMenu.totalPriceJTextField8);
        else if (tbNo==9) assignIntoVector(Table.orderFoodNameVec9, Table.orderFoodQnVec9, Table.orderFoodPriceVec9, CustomerMenu.orderJTable9, CustomerMenu.totalPriceJTextField9);
        else if (tbNo==10) assignIntoVector(Table.orderFoodNameVec10, Table.orderFoodQnVec10, Table.orderFoodPriceVec10, CustomerMenu.orderJTable10, CustomerMenu.totalPriceJTextField10);
        else if (tbNo==11) assignIntoVector(Table.orderFoodNameVec11, Table.orderFoodQnVec11, Table.orderFoodPriceVec11, CustomerMenu.orderJTable11, CustomerMenu.totalPriceJTextField11);
        else if (tbNo==12) assignIntoVector(Table.orderFoodNameVec12, Table.orderFoodQnVec12, Table.orderFoodPriceVec12, CustomerMenu.orderJTable12, CustomerMenu.totalPriceJTextField12);
        else if (tbNo==13) assignIntoVector(Table.orderFoodNameVec13, Table.orderFoodQnVec13, Table.orderFoodPriceVec13, CustomerMenu.orderJTable13, CustomerMenu.totalPriceJTextField13);
        else if (tbNo==14) assignIntoVector(Table.orderFoodNameVec14, Table.orderFoodQnVec14, Table.orderFoodPriceVec14, CustomerMenu.orderJTable14, CustomerMenu.totalPriceJTextField14);
        else if (tbNo==15) assignIntoVector(Table.orderFoodNameVec15, Table.orderFoodQnVec15, Table.orderFoodPriceVec15, CustomerMenu.orderJTable15, CustomerMenu.totalPriceJTextField15);
        else if (tbNo==16) assignIntoVector(Table.orderFoodNameVec16, Table.orderFoodQnVec16, Table.orderFoodPriceVec16, CustomerMenu.orderJTable16, CustomerMenu.totalPriceJTextField16);
        else if (tbNo==17) assignIntoVector(Table.orderFoodNameVec17, Table.orderFoodQnVec17, Table.orderFoodPriceVec17, CustomerMenu.orderJTable17, CustomerMenu.totalPriceJTextField17);
        else if (tbNo==18) assignIntoVector(Table.orderFoodNameVec18, Table.orderFoodQnVec18, Table.orderFoodPriceVec18, CustomerMenu.orderJTable18, CustomerMenu.totalPriceJTextField18);
        else if (tbNo==19) assignIntoVector(Table.orderFoodNameVec19, Table.orderFoodQnVec19, Table.orderFoodPriceVec19, CustomerMenu.orderJTable19, CustomerMenu.totalPriceJTextField19);
        else if (tbNo==20) assignIntoVector(Table.orderFoodNameVec20, Table.orderFoodQnVec20, Table.orderFoodPriceVec20, CustomerMenu.orderJTable20, CustomerMenu.totalPriceJTextField20);
        
        CashierModule.refresh();
        dispose();
    }//okButtonActionPerformed end

    DecimalFormat df = new DecimalFormat("0.00");
    
    void assignIntoVector(Vector<String> ordFNameVec, Vector<Integer> ordFQnVec, Vector<Double> ordFPriceVec, JTable jTab, JTextField jTxt) {
    	
    	for (int a=0;a<ordFNameVec.size();a++) {
            if (ordFNameVec.elementAt(a)==foodNameLabel.getText()) {
                int tempNewQn = ordFQnVec.get(a)+(Integer)quantityJSpinner.getValue();
                ordFQnVec.set(a,tempNewQn);
                ordFPriceVec.set(a,Double.valueOf(priceTextField.getText())*tempNewQn);
                sameName = true;
            }
        }//for end

        if (sameName == false) {
        	ordFNameVec.addElement(foodNameLabel.getText());
        	ordFQnVec.addElement((Integer)quantityJSpinner.getValue());
        	ordFPriceVec.addElement(Double.valueOf(priceTextField.getText())*(Integer)quantityJSpinner.getValue());
        }

        int size = ordFNameVec.size();
        
        resetTable(size, jTab);

        for (int a=0;a<ordFNameVec.size();a++) {
        	jTab.setValueAt(ordFNameVec.elementAt(a), a, 0);
        	jTab.setValueAt(ordFQnVec.elementAt(a), a, 1);
        	jTab.setValueAt(df.format(ordFPriceVec.elementAt(a)), a, 2);

            totalPriceDbl += Double.valueOf(ordFPriceVec.get(a));
        }//for end
        
        jTxt.setText(df.format(totalPriceDbl));
        
    }//end assignIntoVector
    
    void resetTable(int size, JTable jTab1) {
    	
    	//set up a table with empty values inside---------------------------------------
        Vector tempTableColVec = new Vector();
        Vector tableHeaderVec = new Vector(3);
        for (int a=0;a<size;a++) {
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

        jTab1.setModel(new DefaultTableModel(
                tempTableColVec,tableHeaderVec) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        jTab1.getColumnModel().getColumn(0).setPreferredWidth(200);
        //----------------------------------------------------------------------------------
    	
    }
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        dispose();
        
    }//cancelButtonActionPerformed end
    
    //main function for this class
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OrderPopUp().setVisible(true);
//            }
//        });
//    }//main end

}//class OrderPopUp end
