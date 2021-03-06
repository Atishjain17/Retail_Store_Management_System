package atish;

import static atish.emp_info.pos;
import static atish.emp_info.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author resham
 */
public class manp_info extends javax.swing.JFrame {

    private Connection con;// object of coonnection for linking
    private Statement st;// object of statements of queries
    private ResultSet rs;
    public static String pname,pcost;
    public static int quant,user=1,pvalue,mavalue;
    public manp_info() {
             try
    {  
        Class.forName("com.mysql.jdbc.Driver");//to give which software either mysql or sqlite
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atish","root","");//path can be changed //use the correct name of the database file
        st=con.createStatement();//if connection is not present no use of this line
                //initComponents();
        //display();
    }
    catch(Exception ex){
    System.out.println(ex);
    }
        initComponents();
        display();
    }
    
     public void display(int i)
    {
        try{
        String query="select * from product_info where product_id='"+i+"'";
       rs=st.executeQuery(query);
        while(rs.next()){
           name.setText(rs.getString("Product_name"));
           value.setText(rs.getString("product_value"));
           quantity.setText(rs.getString("product_quantity"));
           mvalue.setText(rs.getString("market_value"));
           quant=Integer.parseInt(rs.getString("product_quantity"));
        }
        }
        catch(Exception e)
        {
            
        }}
     public void display()
    {
        try{
        String query="select * from product_info where product_id='"+user+"'";
       rs=st.executeQuery(query);
        while(rs.next()){
           name.setText(rs.getString("Product_name"));
           value.setText(rs.getString("product_value"));
           quantity.setText(rs.getString("product_quantity"));
           mvalue.setText(rs.getString("market_value"));
           quant=Integer.parseInt(rs.getString("product_quantity"));
        }
        }
        catch(Exception e)
        {
            
        }}
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        logout = new javax.swing.JButton();
        e = new javax.swing.JButton();
        Continu = new javax.swing.JButton();
        detail = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mvalue = new javax.swing.JTextField();
        po = new javax.swing.JRadioButton();
        decr = new javax.swing.JRadioButton();
        none = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Product Information:");

        jLabel3.setText("Product name:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel1.setText("Product value:");

        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        jLabel4.setText("No. of product:");

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        e.setText("Exit");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        Continu.setText("Continue");
        Continu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuActionPerformed(evt);
            }
        });

        detail.setText("Full Detail");
        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });

        jLabel5.setText("Market  value:");

        mvalue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvalueActionPerformed(evt);
            }
        });

        po.setText("Place order");
        po.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poActionPerformed(evt);
            }
        });

        decr.setText("Decrease order");
        decr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrActionPerformed(evt);
            }
        });

        none.setText("None");
        none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Continu)
                        .addGap(18, 18, 18)
                        .addComponent(detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addGap(18, 18, 18)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(po))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decr)
                                .addGap(28, 28, 28)
                                .addComponent(none))
                            .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(po)
                    .addComponent(decr)
                    .addComponent(none))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e)
                    .addComponent(Continu)
                    .addComponent(detail)
                    .addComponent(logout))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
         
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       emp_ui eu=new emp_ui();
        eu.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_eActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void ContinuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuActionPerformed
     
      pvalue=Integer.parseInt(value.getText());
      System.out.println(pvalue);
        String query="update product_info set product_value='"+pvalue+"'where product_id='"+user+"'";
            try {
                int d=st.executeUpdate(query);
            }
            catch(Exception e)
            {}
            
      mavalue=Integer.parseInt(mvalue.getText());
         query="update product_info set market_value='"+mvalue+"'where product_id='"+user+"'";
            try {
                int d=st.executeUpdate(query);
            }
            catch(Exception e)
            {}  
       int profit=mavalue-pvalue; 
       query="update product_info set profit='"+profit+"'where product_id='"+user+"'";
            try {
                int d=st.executeUpdate(query);
            }
            catch(Exception e)
            {} 
      user=user+1;
      
      po.setSelected(false);
      decr.setSelected(false);
      none.setSelected(true);
      display();
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ContinuActionPerformed

    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed
                  prodetail pd=new prodetail();
                  pd.setVisible(true);
                  this.setVisible(false);      
        // TODO add your handling code here:
    }//GEN-LAST:event_detailActionPerformed

    private void mvalueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mvalueActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mvalueActionPerformed

    private void decrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrActionPerformed
 if(decr.isSelected())
        { po.setSelected(false);
         none.setSelected(false);
            quant=quant-5;
        System.out.println(quant);
        String query="update product_info set product_quantity='"+quant+"'where product_id='"+user+"'";
            try {
                int d=st.executeUpdate(query);
            }
            catch(Exception e)
            {}
            quantity.setText(""+quant);
            
        }           // TODO add your handling code here:
    }//GEN-LAST:event_decrActionPerformed

    private void poActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poActionPerformed
if(po.isSelected())
        {
             decr.setSelected(false);
              none.setSelected(false);
        quant=quant+5;
        String query="update product_info set product_quantity='"+quant+"'where product_id='"+user+"'";
            try {
                int p=st.executeUpdate(query);
            }
            catch(Exception e)
            {}
            quantity.setText(""+quant);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_poActionPerformed

    private void noneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noneActionPerformed
     
         po.setSelected(false);
        decr.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_noneActionPerformed

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
            java.util.logging.Logger.getLogger(manp_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manp_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manp_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manp_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manp_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continu;
    private javax.swing.JRadioButton decr;
    private javax.swing.JButton detail;
    private javax.swing.JButton e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logout;
    private javax.swing.JTextField mvalue;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton none;
    private javax.swing.JRadioButton po;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
