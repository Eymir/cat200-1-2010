package RestOrdSystem;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.text.*;
import java.util.*;

public class CashierModule extends JFrame {

	static public String [] TableStatus = new String[20];
	
	static public String Available="                    Available";
	static public String Seated="                   Seated";
	static public String Billing="                       Billing";
	static public int TableNumber; 
	static public Color [] TableStatusColor;
	
    static private String SQL;
    
    static private int No,NumberOfItemOrdered,TableReceiptNumber;
    static private double TotalPrice;
    static private Vector Title,BillDetails,BillDetailsRow;
    static private DecimalFormat df = new DecimalFormat("0.00");
   
   
    
    
    static private JTable BillTable;
	
	
	static private JScrollPane BillTableScrollPane;
	
	
	static private JPanel BasePanel,ButtonPanel,InstructionPanel,TotalPricePanel;
	
	
	static private JToggleButton Table1Button,Table2Button,Table3Button,Table4Button,Table5Button,
						  Table6Button,Table7Button,Table8Button,Table9Button,Table10Button,
						  Table11Button,Table12Button,Table13Button,Table14Button,Table15Button,
						  Table16Button,Table17Button,Table18Button,Table19Button,Table20Button;
	
	
	static private JButton ConfirmPrint;
	
	
	static private JLabel Table1Label,Table2Label,Table3Label,Table4Label,Table5Label,
				   Table6Label,Table7Label,Table8Label,Table9Label,Table10Label,
   				   Table11Label,Table12Label,Table13Label,Table14Label,Table15Label,
   				   Table16Label,Table17Label,Table18Label,Table19Label,Table20Label;
	
    
	static private JPanel RedBox,BlueBox,GreenBox;
	static private JLabel AvailableLabel,SeatedLabel,BillingLabel;
		
	
	static private JLabel TotalLabel, TotalPriceLabel;
	
	
	public CashierModule() {
       initComponents();
       initTableStatus();
       Available="                    Available";
   		Seated="                   Seated";
   		Billing="                       Billing";
    }
    
	
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierModule().setVisible(true);
            }
        });
    }
    

    
    
    static public void setTableStatusColor(){
        for(int i=0;i<20;i++){
        	if(TableStatus[i]==Available){
        		TableStatusColor[i]=new Color(20,255,20);
        	} 
        	else if(TableStatus[i]==Seated){
        		TableStatusColor[i]=new Color(20,255,255);
        	}
        	else if(TableStatus[i]==Billing){
        		TableStatusColor[i]=new Color(255,0,0);
        	}
    	}
    }
  
    
    static public void initTableStatus(){
    	for(int i=0;i<20;i++){
        	TableStatus[i]=Available;
        	} 
    }
    
    
    public static void refresh(){

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
        
        setTableStatusColor();
        
        Table1Label.setForeground(TableStatusColor[0]);
        Table2Label.setForeground(TableStatusColor[1]);
        Table3Label.setForeground(TableStatusColor[2]);
        Table4Label.setForeground(TableStatusColor[3]);
        Table5Label.setForeground(TableStatusColor[4]);
        Table6Label.setForeground(TableStatusColor[5]);
        Table7Label.setForeground(TableStatusColor[6]);
        Table8Label.setForeground(TableStatusColor[7]);
        Table9Label.setForeground(TableStatusColor[8]);
        Table10Label.setForeground(TableStatusColor[9]);
        Table11Label.setForeground(TableStatusColor[10]);
        Table12Label.setForeground(TableStatusColor[11]);
        Table13Label.setForeground(TableStatusColor[12]);
        Table14Label.setForeground(TableStatusColor[13]);
        Table15Label.setForeground(TableStatusColor[14]);
        Table16Label.setForeground(TableStatusColor[15]);
        Table17Label.setForeground(TableStatusColor[16]);
        Table18Label.setForeground(TableStatusColor[17]);
        Table19Label.setForeground(TableStatusColor[18]);
        Table20Label.setForeground(TableStatusColor[19]);
        
    	BillTableScrollPane.setBorder(BorderFactory.createTitledBorder(null,"Table "+TableNumber+"'s Bill",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION, new Font("Dialog", 1, 12),new Color(220,220,220)));
    	
    	SetBillTableDataOutputAndTotalPrice();
    	
        if(TableStatus[TableNumber-1]!=Billing)
            ConfirmPrint.setEnabled(false);
        else if(TableStatus[TableNumber-1]==Billing)
        	ConfirmPrint.setEnabled(true);
    }
    
    private void initComponents() {
    	
    	
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch (ClassNotFoundException e) {}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
		catch (UnsupportedLookAndFeelException e) {}
	        	
    	
        
        TableStatusColor = new Color[20];
        TableNumber = 1;
        
        
        BillTableScrollPane = new JScrollPane();
        
        
        BillTable = new JTable();
        
        
        Title = new Vector<String>();
        BillDetails = new Vector();
        BillDetailsRow = new Vector();
        
        BasePanel = new JPanel();
        ButtonPanel = new JPanel();
        InstructionPanel = new JPanel();
        TotalPricePanel = new JPanel();
        
        
        RedBox = new JPanel();
        BlueBox = new JPanel();
        GreenBox = new JPanel();
        AvailableLabel = new JLabel();
        SeatedLabel = new JLabel();
        BillingLabel = new JLabel();
        
        
        ConfirmPrint = new JButton();
        
        
        TotalLabel = new JLabel();
        TotalPriceLabel = new JLabel();
        

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
    	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Title.addElement("No.");
        Title.addElement("              Item");
        Title.addElement("Unit");
        Title.addElement("  Price");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Restaurant Ordering System - Cashier                                                    "+SystemMain.getToday);
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
        BasePanel.add(InstructionPanel);
        
        
        BasePanel.add(ConfirmPrint);
        
        
        BasePanel.add(TotalLabel);
        BasePanel.add(TotalPricePanel);
        
        
        BillTableScrollPane.add(BillTable);
        
        
        InstructionPanel.add(RedBox);
        InstructionPanel.add(BlueBox);
        InstructionPanel.add(GreenBox);
        InstructionPanel.add(AvailableLabel);
        InstructionPanel.add(SeatedLabel);
        InstructionPanel.add(BillingLabel);
        
        
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
        
///////Total Price Label//////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        TotalPricePanel.add(TotalPriceLabel);
        TotalPricePanel.setLayout(null);
        
        TotalLabel.setBounds(610,494,70,25);
        TotalLabel.setFont(new Font("Dialog", 1, 16));
        TotalPricePanel.setBounds(685,495,100,25);
        TotalPricePanel.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102),2));
        
        TotalLabel.setForeground(new Color(220,220,220));
        TotalPriceLabel.setForeground(new Color(51,51,51));
        TotalPriceLabel.setBounds(0,-1,100,25);
        TotalPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalPriceLabel.setText("RM 0");
        
        TotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalLabel.setText("Total :");
        
