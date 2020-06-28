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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PrithviDevKumar
 */
public class userinfo extends javax.swing.JFrame {

    /**
     * Creates new form userinfo
     */
    String userid;
    int xmouse , ymouse;
    public userinfo() {
        initComponents();
    }

    userinfo(String u1) {
        initComponents();
        userid = u1;
        profilepic();
    }
    public void profilepic(){
        try{
            Connection con;
            myconnection reg = new myconnection();
            con = reg.getRegisterConnection();
            String sql = "select * from record where username ='"+userid+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                fn.setText(rs.getString(1));
                ln.setText(rs.getString(2));
                dob.setText(rs.getString(3));
                mob.setText(rs.getString(4));
                ema.setText(rs.getString(5));
                city.setText(rs.getString(8));
                dist.setText(rs.getString(9));
                pincode.setText(rs.getString(10));
                byte[] img = rs.getBytes(11);
                ImageIcon iu = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(132,155,Image.SCALE_SMOOTH));
                q.setIcon(iu);
                uu.setText(rs.getString(12));
            }
            else{JOptionPane.showMessageDialog(this,"ERROR");}
        }
        catch(Exception ex){}
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        mob = new javax.swing.JLabel();
        ema = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        dist = new javax.swing.JLabel();
        pincode = new javax.swing.JLabel();
        q = new javax.swing.JLabel();
        uu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Information");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 24));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/exit.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 28, 24));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/minimize.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 28, 24));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FIRST NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 64, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("D.O.B.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 64, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LAST NAME");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 64, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MOBILE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 64, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EMAIL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 64, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CITY");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 64, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DISTRICT");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 64, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PINCODE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 64, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/go-back.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 30, 30));

        fn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 158, 30));

        ln.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ln.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ln.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 158, 30));

        dob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dob.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 158, 30));

        mob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mob.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mob.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 158, 30));

        ema.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ema, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 210, 30));

        city.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        city.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        city.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        city.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 158, 30));

        dist.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dist.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 158, 30));

        pincode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pincode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pincode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pincode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 158, 30));

        q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 132, 150));

        uu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        uu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(uu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 132, 32));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/cool-background (2).png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(490, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(userinfo.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dashboard h = new dashboard();
        this.dispose();
        h.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JLabel dist;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel ema;
    private javax.swing.JLabel fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ln;
    private javax.swing.JLabel mob;
    private javax.swing.JLabel pincode;
    private javax.swing.JLabel q;
    private javax.swing.JLabel uu;
    // End of variables declaration//GEN-END:variables
}
