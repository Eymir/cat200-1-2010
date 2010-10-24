package RestOrdSystem;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.sql.*;

import javax.swing.GroupLayout.Alignment;


public class Table extends JFrame {
	
	public Table() {
		initComponents();
	}
	
	static CustomerMenu csMenu1;
	static CustomerMenu csMenu2;
	static CustomerMenu csMenu3;
	static CustomerMenu csMenu4;
	static CustomerMenu csMenu5;
	static CustomerMenu csMenu6;
	static CustomerMenu csMenu7;
	static CustomerMenu csMenu8;
	static CustomerMenu csMenu9;
	static CustomerMenu csMenu10;
	static CustomerMenu csMenu11;
	static CustomerMenu csMenu12;
	static CustomerMenu csMenu13;
	static CustomerMenu csMenu14;
	static CustomerMenu csMenu15;
	static CustomerMenu csMenu16;
	static CustomerMenu csMenu17;
	static CustomerMenu csMenu18;
	static CustomerMenu csMenu19;
	static CustomerMenu csMenu20;
	
	
    private JPanel jPanel1;
    private JSeparator jSeparator1;
    private JLabel restaurantJLabel;
    private JLabel promotionJLabel;
    private JLabel selectTableJLabel;
    protected static JButton Button1;
    protected static JButton Button2;
    protected static JButton Button3;
    protected static JButton Button4;
    protected static JButton Button5;
    protected static JButton Button6;
    protected static JButton Button7;
    protected static JButton Button8;
    protected static JButton Button9;
    protected static JButton Button10;
    protected static JButton Button11;
    protected static JButton Button12;
    protected static JButton Button13;
    protected static JButton Button14;
    protected static JButton Button15;
    protected static JButton Button16;
    protected static JButton Button17;
    protected static JButton Button18;
    protected static JButton Button19;
    protected static JButton Button20;
//    private JButton okButton;
//    private JButton cancelButton;
    
    
    