///////Instruction Panel//////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        InstructionPanel.setBounds(10,533,480,23);
        InstructionPanel.setLayout(null);
        InstructionPanel.setBackground(new Color(51,51,51));
        
        GreenBox.setBounds(7,2,15,15);
        BlueBox.setBounds(106,2,15,15);
        RedBox.setBounds(194,2,15,15);
        
        GreenBox.setBackground(new Color(20,255,20));
        BlueBox.setBackground(new Color(20,255,255));
        RedBox.setBackground(new Color(255,20,20));
        
        GreenBox.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102),2));
        BlueBox.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102),2));
        RedBox.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102),2));
        
        AvailableLabel.setBounds(30,0,150,18);
        SeatedLabel.setBounds(128,0,150,18);
        BillingLabel.setBounds(217,0,150,18);
        
        AvailableLabel.setText("Available");
        SeatedLabel.setText("Seated");
        BillingLabel.setText("Billing");
        
        AvailableLabel.setForeground(new Color(220,220,220));
        SeatedLabel.setForeground(new Color(220,220,220));
        BillingLabel.setForeground(new Color(220,220,220));
        
        AvailableLabel.setFont(new Font("Dialog", 1, 12));
        SeatedLabel.setFont(new Font("Dialog", 1, 12));
        BillingLabel.setFont(new Font("Dialog", 1, 12));
        
        
