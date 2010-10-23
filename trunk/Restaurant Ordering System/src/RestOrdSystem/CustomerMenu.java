package RestOrdSystem;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.*;

public class CustomerMenu extends javax.swing.JFrame {

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

    static int receiptNumber = 0;

    public CustomerMenu() {
        initComponents();
        setLocationRelativeTo(null);
        getCon();
        getFoodData();
        setFoodData();
        tableNoJTextField.setText("1");
        receiptNumber = 100000;
        try {
            rs = stmt.executeQuery("INSERT INTO RECEIPTTABLE ("
                    + "RECEIPT_NO, TABLE_NO, PRICE_CHARGED) VALUES ("
                    //+ "RECEIPT_NO_SEQ.NEXTVAL, "
                    + receiptNumber + ", "
                    + tableNoJTextField.getText() + ", "
                    + "0.00"
                    + ")");
        }catch(SQLException e) {
            System.out.println("testing failed : " + e.getMessage());
        }
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


    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodJList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        drinkJList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        sideJList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        tableNoJLabel = new javax.swing.JLabel();
        tableNoJTextField = new javax.swing.JTextField();
        orderButton = new javax.swing.JButton();
        payBillButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        totalPriceJPanel = new javax.swing.JPanel();
        totalPriceJLabel = new javax.swing.JLabel();
        totalPriceJTextField = new javax.swing.JTextField();
        backgroundJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CustomerMenu");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(800, 480));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16));

        foodJList.setFont(new java.awt.Font("Tahoma", 0, 18));
        foodJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(foodJList);

        jTabbedPane1.addTab("FOOD", jScrollPane1);

        drinkJList.setFont(new java.awt.Font("Tahoma", 0, 18));
        drinkJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(drinkJList);

        jTabbedPane1.addTab("DRINK", jScrollPane2);

        sideJList.setFont(new java.awt.Font("Tahoma", 0, 18));
        sideJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(sideJList);

        jTabbedPane1.addTab("SIDEORDER", jScrollPane3);

        jTabbedPane1.setBounds(40, 100, 260, 340);
        jLayeredPane1.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Order List");
        jLabel1.setBounds(460, 80, 310, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderJTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        orderJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(orderJTable);
        orderJTable.getColumnModel().getColumn(0).setPreferredWidth(200);

        jScrollPane4.setBounds(460, 110, 310, 260);
        jLayeredPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tableNoJLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        tableNoJLabel.setText("Table No :");
        tableNoJLabel.setBounds(430, 10, 180, 50);
        jLayeredPane1.add(tableNoJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tableNoJTextField.setEditable(false);
        tableNoJTextField.setFont(new java.awt.Font("Tahoma", 0, 18));
        tableNoJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tableNoJTextField.setBounds(580, 10, 80, 50);
        jLayeredPane1.add(tableNoJTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        orderButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        orderButton.setText("Order >>");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });
        orderButton.setBounds(320, 180, 120, 60);
        jLayeredPane1.add(orderButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        payBillButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        payBillButton.setText("Pay Bill");
        payBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBillButtonActionPerformed(evt);
            }
        });
        payBillButton.setBounds(460, 410, 310, 50);
        jLayeredPane1.add(payBillButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        backButton.setBounds(690, 10, 90, 50);
        jLayeredPane1.add(backButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        titleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/Customer_menu_text.png")));
        titleJLabel.setBounds(10, 10, 400, 60);
        jLayeredPane1.add(titleJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        totalPriceJPanel.setLayout(null);

        totalPriceJLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        totalPriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceJLabel.setText("Total Price : RM");
        totalPriceJPanel.add(totalPriceJLabel);
        totalPriceJLabel.setBounds(0, 0, 150, 40);

        totalPriceJTextField.setEditable(false);
        totalPriceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18));
        totalPriceJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPriceJPanel.add(totalPriceJTextField);
        totalPriceJTextField.setBounds(150, 0, 160, 40);

        totalPriceJPanel.setBounds(460, 370, 310, 40);
        jLayeredPane1.add(totalPriceJPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/menu_background2.jpg"))); 
        backgroundJLabel.setBounds(0, 0, 800, 480);
        jLayeredPane1.add(backgroundJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 480);

        //pack();
    }

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        OrderPopUp odp = new OrderPopUp();
        odp.setVisible(true);
        odp.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);

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
        odp.foodPictLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(foodPictURLStr)));
        odp.priceTextField.setText(df.format(foodPriceDbl));
        odp.descriptionTextArea.setText(foodDescptStr);

    }                                           

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        dispose();
    }                                          

    private void payBillButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        if (orderFoodNameVec.size()==0) {
            return;
        }

        int confirmInt = JOptionPane.showConfirmDialog(null, "Are you sure you want to pay bill?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirmInt == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "This meal is FREE!!!", "Surprise!!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }                                             


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JList drinkJList;
    private javax.swing.JList foodJList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton orderButton;
    protected static javax.swing.JTable orderJTable;
    protected static javax.swing.JButton payBillButton;
    private javax.swing.JList sideJList;
    private javax.swing.JLabel tableNoJLabel;
    protected static javax.swing.JTextField tableNoJTextField;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JLabel totalPriceJLabel;
    private javax.swing.JPanel totalPriceJPanel;
    protected static javax.swing.JTextField totalPriceJTextField;
    

}
