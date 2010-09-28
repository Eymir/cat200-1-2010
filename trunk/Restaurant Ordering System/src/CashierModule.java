import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class CashierModule extends JPanel {
	
	private JButton jButton2;
	private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JToggleButton jToggleButton1;
    private JToggleButton jToggleButton10;
    private JToggleButton jToggleButton11;
    private JToggleButton jToggleButton12;
    private JToggleButton jToggleButton13;
    private JToggleButton jToggleButton14;
    private JToggleButton jToggleButton2;
    private JToggleButton jToggleButton3;
    private JToggleButton jToggleButton4;
    private JToggleButton jToggleButton5;
    private JToggleButton jToggleButton6;
    private JToggleButton jToggleButton7;
    private JToggleButton jToggleButton8;
    private JToggleButton jToggleButton9;
	    
    public CashierModule() {
    	init();
    }

    @SuppressWarnings("serial")
	public void init() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        jButton2 = new JButton();
        jLabel1 = new JLabel();
        jToggleButton1 = new JToggleButton();
        jToggleButton2 = new JToggleButton();
        jToggleButton3 = new JToggleButton();
        jToggleButton4 = new JToggleButton();
        jToggleButton5 = new JToggleButton();
        jToggleButton6 = new JToggleButton();
        jToggleButton7 = new JToggleButton();
        jToggleButton8 = new JToggleButton();
        jToggleButton9 = new JToggleButton();
        jToggleButton10 = new JToggleButton();
        jToggleButton11 = new JToggleButton();
        jToggleButton12 = new JToggleButton();
        jToggleButton13 = new JToggleButton();
        jToggleButton14 = new JToggleButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();

        jPanel1.setBackground(new Color(255, 51, 51));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        jPanel1.setFocusTraversalPolicyProvider(true);

        jPanel2.setBackground(new Color(153, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 102), 2));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"  1", " B.P Chic.Chop", "   1", "    19.90"},
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
                {null, null, null, null}
            },
            new String [] {
                "No", "Name", "Unit", "Price"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                String.class, String.class, String.class, String.class
            };

            @SuppressWarnings("unchecked")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new Font("Tahoma", 1, 14));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Total Bill:");

        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("RM 19.90");

        jButton2.setText("Click Here to Print Bill");

        jLabel1.setFont(new Font("Tahoma", 1, 14));
        jLabel1.setForeground(new Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Tuesday, September 14, 2010");
        jLabel1.setBorder(BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jToggleButton1.setText("Table 1");

        jToggleButton2.setText("Table 2");

        jToggleButton3.setText("Table 3");

        jToggleButton4.setText("Table 4");

        jToggleButton5.setText("Table 5");

        jToggleButton6.setText("Table 6");

        jToggleButton7.setText("Table 7");

        jToggleButton8.setText("Table 8");

        jToggleButton9.setText("Table 9");

        jToggleButton10.setText("Table 10");

        jToggleButton11.setText("Table 11");

        jToggleButton12.setText("Table 12");

        jToggleButton13.setText("Table 13");

        jToggleButton14.setText("Table 14");

        jLabel2.setBackground(new Color(204, 204, 204));
        jLabel2.setFont(new Font("Tahoma", 1, 12));
        jLabel2.setForeground(new Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Empty");
        jLabel2.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel3.setBackground(new Color(204, 204, 204));
        jLabel3.setFont(new Font("Tahoma", 1, 12));
        jLabel3.setForeground(new Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Seated");
        jLabel3.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel5.setBackground(new Color(204, 204, 204));
        jLabel5.setFont(new Font("Tahoma", 1, 12));
        jLabel5.setForeground(new Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Billing");
        jLabel5.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel6.setBackground(new Color(204, 204, 204));
        jLabel6.setFont(new Font("Tahoma", 1, 12));
        jLabel6.setForeground(new Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("Empty");
        jLabel6.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel7.setBackground(new Color(204, 204, 204));
        jLabel7.setFont(new Font("Tahoma", 1, 12));
        jLabel7.setForeground(new Color(0, 0, 255));
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("Seated");
        jLabel7.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel8.setBackground(new Color(204, 204, 204));
        jLabel8.setFont(new Font("Tahoma", 1, 12));
        jLabel8.setForeground(new Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("Empty");
        jLabel8.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel9.setBackground(new Color(204, 204, 204));
        jLabel9.setFont(new Font("Tahoma", 1, 12));
        jLabel9.setForeground(new Color(0, 0, 255));
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Seated");
        jLabel9.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel10.setBackground(new Color(204, 204, 204));
        jLabel10.setFont(new Font("Tahoma", 1, 12));
        jLabel10.setForeground(new Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("Empty");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel11.setBackground(new Color(204, 204, 204));
        jLabel11.setFont(new Font("Tahoma", 1, 12));
        jLabel11.setForeground(new Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setText("Empty");
        jLabel11.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel12.setBackground(new Color(204, 204, 204));
        jLabel12.setFont(new Font("Tahoma", 1, 12));
        jLabel12.setForeground(new Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("Empty");
        jLabel12.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel13.setBackground(new Color(204, 204, 204));
        jLabel13.setFont(new Font("Tahoma", 1, 12));
        jLabel13.setForeground(new Color(255, 0, 0));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("Empty");
        jLabel13.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel14.setBackground(new Color(204, 204, 204));
        jLabel14.setFont(new Font("Tahoma", 1, 12));
        jLabel14.setForeground(new Color(0, 0, 255));
        jLabel14.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel14.setText("Seated");
        jLabel14.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel15.setBackground(new Color(204, 204, 204));
        jLabel15.setFont(new Font("Tahoma", 1, 12));
        jLabel15.setForeground(new Color(0, 0, 255));
        jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel15.setText("Seated");
        jLabel15.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        jLabel16.setBackground(new Color(204, 204, 204));
        jLabel16.setFont(new Font("Tahoma", 1, 12));
        jLabel16.setForeground(new Color(0, 0, 255));
        jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel16.setText("Seated");
        jLabel16.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 2));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton13, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton14, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

}
