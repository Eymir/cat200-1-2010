package RestOrdSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import RestOrdSystem.Administrator.*;

public class SystemMain extends JFrame {

	
    static public CustomerMenu CustomerModule = new CustomerMenu();
    static public CashierModule CashierModule = new CashierModule();
    static public Kitchen KitchenModule = new Kitchen();
   // static public LogIn AdministratorModule = new LogIn();
    
    private JButton CustomerModuleButton;    
    private JButton CashierModuleButton;
    private JButton KitchenModuleButton;
    private JButton AdministratorModuleButton;
    private JLabel Title;
    
    
    public SystemMain() {    	
    	
        initComponents();
        setSize(400,300);
        setLocationRelativeTo(null);

    }
    
    
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemMain().setVisible(true);
            }
        });
    }


    private void initComponents() {
    	
    	
        CustomerModuleButton = new JButton();
        CashierModuleButton = new JButton();
        KitchenModuleButton = new JButton();
        AdministratorModuleButton = new JButton();
        Title = new JLabel();
        
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Launcher");
        setResizable(false);
        getContentPane().setLayout(null);
        
        
        getContentPane().add(Title);
        getContentPane().add(CustomerModuleButton);
        getContentPane().add(CashierModuleButton);
        getContentPane().add(KitchenModuleButton);
        getContentPane().add(AdministratorModuleButton);

        Title.setFont(new Font("DejaVu Sans", 1, 16)); 
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        Title.setText("Restaurant Ordering System");
        Title.setBounds(50,30,300,30);

        
        CustomerModuleButton.setText("Customer Module");
        CustomerModuleButton.setBounds(100, 90, 200, 30);
        CustomerModuleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CustomerModuleActionPerformed(evt);
            }
        });
        
        
        CashierModuleButton.setText("Cashier Module");
        CashierModuleButton.setBounds(100, 130, 200, 30);
        CashierModuleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CashierModuleActionPerformed(evt);
            }
        });

        
        KitchenModuleButton.setText("Kitchen Module");
        KitchenModuleButton.setBounds(100, 170, 200, 30);
        KitchenModuleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	KitchenModuleActionPerformed(evt);
            }
        });

        
        AdministratorModuleButton.setText("Administrator Module");
        AdministratorModuleButton.setBounds(100, 210, 200, 30);
        AdministratorModuleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	AdministratorModuleActionPerformed(evt);
            }
        });
        
        pack();
    }

    
    private void CustomerModuleActionPerformed(ActionEvent evt) 
    {
        CustomerModule.setVisible(true);
    }
    
    
    private void CashierModuleActionPerformed(ActionEvent evt) 
    {
        CashierModule.setVisible(true);
    }
    
    
    private void KitchenModuleActionPerformed(ActionEvent evt) 
    {
       KitchenModule.setVisible(true);
    }
    
    private void AdministratorModuleActionPerformed(ActionEvent evt) 
    {
 //      AdministratorModule.setVisible(true);
    }
}
