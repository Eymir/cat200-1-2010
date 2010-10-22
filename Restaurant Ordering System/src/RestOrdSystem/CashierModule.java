package RestOrdSystem;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.text.*;
import java.util.*;


public class CashierModule extends JFrame {

	static public String [] TableStatus;
	static public int TableNumber; 
	
	
	static public Calendar Calender;
    static public int DayOfWeek;
    static public String Day;
    static public String Date;
    static public Date Today;
    
    
	private JTable BillTable;
	
	
	private JScrollPane BillTableScrollPane;
	
	
	private JPanel BasePanel,ButtonPanel;
	
	
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
    }
    
	
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierModule().setVisible(true);
            }
        });
    }
    
    public void date() {
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("dd-MMM-yyyy");
        Date = simpleFormatter.format(Today);
    }
    
    /**
     * 
     */
    @SuppressWarnings("serial")
	private void initComponents() {
    	 
    	Today = new Date();
        Calender = new GregorianCalendar();
    	DayOfWeek = Calender.get(Calendar.DAY_OF_WEEK);
            	
    	
        TableStatus = new String[20];
        TableNumber = 1;
        
        
        BillTableScrollPane = new JScrollPane();
        
        
        BillTable = new JTable();
        
        
        BasePanel = new JPanel();
        ButtonPanel = new JPanel();
        
        
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
    	
    	for(int i=0;i<20;i++)
    	{
    		TableStatus[i]="                        Available";
    	}  
    	
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurant Ordering System - Cashier                                                 "+Day+", "+Date);
        setResizable(false);
        setMinimumSize(new Dimension(800,600));
        getContentPane().setLayout(null);
        this.setLocationRelativeTo(null);
        
        getContentPane().add(BasePanel);
        BasePanel.setLayout(null);
        BasePanel.setBounds(0,0,798,568);
        BasePanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 0, 0)));
        BasePanel.setBackground(new Color(51,51,51));
              
////////Layout Ordering/////////////////////////////////////////////////////////////////////////////////////////////////        
        
        BasePanel.add(BillTableScrollPane);
        BasePanel.add(ButtonPanel);
        
        
        BillTableScrollPane.add(BillTable);
        
        
        ButtonPanel.add(Table1Button);
        ButtonPanel.add(Table2Button);
        ButtonPanel.add(Table3Button);
        ButtonPanel.add(Table4Button);
        ButtonPanel.add(Table5Button);
        ButtonPanel.add(Table6Button);
        ButtonPanel.add(Table7Button);
        ButtonPanel.add(Table8Button);
        ButtonPanel.add(Table9Button);
        ButtonPanel.add(Table10Button);
        ButtonPanel.add(Table11Button);
        ButtonPanel.add(Table12Button);
        ButtonPanel.add(Table13Button);
        ButtonPanel.add(Table14Button);
        ButtonPanel.add(Table15Button);
        ButtonPanel.add(Table16Button);
        ButtonPanel.add(Table17Button);
        ButtonPanel.add(Table18Button);
        ButtonPanel.add(Table19Button);
        ButtonPanel.add(Table20Button);
        
        
        ButtonPanel.add(Table1Label);
        ButtonPanel.add(Table2Label);
        ButtonPanel.add(Table3Label);
        ButtonPanel.add(Table4Label);
        ButtonPanel.add(Table5Label);
        ButtonPanel.add(Table6Label);
        ButtonPanel.add(Table7Label);
        ButtonPanel.add(Table8Label);
        ButtonPanel.add(Table9Label);
        ButtonPanel.add(Table10Label);
        ButtonPanel.add(Table11Label);
        ButtonPanel.add(Table12Label);
        ButtonPanel.add(Table13Label);
        ButtonPanel.add(Table14Label);
        ButtonPanel.add(Table15Label);
        ButtonPanel.add(Table16Label);
        ButtonPanel.add(Table17Label);
        ButtonPanel.add(Table18Label);
        ButtonPanel.add(Table19Label);
        ButtonPanel.add(Table20Label);
        
 ///////Button Panel Layout//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ButtonPanel.setLayout(null);
        ButtonPanel.setBounds(10,7,480,520);
        ButtonPanel.setBackground(new Color(51,51,51));
        ButtonPanel.setBorder(BorderFactory.createTitledBorder(null,"Table's Status",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION, new Font("Dialog", 1, 12),new Color(220,220,220)));
        
        
