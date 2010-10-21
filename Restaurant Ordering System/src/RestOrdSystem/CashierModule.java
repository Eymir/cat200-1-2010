package RestOrdSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CashierModule extends JFrame {

	static public String [] TableStatus; 
	
	
	private JPanel BasePanel;
	
	private JToggleButton Table1Button,Table2Button,Table3Button,Table4Button,Table5Button,
						  Table6Button,Table7Button,Table8Button,Table9Button,Table10Button,
						  Table11Button,Table12Button,Table13Button,Table14Button,Table15Button,
						  Table16Button,Table17Button,Table18Button,Table19Button,Table20Button;
	
	
	private JLabel Table1Label,Table2Label,Table3Label,Table4Label,Table5Label,
				   Table6Label,Table7Label,Table8Label,Table9Label,Table10Label,
   				   Table11Label,Table12Label,Table13Label,Table14Label,Table15Label,
   				   Table16Label,Table17Label,Table18Label,Table19Label,Table20Label;
	
	
	public CashierModule() {
        initComponents();
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
    	 
        TableStatus = new String[20];
        
        
        BasePanel = new JPanel();
        
        
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
    	
    	
    	Table1Label = new JLabel();
    	Table2Label = new JLabel();
    	Table3Label = new JLabel();
    	Table4Label = new JLabel();
    	Table5Label = new JLabel();
    	Table6Label = new JLabel();
    	Table7Label = new JLabel();
    	Table8Label = new JLabel();
    	Table9Label = new JLabel();
    	Table10Label = new JLabel();
    	Table11Label = new JLabel();
    	Table12Label = new JLabel();
    	Table13Label = new JLabel();
    	Table14Label = new JLabel();
    	Table15Label = new JLabel();
    	Table16Label = new JLabel();
    	Table17Label = new JLabel();
    	Table18Label = new JLabel();
    	Table19Label = new JLabel();
    	Table20Label = new JLabel();
    	
    	
    	for(int i=0;i<20;i++)
    	{
    		TableStatus[i]="                        Available";
    	}
    	
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurant Ordering System - Cashier");
        setResizable(false);
        setMinimumSize(new Dimension(800,600));
        getContentPane().setLayout(null);
        
        
        getContentPane().add(BasePanel);
        BasePanel.setLayout(null);
        BasePanel.setBounds(0,0,794,572);
        BasePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 0, 0)));
        BasePanel.setBackground(new Color(51,51,51));
              
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        BasePanel.add(Table1Button);
        BasePanel.add(Table2Button);
        BasePanel.add(Table3Button);
        BasePanel.add(Table4Button);
        BasePanel.add(Table5Button);
        BasePanel.add(Table6Button);
        BasePanel.add(Table7Button);
        BasePanel.add(Table8Button);
        BasePanel.add(Table9Button);
        BasePanel.add(Table10Button);
        BasePanel.add(Table11Button);
        BasePanel.add(Table12Button);
        BasePanel.add(Table13Button);
        BasePanel.add(Table14Button);
        BasePanel.add(Table15Button);
        BasePanel.add(Table16Button);
        BasePanel.add(Table17Button);
        BasePanel.add(Table18Button);
        BasePanel.add(Table19Button);
        BasePanel.add(Table20Button);
        
        
        BasePanel.add(Table1Label);
        BasePanel.add(Table2Label);
        BasePanel.add(Table3Label);
        BasePanel.add(Table4Label);
        BasePanel.add(Table5Label);
        BasePanel.add(Table6Label);
        BasePanel.add(Table7Label);
        BasePanel.add(Table8Label);
        BasePanel.add(Table9Label);
        BasePanel.add(Table10Label);
        BasePanel.add(Table11Label);
        BasePanel.add(Table12Label);
        BasePanel.add(Table13Label);
        BasePanel.add(Table14Label);
        BasePanel.add(Table15Label);
        BasePanel.add(Table16Label);
        BasePanel.add(Table17Label);
        BasePanel.add(Table18Label);
        BasePanel.add(Table19Label);
        BasePanel.add(Table20Label);
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Table1Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table2Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table3Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table4Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table5Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table6Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table7Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table8Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table9Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table10Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table11Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table12Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table13Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table14Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table15Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table16Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table17Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table18Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table19Label.setHorizontalAlignment(SwingConstants.CENTER);
        Table20Label.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        Table1Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table2Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table3Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table4Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table5Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table6Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table7Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table8Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table9Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table10Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table11Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table12Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table13Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table14Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table15Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table16Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table17Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table18Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table19Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table20Label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        
        
        Table1Label.setText(TableStatus[0]);
        Table2Label.setText(TableStatus[1]);
        Table3Label.setText(TableStatus[2]);
        Table4Label.setText(TableStatus[3]);
        Table5Label.setText(TableStatus[4]);
        Table6Label.setText(TableStatus[5]);
        Table7Label.setText(TableStatus[6]);
        Table8Label.setText(TableStatus[7]);
        Table9Label.setText(TableStatus[8]);
        Table10Label.setText(TableStatus[9]);
        Table11Label.setText(TableStatus[10]);
        Table12Label.setText(TableStatus[11]);
        Table13Label.setText(TableStatus[12]);
        Table14Label.setText(TableStatus[13]);
        Table15Label.setText(TableStatus[14]);
        Table16Label.setText(TableStatus[15]);
        Table17Label.setText(TableStatus[16]);
        Table18Label.setText(TableStatus[17]);
        Table19Label.setText(TableStatus[18]);
        Table20Label.setText(TableStatus[19]);
        
        
        Table1Label.setForeground(new Color(220,220,220));
        Table2Label.setForeground(new Color(220,220,220));
        Table3Label.setForeground(new Color(220,220,220));
        Table4Label.setForeground(new Color(220,220,220));
        Table5Label.setForeground(new Color(220,220,220));
        Table6Label.setForeground(new Color(220,220,220));
        Table7Label.setForeground(new Color(220,220,220));
        Table8Label.setForeground(new Color(220,220,220));
        Table9Label.setForeground(new Color(220,220,220));
        Table10Label.setForeground(new Color(220,220,220));
        Table11Label.setForeground(new Color(220,220,220));
        Table12Label.setForeground(new Color(220,220,220));
        Table13Label.setForeground(new Color(220,220,220));
        Table14Label.setForeground(new Color(220,220,220));
        Table15Label.setForeground(new Color(220,220,220));
        Table16Label.setForeground(new Color(220,220,220));
        Table17Label.setForeground(new Color(220,220,220));
        Table18Label.setForeground(new Color(220,220,220));
        Table19Label.setForeground(new Color(220,220,220));
        Table20Label.setForeground(new Color(220,220,220));
        
        
        Table1Label.setBounds(40,47,200,46);
        Table2Label.setBounds(40,97,200,46);
        Table3Label.setBounds(40,147,200,46);
        Table4Label.setBounds(40,197,200,46);
        Table5Label.setBounds(40,247,200,46);
        Table6Label.setBounds(40,297,200,46);
        Table7Label.setBounds(40,347,200,46);
        Table8Label.setBounds(40,397,200,46);
        Table9Label.setBounds(40,447,200,46);
        Table10Label.setBounds(40,497,200,46);
        Table11Label.setBounds(280,47,200,46);
        Table12Label.setBounds(280,97,200,46);
        Table13Label.setBounds(280,147,200,46);
        Table14Label.setBounds(280,197,200,46);
        Table15Label.setBounds(280,247,200,46);
        Table16Label.setBounds(280,297,200,46);
        Table17Label.setBounds(280,347,200,46);
        Table18Label.setBounds(280,397,200,46);
        Table19Label.setBounds(280,447,200,46);
        Table20Label.setBounds(280,497,200,46);
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
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
           
 /////////////////////////////////////////////////////////////////////////////////////////////////////////      
        pack();
    }
}
