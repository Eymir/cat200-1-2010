
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;


public class Main extends JFrame  implements  ActionListener{
    
        JButton Customer,Cashier,Kitchen,Administrator;
    JLabel Title;
    JPanel jPanel1,jPanel2;
    GroupLayout layout;
    GroupLayout jPanel1Layout;
    
        JComponent pane = (JComponent)this.getContentPane();
    
    public Main() {
           
        initComponents();
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(806,600);
        setTitle("Restaurant Ordering System");
        setVisible(true);
        setLocationRelativeTo(null);
 
    }
    
    
    private void initComponents() {
    	
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        Title = new JLabel();
        Customer = new JButton();
        Cashier = new JButton();
        Kitchen = new JButton();
        Administrator = new JButton();
        setResizable(false);
        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 0, 153)));
        jPanel1.setMaximumSize(new java.awt.Dimension(776, 497));
        jPanel1.setMinimumSize(new java.awt.Dimension(776, 497));
 
        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        jPanel2.setMaximumSize(new java.awt.Dimension(748, 467));
        jPanel2.setMinimumSize(new java.awt.Dimension(748, 467));
        
        Title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Restaurant Ordering System");
        Title.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 204)));
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Customer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Customer.setText("Customer Module");
        Customer.addActionListener(this);

        Cashier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cashier.setText("Cashier Module");
        Cashier.addActionListener(this);

        Kitchen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Kitchen.setText("Kitchen Module");
        Kitchen.addActionListener(this);

        Administrator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Administrator.setText("Administrator Module");
        Administrator.addActionListener(this);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(Title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(Administrator, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(Kitchen, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(Cashier, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(Customer, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))
                .addGap(258, 258, 258))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(Title)
                .addGap(59, 59, 59)
                .addComponent(Customer, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Cashier, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Kitchen, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Administrator, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(134, 134, 134))
        );

        jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        pack();
        
    }

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

        void Customer()
        {
                CustomerMenu CustMain = new CustomerMenu();
                CustMain.setVisible(true);
                CustMain.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        }
        
        void Cashier()
        {
            pane.removeAll() ;
            jPanel1 = new JPanel();
            
            CashierModule CashierMain=new CashierModule()
            {
                public String getParameter(String name)
                {
                    if (name.equalsIgnoreCase("msg"))
                    {
                        return "Local Frame";
                    }
                        return null;
                }
            };

            layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
          
            layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(CashierMain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            
            layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(CashierMain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

        CashierMain.init();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
            
        }
        void Kitchen()
        {
        	Kitchen kitchen= new Kitchen();
        	kitchen.show();
        	kitchen.setSize(800,600);
              // pane.removeAll() ;
                
                /*
                Kitchen KitchenMain = new Kitchen()
        {
         public String getParameter(String name) 
          {
           if (name.equalsIgnoreCase("msg"))
           {
              return "Local Frame";
           }
                        return null;
          }
        };
        setSize(800,600);
        this.setLocationRelativeTo(null);
        KitchenMain.init();
        this.getContentPane().add(KitchenMain, BorderLayout.CENTER);
            this.setVisible(true);
            */
        }
        void Administrator()
        {
                pane.removeAll() ;
                /*
                Administrator AdministratorMain = new Administrator()
                {
                 public String getParameter(String name) 
                  {
                   if (name.equalsIgnoreCase("msg"))
                   {
                      return "Local Frame";
                   }
                                return null;
                  }
                };
                setSize(800,600);
                this.setLocationRelativeTo(null);
                AdministratorMain.init();    
            this.getContentPane().add( AdministratorMain, BorderLayout.CENTER);
            this.setVisible(true);
            */
        }
        
        
        public void actionPerformed(ActionEvent evt) 
        {
        String command = evt.getActionCommand();
         
         if(command.equals("Customer Module"))
         {
                Customer();
         }
         if (command.equals("Cashier Module"))
         {
                Cashier();
         }
         if (command.equals("Kitchen Module"))
         {
                Kitchen();
         }
         if (command.equals("Administrator Module"))
         {
                Administrator();
         }
        }
}
