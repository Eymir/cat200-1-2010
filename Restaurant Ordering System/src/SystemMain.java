/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SystemMain.java
 *
 * Created on Oct 19, 2010, 5:15:22 PM
 */

/**
 *
 * @author root
 */
public class SystemMain extends javax.swing.JFrame {

    static public CustomerMenu CustomerMenu = new CustomerMenu();
    /** Creates new form SystemMain */
    public SystemMain() {
        initComponents();
        setSize(400,330);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerModule = new javax.swing.JButton();
        CashierModule = new javax.swing.JButton();
        KitchenModule = new javax.swing.JButton();
        AdministratorModule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Ordering System");
        setResizable(false);
        getContentPane().setLayout(null);

        CustomerModule.setText("Customer Module");
        CustomerModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerModuleActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerModule);
        CustomerModule.setBounds(100, 120, 200, 30);

        CashierModule.setText("Cashier Module");
        getContentPane().add(CashierModule);
        CashierModule.setBounds(100, 160, 200, 30);

        KitchenModule.setText("Kitchen Module");
        getContentPane().add(KitchenModule);
        KitchenModule.setBounds(100, 200, 200, 30);

        AdministratorModule.setText("Administrator Module");
        getContentPane().add(AdministratorModule);
        AdministratorModule.setBounds(100, 240, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerModuleActionPerformed
        // TODO add your handling code here:
        CustomerMenu.setVisible(true);
    }//GEN-LAST:event_CustomerModuleActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdministratorModule;
    private javax.swing.JButton CashierModule;
    private javax.swing.JButton CustomerModule;
    private javax.swing.JButton KitchenModule;
    // End of variables declaration//GEN-END:variables

}
