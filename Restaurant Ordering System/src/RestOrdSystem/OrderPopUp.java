package RestOrdSystem;

public class OrderPopUp extends javax.swing.JFrame {

    /** Creates new form OrderPopUp */
    public OrderPopUp() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        quantityJSpinner = new javax.swing.JSpinner();
        howManyLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        descriptionLabel = new javax.swing.JLabel();
        foodPictLabel = new javax.swing.JLabel();
        foodNameLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Pop Up");
        setResizable(false);

        okButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.setBounds(120, 350, 120, 40);
        jLayeredPane1.add(okButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        cancelButton.setBounds(270, 350, 120, 40);
        jLayeredPane1.add(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        quantityJSpinner.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        quantityJSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99, 1));
        quantityJSpinner.setPreferredSize(new java.awt.Dimension(40, 20));
        quantityJSpinner.setBounds(260, 170, 90, 60);
        jLayeredPane1.add(quantityJSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        howManyLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        howManyLabel.setText("How many you want to order?");
        howManyLabel.setBounds(260, 140, 230, 20);
        jLayeredPane1.add(howManyLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        priceTextField.setBackground(new java.awt.Color(255, 255, 255));
        priceTextField.setEditable(false);
        priceTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        priceTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceTextField.setBounds(260, 70, 210, 50);
        jLayeredPane1.add(priceTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        priceLabel.setText("Price");
        priceLabel.setBounds(260, 40, 50, 19);
        jLayeredPane1.add(priceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setTabSize(1);
        descriptionTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descriptionScrollPane.setViewportView(descriptionTextArea);

        descriptionScrollPane.setBounds(10, 260, 480, 70);
        jLayeredPane1.add(descriptionScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 15));
        descriptionLabel.setText("Description");
        descriptionLabel.setBounds(10, 230, 100, 19);
        jLayeredPane1.add(descriptionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        foodPictLabel.setText("foodPictLabel");
        foodPictLabel.setBounds(10, 40, 240, 180);
        jLayeredPane1.add(foodPictLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        foodNameLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        foodNameLabel.setText("<Food Name>");
        foodNameLabel.setBounds(10, 10, 480, 20);
        jLayeredPane1.add(foodNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/windows-7-wallpaper-500x400.jpg"))); // NOI18N
        backLabel.setBounds(0, 0, 500, 400);
        jLayeredPane1.add(backLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed


//    /**
//    * @param args the command line arguments
//    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OrderPopUp().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    protected javax.swing.JLabel foodNameLabel;
    protected javax.swing.JLabel foodPictLabel;
    private javax.swing.JLabel howManyLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JSpinner quantityJSpinner;
    // End of variables declaration//GEN-END:variables

}
