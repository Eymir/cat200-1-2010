package RestOrdSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CashierModule extends JFrame {

	
	private JToggleButton Table1Button;
	private JToggleButton Table2Button;
	private JToggleButton Table3Button;
	private JToggleButton Table4Button;
	private JToggleButton Table5Button;
	private JToggleButton Table6Button;
	private JToggleButton Table7Button;
	private JToggleButton Table8Button;
	private JToggleButton Table9Button;
	private JToggleButton Table10Button;
	private JToggleButton Table11Button;
	private JToggleButton Table12Button;
	private JToggleButton Table13Button;
	private JToggleButton Table14Button;
	private JToggleButton Table15Button;
	private JToggleButton Table16Button;
	private JToggleButton Table17Button;
	private JToggleButton Table18Button;
	private JToggleButton Table19Button;
	private JToggleButton Table20Button;
	
    
	public CashierModule() {
        initComponents();
        setSize(800,600);
        setLocationRelativeTo(null);
    }
    
	
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierModule().setVisible(true);
            }
        });
    }
    
    
    private void initComponents() {
    	 
    	
    	Table1Button = new JToggleButton();
    	Table2Button = new JToggleButton();
    	Table3Button = new JToggleButton();
    	Table4Button = new JToggleButton();
    	Table5Button = new JToggleButton();
    	Table6Button = new JToggleButton();
    	Table7Button = new JToggleButton();
    	Table8Button = new JToggleButton();
    	Table9Button = new JToggleButton();
    	Table10Button = new JToggleButton();
    	Table11Button = new JToggleButton();
    	Table12Button = new JToggleButton();
    	Table13Button = new JToggleButton();
    	Table14Button = new JToggleButton();
    	Table15Button = new JToggleButton();
    	Table16Button = new JToggleButton();
    	Table17Button = new JToggleButton();
    	Table18Button = new JToggleButton();
    	Table19Button = new JToggleButton();
    	Table20Button = new JToggleButton();
    	
    	
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cashier");
        setResizable(false);
        getContentPane().setLayout(null);
        
        
        getContentPane().add(Table1Button);
        getContentPane().add(Table2Button);
        getContentPane().add(Table3Button);
        getContentPane().add(Table4Button);
        getContentPane().add(Table5Button);
        getContentPane().add(Table6Button);
        getContentPane().add(Table7Button);
        getContentPane().add(Table8Button);
        getContentPane().add(Table9Button);
        getContentPane().add(Table10Button);
        getContentPane().add(Table11Button);
        getContentPane().add(Table12Button);
        getContentPane().add(Table13Button);
        getContentPane().add(Table14Button);
        getContentPane().add(Table15Button);
        getContentPane().add(Table16Button);
        getContentPane().add(Table17Button);
        getContentPane().add(Table18Button);
        getContentPane().add(Table19Button);
        getContentPane().add(Table20Button);
        
        
        Table1Button.setText("Table 1");
        Table2Button.setText("Table 2");
        Table3Button.setText("Table 3");
        Table4Button.setText("Table 4");
        Table5Button.setText("Table 5");
        Table6Button.setText("Table 6");
        Table7Button.setText("Table 7");
        Table8Button.setText("Table 8");
        Table9Button.setText("Table 9");
        Table10Button.setText("Table 10");
        Table11Button.setText("Table 11");
        Table12Button.setText("Table 12");
        Table13Button.setText("Table 13");
        Table14Button.setText("Table 14");
        Table15Button.setText("Table 15");
        Table16Button.setText("Table 16");
        Table17Button.setText("Table 17");
        Table18Button.setText("Table 18");
        Table19Button.setText("Table 19");
        Table20Button.setText("Table 20");
        
        
        Table1Button.setBounds(20,50,100,40);
        Table2Button.setBounds(20,100,100,40);
        Table3Button.setBounds(20,150,100,40);
        Table4Button.setBounds(20,200,100,40);
        Table5Button.setBounds(20,250,100,40);
        Table6Button.setBounds(20,300,100,40);
        Table7Button.setBounds(20,350,100,40);
        Table8Button.setBounds(20,400,100,40);
        Table9Button.setBounds(20,450,100,40);
        Table10Button.setBounds(20,500,100,40);
        
        Table11Button.setBounds(260,50,100,40);
        Table12Button.setBounds(260,100,100,40);
        Table13Button.setBounds(260,150,100,40);
        Table14Button.setBounds(260,200,100,40);
        Table15Button.setBounds(260,250,100,40);
        Table16Button.setBounds(260,300,100,40);
        Table17Button.setBounds(260,350,100,40);
        Table18Button.setBounds(260,400,100,40);
        Table19Button.setBounds(260,450,100,40);
        Table20Button.setBounds(260,500,100,40);
     
        
        pack();
    }
}
