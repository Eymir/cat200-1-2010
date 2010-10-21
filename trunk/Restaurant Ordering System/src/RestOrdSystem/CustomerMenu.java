package RestOrdSystem;

import java.awt.Dimension;
import java.sql.*;
import java.util.List;
import java.util.Vector;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerMenu extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;
    private Statement stmt;
//    String food_number;
//    String food_name;
//    String food_price;
//    int food_qoh;
//    int food_min;
    Vector foodNoVec = new Vector();
    Vector foodNameVec = new Vector();
    Vector foodPriceVec = new Vector();
    Vector foodQOHVec = new Vector();
    Vector foodMinVec = new Vector();

    
    public CustomerMenu() {
        initComponents();
        setLocationRelativeTo(null);
      //  getCon();
       // storeData();
    }

//    void storeData() {
//
//        try {
//            stmt = con.createStatement();
//            rs = stmt.executeQuery("select food_number, food_name, food_price, food_qoh, food_min " +
//            		"from foodtable");
//            
//            while (rs.next()) {
//
////                food_number = rs.getString(1);
////                food_name = rs.getString(2);
////                food_price = rs.getString(3);
////                food_qn = rs.getInt(4);
////                food_min = rs.getInt(5);
//            	foodNoVec.addElement(rs.getString(1));
//            	foodNameVec.addElement(rs.getString(2));
//            	foodPriceVec.addElement(rs.getString(3));
//            	foodQOHVec.addElement(rs.getString(4));
//            	foodMinVec.addElement(rs.getString(5));
//            }//while end
//
//        }
//        catch (Exception e) {
//            System.out.println("noooooooooooob");
//
//        }
//
//
//
//        foodList.setListData(foodNameVec);
////            fnameTextField.setText(fname);
////            lnameTextField.setText(lname);
////            phonenoTextField.setText(phoneno);
////            hiredateTextField.setText(hiredate);
////            salaryTextField.setText(salary);
//
//
//    }

//    public Connection getCon() {
//        try {
//            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
//            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
//            System.out.println("connection established");
//        }
//        catch (Exception e) {
//            System.err.println("connection error!!!");
//        }
//
//        return con;
//    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        itemPanel = new javax.swing.JPanel();
        orderButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        foodScrollPane = new javax.swing.JScrollPane();
        foodList = new javax.swing.JList();
        foodList.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		foodListmouseClickedActionPerformed();
        	}
        });
        drinkScrollPane = new javax.swing.JScrollPane();
        drinkList = new javax.swing.JList();
        setMealScrollPane = new javax.swing.JScrollPane();
        setMealList = new javax.swing.JList();
        orderListLabel = new javax.swing.JLabel();
        menuListLabel = new javax.swing.JLabel();
        custOrdMenuLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tableNoLabel = new javax.swing.JLabel();
        tableNoTextField = new javax.swing.JTextField();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CustomerMenu");
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 12));
        cancelButton.setText("Cancel");
        cancelButton.setBounds(580, 410, 150, 40);
        jLayeredPane1.add(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 12));
        confirmButton.setText("Confirm");
        confirmButton.setBounds(410, 410, 150, 40);
        jLayeredPane1.add(confirmButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Food Name", "Price", "Unit", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(24);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);

        jScrollPane1.setBounds(350, 120, 430, 270);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        orderButton.setFont(new java.awt.Font("Tahoma", 1, 20));
        orderButton.setText("ORDER");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));

        foodList.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        foodList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        foodList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        foodScrollPane.setViewportView(foodList);

        jTabbedPane1.addTab("FOOD", foodScrollPane);

        drinkList.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        drinkList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Apple Juice", "Carrot Juice", "Lemon Juice", "Orange Juice", "Grape Juice", "Watermelon Juice", "CheeseGarlicTomatoFreshHoneyLemon Juice" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        drinkScrollPane.setViewportView(drinkList);

        jTabbedPane1.addTab("DRINKS", drinkScrollPane);

        setMealList.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        setMealList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Set Meal A", "Set Meal B", "Set Meal C", "Set Meal D", "Set Meal E", "Set Meal A+B+C+D+E", "Mega Set Meal A", "Mega Set Meal B", "Mega Set Meal C", "Ultra Set Meal A", "Ultra Set Meal B" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        setMealScrollPane.setViewportView(setMealList);

        jTabbedPane1.addTab("SET MEALS", setMealScrollPane);

        javax.swing.GroupLayout gl_itemPanel = new javax.swing.GroupLayout(itemPanel);
        itemPanel.setLayout(gl_itemPanel);
        gl_itemPanel.setHorizontalGroup(
            gl_itemPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_itemPanel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_itemPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(orderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        gl_itemPanel.setVerticalGroup(
            gl_itemPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_itemPanel.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        itemPanel.setBounds(30, 120, 290, 330);
        jLayeredPane1.add(itemPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        orderListLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderListLabel.setText("Order List");
        orderListLabel.setBounds(350, 90, 80, 30);
        jLayeredPane1.add(orderListLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuListLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        menuListLabel.setText("Menu List");
        menuListLabel.setBounds(30, 90, 80, 30);
        jLayeredPane1.add(menuListLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        custOrdMenuLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
        custOrdMenuLabel.setText("CUSTOMER ORDER MENU");
        custOrdMenuLabel.setBounds(10, 10, 320, 40);
        jLayeredPane1.add(custOrdMenuLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        custOrdMenuLabel.setForeground(java.awt.Color.black);
        jSeparator1.setBounds(0, 60, 800, 2);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tableNoLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        tableNoLabel.setText("Table No :");
        tableNoLabel.setBounds(510, 30, 70, 17);
        jLayeredPane1.add(tableNoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tableNoTextField.setEditable(false);
        tableNoTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableNoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tableNoTextField.setBounds(590, 20, 100, 30);
        jLayeredPane1.add(tableNoTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/GrassBlades_800x480.jpg"))); // NOI18N
        backgroundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backgroundLabel.setBounds(0, 0, 800, 480);
        jLayeredPane1.add(backgroundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        OrderPopUp odp = new OrderPopUp();
        odp.setVisible(true);
        odp.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        odp.foodPictLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/friedChickenChop.jpg")));
        odp.foodNameLabel.setText((String)foodList.getModel().getElementAt(foodList.getSelectedIndex()));
    }//GEN-LAST:event_orderButtonActionPerformed
    
    private void foodListmouseClickedActionPerformed() {
    	
    }

 
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel custOrdMenuLabel;
    private javax.swing.JList drinkList;
    private javax.swing.JScrollPane drinkScrollPane;
    private javax.swing.JList foodList;
    private javax.swing.JScrollPane foodScrollPane;
    private javax.swing.JPanel itemPanel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menuListLabel;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel orderListLabel;
    private javax.swing.JList setMealList;
    private javax.swing.JScrollPane setMealScrollPane;
    private javax.swing.JLabel tableNoLabel;
    private javax.swing.JTextField tableNoTextField;
    // End of variables declaration//GEN-END:variables

}