    private void initComponents() {
    	
    	CashierModule.initTableStatus();
    	
    	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    	setTitle("Restaurant Ordering System - Table Menu");
    	setMinimumSize(new Dimension(800, 500));
    	setResizable(false);
    	getContentPane().setLayout(null);
    	setLocationRelativeTo(null);

        jPanel1 = new JPanel();
        jSeparator1 = new JSeparator();
        Button1 = new JButton();
        Button4 = new JButton();
        Button3 = new JButton();
        Button8 = new JButton();
        Button9 = new JButton();
        Button5 = new JButton();
        Button18 = new JButton();
        Button2 = new JButton();
        Button6 = new JButton();
        Button7 = new JButton();
        Button13 = new JButton();
        Button14 = new JButton();
        Button15 = new JButton();
        Button17 = new JButton();
        Button12 = new JButton();
        Button11 = new JButton();
        Button16 = new JButton();
        Button19 = new JButton();
        Button20 = new JButton();
        Button10 = new JButton();
        selectTableJLabel = new JLabel();
        promotionJLabel = new JLabel();
        restaurantJLabel = new JLabel();
//        okButton = new JButton();
//        cancelButton = new JButton();

        

        jPanel1.setBackground(new Color(204, 204, 204));
        jPanel1.setPreferredSize(new Dimension(800, 480));
        jPanel1.setLayout(null);
        
        jSeparator1.setOrientation(SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(371, 0, 2, 480);
        
        restaurantJLabel.setFont(new Font("Tempus Sans ITC", 1, 18));
        restaurantJLabel.setForeground(new Color(255, 0, 51));
        restaurantJLabel.setText("            FOOD RESTAURENT");
        restaurantJLabel.setBorder(BorderFactory.createCompoundBorder(new SoftBevelBorder(BevelBorder.RAISED), BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        jPanel1.add(restaurantJLabel);
        restaurantJLabel.setBounds(0, 10, 370, 30);
        
        promotionJLabel.setText("Promotion");
        jPanel1.add(promotionJLabel);
        promotionJLabel.setBounds(50, 130, 260, 200);

        selectTableJLabel.setFont(new Font("Goudy Old Style", 1, 24));
        selectTableJLabel.setForeground(new Color(255, 0, 0));
        selectTableJLabel.setText("                 Please select your table");
        selectTableJLabel.setBorder(BorderFactory.createCompoundBorder(new SoftBevelBorder(BevelBorder.RAISED), BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        jPanel1.add(selectTableJLabel);
        selectTableJLabel.setBounds(370, 10, 414, 30);

        Button1.setIcon(new ImageIcon(getClass().getResource("/image1/table1.jpg")));
        Button1.setBorder(null);
        Button1.setBorderPainted(false);
        Button1.setContentAreaFilled(false);
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        jPanel1.add(Button1);
        Button1.setBounds(390, 50, 71, 61);

        Button2.setIcon(new ImageIcon(getClass().getResource("/image1/table2.jpg")));
        Button2.setBorder(null);
        Button2.setBorderPainted(false);
        Button2.setContentAreaFilled(false);
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        jPanel1.add(Button2);
        Button2.setBounds(490, 50, 71, 61);
        
        Button3.setIcon(new ImageIcon(getClass().getResource("/image1/table3.jpg")));
        Button3.setBorder(null);
        Button3.setBorderPainted(false);
        Button3.setContentAreaFilled(false);
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        jPanel1.add(Button3);
        Button3.setBounds(580, 50, 71, 61);
        
        Button4.setIcon(new ImageIcon(getClass().getResource("/image1/table4.jpg")));
        Button4.setBorder(null);
        Button4.setBorderPainted(false);
        Button4.setContentAreaFilled(false);
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        jPanel1.add(Button4);
        Button4.setBounds(680, 50, 71, 61);
        
        Button5.setIcon(new ImageIcon(getClass().getResource("/image1/table5.jpg")));
        Button5.setBorder(null);
        Button5.setBorderPainted(false);
        Button5.setContentAreaFilled(false);
        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        jPanel1.add(Button5);
        Button5.setBounds(420, 120, 71, 61);

        Button6.setIcon(new ImageIcon(getClass().getResource("/image1/table6.jpg")));
        Button6.setBorder(null);
        Button6.setBorderPainted(false);
        Button6.setContentAreaFilled(false);
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        jPanel1.add(Button6);
        Button6.setBounds(529, 120, 71, 61);

        Button7.setIcon(new ImageIcon(getClass().getResource("/image1/table7.jpg")));
        Button7.setBorder(null);
        Button7.setBorderPainted(false);
        Button7.setContentAreaFilled(false);
        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        jPanel1.add(Button7);
        Button7.setBounds(627, 120, 71, 61);

        Button8.setIcon(new ImageIcon(getClass().getResource("/image1/table8.jpg")));
        Button8.setBorder(null);
        Button8.setBorderPainted(false);
        Button8.setContentAreaFilled(false);
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        jPanel1.add(Button8);
        Button8.setBounds(723, 120, 71, 61);

        Button9.setIcon(new ImageIcon(getClass().getResource("/image1/table9.jpg")));
        Button9.setBorder(null);
        Button9.setBorderPainted(false);
        Button9.setContentAreaFilled(false);
        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        jPanel1.add(Button9);
        Button9.setBounds(390, 190, 71, 61);
        
        Button10.setIcon(new ImageIcon(getClass().getResource("/image1/table10.jpg")));
        Button10.setBorder(null);
        Button10.setBorderPainted(false);
        Button10.setContentAreaFilled(false);
        Button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });
        jPanel1.add(Button10);
        Button10.setBounds(480, 190, 71, 61);
        
        Button11.setIcon(new ImageIcon(getClass().getResource("/image1/table11.jpg")));
        Button11.setBorder(null);
        Button11.setBorderPainted(false);
        Button11.setContentAreaFilled(false);
        Button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });
        jPanel1.add(Button11);
        Button11.setBounds(580, 190, 71, 61);

        Button12.setIcon(new ImageIcon(getClass().getResource("/image1/table12.jpg")));
        Button12.setBorder(null);
        Button12.setBorderPainted(false);
        Button12.setContentAreaFilled(false);
        Button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });
        jPanel1.add(Button12);
        Button12.setBounds(680, 190, 71, 61);
        
