package RestOrdSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import RestOrdSystem.Administrator.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class SystemMain extends JFrame {

	static Connection con;
    static ResultSet rs;
    static Statement stmt;
	
	static public Table TableModule;
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
    	
    	getCon();
        initComponents();
        setSize(400,300);
        setLocationRelativeTo(null);

    }
    
    public static Connection getCon() {
        try {
            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("connection established");
        }
        catch (Exception e) {
            System.err.println("connection error!!!");
        }

        return con;
    }//getCon end
    
    
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
        
        
        //CustomerModule = new CustomerMenu();
        TableModule = new Table();
        CashierModule = new CashierModule();
        KitchenModule = new Kitchen();
        //AdministratorModule = new LogIn();
        
        
        CustomerModuleButton = new JButton();
        CashierModuleButton = new JButton();
        KitchenModuleButton = new JButton();
        AdministratorModuleButton = new JButton();
        Title = new JLabel();
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
    	TableModule.setVisible(true);
    	TableModule.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    
    private void CashierModuleActionPerformed(ActionEvent evt) 
    {
        CashierModule.setVisible(true);
        CashierModule.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    
    private void KitchenModuleActionPerformed(ActionEvent evt) 
    {
       KitchenModule.setVisible(true);
       KitchenModule.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    private void AdministratorModuleActionPerformed(ActionEvent evt) 
    {
 //      AdministratorModule.setVisible(true);
    }
}
