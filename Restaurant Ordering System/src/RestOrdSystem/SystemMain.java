package RestOrdSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import RestOrdSystem.Administrator.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class SystemMain extends JFrame {

	
    static public CustomerMenu CustomerModule;
    static public CashierModule CashierModule;
    static public Kitchen KitchenModule;
   // static public LogIn AdministratorModule;
    
    private JButton CustomerModuleButton;    
    private JButton CashierModuleButton;
    private JButton KitchenModuleButton;
    private JButton AdministratorModuleButton;
    private JLabel Title;
	static public Calendar Calender;
    static public int DayOfWeek;
    static public String Day;
    static public String Date;
    static public Date Today;
    static public String getToday;
    
    static public void date() {
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd-MMM-yyyy");
        Date = simpleFormatter.format(Today);
    }
    
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
    	
    	
      
        
    	Today = new Date();
        Calender = new GregorianCalendar();
    	DayOfWeek = Calender.get(Calendar.DAY_OF_WEEK);
    	
    	date();
        switch (DayOfWeek)
        {
            case 1:
                Day="Sunday";
                break;
            case 2:
                Day="Monday";
                break;
            case 3:
                Day="Tuesday";
                break;
            case 4:
                Day="Wednesday";
                break;
            case 5:
                Day="Thursday";
                break;
            case 6:
                Day="Friday";
                break;
            case 7:
                Day="Saturday";
                break;
        } 
        
        getToday=Day+", "+Date;
        
        
        CustomerModule = new CustomerMenu();
        CashierModule = new CashierModule();
        KitchenModule = new Kitchen();
        //AdministratorModule = new LogIn();
        
        
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