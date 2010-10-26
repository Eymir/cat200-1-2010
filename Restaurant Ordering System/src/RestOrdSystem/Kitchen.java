package RestOrdSystem;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.util.Calendar;
import javax.swing.*;

public class Kitchen extends javax.swing.JFrame {

    public Kitchen() {
        initComponents();
        setTitle("Restaurant Ordering System - Kitchen                                                    "+SystemMain.getToday);
        setResizable(false);
        setLocationRelativeTo(null);
        tableview();
        btnServed.setEnabled(false);
        rdbtnPending.setEnabled(false);
        rdbtnInProgress.setEnabled(false);
        rdbtnDone.setEnabled(false);

    }//initialization
    
/*************************-Declaration And Settings-*******************************/
    
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLayeredPane jLayeredPane1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton btnServed;
    private JButton button;
    private JRadioButton rdbtnPending;
    private JRadioButton rdbtnInProgress;
    private JRadioButton rdbtnDone;
    private JLabel lblRefresh;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JPanel panel;

    private void initComponents() {
 
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setIcon(new ImageIcon(Kitchen.class.getResource("/image1/kitchen1.png")));
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
        jLabel2.setBounds(300, 30, 150, 105);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ORDER NUMBER", "Table Number", "Food", "Quantity", "Status"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(20, 189, 550, 281);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Served");
        jButton1.setBounds(40, 420, 80, -1);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 600);
        
        btnServed = new JButton("Served");
        btnServed.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		delete();
        		tableview();
            	
        	}
        });
        
        btnServed.setBounds(40, 500, 89, 23);
        jLayeredPane1.add(btnServed);
                
        rdbtnPending = new JRadioButton("Pending");
        rdbtnPending.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		status = "Pending";
        		warn();
        		tableview();
        	}
        });
        
        buttonGroup.add(rdbtnPending);
        rdbtnPending.setBounds(617, 192, 109, 23);
        jLayeredPane1.add(rdbtnPending);
                
        rdbtnInProgress = new JRadioButton("In Progress");
        rdbtnInProgress.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		status = "In Progress";
        		warn();
        		tableview();
        	}
        });
        
        buttonGroup.add(rdbtnInProgress);
        rdbtnInProgress.setBounds(617, 218, 109, 23);
        jLayeredPane1.add(rdbtnInProgress);
                
        rdbtnDone = new JRadioButton("Done");
        rdbtnDone.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		status = "Done";
        		warn();
        		tableview();
        		btnServed.setEnabled(true);
        	}
        });
        
        buttonGroup.add(rdbtnDone);
        rdbtnDone.setBounds(617, 244, 109, 23);
        jLayeredPane1.add(rdbtnDone);
        
        button = new JButton("");
        button.setBackground(Color.WHITE);
        button.setIcon(new ImageIcon(Kitchen.class.getResource("/image1/Refresh1.png")));
        button.setBounds(520, 114, 50, 50);
        jLayeredPane1.add(button);
        
        lblRefresh = new JLabel("Refresh");
        button.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(MouseEvent arg0) {
        		lblRefresh.setForeground(Color.YELLOW);
        	}
        	public void mouseExited(MouseEvent e) {
        		lblRefresh.setForeground(Color.WHITE);
        	}
        	public void mouseClicked(MouseEvent e) {
        		tableview();
        		btnServed.setEnabled(false);
                rdbtnPending.setEnabled(false);
                rdbtnInProgress.setEnabled(false);
                rdbtnDone.setEnabled(false);
        	}
        });
        lblRefresh.setForeground(Color.WHITE);
        lblRefresh.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblRefresh.setBounds(515, 165, 65, 20);
        jLayeredPane1.add(lblRefresh);
        
        panel = new JPanel(){
        	public void paintComponent(Graphics g) {
        		Time current= new Time();
              super.paintComponent(g);
              digitalclock();
              g.setFont(new Font("Tahoma", Font.BOLD, 25));
              g.setColor(Color.WHITE);
              g.drawString(current.gettime(),5,35);
               }
        	
        };
        panel.setBackground(Color.BLACK);
        panel.setBounds(605, 100, 132, 50);
        jLayeredPane1.add(panel);
        
        //myDate.getHours()+":"+myDate.getMinutes()+":"+myDate.getSeconds()
     
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(SystemColor.controlDkShadow);
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/background.png"))); 
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pack();
    }
    
/**********************************************************************************/    
    
