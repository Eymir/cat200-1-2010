package RestOrdSystem;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class Kitchen extends javax.swing.JFrame {

    public Kitchen() {
        initComponents();
        setTitle("Kitchen");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setIcon(new ImageIcon(Kitchen.class.getResource("/image1/kitchen.jpg")));
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
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(20, 189, 550, 281);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Served");
        jButton1.setBounds(40, 420, 80, -1);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 800, 600);
        
        btnServed = new JButton("Served");
        btnServed.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		delete();
        	}
        });
        btnServed.setBounds(40, 500, 89, 23);
        jLayeredPane1.add(btnServed);
                
        rdbtnPending = new JRadioButton("Pending");
        rdbtnPending.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		warn();
        	}
        });
        buttonGroup.add(rdbtnPending);
        rdbtnPending.setBounds(617, 192, 109, 23);
        jLayeredPane1.add(rdbtnPending);
                
        rdbtnInProgress = new JRadioButton("In Progress");
        rdbtnInProgress.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		warn();
        	}
        });
        buttonGroup.add(rdbtnInProgress);
        rdbtnInProgress.setBounds(617, 218, 109, 23);
        jLayeredPane1.add(rdbtnInProgress);
                
        rdbtnDone = new JRadioButton("Done");
        rdbtnDone.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		warn();
        	}
        });
        buttonGroup.add(rdbtnDone);
        rdbtnDone.setBounds(617, 244, 109, 23);
        jLayeredPane1.add(rdbtnDone);
        
        JLabel label = new JLabel("New label");
        label.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		
        	}
        });
        label.setIcon(new ImageIcon(Kitchen.class.getResource("/image1/Symbol Black Refresh.jpg")));
        label.setBounds(520, 128, 50, 50);
        jLayeredPane1.add(label);
        jLabel1 = new javax.swing.JLabel();
                
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/background.png"))); 
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pack();
    }
    
    Object[] confirm = {"Yes","No"};
    Object[] ok = {"ok"};
    TableModel newtable1 = new TableModel();
    
    public void setTable(){
    	jTable1.setModel(newtable1);
    }
    
    public void update(String edit){

        try {
            //DriverManager.registerDriver (new oracle.jdbc.OracleDriver());

            Connection con;
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hihi", "hihi");
            System.out.println("Database Connected1");

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
        
        	
        }
    }
    
    public void delete(){
    	
    	int n = deleteMessage();

        if(n == 0){
        
        	
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
    private final ButtonGroup buttonGroup = new ButtonGroup();
}
