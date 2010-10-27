package RestOrdSystem;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;


public class Table extends JFrame {
	
	public Table() {
		initComponents();
		setPromoFood();
	}
	
	CustomerMenu csMenu1;
	CustomerMenu csMenu2;
	CustomerMenu csMenu3;
	CustomerMenu csMenu4;
	CustomerMenu csMenu5;
	CustomerMenu csMenu6;
	CustomerMenu csMenu7;
	CustomerMenu csMenu8;
	CustomerMenu csMenu9;
	CustomerMenu csMenu10;
	CustomerMenu csMenu11;
	CustomerMenu csMenu12;
	CustomerMenu csMenu13;
	CustomerMenu csMenu14;
	CustomerMenu csMenu15;
	CustomerMenu csMenu16;
	CustomerMenu csMenu17;
	CustomerMenu csMenu18;
	CustomerMenu csMenu19;
	CustomerMenu csMenu20;
	
	static Vector<String> orderFoodNameVec1;
	static Vector<String> orderFoodNameVec2;
	static Vector<String> orderFoodNameVec3;
	static Vector<String> orderFoodNameVec4;
	static Vector<String> orderFoodNameVec5;
	static Vector<String> orderFoodNameVec6;
	static Vector<String> orderFoodNameVec7;
	static Vector<String> orderFoodNameVec8;
	static Vector<String> orderFoodNameVec9;
	static Vector<String> orderFoodNameVec10;
	static Vector<String> orderFoodNameVec11;
	static Vector<String> orderFoodNameVec12;
	static Vector<String> orderFoodNameVec13;
	static Vector<String> orderFoodNameVec14;
	static Vector<String> orderFoodNameVec15;
	static Vector<String> orderFoodNameVec16;
	static Vector<String> orderFoodNameVec17;
	static Vector<String> orderFoodNameVec18;
	static Vector<String> orderFoodNameVec19;
	static Vector<String> orderFoodNameVec20;
	
	static Vector<Integer> orderFoodQnVec1;
	static Vector<Integer> orderFoodQnVec2;
	static Vector<Integer> orderFoodQnVec3;
	static Vector<Integer> orderFoodQnVec4;
	static Vector<Integer> orderFoodQnVec5;
	static Vector<Integer> orderFoodQnVec6;
	static Vector<Integer> orderFoodQnVec7;
	static Vector<Integer> orderFoodQnVec8;
	static Vector<Integer> orderFoodQnVec9;
	static Vector<Integer> orderFoodQnVec10;
	static Vector<Integer> orderFoodQnVec11;
	static Vector<Integer> orderFoodQnVec12;
	static Vector<Integer> orderFoodQnVec13;
	static Vector<Integer> orderFoodQnVec14;
	static Vector<Integer> orderFoodQnVec15;
	static Vector<Integer> orderFoodQnVec16;
	static Vector<Integer> orderFoodQnVec17;
	static Vector<Integer> orderFoodQnVec18;
	static Vector<Integer> orderFoodQnVec19;
	static Vector<Integer> orderFoodQnVec20;
	 
	static Vector<Double> orderFoodPriceVec1;
	static Vector<Double> orderFoodPriceVec2;
	static Vector<Double> orderFoodPriceVec3;
	static Vector<Double> orderFoodPriceVec4;
	static Vector<Double> orderFoodPriceVec5;
	static Vector<Double> orderFoodPriceVec6;
	static Vector<Double> orderFoodPriceVec7;
	static Vector<Double> orderFoodPriceVec8;
	static Vector<Double> orderFoodPriceVec9;
	static Vector<Double> orderFoodPriceVec10;
	static Vector<Double> orderFoodPriceVec11;
	static Vector<Double> orderFoodPriceVec12;
	static Vector<Double> orderFoodPriceVec13;
	static Vector<Double> orderFoodPriceVec14;
	static Vector<Double> orderFoodPriceVec15;
	static Vector<Double> orderFoodPriceVec16;
	static Vector<Double> orderFoodPriceVec17;
	static Vector<Double> orderFoodPriceVec18;
	static Vector<Double> orderFoodPriceVec19;
	static Vector<Double> orderFoodPriceVec20;
	
