package RestOrdSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CashierModule extends JFrame {

	
    public CashierModule() {
        initComponents();
        setSize(800,600);
        setLocationRelativeTo(null);
    }
    
    
    private void initComponents() {
    
    	
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cashier");
        setResizable(false);
        getContentPane().setLayout(null);
    }
}
