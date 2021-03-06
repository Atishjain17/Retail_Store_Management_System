package atish;

import java.sql.*;
import javax.swing.JOptionPane;
public class prof_info extends javax.swing.JFrame {

    /**
     * Creates new form prof_info
     */
    private Connection con;// object of coonnection for linking
    private Statement st=null;// object of statements of queries
    private ResultSet rs;
    public static int i;
    public prof_info() {
           try
    {  
        Class.forName("com.mysql.jdbc.Driver");//to give which software either mysql or sqlite
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atish","root","");//path can be changed //use the correct name of the database file
        st=con.createStatement();//if connection is not present no use of this line
        
    }
    catch(Exception ex){
    System.out.println(ex);
    }
        initComponents();
        display();
    }
    public void display()
    {
     try{
        String query="select sum(profit) as totalprofit from customer_info ";
        rs=st.executeQuery(query);
        while(rs.next()){
        int total=rs.getInt("totalprofit");
        Totalprofit.setText(""+total);
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Totalprofit = new javax.swing.JTextField();
        cust = new javax.swing.JRadioButton();
        prod = new javax.swing.JRadioButton();
        none = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        viewsort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Accounts:");

        jLabel2.setText("Total Profit Earned:");

        cust.setText("Customer id");
        cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custActionPerformed(evt);
            }
        });

        prod.setText("Product id");
        prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodActionPerformed(evt);
            }
        });

        none.setText("None");
        none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noneActionPerformed(evt);
            }
        });

        jLabel3.setText("View Profit By:");

        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        viewsort.setText("View");
        viewsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Totalprofit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cust)
                            .addGap(18, 18, 18)
                            .addComponent(prod)
                            .addGap(18, 18, 18)
                            .addComponent(none)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewsort)
                        .addGap(26, 26, 26)
                        .addComponent(logout)
                        .addGap(31, 31, 31)
                        .addComponent(exit)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Totalprofit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cust)
                    .addComponent(prod)
                    .addComponent(none))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(exit)
                    .addComponent(viewsort))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custActionPerformed
if(cust.isSelected())
        {
             prod.setSelected(false);
              none.setSelected(false); 
              i=1;
        }// TODO add your handling code here:
    }//GEN-LAST:event_custActionPerformed

    private void prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodActionPerformed
     if(prod.isSelected())
        {
             cust.setSelected(false);
              none.setSelected(false); 
              i=2;
        }   // TODO add your handling code here:
    }//GEN-LAST:event_prodActionPerformed

    private void noneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noneActionPerformed
if(none.isSelected())
        {
             prod.setSelected(false);
             cust.setSelected(false); 
              i=0;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_noneActionPerformed

    private void viewsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewsortActionPerformed
if(i!=0)
        {
             prod.setSelected(false);
              cust.setSelected(false); 
              none.setSelected(false); 
             
        billsort o=new billsort();
        o.display(i);
        o.setVisible(true);
        this.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_viewsortActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
      emp_ui eu=new emp_ui();
        eu.setVisible(true);
        this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prof_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prof_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prof_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prof_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prof_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Totalprofit;
    private javax.swing.JRadioButton cust;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton none;
    private javax.swing.JRadioButton prod;
    private javax.swing.JButton viewsort;
    // End of variables declaration//GEN-END:variables
}