    private JPanel BasePanel;
    private JSeparator Separator;
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
    private JLabel label_1;
    private JLabel promotionJLabel;
    private JLabel promoPictJLabel;
    private JLabel promoNameJLabel;
    private JLabel promoPriceJLabel;
    
    
    private void initComponents() {

    	CashierModule.initTableStatus();
    	
    	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    	setTitle("Restaurant Ordering System - Table Menu                                               "+SystemMain.getToday);
    	setMinimumSize(new Dimension(800, 500));
    	setResizable(false);
    	getContentPane().setLayout(null);
    	setLocationRelativeTo(null);

        BasePanel = new JPanel();
        Separator = new JSeparator();
        Separator.setBounds(300, 9, 2, 450);
        Button1 = new JButton();
        Button1.setBounds(340, 71, 71, 61);
        Button4 = new JButton();
        Button4.setBounds(642, 71, 71, 61);
        Button3 = new JButton();
        Button3.setBounds(542, 71, 71, 61);
        Button8 = new JButton();
        Button8.setBounds(685, 149, 71, 61);
        Button9 = new JButton();
        Button9.setBounds(340, 226, 71, 61);
        Button5 = new JButton();
        Button5.setBounds(394, 149, 71, 61);
        Button18 = new JButton();
        Button18.setBounds(442, 384, 71, 61);
        Button2 = new JButton();
        Button2.setBounds(442, 71, 71, 61);
        Button6 = new JButton();
        Button6.setBounds(491, 149, 71, 61);
        Button7 = new JButton();
        Button7.setBounds(589, 149, 71, 61);
        Button13 = new JButton();
        Button13.setBounds(394, 304, 71, 61);
        Button14 = new JButton();
        Button14.setBounds(491, 304, 71, 61);
        Button15 = new JButton();
        Button15.setBounds(589, 304, 71, 61);
        Button17 = new JButton();
        Button17.setBounds(340, 384, 71, 61);
        Button12 = new JButton();
        Button12.setBounds(642, 226, 71, 61);
        Button11 = new JButton();
        Button11.setBounds(542, 226, 71, 61);
        Button16 = new JButton();
        Button16.setBounds(685, 304, 71, 61);
        Button19 = new JButton();
        Button19.setBounds(542, 384, 71, 61);
        Button20 = new JButton();
        Button20.setBounds(642, 384, 71, 61);
        Button10 = new JButton();
        Button10.setBounds(442, 226, 71, 61);
        
        
        BasePanel.setBackground(UIManager.getColor("OptionPane.warningDialog.titlePane.shadow"));
        BasePanel.setPreferredSize(new Dimension(800, 480));
        BasePanel.setLayout(null);
        
        Separator.setOrientation(SwingConstants.VERTICAL);
        BasePanel.add(Separator);

        Button1.setIcon(new ImageIcon(getClass().getResource("/image1/table1.jpg")));
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        BasePanel.add(Button1);

        Button2.setIcon(new ImageIcon(getClass().getResource("/image1/table2.jpg")));
 
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        BasePanel.add(Button2);
        
        Button3.setIcon(new ImageIcon(getClass().getResource("/image1/table3.jpg")));
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        BasePanel.add(Button3);
        
        Button4.setIcon(new ImageIcon(getClass().getResource("/image1/table4.jpg")));

        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        BasePanel.add(Button4);
        
        Button5.setIcon(new ImageIcon(getClass().getResource("/image1/table5.jpg")));

        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        BasePanel.add(Button5);

        Button6.setIcon(new ImageIcon(getClass().getResource("/image1/table6.jpg")));

        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        BasePanel.add(Button6);

        Button7.setIcon(new ImageIcon(getClass().getResource("/image1/table7.jpg")));

        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        BasePanel.add(Button7);

        Button8.setIcon(new ImageIcon(getClass().getResource("/image1/table8.jpg")));
;
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        BasePanel.add(Button8);

        Button9.setIcon(new ImageIcon(getClass().getResource("/image1/table9.jpg")));

        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        BasePanel.add(Button9);
        
        Button10.setIcon(new ImageIcon(getClass().getResource("/image1/table10.jpg")));

        Button10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });
        BasePanel.add(Button10);
        
        Button11.setIcon(new ImageIcon(getClass().getResource("/image1/table11.jpg")));


        Button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });
        BasePanel.add(Button11);

        Button12.setIcon(new ImageIcon(getClass().getResource("/image1/table12.jpg")));