        Button13.setIcon(new ImageIcon(getClass().getResource("/image1/table13.jpg")));
        Button13.setBorder(null);
        Button13.setBorderPainted(false);
        Button13.setContentAreaFilled(false);
        Button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });
        jPanel1.add(Button13);
        Button13.setBounds(420, 260, 71, 61);

        Button14.setIcon(new ImageIcon(getClass().getResource("/image1/table14.jpg")));
        Button14.setBorder(null);
        Button14.setBorderPainted(false);
        Button14.setContentAreaFilled(false);
        Button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });
        jPanel1.add(Button14);
        Button14.setBounds(529, 260, 71, 61);

        Button15.setIcon(new ImageIcon(getClass().getResource("/image1/table15.jpg")));
        Button15.setBorder(null);
        Button15.setBorderPainted(false);
        Button15.setContentAreaFilled(false);
        Button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });
        jPanel1.add(Button15);
        Button15.setBounds(627, 260, 71, 61);
        
        Button16.setIcon(new ImageIcon(getClass().getResource("/image1/table16.jpg")));
        Button16.setBorder(null);
        Button16.setBorderPainted(false);
        Button16.setContentAreaFilled(false);
        Button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });
        jPanel1.add(Button16);
        Button16.setBounds(713, 260, 71, 61);
        
        Button17.setIcon(new ImageIcon(getClass().getResource("/image1/table17.jpg")));
        Button17.setBorder(null);
        Button17.setBorderPainted(false);
        Button17.setContentAreaFilled(false);
        Button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });
        jPanel1.add(Button17);
        Button17.setBounds(390, 340, 71, 61);

        Button18.setIcon(new ImageIcon(getClass().getResource("/image1/table18.jpg")));
        Button18.setBorder(null);
        Button18.setBorderPainted(false);
        Button18.setContentAreaFilled(false);
        Button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });
        jPanel1.add(Button18);
        Button18.setBounds(490, 340, 71, 61);
        
        Button19.setIcon(new ImageIcon(getClass().getResource("/image1/table19.jpg")));
        Button19.setBorder(null);
        Button19.setBorderPainted(false);
        Button19.setContentAreaFilled(false);
        Button19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button19ActionPerformed(evt);
            }
        });
        jPanel1.add(Button19);
        Button19.setBounds(590, 340, 71, 61);

        Button20.setIcon(new ImageIcon(getClass().getResource("/image1/table20.jpg")));
        Button20.setBorder(null);
        Button20.setBorderPainted(false);
        Button20.setContentAreaFilled(false);
        Button20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button20ActionPerformed(evt);
            }
        });
        jPanel1.add(Button20);
        Button20.setBounds(690, 340, 71, 61);
        
//        okButton.setIcon(new ImageIcon(getClass().getResource("/image1/OK.jpg")));
//        okButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                okButtonActionPerformed(evt);
//            }
//        });
//        
//        jPanel1.add(okButton);
//        okButton.setBounds(490, 420, 70, 40);

