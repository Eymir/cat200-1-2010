package RestOrdSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerMenu extends JFrame {
	
    Vector<String> foodNameVec = new Vector<String>();
    Vector<String> foodTypeVec = new Vector<String>();

    Vector<String> typeFoodVec = new Vector<String>();
    Vector<String> typeDrinkVec = new Vector<String>();
    Vector<String> typeSideVec = new Vector<String>();

    String selectedFoodName = "";
    double foodPriceDbl = 0.00;
    String foodPictURLStr = "";
    String foodDescptStr = "";
    String receiptNoStr = "";

    DecimalFormat df = new DecimalFormat("0.00");

    int tableNo;
    
    public CustomerMenu(int tbNo) {
    	
    	tableNo = tbNo;
    	
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch (ClassNotFoundException e) {}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
		catch (UnsupportedLookAndFeelException e) {}
		
		init();
		
		tableNoJTextField.setText(Integer.toString(tableNo));
		
		//getCon();
        getFoodData();
        setFoodData();
        
    }
    

    

    void getFoodData() {

        try {
        	SystemMain.rs = SystemMain.stmt.executeQuery("SELECT FOOD_NAME, FOOD_TYPE " +
            		"FROM FOODTABLE");
            
            while (SystemMain.rs.next()) {
            	foodNameVec.addElement(SystemMain.rs.getString(1));
                foodTypeVec.addElement(SystemMain.rs.getString(2));
            }//while end
        }
        catch (SQLException e) {
            System.err.println("database retrieval failed : " + e.getMessage());
        }//try catch end

    }//getFoodData end

    void setFoodData () {

        for (int a=0;a<foodNameVec.size();a++) {
            if (foodTypeVec.elementAt(a).equals("Food")) {
                typeFoodVec.addElement(foodNameVec.elementAt(a));
            }
            else if (foodTypeVec.elementAt(a).equals("Drink")) {
                typeDrinkVec.addElement(foodNameVec.elementAt(a));
            }
            else {
                typeSideVec.addElement(foodNameVec.elementAt(a));
            }
        }//for end

        foodJList.setListData(typeFoodVec);
        drinkJList.setListData(typeDrinkVec);
        sideJList.setListData(typeSideVec);

        foodJList.setSelectedIndex(0);
        drinkJList.setSelectedIndex(0);
        sideJList.setSelectedIndex(0);
    }//setFoodData end

    protected static JLayeredPane jLayeredPane1;
    private JLabel backgroundJLabel;
    private JLabel titleJLabel;
    private JLabel tableNoJLabel;
    private JTextField tableNoJTextField;
    private JTabbedPane jTabbedPane1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JList foodJList;
    private JList drinkJList;
    private JList sideJList;
    private JButton orderButton;
    private JLabel orderListJLabel;
    private JScrollPane jScrollPane4;
    private JPanel totalPriceJPanel;
    private JLabel totalPriceJLabel;
    protected static JButton payBillButton;
    
    protected static JTable orderJTable1;
    protected static JTable orderJTable2;
    protected static JTable orderJTable3;
    protected static JTable orderJTable4;
    protected static JTable orderJTable5;
    protected static JTable orderJTable6;
    protected static JTable orderJTable7;
    protected static JTable orderJTable8;
    protected static JTable orderJTable9;
    protected static JTable orderJTable10;
    protected static JTable orderJTable11;
    protected static JTable orderJTable12;
    protected static JTable orderJTable13;
    protected static JTable orderJTable14;
    protected static JTable orderJTable15;
    protected static JTable orderJTable16;
    protected static JTable orderJTable17;
    protected static JTable orderJTable18;
    protected static JTable orderJTable19;
    protected static JTable orderJTable20;
    
    protected static JTextField totalPriceJTextField1;
    protected static JTextField totalPriceJTextField2;
    protected static JTextField totalPriceJTextField3;
    protected static JTextField totalPriceJTextField4;
    protected static JTextField totalPriceJTextField5;
    protected static JTextField totalPriceJTextField6;
    protected static JTextField totalPriceJTextField7;
    protected static JTextField totalPriceJTextField8;
    protected static JTextField totalPriceJTextField9;
    protected static JTextField totalPriceJTextField10;
    protected static JTextField totalPriceJTextField11;
    protected static JTextField totalPriceJTextField12;
    protected static JTextField totalPriceJTextField13;
    protected static JTextField totalPriceJTextField14;
    protected static JTextField totalPriceJTextField15;
    protected static JTextField totalPriceJTextField16;
    protected static JTextField totalPriceJTextField17;
    protected static JTextField totalPriceJTextField18;
    protected static JTextField totalPriceJTextField19;
    protected static JTextField totalPriceJTextField20;
    
    private void init() {

    	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurant Ordering System - Customer Menu                  "+SystemMain.Day+", "+SystemMain.Date);
        setMinimumSize(new Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        
                
    	//background
        jLayeredPane1 = new JLayeredPane();
        backgroundJLabel = new JLabel();
        
        //north component
        titleJLabel = new JLabel();
        tableNoJLabel = new JLabel();
        tableNoJTextField = new JTextField();
        
        //left component
        jTabbedPane1 = new JTabbedPane();
        jScrollPane1 = new JScrollPane();
        jScrollPane2 = new JScrollPane();
        jScrollPane3 = new JScrollPane();
        foodJList = new JList();
        drinkJList = new JList();
        sideJList = new JList();
        
        //right component
        orderListJLabel = new JLabel();
        jScrollPane4 = new JScrollPane();
        if (tableNo==1) { orderJTable1 = new JTable(); totalPriceJTextField1 = new JTextField(); }
        else if (tableNo==2) { orderJTable2 = new JTable(); totalPriceJTextField2 = new JTextField(); }
        else if (tableNo==3) { orderJTable3 = new JTable(); totalPriceJTextField3 = new JTextField(); }
        else if (tableNo==4) { orderJTable4 = new JTable(); totalPriceJTextField4 = new JTextField(); }
        else if (tableNo==5) { orderJTable5 = new JTable(); totalPriceJTextField5 = new JTextField(); }
        else if (tableNo==6) { orderJTable6 = new JTable(); totalPriceJTextField6 = new JTextField(); }
        else if (tableNo==7) { orderJTable7 = new JTable(); totalPriceJTextField7 = new JTextField(); }
        else if (tableNo==8) { orderJTable8 = new JTable(); totalPriceJTextField8 = new JTextField(); }
        else if (tableNo==9) { orderJTable9 = new JTable(); totalPriceJTextField9 = new JTextField(); }
        else if (tableNo==10) { orderJTable10 = new JTable(); totalPriceJTextField10 = new JTextField(); }
        else if (tableNo==11) { orderJTable11 = new JTable(); totalPriceJTextField11 = new JTextField(); }
        else if (tableNo==12) { orderJTable12 = new JTable(); totalPriceJTextField12 = new JTextField(); }
        else if (tableNo==13) { orderJTable13 = new JTable(); totalPriceJTextField13 = new JTextField(); }
        else if (tableNo==14) { orderJTable14 = new JTable(); totalPriceJTextField14 = new JTextField(); }
        else if (tableNo==15) { orderJTable15 = new JTable(); totalPriceJTextField15 = new JTextField(); }
        else if (tableNo==16) { orderJTable16 = new JTable(); totalPriceJTextField16 = new JTextField(); }
        else if (tableNo==17) { orderJTable17 = new JTable(); totalPriceJTextField17 = new JTextField(); }
        else if (tableNo==18) { orderJTable18 = new JTable(); totalPriceJTextField18 = new JTextField(); }
        else if (tableNo==19) { orderJTable19 = new JTable(); totalPriceJTextField19 = new JTextField(); }
        else if (tableNo==20) { orderJTable20 = new JTable(); totalPriceJTextField20 = new JTextField(); }
        totalPriceJPanel = new JPanel();
        totalPriceJLabel = new JLabel();
        payBillButton = new JButton();
        
        //middle component
        orderButton = new JButton();
        
        jLayeredPane1.setMaximumSize(new Dimension(800, 480));

        jTabbedPane1.setFont(new Font("Tahoma", 0, 16));

        foodJList.setFont(new Font("Tahoma", 0, 18));
        foodJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(foodJList);

        jTabbedPane1.addTab("FOOD", jScrollPane1);

        drinkJList.setFont(new Font("Tahoma", 0, 18));
        drinkJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(drinkJList);

        jTabbedPane1.addTab("DRINK", jScrollPane2);

        sideJList.setFont(new Font("Tahoma", 0, 18));
        sideJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(sideJList);

        jTabbedPane1.addTab("SIDEORDER", jScrollPane3);

        jTabbedPane1.setBounds(40, 100, 260, 340);
        jLayeredPane1.add(jTabbedPane1, JLayeredPane.DEFAULT_LAYER);

        orderListJLabel.setFont(new Font("Tahoma", 1, 18));
        orderListJLabel.setText("Order List");
        orderListJLabel.setBounds(460, 80, 310, 30);
        jLayeredPane1.add(orderListJLabel, JLayeredPane.DEFAULT_LAYER);

        if (tableNo==1) initJTable(orderJTable1);
        else if (tableNo==2) initJTable(orderJTable2);
        else if (tableNo==3) initJTable(orderJTable3);
        else if (tableNo==4) initJTable(orderJTable4);
        else if (tableNo==5) initJTable(orderJTable5);
        else if (tableNo==6) initJTable(orderJTable6);
        else if (tableNo==7) initJTable(orderJTable7);
        else if (tableNo==8) initJTable(orderJTable8);
        else if (tableNo==9) initJTable(orderJTable9);
        else if (tableNo==10) initJTable(orderJTable10);
        else if (tableNo==11) initJTable(orderJTable11);
        else if (tableNo==12) initJTable(orderJTable12);
        else if (tableNo==13) initJTable(orderJTable13);
        else if (tableNo==14) initJTable(orderJTable14);
        else if (tableNo==15) initJTable(orderJTable15);
        else if (tableNo==16) initJTable(orderJTable16);
        else if (tableNo==17) initJTable(orderJTable17);
        else if (tableNo==18) initJTable(orderJTable18);
        else if (tableNo==19) initJTable(orderJTable19);
        else if (tableNo==20) initJTable(orderJTable20);

        jScrollPane4.setBounds(460, 110, 310, 260);
        jLayeredPane1.add(jScrollPane4, JLayeredPane.DEFAULT_LAYER);

        tableNoJLabel.setFont(new Font("Tahoma", 1, 24));
        tableNoJLabel.setText("Table No :");
        tableNoJLabel.setBounds(430, 10, 180, 50);
        jLayeredPane1.add(tableNoJLabel, JLayeredPane.DEFAULT_LAYER);

        tableNoJTextField.setEditable(false);
        tableNoJTextField.setFont(new Font("Tahoma", 0, 18));
        tableNoJTextField.setHorizontalAlignment(JTextField.CENTER);
        tableNoJTextField.setBounds(580, 10, 80, 50);
        jLayeredPane1.add(tableNoJTextField, JLayeredPane.DEFAULT_LAYER);

        orderButton.setFont(new Font("Tahoma", 0, 14));
        orderButton.setText("Order >>");
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });
        orderButton.setBounds(320, 180, 120, 60);
        jLayeredPane1.add(orderButton, JLayeredPane.DEFAULT_LAYER);

        payBillButton.setFont(new Font("Tahoma", 0, 18));
        payBillButton.setText("Pay Bill");
        payBillButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                payBillButtonActionPerformed(evt);
            }
        });
        payBillButton.setBounds(460, 410, 310, 50);
        jLayeredPane1.add(payBillButton, JLayeredPane.DEFAULT_LAYER);

        titleJLabel.setIcon(new ImageIcon(getClass().getResource("/image1/Customer_menu_text.png")));
        titleJLabel.setBounds(10, 10, 400, 60);
        jLayeredPane1.add(titleJLabel, JLayeredPane.DEFAULT_LAYER);

        totalPriceJPanel.setLayout(null);

        totalPriceJLabel.setFont(new Font("Tahoma", 0, 18));
        totalPriceJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalPriceJLabel.setText("Total Price : RM");
        totalPriceJPanel.add(totalPriceJLabel);
        totalPriceJLabel.setBounds(0, 0, 150, 40);
        
        if (tableNo==1) inittotalPriceTextField (totalPriceJTextField1);
        else if (tableNo==2) inittotalPriceTextField (totalPriceJTextField2);
        else if (tableNo==3) inittotalPriceTextField (totalPriceJTextField3);
        else if (tableNo==4) inittotalPriceTextField (totalPriceJTextField4);
        else if (tableNo==5) inittotalPriceTextField (totalPriceJTextField5);
        else if (tableNo==6) inittotalPriceTextField (totalPriceJTextField6);
        else if (tableNo==7) inittotalPriceTextField (totalPriceJTextField7);
        else if (tableNo==8) inittotalPriceTextField (totalPriceJTextField8);
        else if (tableNo==9) inittotalPriceTextField (totalPriceJTextField9);
        else if (tableNo==10) inittotalPriceTextField (totalPriceJTextField10);
        else if (tableNo==11) inittotalPriceTextField (totalPriceJTextField11);
        else if (tableNo==12) inittotalPriceTextField (totalPriceJTextField12);
        else if (tableNo==13) inittotalPriceTextField (totalPriceJTextField13);
        else if (tableNo==14) inittotalPriceTextField (totalPriceJTextField14);
        else if (tableNo==15) inittotalPriceTextField (totalPriceJTextField15);
        else if (tableNo==16) inittotalPriceTextField (totalPriceJTextField16);
        else if (tableNo==17) inittotalPriceTextField (totalPriceJTextField17);
        else if (tableNo==18) inittotalPriceTextField (totalPriceJTextField18);
        else if (tableNo==19) inittotalPriceTextField (totalPriceJTextField19);
        else if (tableNo==20) inittotalPriceTextField (totalPriceJTextField20);

        totalPriceJPanel.setBounds(460, 370, 310, 40);
        jLayeredPane1.add(totalPriceJPanel, JLayeredPane.DEFAULT_LAYER);

        backgroundJLabel.setIcon(new ImageIcon(getClass().getResource("/image1/menu_background2.jpg"))); 
        backgroundJLabel.setBounds(0, 0, 800, 480);
        jLayeredPane1.add(backgroundJLabel, JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 480);
        
    }//init end

    void initJTable(JTable jtb) {
    	jtb.setModel(new DefaultTableModel(
        		new Object [][] {}, new String [] {"Food Name", "Quantity", "Price"} ) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
            	return false;
            }
        });
    	jtb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	jtb.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jtb);
        jtb.getColumnModel().getColumn(0).setPreferredWidth(200);
    }
    
    void inittotalPriceTextField (JTextField priceTxt) {
    	priceTxt.setEditable(false);
    	priceTxt.setFont(new Font("Tahoma", 0, 18));
    	priceTxt.setHorizontalAlignment(JTextField.CENTER);
        totalPriceJPanel.add(priceTxt);
        priceTxt.setBounds(150, 0, 160, 40);
    }
    
    private void orderButtonActionPerformed(ActionEvent evt) {
    	
        OrderPopUp odp = new OrderPopUp(tableNo);
        odp.setVisible(true);
        odp.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        if (foodJList.isShowing())
            selectedFoodName = (String)foodJList.getSelectedValue();
        else if (drinkJList.isShowing())
            selectedFoodName = (String)drinkJList.getSelectedValue();
        else
            selectedFoodName = (String)sideJList.getSelectedValue();

        //get selected food detail from oracle----------------------------------------
        try {
        	SystemMain.rs = SystemMain.stmt.executeQuery("SELECT FOOD_PRICE, FOOD_PICT_URL, FOOD_DESCPT "
                    + "FROM FOODTABLE "
                    + "WHERE FOOD_NAME = '" + selectedFoodName + "'");
            
        	SystemMain.rs.first();
            if (SystemMain.rs.first()) {
                foodPriceDbl = SystemMain.rs.getDouble(1);
            	foodPictURLStr = SystemMain.rs.getString(2);
                foodDescptStr = SystemMain.rs.getString(3);
            }
        }
        catch (SQLException e) {
            System.err.println("food detail retrieval failed..." + e.getMessage());
        }//try catch end--------------------------------------------------------------

        odp.foodNameLabel.setText(selectedFoodName);
        odp.foodPictLabel.setIcon(new ImageIcon(getClass().getResource(foodPictURLStr)));
        odp.priceTextField.setText(df.format(foodPriceDbl));
        odp.descriptionTextArea.setText(foodDescptStr);
        
    }//orderButtonActionPerformed end
    
    private void payBillButtonActionPerformed(ActionEvent evt) {
        
        if (tableNo==1 && Table.orderFoodNameVec1.size()==0) return;
        else if (tableNo==2 && Table.orderFoodNameVec2.size()==0) return;
        else if (tableNo==3 && Table.orderFoodNameVec3.size()==0) return;
        else if (tableNo==4 && Table.orderFoodNameVec4.size()==0) return;
        else if (tableNo==5 && Table.orderFoodNameVec5.size()==0) return;
        else if (tableNo==6 && Table.orderFoodNameVec6.size()==0) return;
        else if (tableNo==7 && Table.orderFoodNameVec7.size()==0) return;
        else if (tableNo==8 && Table.orderFoodNameVec8.size()==0) return;
        else if (tableNo==9 && Table.orderFoodNameVec9.size()==0) return;
        else if (tableNo==10 && Table.orderFoodNameVec10.size()==0) return;
        else if (tableNo==11 && Table.orderFoodNameVec11.size()==0) return;
        else if (tableNo==12 && Table.orderFoodNameVec12.size()==0) return;
        else if (tableNo==13 && Table.orderFoodNameVec13.size()==0) return;
        else if (tableNo==14 && Table.orderFoodNameVec14.size()==0) return;
        else if (tableNo==15 && Table.orderFoodNameVec15.size()==0) return;
        else if (tableNo==16 && Table.orderFoodNameVec16.size()==0) return;
        else if (tableNo==17 && Table.orderFoodNameVec17.size()==0) return;
        else if (tableNo==18 && Table.orderFoodNameVec18.size()==0) return;
        else if (tableNo==19 && Table.orderFoodNameVec19.size()==0) return;
        else if (tableNo==20 && Table.orderFoodNameVec20.size()==0) return;

        int confirmInt = JOptionPane.showConfirmDialog(null, "Are you sure you want to pay bill?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmInt == JOptionPane.YES_OPTION) {
            
        	JOptionPane.showMessageDialog(null, "Thank you. Your bill will come in a short moment.", "Thank you", JOptionPane.INFORMATION_MESSAGE);
            
            CashierModule.TableStatus[tableNo-1] = CashierModule.Billing;
            CashierModule.refresh();
            
            dispose();
            
        }
    }//payBillButtonActionPerformed end
    
    //main function for this class
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerMenu().setVisible(true);
//            }
//        });
//    }//main end
    
}//class CustomerMenu end