/*************************-SQL And JTabel Settings-*******************************/
    
    Object[] confirm = {"Yes","No"};
    Object[] ok = {"ok"};
    String status;
    
    int countRow = 0;
    int countRow2 = 0;
    int countColumn = 0;
    int countColumn2 = 0;
    int count = 0;
    
    TableModel newtable1 = new TableModel();
    
    public void tableview(){
    	countRow = 0;
        countRow2 = 0;
        countColumn = 0;
        countColumn2 = 0;
        count = 0;
        
        jTable1.repaint();
        Dimension THIS_SIZE = (jLayeredPane1.getSize());
        
        jTable1.setMaximumSize(THIS_SIZE);
        jTable1.setMinimumSize(THIS_SIZE);
        jTable1.setPreferredSize(THIS_SIZE);
        
        try{
            String queryString = "Select* From KITCHENTABLE";

            SystemMain.rs = SystemMain.stmt.executeQuery(queryString);

            while (SystemMain.rs.next()){
                countRow++;
            }//get the table row count from the database

            ResultSetMetaData metadata = SystemMain.rs.getMetaData();
            countColumn = metadata.getColumnCount();

            newtable1.setDataSize(countRow, countColumn);
            newtable1.setColumnNameSize();
            //end

            //adding column names to table model
            DatabaseMetaData meta = SystemMain.con.getMetaData();
            
            	newtable1.setColumnName(0, "Order Number");
                newtable1.setColumnName(1, "Table");
                newtable1.setColumnName(2, "Food");
                newtable1.setColumnName(3, "Quantity");
                newtable1.setColumnName(4, "Status");
            
            
            count = 0;
            // end

            SystemMain.rs = SystemMain.stmt.executeQuery(queryString);
            while(SystemMain.rs.next()){
            	newtable1.addString(countRow2, countColumn2, SystemMain.rs.getString("KIT_ORD_NO"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, SystemMain.rs.getString("TABLE_NO"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, SystemMain.rs.getString("FOOD_NAME"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, SystemMain.rs.getString("FOOD_QN"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, SystemMain.rs.getString("FOOD_STATUS"));
                countColumn2++;

                countColumn2 = 0;
                countRow2++;
            }
        }

        catch (Exception e){
            System.out.println("error");
        }
        
        this.setTable();
        
        ListSelectionModel selectionModel = jTable1.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent e) {

            	status=(String) newtable1.getValueAt(jTable1.getSelectedRow(), 4);
            	if(status.equals("Done"))
                btnServed.setEnabled(true);
            	else
            	btnServed.setEnabled(false);
                rdbtnPending.setEnabled(true);
                rdbtnInProgress.setEnabled(true);
                rdbtnDone.setEnabled(true);
            
        }
        }
        );//function to get value from the table when mouse clicked on the table 
    }
    
    public void setTable(){
    	jTable1.setModel(newtable1);
    }//called the setModel function after getting all the needed information
    
    public void update(String edit){

        try {
        	SystemMain.stmt.executeUpdate(edit);

        }

        catch(Exception e){

           failMessage();

        }

    }//function to update the SQL command to the database
    
    public void warn(){
    	
    	int n = warnMessage();

        if(n == 0){
        	String no= (String) newtable1.getValueAt(jTable1.getSelectedRow(), 0);
        	String table = (String) newtable1.getValueAt(jTable1.getSelectedRow(), 1);
        	String updateString = "UPDATE KITCHENTABLE SET FOOD_STATUS='"+status+"' WHERE KIT_ORD_NO = '"+no+"' AND TABLE_NO='"+table+"'";

            update(updateString);
            btnServed.setEnabled(false);
        }
    }//function to update data from the database
    
    public void delete(){
    	
    	int n = deleteMessage();

        if(n == 0){
        
        	String no= (String) newtable1.getValueAt(jTable1.getSelectedRow(), 0);
        	String table = (String) newtable1.getValueAt(jTable1.getSelectedRow(), 1);
        	String deleteString = "DELETE FROM KITCHENTABLE WHERE KIT_ORD_NO = '"+no+"'AND TABLE_NO='"+table+"'";

            update(deleteString);
        }
    }//function to delete data from the database
    
    public int warnMessage(){
        return (JOptionPane.showOptionDialog(jLayeredPane1,
                "You are updating the table. If you confirm,please proceed.",
                "Confirmation",//title
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                confirm,
                confirm[0]));
    }//warning message when changing certain information
    
    public int deleteMessage(){
        return (JOptionPane.showOptionDialog(jLayeredPane1,
                "You are removing selected item from the table. If you continue,you will remove the item.",
                "Confirmation",//title
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                confirm,
                confirm[0]));
    }//warning message when deleting certain information
    
    public int failMessage(){
        return (JOptionPane.showOptionDialog(jLayeredPane1,
                "Action Failed.",
                "Warning",//title
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                ok,
                ok[0]));
    }//fail message when the SQL command fail to work
    
/*****************************************************************************/
    
/*********************************-Get Time-**************************************/
    
    public class Time{
    	
    	public static final String currentTime = "HH:mm:ss";
    
    public String gettime(){
    	
    	Calendar rightnow = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat(currentTime);
	    return sdf.format(rightnow.getTime());
    }
    }

    public void digitalclock()
	{
		Timer clock;
		
		clock=new Timer(1000, null);
		clock.start();
		this.repaint();
		
	}//timer to make the digital clock move
    
/**********************************************************************************/
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kitchen().setVisible(true);
            }
        });
    }

}
