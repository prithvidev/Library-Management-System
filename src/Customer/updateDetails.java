/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import static library.management.addnewcustomer.cid;
import library.management.myconnection;

/**
 *
 * @author PrithviDevKumar
 */
public class updateDetails extends javax.swing.JFrame {

    /**
     * Creates new form updateDetails
     */
    String filename;
     byte[] p_image = null;
    String w;
    int xmouse, ymouse;
    String wq;
    String userid;
    public updateDetails() {
        initComponents();
    }

    updateDetails(String user){
        initComponents();
        userid = user;
        labeldisplay();
    }
     public final void labeldisplay(){
        try{
            Connection con;
            myconnection reg = new myconnection();
            con = reg.getRegisterConnection();
            String sql1 = "Select * from Customer where CustomerID='"+userid+"'";
            PreparedStatement ps = con.prepareStatement(sql1);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cid.setText(rs.getString("CustomerID"));
                cn.setText(rs.getString("Customername"));
                dob.setDate(rs.getDate("DateOfBirth"));
                mob.setText(rs.getString("Mobile"));
                em.setText(rs.getString("email"));
                p.setText(rs.getString("password"));
                doj.setText(rs.getString("DateOfJoin"));
                add.setText(rs.getString("address"));
                pc.setText(rs.getString("Pincode"));
                 byte[] img = rs.getBytes("profilepic");
        ImageIcon iu = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(132, 150 , Image.SCALE_SMOOTH));
        profile.setIcon(iu);
            }
        }catch(SQLException ex){ }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        p = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pc = new javax.swing.JTextField();
        profile = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        doj = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Details Update");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 24));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/exit.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 28, 24));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/minimize.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 28, 24));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/go-back.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 30, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customer ID");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 102, 30));

        cid.setEditable(false);
        cid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Name");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 102, 30));

        cn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date Of Birth");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 102, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mobile");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 102, 30));

        mob.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 102, 30));

        em.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        em.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emFocusLost(evt);
            }
        });
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 102, 30));
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 170, 31));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Date Of Joining");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 102, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Address");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 102, 30));

        add.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 170, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Pincode");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 102, 30));

        pc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });
        getContentPane().add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 170, 30));

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 132, 150));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("UPLOAD");
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 85, 31));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 121, 42));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 36, 31));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, 30));

        doj.setEditable(false);
        doj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 170, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/cool-background (2).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 550));

        setSize(new java.awt.Dimension(520, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(Cust_issue_detail.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x  = evt.getXOnScreen();
        int y  = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        Cust_issue_detail h = new Cust_issue_detail(userid);
        h.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void emFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emFocusLost
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(em.getText());

        if(!m.matches()){
            error.setIcon(new ImageIcon("E:\\Netbeans project new\\Email\\src\\email\\Danger.png"));
            em.setText("");
            em.requestFocus(true);
        }
        else{
            error.setIcon(new ImageIcon("E:\\Netbeans project new\\Email\\src\\email\\Yes.png"));
        }
    }//GEN-LAST:event_emFocusLost

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited

    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileFilter ii =  new FileNameExtensionFilter(".jpg",ImageIO.getReaderFileSuffixes());
        chooser.setFileFilter(ii);
        int y = chooser.showOpenDialog(null);
        if(y == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            filename = f.getAbsolutePath();
        }
        else{JOptionPane.showMessageDialog(this, "Please Select Image");}
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(profile.getWidth(), profile.getHeight(), Image.SCALE_SMOOTH));
        profile.setIcon(imageicon);

        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readnum;(readnum = fis.read(buf))!=-1;){
                bos.write(buf,0,readnum);
            }
            p_image = bos.toByteArray();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"ERROR2");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       
        String Cust_name = cn.getText();
        String birth = sdf.format(dob.getDate());
        String phone = mob.getText();
        String email = em.getText();
        String pass = p.getText();
        String address = add.getText();
        String pincode = pc.getText();
        String join = doj.getText();
        
        if(Cust_name.isEmpty() || birth.isEmpty() || phone.isEmpty() || email.isEmpty() || pass.isEmpty() || address.isEmpty() || pincode.isEmpty()){
            JOptionPane.showMessageDialog(this,"Check All the Boxes");
        }
        else{
            try{
                Connection con;
                myconnection reg = new myconnection();
                con = reg.getRegisterConnection();
                String sql1 = "update Customer set CustomerID =?,Customername=?,DateOfBirth=?,Mobile=?,email=?,password=?,DateOfJoin=?,Address=?,Pincode=?,profilepic=? where CustomerID='"+userid+"'";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setString(1, userid);
                ps1.setString(2, cn.getText());
                ps1.setString(3, sdf.format(dob.getDate()));
                ps1.setString(4, mob.getText());
                ps1.setString(5, em.getText());
                ps1.setString(6, p.getText());
                ps1.setString(7, doj.getText());
                ps1.setString(8, add.getText());
                ps1.setString(9, pc.getText());
                ps1.setBytes(10, p_image);
                
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(this, "Details Updated!");
                cn.setText("");
                dob.setDate(date);
                mob.setText("");
                em.setText("");
                p.setText("");
                add.setText("");
                pc.setText("");
                }catch (SQLException ex) {
            Logger.getLogger(updateDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
           

        
    }//GEN-LAST:event_jButton4ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new updateDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    public static javax.swing.JTextField cid;
    private javax.swing.JTextField cn;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField doj;
    private javax.swing.JTextField em;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mob;
    private javax.swing.JPasswordField p;
    private javax.swing.JTextField pc;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
