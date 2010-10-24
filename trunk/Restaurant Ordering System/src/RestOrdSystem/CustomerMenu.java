package RestOrdSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CustomerMenu extends JFrame {

    static Connection con;
    static ResultSet rs;
    static Statement stmt;
    
    Vector foodNameVec = new Vector();
    Vector foodTypeVec = new Vector();

    Vector typeFoodVec = new Vector();
    Vector typeDrinkVec = new Vector();
    Vector typeSideVec = new Vector();

    String selectedFoodName = "";
    double foodPriceDbl = 0.00;
    String foodPictURLStr = "";
    String foodDescptStr = "";
    String receiptNoStr = "";

    static Vector orderFoodNameVec = new Vector();
    static Vector orderFoodQnVec = new Vector();
    static Vector orderFoodPriceVec = new Vector();

    DecimalFormat df = new DecimalFormat("0.00");

    public CustomerMenu() {
    	
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch (ClassNotFoundException e) {}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
		catch (UnsupportedLookAndFeelException e) {}
		
		init();
		getCon();
        getFoodData();
        setFoodData();
        
    }
    

    public Connection getCon() {
        try {
            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
            System.out.println("connection established");
        }
        catch (Exception e) {
            System.err.println("connection error!!!");
        }

        return con;
    }//getCon end

    void getFoodData() {

        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT FOOD_NAME, FOOD_TYPE " +
            		"FROM FOODTABLE");

            while (rs.next()) {
            	foodNameVec.addElement(rs.getString(1));
                foodTypeVec.addElement(rs.getString(2));
            }//while end
        }
        catch (Exception e) {
            System.err.println("database retrieval failed...");
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
    protected static JTextField tableNoJTextField;
    private JButton backButton;
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
    protected static JTable orderJTable;
    private JPanel totalPriceJPanel;
    private JLabel totalPriceJLabel;
    protected static JTextField totalPriceJTextField;
    protected static JButton payBillButton;
    
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
        backButton = new JButton();
        
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
        orderJTable = new JTable();
        totalPriceJPanel = new JPanel();
        totalPriceJLabel = new JLabel();
        totalPriceJTextField = new JTextField();
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

        orderJTable.setModel(new DefaultTableModel(
        		new Object [][] {}, new String [] {"Food Name", "Quantity", "Price"} ) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
            	return false;
            }
        });
        orderJTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        orderJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(orderJTable);
        orderJTable.getColumnModel().getColumn(0).setPreferredWidth(200);

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

//        backButton.setText("BACK");
//        backButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                backButtonActionPerformed(evt);
//            }
//        });
//        backButton.setBounds(690, 10, 90, 50);
//        jLayeredPane1.add(backButton, JLayeredPane.DEFAULT_LAYER);

        titleJLabel.setIcon(new ImageIcon(getClass().getResource("/image1/Customer_menu_text.png")));
        titleJLabel.setBounds(10, 10, 400, 60);
        jLayeredPane1.add(titleJLabel, JLayeredPane.DEFAULT_LAYER);

        totalPriceJPanel.setLayout(null);

        totalPriceJLabel.setFont(new Font("Tahoma", 0, 18));
        totalPriceJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalPriceJLabel.setText("Total Price : RM");
        totalPriceJPanel.add(totalPriceJLabel);
        totalPriceJLabel.setBounds(0, 0, 150, 40);

        totalPriceJTextField.setEditable(false);
        totalPriceJTextField.setFont(new Font("Tahoma", 0, 18));
        totalPriceJTextField.setHorizontalAlignment(JTextField.CENTER);
        totalPriceJPanel.add(totalPriceJTextField);
        totalPriceJTextField.setBounds(150, 0, 160, 40);

        totalPriceJPanel.setBounds(460, 370, 310, 40);
        jLayeredPane1.add(totalPriceJPanel, JLayeredPane.DEFAULT_LAYER);

        backgroundJLabel.setIcon(new ImageIcon(getClass().getResource("/image1/menu_background2.jpg"))); 
        backgroundJLabel.setBounds(0, 0, 800, 480);
        jLayeredPane1.add(backgroundJLabel, JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 480);
        
        
    }//init end

    private void orderButtonActionPerformed(ActionEvent evt) {
    	
        OrderPopUp odp = new OrderPopUp();
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
            rs = stmt.executeQuery("SELECT FOOD_PRICE, FOOD_PICT_URL, FOOD_DESCPT "
                    + "FROM FOODTABLE "
                    + "WHERE FOOD_NAME = '" + selectedFoodName + "'");
            
            rs.first();
            if (rs.first()) {
                foodPriceDbl = rs.getDouble(1);
            	foodPictURLStr = rs.getString(2);
                foodDescptStr = rs.getString(3);
            }
        }
        catch (Exception e) {
            System.err.println("food detail retrieval failed...");
        }//try catch end--------------------------------------------------------------

        odp.foodNameLabel.setText(selectedFoodName);
        odp.foodPictLabel.setIcon(new ImageIcon(getClass().getResource(foodPictURLStr)));
        odp.priceTextField.setText(df.format(foodPriceDbl));
        odp.descriptionTextArea.setText(foodDescptStr);
        
    }//orderButtonActionPerformed end
    