///////Button Panel Layout//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ButtonPanel.setLayout(null);
        ButtonPanel.setBounds(10,7,480,523);
        ButtonPanel.setBackground(new Color(51,51,51));
        ButtonPanel.setBorder(BorderFactory.createTitledBorder(null,"Table's Status",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION, new Font("Dialog", 1, 12),new Color(220,220,220)));
        
        
////////Bill Table with Scroll Pane///////////////////////////////////////////////////////////////////////////////////////////////////////
        
        BillTableScrollPane.setBounds(497,7,290,479);
        BillTable.setEnabled(false);
        BillTable.getTableHeader().setReorderingAllowed(false);
        
        BillTableScrollPane.setBackground(new Color(51,51,51));
        BillTableScrollPane.setBorder(BorderFactory.createTitledBorder(null,"Table "+TableNumber+"'s Bill",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION, new Font("Dialog", 1, 12),new Color(220,220,220)));
             
////////Confirm & Print Button and Function//////////////////////////////////////////////////////////////////////////////
        
        ConfirmPrint.setBounds(499,530,286,25);
        ConfirmPrint.setText("Confirm & Print Bill");
        
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
        
        
        Table1Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table2Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table3Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table4Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table5Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table6Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table7Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table8Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table9Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table10Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table11Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table12Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table13Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table14Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table15Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table16Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table17Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table18Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table19Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        Table20Label.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        
        

        
        
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
        
        setTableStatusColor();
        
        
        Table1Label.setForeground(TableStatusColor[0]);
        Table2Label.setForeground(TableStatusColor[1]);
        Table3Label.setForeground(TableStatusColor[2]);
        Table4Label.setForeground(TableStatusColor[3]);
        Table5Label.setForeground(TableStatusColor[4]);
        Table6Label.setForeground(TableStatusColor[5]);
        Table7Label.setForeground(TableStatusColor[6]);
        Table8Label.setForeground(TableStatusColor[7]);
        Table9Label.setForeground(TableStatusColor[8]);
        Table10Label.setForeground(TableStatusColor[9]);
        Table11Label.setForeground(TableStatusColor[10]);
        Table12Label.setForeground(TableStatusColor[11]);
        Table13Label.setForeground(TableStatusColor[12]);
        Table14Label.setForeground(TableStatusColor[13]);
        Table15Label.setForeground(TableStatusColor[14]);
        Table16Label.setForeground(TableStatusColor[15]);
        Table17Label.setForeground(TableStatusColor[16]);
        Table18Label.setForeground(TableStatusColor[17]);
        Table19Label.setForeground(TableStatusColor[18]);
        Table20Label.setForeground(TableStatusColor[19]);
        
        
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
                     
        
        Table1Label.setFont(new Font("Dialog", 1, 12));
        Table2Label.setFont(new Font("Dialog", 1, 12));
        Table3Label.setFont(new Font("Dialog", 1, 12));
        Table4Label.setFont(new Font("Dialog", 1, 12));
        Table5Label.setFont(new Font("Dialog", 1, 12));
        Table6Label.setFont(new Font("Dialog", 1, 12));
        Table7Label.setFont(new Font("Dialog", 1, 12));
        Table8Label.setFont(new Font("Dialog", 1, 12));
        Table9Label.setFont(new Font("Dialog", 1, 12));
        Table10Label.setFont(new Font("Dialog", 1, 12));
        Table11Label.setFont(new Font("Dialog", 1, 12));
        Table12Label.setFont(new Font("Dialog", 1, 12));
        Table13Label.setFont(new Font("Dialog", 1, 12));
        Table14Label.setFont(new Font("Dialog", 1, 12));
        Table15Label.setFont(new Font("Dialog", 1, 12));
        Table16Label.setFont(new Font("Dialog", 1, 12));
        Table17Label.setFont(new Font("Dialog", 1, 12));
        Table18Label.setFont(new Font("Dialog", 1, 12));
        Table19Label.setFont(new Font("Dialog", 1, 12));
        Table20Label.setFont(new Font("Dialog", 1, 12));
        
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
               
        
        Table1Button.setFont(new Font("Dialog", 1, 13));
        Table2Button.setFont(new Font("Dialog", 1, 13));
        Table3Button.setFont(new Font("Dialog", 1, 13));
        Table4Button.setFont(new Font("Dialog", 1, 13));
        Table5Button.setFont(new Font("Dialog", 1, 13));
        Table6Button.setFont(new Font("Dialog", 1, 13));
        Table7Button.setFont(new Font("Dialog", 1, 13));
        Table8Button.setFont(new Font("Dialog", 1, 13));
        Table9Button.setFont(new Font("Dialog", 1, 13));
        Table10Button.setFont(new Font("Dialog", 1, 13));
        Table11Button.setFont(new Font("Dialog", 1, 13));
        Table12Button.setFont(new Font("Dialog", 1, 13));
        Table13Button.setFont(new Font("Dialog", 1, 13));
        Table14Button.setFont(new Font("Dialog", 1, 13));
        Table15Button.setFont(new Font("Dialog", 1, 13));
        Table16Button.setFont(new Font("Dialog", 1, 13));
        Table17Button.setFont(new Font("Dialog", 1, 13));
        Table18Button.setFont(new Font("Dialog", 1, 13));
        Table19Button.setFont(new Font("Dialog", 1, 13));
        Table20Button.setFont(new Font("Dialog", 1, 13));
        
        
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
        
        Table1Button.setSelected(true);
        
        SetBillTableDataOutputAndTotalPrice();
        
        Table1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table1ButtonActionPerformed(evt);
            }
        });
        Table2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table2ButtonActionPerformed(evt);
            }
        });
        Table3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table3ButtonActionPerformed(evt);
            }
        });
        Table4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table4ButtonActionPerformed(evt);
            }
        });
        Table5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table5ButtonActionPerformed(evt);
            }
        });
        Table6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table6ButtonActionPerformed(evt);
            }
        });
        Table7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table7ButtonActionPerformed(evt);
            }
        });
        Table8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table8ButtonActionPerformed(evt);
            }
        });
        Table9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table9ButtonActionPerformed(evt);
            }
        });
        Table10Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table10ButtonActionPerformed(evt);
            }
        });
        Table11Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table11ButtonActionPerformed(evt);
            }
        });
        Table12Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table12ButtonActionPerformed(evt);
            }
        });
        Table13Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table13ButtonActionPerformed(evt);
            }
        });
        Table14Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table14ButtonActionPerformed(evt);
            }
        });
        Table15Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table15ButtonActionPerformed(evt);
            }
        });
        Table16Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table16ButtonActionPerformed(evt);
            }
        });
        Table17Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table17ButtonActionPerformed(evt);
            }
        });
        Table18Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table18ButtonActionPerformed(evt);
            }
        });
        Table19Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table19ButtonActionPerformed(evt);
            }
        });
        Table20Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	Table20ButtonActionPerformed(evt);
            }
        });
        
        
        ConfirmPrint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	ConfirmPrintButtonActionPerformed(evt);
            }
        });
        if(TableStatus[TableNumber]!=Billing)
            ConfirmPrint.setEnabled(false);
 /////////////////////////////////////////////////////////////////////////////////////////////////////////      
        pack();
    }
    
 //////Table Button Function//////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void Table1ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(true);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=1;
    	refresh();
    };
    
    public void Table2ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(true);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=2;
    	refresh();
    };
    
    public void Table3ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(true);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=3;
    	refresh();
    };
    
    public void Table4ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(true);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=4;
    	refresh();
    };
    
    public void Table5ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(true);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=5;
    	refresh();
    };
    
    public void Table6ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(true);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=6;
    	refresh();
    };
    
    public void Table7ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(true);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=7;
    	refresh();
    };
    
    public void Table8ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(true);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=8;
    	refresh();
    };
    
    public void Table9ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(true);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=9;
    	refresh();
    };
    
    public void Table10ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(true);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=10;
    	refresh();
    };
    
    public void Table11ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(true);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=11;
    	refresh();
    };
    
    public void Table12ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(true);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=12;
    	refresh();
    };
    
    public void Table13ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(true);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=13;
    	refresh();
    };
    
    public void Table14ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(true);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=14;
    	refresh();
    };
    
    public void Table15ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(true);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=15;
    	refresh();
    };
    
    public void Table16ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(true);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=16;
    	refresh();
    };
    
    public void Table17ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(true);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=17;
    	refresh();
    };
    
    public void Table18ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(true);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(false);
    	TableNumber=18;
    	refresh();
    };
    
    public void Table19ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(true);
    	Table20Button.setSelected(false);
    	TableNumber=19;
    	refresh();
    };
    
    public void Table20ButtonActionPerformed(ActionEvent evt){
    	Table1Button.setSelected(false);
    	Table2Button.setSelected(false);
    	Table3Button.setSelected(false);
    	Table4Button.setSelected(false);
    	Table5Button.setSelected(false);
    	Table6Button.setSelected(false);
    	Table7Button.setSelected(false);
    	Table8Button.setSelected(false);
    	Table9Button.setSelected(false);
    	Table10Button.setSelected(false);
    	Table11Button.setSelected(false);
    	Table12Button.setSelected(false);
    	Table13Button.setSelected(false);
    	Table14Button.setSelected(false);
    	Table15Button.setSelected(false);
    	Table16Button.setSelected(false);
    	Table17Button.setSelected(false);
    	Table18Button.setSelected(false);
    	Table19Button.setSelected(false);
    	Table20Button.setSelected(true);
    	TableNumber=20;
    	refresh();
    };
    
    Object[] confirm = {"Confirm & Print","Cancel"};
    String TPrice;
    
    /////////////////confirm print button//////////////////////
    public void ConfirmPrintButtonActionPerformed(ActionEvent evt){

    	int n = Confirmation();
    	
    	if (n==0)
    	{
    		TableStatus[TableNumber-1]=Available;
    		    		
    	
    	
    	if (TableNumber==1) { Table.Button1.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField1.getText(); }
        if (TableNumber==2) { Table.Button2.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField2.getText(); }
         if (TableNumber==3) { Table.Button3.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField3.getText(); }
         if (TableNumber==4) { Table.Button4.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField4.getText(); }
         if (TableNumber==5) { Table.Button5.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField5.getText(); }
         if (TableNumber==6) { Table.Button6.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField6.getText(); }
         if (TableNumber==7) { Table.Button7.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField7.getText(); }
         if (TableNumber==8) { Table.Button8.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField8.getText(); }
         if (TableNumber==9) { Table.Button9.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField9.getText(); }
         if (TableNumber==10) { Table.Button10.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField10.getText(); }
         if (TableNumber==11) { Table.Button11.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField11.getText(); }
         if (TableNumber==12) { Table.Button12.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField12.getText(); }
         if (TableNumber==13) { Table.Button13.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField13.getText(); }
         if (TableNumber==14) { Table.Button14.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField14.getText(); }
         if (TableNumber==15) { Table.Button15.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField15.getText(); }
         if (TableNumber==16) { Table.Button16.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField16.getText(); }
         if (TableNumber==17) { Table.Button17.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField17.getText(); }
         if (TableNumber==18) { Table.Button18.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField18.getText(); }
         if (TableNumber==19) { Table.Button19.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField19.getText(); }
         if (TableNumber==20) { Table.Button20.setEnabled(true); TPrice = CustomerMenu.totalPriceJTextField20.getText(); }
    	
       //////////////////////update total price charged into oracle////////////////////////////////////
         try {
        	 SystemMain.rs = SystemMain.stmt.executeQuery("UPDATE RECEIPTTABLE " +
             		"SET PRICE_CHARGED = " + TPrice + " " +
             		"WHERE RECEIPT_NO = (SELECT MAX(RECEIPT_NO) FROM RECEIPTTABLE WHERE TABLE_NO = "+ Integer.toString(TableNumber) +")");
         }
         catch (SQLException e) {
             System.err.println("update total price charged failed : " + e.getMessage());
         }
         
    	refresh();
    	}
    }
    
    //////////////////////////////////No./////////////////////////////
    static private int NoIncrement()
    {
        ++No;
        return new Integer(No);
    }
    
    ///////////////set Bill table///////////////////////////
    @SuppressWarnings("unchecked")
	static public void SetBillTableDataOutputAndTotalPrice(){
    	
    	if(TableStatus[TableNumber-1]==Seated || TableStatus[TableNumber-1]== Billing){
    	No=0;
    	BillDetailsRow.clear();
    	BillDetails.clear();
    	
    	//////////////////////get current table receopt number/////////////////////////////
    	try {
            SQL = "SELECT MAX(RECEIPT_NO) FROM RECEIPTTABLE WHERE TABLE_NO = '"+TableNumber+"'";
            SystemMain.rs = SystemMain.stmt.executeQuery(SQL);
            SystemMain.rs.first();
            TableReceiptNumber = SystemMain.rs.getInt(1);
        } catch (Exception e) {
        	System.out.println("data retrieval failed...");
        }
        
        /////////////////get number of food ordered accoring to the receipt number above////////////////////////////////
    	try {
            SQL = "SELECT COUNT(DISTINCT ORD_FOOD_NAME) FROM ORDERTABLE WHERE RECEIPT_NO = '"+TableReceiptNumber+"'";
            SystemMain.rs = SystemMain.stmt.executeQuery(SQL);
            SystemMain.rs.first();
            NumberOfItemOrdered = SystemMain.rs.getInt(1);
        } catch (Exception e) {
        	System.out.println("data retrieval failed...");
        }
    	
        //////////////get data from the database and set it into column and row vector/////////////////////////////////////////
    	try {
            SQL = "SELECT ORD_FOOD_NAME,SUM(ORD_FOOD_QN), FOOD_PRICE FROM ORDERTABLE,FOODTABLE WHERE RECEIPT_NO = '"+TableReceiptNumber+"' AND ORDERTABLE.ORD_FOOD_NAME = FOODTABLE.FOOD_NAME GROUP BY ORDERTABLE.ORD_FOOD_NAME,FOODTABLE.FOOD_PRICE";
            SystemMain.rs = SystemMain.stmt.executeQuery(SQL);
            for(int x=1;x<=NumberOfItemOrdered;x++){
            	SystemMain.rs.next();
            	BillDetailsRow = new Vector();
            	BillDetailsRow.addElement("  "+NoIncrement());
            	BillDetailsRow.addElement(SystemMain.rs.getString(1));
            	BillDetailsRow.addElement("   "+SystemMain.rs.getInt(2));
            	BillDetailsRow.addElement("  "+df.format(SystemMain.rs.getDouble(3)*SystemMain.rs.getInt(2)));
            	BillDetails.addElement(BillDetailsRow);   	 	
            	
            	TotalPrice = TotalPrice + SystemMain.rs.getDouble(3)*SystemMain.rs.getInt(2);
            	
            }
            TotalPriceLabel.setText("RM "+df.format(TotalPrice));
            TotalPrice=0;
        } catch (Exception e) {
        	System.out.println("data retrieval failed...");
        }
    	}
        //////////////////////////////////////////////////////////////

    	else{
    		BillDetails.clear();
    	}
    	
    	/////////////////////////////////////////set up the table//////////////////////////////////////////
    	@SuppressWarnings("serial")
		DefaultTableModel model = new DefaultTableModel(BillDetails,Title){

			boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };      
        BillTable.setModel(model); 
        BillTableScrollPane.setViewportView(BillTable);
        BillTable.getColumnModel().getColumn(0).setResizable(false);
        BillTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        BillTable.getColumnModel().getColumn(1).setResizable(false);
        BillTable.getColumnModel().getColumn(1).setPreferredWidth(157);
        BillTable.getColumnModel().getColumn(2).setResizable(false);
        BillTable.getColumnModel().getColumn(2).setPreferredWidth(35);
        BillTable.getColumnModel().getColumn(3).setResizable(false);
        BillTable.getColumnModel().getColumn(3).setPreferredWidth(58);
    	    		
    }
   
    ////message box for confirm & print button///////////////////////////////////////////////////
    
	public int Confirmation(){
    	return(JOptionPane.showOptionDialog(BasePanel,
                "Confirm and Print Table "+TableNumber+"'s Bill?",
                "Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                confirm,
                confirm[0]));
    	}


}


	

