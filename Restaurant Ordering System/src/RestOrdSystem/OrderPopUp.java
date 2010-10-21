
package RestOrdSystem;


public class OrderPopUp extends javax.swing.JFrame {

    
    public OrderPopUp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
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
        setMinimumSize(new java.awt.Dimension(500, 420));
        getContentPane().setLayout(null);

        priceTextField.setEditable(false);
        priceTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceTextField.setBounds(260, 110, 210, 50);
        jLayeredPane1.add(priceTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        priceLabel.setText("Price");
        priceLabel.setBounds(260, 70, 130, 30);
        jLayeredPane1.add(priceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setTabSize(1);
        descriptionTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descriptionScrollPane.setViewportView(descriptionTextArea);

        descriptionScrollPane.setBounds(10, 260, 480, 120);
        jLayeredPane1.add(descriptionScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        descriptionLabel.setText("Description");
        descriptionLabel.setBounds(10, 230, 100, 19);
        jLayeredPane1.add(descriptionLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        foodPictLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodPictLabel.setText("foodPictLabel");
        foodPictLabel.setBounds(10, 40, 240, 180);
        jLayeredPane1.add(foodPictLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        foodNameLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        foodNameLabel.setText("<Food Name>");
        foodNameLabel.setBounds(10, 10, 480, 30);
        jLayeredPane1.add(foodNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/windows-7-wallpaper-500x400.jpg"))); // NOI18N
        backLabel.setBounds(0, 0, 500, 400);
        jLayeredPane1.add(backLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 500, 400);

        pack();
    }


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPopUp().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    protected javax.swing.JTextArea descriptionTextArea;
    protected javax.swing.JLabel foodNameLabel;
    protected javax.swing.JLabel foodPictLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel priceLabel;
    protected javax.swing.JTextField priceTextField;
    

}
