package RestOrdSystem;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KitchenGUI.java
 *
 * Created on Oct 21, 2010, 4:27:05 PM
 */

/**
 *
 * @author Yinger
 */
public class Kitchen extends javax.swing.JFrame {

    /** Creates new form KitchenGUI */
    public Kitchen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLayeredPane1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kitchen");
        jLabel2.setBounds(20, 20, 100, 30);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(20, 70, 550, 400);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Served");
        jButton1.setBounds(40, 420, 80, -1);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 600);
        
        btnServed = new JButton("Served");
        btnServed.setBounds(40, 500, 89, 23);
        jLayeredPane1.add(btnServed);
                
                rdbtnPending = new JRadioButton("Pending");
                buttonGroup.add(rdbtnPending);
                rdbtnPending.setBounds(617, 119, 109, 23);
                jLayeredPane1.add(rdbtnPending);
                
                rdbtnInProgress = new JRadioButton("In Progress");
                buttonGroup.add(rdbtnInProgress);
                rdbtnInProgress.setBounds(617, 145, 109, 23);
                jLayeredPane1.add(rdbtnInProgress);
                
                rdbtnDone = new JRadioButton("Done");
                buttonGroup.add(rdbtnDone);
                rdbtnDone.setBounds(617, 171, 109, 23);
                jLayeredPane1.add(rdbtnDone);
                jLabel1 = new javax.swing.JLabel();
                
                        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/background.png"))); 
                        jLabel1.setText("jLabel1");
                        jLabel1.setBounds(0, 0, 800, 600);
                        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pack();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kitchen().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private JButton btnServed;
    private JRadioButton rdbtnPending;
    private JRadioButton rdbtnInProgress;
    private JRadioButton rdbtnDone;
    private final ButtonGroup buttonGroup = new ButtonGroup();


}
