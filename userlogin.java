/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepa Shree
 */

import java.sql.*;
import javax.swing.*;
public class userlogin extends javax.swing.JFrame {

    /**
     * Creates new form userlogin
     */
    public userlogin() {
        initComponents();
        setTitle("USER LOGIN");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tuserloginuserid = new javax.swing.JTextField();
        buserloginlogin = new javax.swing.JButton();
        buserloginback = new javax.swing.JButton();
        tuserloginpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USERID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("PASSWORD");

        tuserloginuserid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tuserloginuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuserloginuseridActionPerformed(evt);
            }
        });

        buserloginlogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buserloginlogin.setText("LOGIN");
        buserloginlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buserloginloginMouseClicked(evt);
            }
        });
        buserloginlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buserloginloginActionPerformed(evt);
            }
        });

        buserloginback.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buserloginback.setText("BACK");
        buserloginback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buserloginbackMouseClicked(evt);
            }
        });

        tuserloginpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tuserloginuserid, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(tuserloginpassword))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(buserloginlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(buserloginback)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tuserloginuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tuserloginpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buserloginlogin)
                    .addComponent(buserloginback))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tuserloginuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuserloginuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuserloginuseridActionPerformed

    private void buserloginbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buserloginbackMouseClicked
        // TODO add your handling code here:
        user u = new user();
        u.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buserloginbackMouseClicked

    private void buserloginloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buserloginloginMouseClicked
        // TODO add your handling code here:
          Connection conn = null;
        conn = jdbcConnection.connect();
        String fname = null,lname = null;
        String sql = "select *  from user_detail where userid=? and password=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,tuserloginuserid.getText());
            ps.setString(2, tuserloginpassword.getText());
            String id = tuserloginuserid.getText();
             
           // bill b1 = new bill(id);
             ResultSet rs = ps.executeQuery();
             
              
              
            
            if(rs.next())
            {
                 fname=rs.getString("firstname");
                  lname = rs.getString("lastname");
               String name= fname.concat(lname);
                JOptionPane.showMessageDialog(null,"LOGIN SUCCESS");
                 bill b =new bill(id,name);
                
                b.setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "LOGIN NOT SUCCESS");
            }
           
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buserloginloginMouseClicked

    private void buserloginloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buserloginloginActionPerformed
        // TODO add your handling code here
     
        
    }//GEN-LAST:event_buserloginloginActionPerformed

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
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buserloginback;
    private javax.swing.JButton buserloginlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tuserloginpassword;
    private javax.swing.JTextField tuserloginuserid;
    // End of variables declaration//GEN-END:variables
}
