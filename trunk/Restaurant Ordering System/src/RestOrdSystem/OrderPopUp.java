package RestOrdSystem;

import java.text.DecimalFormat;
import java.util.Vector;

public class OrderPopUp extends javax.swing.JFrame {

    
    public OrderPopUp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        priceTextField = new javax.swing.JTextField();
        rmLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        descriptionLabel = new javax.swing.JLabel();
        foodPictLabel = new javax.swing.JLabel();
        foodNameLabel = new javax.swing.JLabel();
        quantityJLabel = new javax.swing.JLabel();
        quantityJSpinner = new javax.swing.JSpinner();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Pop Up");
        setMinimumSize(new java.awt.Dimension(500, 420));
        setResizable(false);
        getContentPane().setLayout(null);

        priceTextField.setEditable(false);
        priceTextField.setFont(new java.awt.Font("Tahoma", 0, 18));
        priceTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceTextField.setBounds(320, 60, 150, 50);
        jLayeredPane1.add(priceTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        rmLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        rmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rmLabel.setText("RM");
        rmLabel.setBounds(260, 60, 60, 50);
        jLayeredPane1.add(rmLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        priceLabel.setText("Price");
        priceLabel.setBounds(260, 30, 130, 30);
        jLayeredPane1.add(priceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setTabSize(1);
        descriptionTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descriptionScrollPane.setViewportView(descriptionTextArea);

        descriptionScrollPane.setBounds(10, 250, 480, 70);
        jLayeredPane1.add(descriptionScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        descriptionLabel.setText("Description");
        descriptionLabel.setBounds(10, 230, 100, -1);
        jLayeredPane1.add(descriptionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        foodPictLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodPictLabel.setText("<no data>");
        foodPictLabel.setBounds(10, 40, 240, 180);
        jLayeredPane1.add(foodPictLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        foodNameLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        foodNameLabel.setText("<no data>");
        foodNameLabel.setBounds(10, 10, 480, 30);
        jLayeredPane1.add(foodNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        quantityJLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        quantityJLabel.setText("Quantity");
        quantityJLabel.setBounds(260, 120, 210, 30);
        jLayeredPane1.add(quantityJLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        quantityJSpinner.setFont(new java.awt.Font("Tahoma", 0, 24));
        quantityJSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        quantityJSpinner.setBounds(260, 160, 120, 60);
        jLayeredPane1.add(quantityJSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        okButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(120, 340, 110, 40);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        cancelButton.setBounds(270, 340, 110, 40);
        jLayeredPane1.add(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/BlueBackground_1_500x400.jpg")));
        backLabel.setBounds(0, 0, 500, 400);
        jLayeredPane1.add(backLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 500, 400);

        //pack();
    }

    boolean sameName = false;
    double totalPriceDbl = 0;

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         

        DecimalFormat df = new DecimalFormat("0.00");

        for (int a=0;a<CustomerMenu.orderFoodNameVec.size();a++) {
            if (CustomerMenu.orderFoodNameVec.elementAt(a)==foodNameLabel.getText()) {
                int tempNewQn = (Integer)CustomerMenu.orderFoodQnVec.get(a)+(Integer)quantityJSpinner.getValue();
                CustomerMenu.orderFoodQnVec.set(a,tempNewQn);
                CustomerMenu.orderFoodPriceVec.set(a,df.format(Double.valueOf(priceTextField.getText())*tempNewQn));
                sameName = true;
            }
        }

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

        CustomerMenu.orderJTable.setModel(new javax.swing.table.DefaultTableModel(
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
    }                                        

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }                                            


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPopUp().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    protected javax.swing.JTextArea descriptionTextArea;
    protected javax.swing.JLabel foodNameLabel;
    protected javax.swing.JLabel foodPictLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel priceLabel;
    protected javax.swing.JTextField priceTextField;
    private javax.swing.JLabel quantityJLabel;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JLabel rmLabel;
    

}
