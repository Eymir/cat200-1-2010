
package RestOrdSystem;

import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;

public class CustomerMenu extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;

    Vector foodNameVec = new Vector();
    Vector foodTypeVec = new Vector();

    Vector typeFoodVec = new Vector();
    Vector typeDrinkVec = new Vector();
    Vector typeSideVec = new Vector();

    String selectedFoodName = "";
    double foodPriceDbl = 0.00;
    String foodPictURLStr = "";
    String foodDescptStr = "";

    public CustomerMenu() {
        initComponents();
        setLocationRelativeTo(null);
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
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        tableNoJLabel = new javax.swing.JLabel();
        tableNoJTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        titleJLabel = new javax.swing.JLabel();
        backgroundJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CustomerMenu");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

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

        jTabbedPane1.setBounds(40, 100, 260, 310);
        jLayeredPane1.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Order List");
        jLabel1.setBounds(460, 80, 310, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);

        jScrollPane4.setBounds(460, 110, 310, 290);
        jLayeredPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("Add >>");
        addButton.setBounds(320, 170, 120, 60);
        jLayeredPane1.add(addButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        removeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removeButton.setText("<< Remove");
        removeButton.setBounds(320, 270, 120, 60);
        jLayeredPane1.add(removeButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tableNoJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tableNoJLabel.setText("Table No :");
        tableNoJLabel.setBounds(430, 10, 180, 50);
        jLayeredPane1.add(tableNoJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tableNoJTextField.setBackground(new java.awt.Color(255, 255, 255));
        tableNoJTextField.setEditable(false);
        tableNoJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableNoJTextField.setBounds(580, 10, 80, 50);
        jLayeredPane1.add(tableNoJTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        confirmButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmButton.setText("Confirm Order");
        confirmButton.setBounds(560, 410, 210, 50);
        jLayeredPane1.add(confirmButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backButton.setText("BACK");
        backButton.setBounds(690, 10, 90, 50);
        jLayeredPane1.add(backButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewButton.setText("View Food Detail");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        viewButton.setBounds(40, 410, 260, 50);
        jLayeredPane1.add(viewButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        titleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/Customer_menu_text.png")));
        titleJLabel.setBounds(10, 10, 400, 60);
        jLayeredPane1.add(titleJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/menu_background2.jpg")));
        backgroundJLabel.setBounds(0, 0, 800, 480);
        jLayeredPane1.add(backgroundJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 480);

        pack();
    }

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        OrderPopUp odp = new OrderPopUp();
        odp.setVisible(true);
        odp.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);

        if (foodJList.isShowing())
            selectedFoodName = (String)foodJList.getSelectedValue();
        else if (drinkJList.isShowing())
            selectedFoodName = (String)drinkJList.getSelectedValue();
        else
            selectedFoodName = (String)sideJList.getSelectedValue();

        //get food pict url from oracle
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
            System.err.println("picture retrieval failed...");
        }//try catch end

        odp.foodNameLabel.setText(selectedFoodName);
        odp.foodPictLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(foodPictURLStr)));
        DecimalFormat df = new DecimalFormat("0.00");
        odp.priceTextField.setText("RM "+df.format(foodPriceDbl));
        odp.descriptionTextArea.setText(foodDescptStr);

    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundJLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JList drinkJList;
    private javax.swing.JList foodJList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton removeButton;
    private javax.swing.JList sideJList;
    private javax.swing.JLabel tableNoJLabel;
    private javax.swing.JTextField tableNoJTextField;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JButton viewButton;
    

}