;
        Button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });
        BasePanel.add(Button12);
        
        Button13.setIcon(new ImageIcon(getClass().getResource("/image1/table13.jpg")));

        Button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });
        BasePanel.add(Button13);

        Button14.setIcon(new ImageIcon(getClass().getResource("/image1/table14.jpg")));

        Button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });
        BasePanel.add(Button14);

        Button15.setIcon(new ImageIcon(getClass().getResource("/image1/table15.jpg")));

        Button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });
        BasePanel.add(Button15);
        
        Button16.setIcon(new ImageIcon(getClass().getResource("/image1/table16.jpg")));

        Button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });
        BasePanel.add(Button16);
        
        Button17.setIcon(new ImageIcon(getClass().getResource("/image1/table17.jpg")));

        Button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });
        BasePanel.add(Button17);

        Button18.setIcon(new ImageIcon(getClass().getResource("/image1/table18.jpg")));

        Button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });
        BasePanel.add(Button18);
        
        Button19.setIcon(new ImageIcon(getClass().getResource("/image1/table19.jpg")));

        Button19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button19ActionPerformed(evt);
            }
        });
        BasePanel.add(Button19);

        Button20.setIcon(new ImageIcon(getClass().getResource("/image1/table20.jpg")));

        Button20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Button20ActionPerformed(evt);
            }
        });
        BasePanel.add(Button20);
        
        getContentPane().add(BasePanel);
        BasePanel.setBounds(0,0,798,468);
        JLabel label = new JLabel();
        label.setBounds(320, 11, 459, 41);
        label.setIcon(new ImageIcon(Table.class.getResource("/image1/cooltext474323728.png")));
        label.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
        BasePanel.add(label);
        BasePanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(102, 102, 102)));
        
        label_1 = new JLabel("");
        label_1.setBounds(18, 11, 265, 41);
        label_1.setIcon(new ImageIcon(Table.class.getResource("/image1/cooltext474326281.png")));
        label_1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
        BasePanel.add(label_1);
        
        promotionJLabel = new JLabel("");
        promotionJLabel.setBounds(28, 64, 238, 60);
        //promoPictJLabel.setIcon(new ImageIcon(getClass().getResource("/image1/promotion.png")));
        BasePanel.add(promotionJLabel);
        
        promoPictJLabel = new JLabel("");
        promoPictJLabel.setBounds(26, 130, 240, 180);
        BasePanel.add(promoPictJLabel);
        
        promoNameJLabel = new JLabel("");
        promoNameJLabel.setFont(new Font("Tahoma", 0, 18)); 
        promoNameJLabel.setBounds(28, 315, 234, 41);
        BasePanel.add(promoNameJLabel);
        
        promoPriceJLabel = new JLabel("");
        promoPriceJLabel.setFont(new Font("Tahoma", 0, 18)); 
        promoPriceJLabel.setBounds(28, 365, 240, 41);
        BasePanel.add(promoPriceJLabel);
        
    }//end init

    String promoFoodName = "";
    Double promoFoodPrice = 0.00;
    String promoFoodUrl = "";
    DecimalFormat df = new DecimalFormat("0.00");
    
    void setPromoFood() {
    	try {
    		SystemMain.rs = SystemMain.stmt.executeQuery("SELECT FOOD_NAME, FOOD_PRICE, FOOD_PICT_URL " +
        			"FROM FOODTABLE " +
        			"WHERE SPECIAL_FOOD = 1");
    		SystemMain.rs.first();
    		if (SystemMain.rs.first()) {
    			promoFoodName = SystemMain.rs.getString(1);
    			promoFoodPrice = SystemMain.rs.getDouble(2);
    			promoFoodUrl = SystemMain.rs.getString(3);
            }
    		
    		promoNameJLabel.setText(promoFoodName);
    		promoPriceJLabel.setText("RM " + df.format(promoFoodPrice));
    		promoPictJLabel.setIcon(new ImageIcon(getClass().getResource(promoFoodUrl)));
    		
    		
    	}catch (SQLException e) {
    		System.err.println("promotion food selection failed : " + e.getMessage());
    	}
    }
    
    private void Button1ActionPerformed(ActionEvent evt) {
    	Button1.setEnabled(false);
    	csMenu1 = new CustomerMenu(1);
    	orderFoodNameVec1 = new Vector<String>();
    	orderFoodQnVec1 = new Vector<Integer>();
    	orderFoodPriceVec1 = new Vector<Double>();
    	pressedButton (csMenu1,"1");
    }
    
    private void Button2ActionPerformed(ActionEvent evt) {
    	Button2.setEnabled(false);
    	csMenu2 = new CustomerMenu(2);
    	orderFoodNameVec2 = new Vector<String>();
    	orderFoodQnVec2 = new Vector<Integer>();
    	orderFoodPriceVec2 = new Vector<Double>();
    	pressedButton (csMenu2,"2");
    }
    
    private void Button3ActionPerformed(ActionEvent evt) {
    	Button3.setEnabled(false);
    	csMenu3 = new CustomerMenu(3);
    	orderFoodNameVec3 = new Vector<String>();
    	orderFoodQnVec3 = new Vector<Integer>();
    	orderFoodPriceVec3 = new Vector<Double>();
    	pressedButton (csMenu3,"3");
    }
    
    private void Button4ActionPerformed(ActionEvent evt) {
    	Button4.setEnabled(false);
    	csMenu4 = new CustomerMenu(4);
    	orderFoodNameVec4 = new Vector<String>();
    	orderFoodQnVec4 = new Vector<Integer>();
    	orderFoodPriceVec4 = new Vector<Double>();
    	pressedButton (csMenu4,"4");
    }
    
    private void Button5ActionPerformed(ActionEvent evt) {
    	Button5.setEnabled(false);
    	csMenu5 = new CustomerMenu(5);
    	orderFoodNameVec5 = new Vector<String>();
    	orderFoodQnVec5 = new Vector<Integer>();
    	orderFoodPriceVec5 = new Vector<Double>();
    	pressedButton (csMenu5,"5");
    }
    
    private void Button6ActionPerformed(ActionEvent evt) {
    	Button6.setEnabled(false);
    	csMenu6 = new CustomerMenu(6);
    	orderFoodNameVec6 = new Vector<String>();
    	orderFoodQnVec6 = new Vector<Integer>();
    	orderFoodPriceVec6 = new Vector<Double>();
    	pressedButton (csMenu6,"6");
    }
    
    private void Button7ActionPerformed(ActionEvent evt) {
    	Button7.setEnabled(false);
    	csMenu7 = new CustomerMenu(7);
    	orderFoodNameVec7 = new Vector<String>();
    	orderFoodQnVec7 = new Vector<Integer>();
    	orderFoodPriceVec7 = new Vector<Double>();
    	pressedButton (csMenu7,"7");
    }
    
    private void Button8ActionPerformed(ActionEvent evt) {
    	Button8.setEnabled(false);
    	csMenu8 = new CustomerMenu(8);
    	orderFoodNameVec8 = new Vector<String>();
    	orderFoodQnVec8 = new Vector<Integer>();
    	orderFoodPriceVec8 = new Vector<Double>();
    	pressedButton (csMenu8,"8");
    }
    
    private void Button9ActionPerformed(ActionEvent evt) {
    	Button9.setEnabled(false);
    	csMenu9 = new CustomerMenu(9);
    	orderFoodNameVec9 = new Vector<String>();
    	orderFoodQnVec9 = new Vector<Integer>();
    	orderFoodPriceVec9 = new Vector<Double>();
    	pressedButton (csMenu9,"9");
    }
    
    private void Button10ActionPerformed(ActionEvent evt) {
    	Button10.setEnabled(false);
    	csMenu10 = new CustomerMenu(10);
    	orderFoodNameVec10 = new Vector<String>();
    	orderFoodQnVec10 = new Vector<Integer>();
    	orderFoodPriceVec10 = new Vector<Double>();
    	pressedButton (csMenu10,"10");
    }
    
    private void Button11ActionPerformed(ActionEvent evt) {
    	Button11.setEnabled(false);
    	csMenu11 = new CustomerMenu(11);
    	orderFoodNameVec11 = new Vector<String>();
    	orderFoodQnVec11 = new Vector<Integer>();
    	orderFoodPriceVec11 = new Vector<Double>();
    	pressedButton (csMenu11,"11");
    }
    
    private void Button12ActionPerformed(ActionEvent evt) {
    	Button12.setEnabled(false);
    	csMenu12 = new CustomerMenu(12);
    	orderFoodNameVec12 = new Vector<String>();
    	orderFoodQnVec12 = new Vector<Integer>();
    	orderFoodPriceVec12 = new Vector<Double>();
    	pressedButton (csMenu12,"12");
    }
    
    private void Button13ActionPerformed(ActionEvent evt) {
    	Button13.setEnabled(false);
    	csMenu13 = new CustomerMenu(13);
    	orderFoodNameVec13 = new Vector<String>();
    	orderFoodQnVec13 = new Vector<Integer>();
    	orderFoodPriceVec13 = new Vector<Double>();
    	pressedButton (csMenu13,"13");
    }
    
    private void Button14ActionPerformed(ActionEvent evt) {
    	Button14.setEnabled(false);
    	csMenu14 = new CustomerMenu(14);
    	orderFoodNameVec14 = new Vector<String>();
    	orderFoodQnVec14 = new Vector<Integer>();
    	orderFoodPriceVec14 = new Vector<Double>();
    	pressedButton (csMenu14,"14");
    }
    
    private void Button15ActionPerformed(ActionEvent evt) {
    	Button15.setEnabled(false);
    	csMenu15 = new CustomerMenu(15);
    	orderFoodNameVec15 = new Vector<String>();
    	orderFoodQnVec15 = new Vector<Integer>();
    	orderFoodPriceVec15 = new Vector<Double>();
    	pressedButton (csMenu15,"15");
    }
    
    private void Button16ActionPerformed(ActionEvent evt) {
    	Button16.setEnabled(false);
    	csMenu16 = new CustomerMenu(16);
    	orderFoodNameVec16 = new Vector<String>();
    	orderFoodQnVec16 = new Vector<Integer>();
    	orderFoodPriceVec16 = new Vector<Double>();
    	pressedButton (csMenu16,"16");
    }
    
    private void Button17ActionPerformed(ActionEvent evt) {
    	Button17.setEnabled(false);
    	csMenu17 = new CustomerMenu(17);
    	orderFoodNameVec17 = new Vector<String>();
    	orderFoodQnVec17 = new Vector<Integer>();
    	orderFoodPriceVec17 = new Vector<Double>();
    	pressedButton (csMenu17,"17");
    }
    
    private void Button18ActionPerformed(ActionEvent evt) {
    	Button18.setEnabled(false);
    	csMenu18 = new CustomerMenu(18);
    	orderFoodNameVec18 = new Vector<String>();
    	orderFoodQnVec18 = new Vector<Integer>();
    	orderFoodPriceVec18 = new Vector<Double>();
    	pressedButton (csMenu18,"18");
    }
    
    private void Button19ActionPerformed(ActionEvent evt) {
    	Button19.setEnabled(false);
    	csMenu19 = new CustomerMenu(19);
    	orderFoodNameVec19 = new Vector<String>();
    	orderFoodQnVec19 = new Vector<Integer>();
    	orderFoodPriceVec19 = new Vector<Double>();
    	pressedButton (csMenu19,"19");
    }
    
    private void Button20ActionPerformed(ActionEvent evt) {
    	Button20.setEnabled(false);
    	csMenu20 = new CustomerMenu(20);
    	orderFoodNameVec20 = new Vector<String>();
    	orderFoodQnVec20 = new Vector<Integer>();
    	orderFoodPriceVec20 = new Vector<Double>();
    	pressedButton (csMenu20,"20");
    }
    
    void pressedButton (CustomerMenu csm, String tbN) {
    	

    	csm.setVisible(true);
    	csm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	try {
    		SystemMain.rs = SystemMain.stmt.executeQuery("INSERT INTO RECEIPTTABLE ("
                    + "RECEIPT_NO, TABLE_NO, PRICE_CHARGED) VALUES ("
                    + "RECEIPT_NO_SEQ.NEXTVAL, "
                    + tbN + ", "
                    + "0.00"
                    + ")");
    		
        }catch(SQLException e) {
            System.out.println("insert receipt failed : " + e.getMessage());
        }
        
        CashierModule.TableStatus[Integer.valueOf(tbN)-1] = CashierModule.Seated;
    	CashierModule.refresh();
    }//pressedButton end
    
    
    public static void main(String args[]) {
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }
}//class Table end
