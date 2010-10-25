package RestOrdSystem;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.Timer;
import javax.swing.JPanel;

public class Kitchen extends javax.swing.JFrame {
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date myDate=new Date();
	Timer timer;
	private long hr;//=myDate.getHours();
	private long min;//=myDate.getMinutes();
	private long sec;//=myDate.getSeconds();
	
    public Kitchen() {
        initComponents();
        setTitle("Restaurant Ordering System - Kitchen                                                    "+dateFormat.format(myDate));
        setResizable(false);
        setLocationRelativeTo(null);
        tableview();
        btnServed.setEnabled(false);
        rdbtnPending.setEnabled(false);
        rdbtnInProgress.setEnabled(false);
        rdbtnDone.setEnabled(false);
//        timer = new Timer(500, task);
 //       timer.start();
  //      timer.stop();
   //     timer = new Kitchen.TimeLabelTimer( );
      //  timer.start( );
       // timer.stop();
    }

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
                "Table Number", "Food", "Quantity", "Status"
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
        
        JButton button = new JButton("");
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
        
        label = new JLabel("New label");
        label.setForeground(SystemColor.inactiveCaptionBorder);
        label.setFont(new Font("Tahoma", Font.BOLD, 26));
        label.setBounds(610, 75, 120, 65);
        jLayeredPane1.add(label);
        //timer.setActionCommand(hr);
        label.setText(myDate.getHours()+":"+myDate.getMinutes()+":"+myDate.getSeconds());
        //label.setText(hr+":"+min+":"+sec);
        
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
        	DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
        	
            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hihi", "hihi");
           // con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
            System.out.println("Database Connected");
        	
        	Statement stmt = con.createStatement();

            String queryString = "Select* From KITCHENTABLE";

            ResultSet rset = stmt.executeQuery(queryString);

            while (rset.next()){
                countRow++;
            }

            ResultSetMetaData metadata = rset.getMetaData();
            countColumn = metadata.getColumnCount();

            newtable1.setDataSize(countRow, countColumn);
            newtable1.setColumnNameSize();
            //end

            //adding column names to table model
            DatabaseMetaData meta = con.getMetaData();

            ResultSet rset2 = meta.getColumns(null, null, "KITCHENTABLE", null);
            
            	newtable1.setColumnName(0, "Order Number");
                newtable1.setColumnName(1, "Table");
                newtable1.setColumnName(2, "Food");
                newtable1.setColumnName(3, "Quantity");
                newtable1.setColumnName(4, "Status");
            
            
            count = 0;
            // end

            rset = stmt.executeQuery(queryString);
            while(rset.next()){
            	newtable1.addString(countRow2, countColumn2, rset.getString("KIT_ORD_NO"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, rset.getString("TABLE_NO"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, rset.getString("FOOD_NAME"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, rset.getString("FOOD_QN"));
                countColumn2++;
                newtable1.addString(countRow2, countColumn2, rset.getString("FOOD_STATUS"));
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
        ); 
    }
    
    public void setTable(){
    	jTable1.setModel(newtable1);
    }
    
    public void update(String edit){

        try {
            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());

            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hihi", "hihi");
           // con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
            System.out.println("Database Connected 1");

            Statement stmt = con.createStatement();
            System.out.println("success2");
            stmt.executeUpdate(edit);
            System.out.println("success3");
        }

        catch(Exception e){

           failMessage();

        }

    }
    
    public void warn(){
    	
    	int n = warnMessage();

        if(n == 0){
        	String no= (String) newtable1.getValueAt(jTable1.getSelectedRow(), 0);
        	String table = (String) newtable1.getValueAt(jTable1.getSelectedRow(), 1);
        	String updateString = "UPDATE KITCHENTABLE SET FOOD_STATUS='"+status+"' WHERE KIT_ORD_NO = '"+no+"' AND TABLE_NO='"+table+"'";

            update(updateString);
            btnServed.setEnabled(false);
        }
    }
    
    public void delete(){
    	
    	int n = deleteMessage();

        if(n == 0){
        
        	String no= (String) newtable1.getValueAt(jTable1.getSelectedRow(), 0);
        	String table = (String) newtable1.getValueAt(jTable1.getSelectedRow(), 1);
        	String deleteString = "DELETE FROM KITCHENTABLE WHERE KIT_ORD_NO = '"+no+"'AND TABLE_NO='"+table+"'";

            update(deleteString);
        }
    }
    
    public int warnMessage(){
        return (JOptionPane.showOptionDialog(jLayeredPane1,
                "You are updating the table. If you confirm,please proceed.",
                "Confirmation",//title
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                confirm,
                confirm[0]));
    }
    
    public int deleteMessage(){
        return (JOptionPane.showOptionDialog(jLayeredPane1,
                "You are removing selected item from the table. If you continue,you will remove the item.",
                "Confirmation",//title
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                confirm,
                confirm[0]));
    }
    
    public int failMessage(){
        return (JOptionPane.showOptionDialog(jLayeredPane1,
                "Action Failed.",
                "Warning",//title
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                ok,
                ok[0]));
    }
/*    private       TimeZone         defaultTimeZone = null;
    private       Calendar         calendar        = null;
    private class TimeLabelTimer extends Timer implements ActionListener
    {
        private final String           TIME_FORMAT     = " HH:mm:ss ";
        private       SimpleDateFormat timeFormat      = null;

        TimeLabelTimer( )
        {
            
            super(1000, null);  
            addActionListener(this);

            timeFormat      = new SimpleDateFormat(TIME_FORMAT);
            timeFormat.setTimeZone(defaultTimeZone);
        }
        public void actionPerformed(ActionEvent e)
        {
            calendar = Calendar.getInstance(defaultTimeZone);
            label.setText(timeFormat.format(calendar.getTime( )));
        }
    }*/

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kitchen().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private JButton btnServed;
    private JRadioButton rdbtnPending;
    private JRadioButton rdbtnInProgress;
    private JRadioButton rdbtnDone;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JLabel label;
    private final ButtonGroup buttonGroup = new ButtonGroup();
}