//    private void backButtonActionPerformed(ActionEvent evt) {
//        dispose();
//    }//backButtonActionPerformed end

    private void payBillButtonActionPerformed(ActionEvent evt) {
        
        if (orderFoodNameVec.size()==0) {
            return;
        }

        int confirmInt = JOptionPane.showConfirmDialog(null, "Are you sure you want to pay bill?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmInt == JOptionPane.YES_OPTION) {
            
        	JOptionPane.showMessageDialog(null, "Thank you. Your bill will come in a short moment.", "Thank you", JOptionPane.INFORMATION_MESSAGE);
            
            CashierModule.TableStatus[Integer.valueOf(tableNoJTextField.getText())-1] = CashierModule.Billing;
            CashierModule.refresh();
            
            dispose();
            
        }
    }//payBillButtonActionPerformed end

    public static void refreshTable() {
    	
    	if (tableNoJTextField.getText().equals("1")) Table.Button1.setEnabled(true);
        else if (tableNoJTextField.getText().equals("2")) Table.Button2.setEnabled(true);
        else if (tableNoJTextField.getText().equals("3")) Table.Button3.setEnabled(true);
        else if (tableNoJTextField.getText().equals("4")) Table.Button4.setEnabled(true);
        else if (tableNoJTextField.getText().equals("5")) Table.Button5.setEnabled(true);
        else if (tableNoJTextField.getText().equals("6")) Table.Button6.setEnabled(true);
        else if (tableNoJTextField.getText().equals("7")) Table.Button7.setEnabled(true);
        else if (tableNoJTextField.getText().equals("8")) Table.Button8.setEnabled(true);
        else if (tableNoJTextField.getText().equals("9")) Table.Button9.setEnabled(true);
        else if (tableNoJTextField.getText().equals("10")) Table.Button10.setEnabled(true);
        else if (tableNoJTextField.getText().equals("11")) Table.Button11.setEnabled(true);
        else if (tableNoJTextField.getText().equals("12")) Table.Button12.setEnabled(true);
        else if (tableNoJTextField.getText().equals("13")) Table.Button13.setEnabled(true);
        else if (tableNoJTextField.getText().equals("14")) Table.Button14.setEnabled(true);
        else if (tableNoJTextField.getText().equals("15")) Table.Button15.setEnabled(true);
        else if (tableNoJTextField.getText().equals("16")) Table.Button16.setEnabled(true);
        else if (tableNoJTextField.getText().equals("17")) Table.Button17.setEnabled(true);
        else if (tableNoJTextField.getText().equals("18")) Table.Button18.setEnabled(true);
        else if (tableNoJTextField.getText().equals("19")) Table.Button19.setEnabled(true);
        else Table.Button20.setEnabled(true);
    	
    }
    
    
    
    //main function for this class
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerMenu().setVisible(true);
//            }
//        });
//    }//main end
    
}