////////Bill Table with Scroll Pane///////////////////////////////////////////////////////////////////////////////////////////////////////
        
        BillTableScrollPane.setBounds(497,7,290,456);
        BillTable.setModel(new DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}, 
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},

                },
                new String [] {
                    "No.", "Item", "Unit", "Price"
                }
            ) {

				boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        
        BillTableScrollPane.setViewportView(BillTable);
        BillTable.getColumnModel().getColumn(0).setResizable(false);
        BillTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        BillTable.getColumnModel().getColumn(1).setResizable(false);
        BillTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        BillTable.getColumnModel().getColumn(2).setResizable(false);
        BillTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        BillTable.getColumnModel().getColumn(3).setResizable(false);
        BillTable.getColumnModel().getColumn(3).setPreferredWidth(60);
       
        BillTableScrollPane.setBackground(new Color(51,51,51));
        BillTableScrollPane.setBorder(BorderFactory.createTitledBorder(null,"Table "+TableNumber+"'s Bill",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION, new Font("Dialog", 1, 12),new Color(220,220,220)));
     
        
        
////////Table Label//////////////////////////////////////////////////////////////////////////////////////////////////////
        
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
        
        
        Table1Label.setBounds(30,17,200,46);
        Table2Label.setBounds(30,67,200,46);
        Table3Label.setBounds(30,117,200,46);
        Table4Label.setBounds(30,167,200,46);
        Table5Label.setBounds(30,217,200,46);
        Table6Label.setBounds(30,267,200,46);
        Table7Label.setBounds(30,317,200,46);
        Table8Label.setBounds(30,367,200,46);
        Table9Label.setBounds(30,417,200,46);
        Table10Label.setBounds(30,467,200,46);
        Table11Label.setBounds(270,17,200,46);
        Table12Label.setBounds(270,67,200,46);
        Table13Label.setBounds(270,117,200,46);
        Table14Label.setBounds(270,167,200,46);
        Table15Label.setBounds(270,217,200,46);
        Table16Label.setBounds(270,267,200,46);
        Table17Label.setBounds(270,317,200,46);
        Table18Label.setBounds(270,367,200,46);
        Table19Label.setBounds(270,417,200,46);
        Table20Label.setBounds(270,467,200,46);
        
////////Table Button//////////////////////////////////////////////////////////////////////////////////////////
        
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
               
        
        Table1Button.setBounds(10,20,100,40);
        Table2Button.setBounds(10,70,100,40);
        Table3Button.setBounds(10,120,100,40);
        Table4Button.setBounds(10,170,100,40);
        Table5Button.setBounds(10,220,100,40);
        Table6Button.setBounds(10,270,100,40);
        Table7Button.setBounds(10,320,100,40);
        Table8Button.setBounds(10,370,100,40);
        Table9Button.setBounds(10,420,100,40);
        Table10Button.setBounds(10,470,100,40);
        Table11Button.setBounds(250,20,100,40);
        Table12Button.setBounds(250,70,100,40);
        Table13Button.setBounds(250,120,100,40);
        Table14Button.setBounds(250,170,100,40);
        Table15Button.setBounds(250,220,100,40);
        Table16Button.setBounds(250,270,100,40);
        Table17Button.setBounds(250,320,100,40);
        Table18Button.setBounds(250,370,100,40);
        Table19Button.setBounds(250,420,100,40);
        Table20Button.setBounds(250,470,100,40);
           
 /////////////////////////////////////////////////////////////////////////////////////////////////////////      
        pack();
    }
}