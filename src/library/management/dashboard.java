/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PrithviDevKumar
 */
public final class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    int xmouse , ymouse;
    String u1;
    public dashboard() {
        initComponents();
    }
    
     dashboard(String u) {
        initComponents();
        u1 = u;
        
    }
     
     
   

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        addnew = new javax.swing.JButton();
        dd = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/qaz.png"))); // NOI18N
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 180, 120));

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/add.png"))); // NOI18N
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 194, 92, 80));

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/graph.png"))); // NOI18N
        jButton28.setContentAreaFilled(false);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 194, 92, 80));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/about.png"))); // NOI18N
        jButton29.setContentAreaFilled(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 336, 92, 80));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/issue.png"))); // NOI18N
        jButton30.setContentAreaFilled(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 336, 92, 80));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/return.png"))); // NOI18N
        jButton31.setContentAreaFilled(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 336, -1, 80));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("STATISTICS");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 274, 92, 27));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("ABOUT");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 416, 92, 27));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("ISSUE BOOK");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 416, 92, 27));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("RETURN BOOK");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 416, -1, 27));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/info.png"))); // NOI18N
        jButton32.setContentAreaFilled(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 194, 92, 80));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("USER INFO");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 280, 92, 27));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("NEW BOOK");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 280, 92, 27));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/logout.png"))); // NOI18N
        logout.setContentAreaFilled(false);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel6.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 30, 30));

        addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/addnew.png"))); // NOI18N
        addnew.setContentAreaFilled(false);
        addnew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addnewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addnewMouseExited(evt);
            }
        });
        addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewActionPerformed(evt);
            }
        });
        jPanel6.add(addnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 30, 30));

        dd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 120, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Dev Library");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 24));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/exit.png"))); // NOI18N
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 28, 24));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/minimize.png"))); // NOI18N
        jButton26.setContentAreaFilled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 28, 24));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/cool-background (2).png"))); // NOI18N
        jLabel1.setRequestFocusEnabled(false);
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(568, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton25jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25jButton1ActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButton25jButton1ActionPerformed

    private void jButton26jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26jButton2ActionPerformed
        this.setExtendedState(dashboard.ICONIFIED);
    }//GEN-LAST:event_jButton26jButton2ActionPerformed

    private void jButton31jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31jButton7ActionPerformed
        this.dispose();
        returnBook rb = new returnBook();
        JOptionPane.showMessageDialog(this,"Enter Customer ID and Book ID to find details","Return Book",JOptionPane.INFORMATION_MESSAGE);
        rb.setVisible(true);
    }//GEN-LAST:event_jButton31jButton7ActionPerformed

    private void jButton32jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32jButton8ActionPerformed
        userinfo uu = new userinfo(u1);
        this.dispose();
        uu.setVisible(true);
    }//GEN-LAST:event_jButton32jButton8ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        this.dispose();
        newBook nb = new newBook();
        nb.setVisible(true);
                
    }//GEN-LAST:event_jButton27ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        login l = new login();
        l.setVisible(true);
        JOptionPane.showMessageDialog(this, "Logged Out");
    }//GEN-LAST:event_logoutActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewActionPerformed
        this.dispose();
        addnewcustomer cust = new addnewcustomer();
        cust.setVisible(true);
    }//GEN-LAST:event_addnewActionPerformed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        dd.setVisible(true);
        dd.setText("Logout");
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        dd.setVisible(false);
    }//GEN-LAST:event_logoutMouseExited

    private void addnewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewMouseEntered
        dd.setVisible(true);
        dd.setText("Add New Customer");
    }//GEN-LAST:event_addnewMouseEntered

    private void addnewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewMouseExited
        dd.setVisible(false);
    }//GEN-LAST:event_addnewMouseExited

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        this.dispose();
        issuebook ib = new issuebook();
        ib.setVisible(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        this.dispose();
        statistics st = new statistics();
        st.setVisible(true);
    }//GEN-LAST:event_jButton28ActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnew;
    private javax.swing.JLabel dd;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