//        cancelButton.setIcon(new ImageIcon(getClass().getResource("/image1/cancel.jpg")));
//        cancelButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                cancelButtonActionPerformed(evt);
//            }
//        });
//        jPanel1.add(cancelButton);
//        cancelButton.setBounds(600, 420, 70, 40);
        
        
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0,0,800,480);
        
    }//end init

    
    
    private void Button1ActionPerformed(ActionEvent evt) {
    	Button1.setEnabled(false);
    	csMenu1 = new CustomerMenu();
    	csMenu1.tableNoJTextField.setText("1");
    	pressedButton (csMenu1);
    }
    
    private void Button2ActionPerformed(ActionEvent evt) {
    	Button2.setEnabled(false);
    	csMenu2 = new CustomerMenu();
    	csMenu2.tableNoJTextField.setText("2");
    	pressedButton (csMenu2);
    }
    
    private void Button3ActionPerformed(ActionEvent evt) {
    	Button3.setEnabled(false);
    	csMenu3 = new CustomerMenu();
    	csMenu3.tableNoJTextField.setText("3");
    	pressedButton (csMenu3);
    }
    
    private void Button4ActionPerformed(ActionEvent evt) {
    	Button4.setEnabled(false);
    	csMenu4 = new CustomerMenu();
    	csMenu4.tableNoJTextField.setText("4");
    	pressedButton (csMenu4);
    }
    
    private void Button5ActionPerformed(ActionEvent evt) {
    	Button5.setEnabled(false);
    	csMenu5 = new CustomerMenu();
    	csMenu5.tableNoJTextField.setText("5");
    	pressedButton (csMenu5);
    }
    
    private void Button6ActionPerformed(ActionEvent evt) {
    	Button6.setEnabled(false);
    	csMenu6 = new CustomerMenu();
    	csMenu6.tableNoJTextField.setText("6");
    	pressedButton (csMenu6);
    }
    
    private void Button7ActionPerformed(ActionEvent evt) {
    	Button7.setEnabled(false);
    	csMenu7 = new CustomerMenu();
    	csMenu7.tableNoJTextField.setText("7");
    	pressedButton (csMenu7);
    }
    
    private void Button8ActionPerformed(ActionEvent evt) {
    	Button8.setEnabled(false);
    	csMenu8 = new CustomerMenu();
    	csMenu8.tableNoJTextField.setText("8");
    	pressedButton (csMenu8);
    }
    
    private void Button9ActionPerformed(ActionEvent evt) {
    	Button9.setEnabled(false);
    	csMenu9 = new CustomerMenu();
    	csMenu9.tableNoJTextField.setText("9");
    	pressedButton (csMenu9);
    }
    
    private void Button10ActionPerformed(ActionEvent evt) {
    	Button10.setEnabled(false);
    	csMenu10 = new CustomerMenu();
    	csMenu10.tableNoJTextField.setText("10");
    	pressedButton (csMenu10);
    }
    
    private void Button11ActionPerformed(ActionEvent evt) {
    	Button11.setEnabled(false);
    	csMenu11 = new CustomerMenu();
    	csMenu11.tableNoJTextField.setText("11");
    	pressedButton (csMenu11);
    }
    
    private void Button12ActionPerformed(ActionEvent evt) {
    	Button12.setEnabled(false);
    	csMenu12 = new CustomerMenu();
    	csMenu12.tableNoJTextField.setText("12");
    	pressedButton (csMenu12);
    }
    
    private void Button13ActionPerformed(ActionEvent evt) {
    	Button13.setEnabled(false);
    	csMenu13 = new CustomerMenu();
    	csMenu13.tableNoJTextField.setText("13");
    	pressedButton (csMenu13);
    }
    
    private void Button14ActionPerformed(ActionEvent evt) {
    	Button14.setEnabled(false);
    	csMenu14 = new CustomerMenu();
    	csMenu14.tableNoJTextField.setText("14");
    	pressedButton (csMenu14);
    }
    
    private void Button15ActionPerformed(ActionEvent evt) {
    	Button15.setEnabled(false);
    	csMenu15 = new CustomerMenu();
    	csMenu15.tableNoJTextField.setText("15");
    	pressedButton (csMenu15);
    }
    
    private void Button16ActionPerformed(ActionEvent evt) {
    	Button16.setEnabled(false);
    	csMenu16 = new CustomerMenu();
    	csMenu16.tableNoJTextField.setText("16");
    	pressedButton (csMenu16);
    }
    
    private void Button17ActionPerformed(ActionEvent evt) {
    	Button17.setEnabled(false);
    	csMenu17 = new CustomerMenu();
    	csMenu17.tableNoJTextField.setText("17");
    	pressedButton (csMenu17);
    }
    
    private void Button18ActionPerformed(ActionEvent evt) {
    	Button18.setEnabled(false);
    	csMenu18 = new CustomerMenu();
    	csMenu18.tableNoJTextField.setText("18");
    	pressedButton (csMenu18);
    }
    
    private void Button19ActionPerformed(ActionEvent evt) {
    	Button19.setEnabled(false);
    	csMenu19 = new CustomerMenu();
    	csMenu19.tableNoJTextField.setText("19");
    	pressedButton (csMenu19);
    }
    
    private void Button20ActionPerformed(ActionEvent evt) {
    	Button20.setEnabled(false);
    	csMenu20 = new CustomerMenu();
    	csMenu20.tableNoJTextField.setText("20");
    	pressedButton (csMenu20);
    }
    
    void pressedButton (CustomerMenu csm) {
    	

    	csm.setVisible(true);
    	csm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	try {
    		csm.rs = csm.stmt.executeQuery("INSERT INTO RECEIPTTABLE ("
                    + "RECEIPT_NO, TABLE_NO, PRICE_CHARGED) VALUES ("
                    + "RECEIPT_NO_SEQ.NEXTVAL, "
                    + csm.tableNoJTextField.getText() + ", "
                    + "0.00"
                    + ")");
        }catch(SQLException e) {
            System.out.println("insert receipt failed : " + e.getMessage());
        }
        
    	CashierModule.TableStatus[Integer.valueOf(csm.tableNoJTextField.getText())-1] = CashierModule.Seated;
    	CashierModule.refresh();
    }//pressedButton end
    
    
    public static void main(String args[]) {
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    
}
