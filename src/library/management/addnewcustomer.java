/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library.management;

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

/**
 *
 * @author PrithviDevKumar
 */
public class addnewcustomer extends javax.swing.JFrame {

    /** Creates new form addnewcustomer */
    
    int xmouse, ymouse;
    String wq ;
        
    String filename;
    byte[] p_image = null;
    String w;
    public addnewcustomer() {
        initComponents();
        try{
            Connection con1;
            myconnection reg = new myconnection();
            con1 = reg.getRegisterConnection();
            String sql = "select count(CustomerID) from Customer";
            PreparedStatement pss = con1.prepareStatement(sql);
            ResultSet rs1 = pss.executeQuery();
            if(rs1.next()){
                int w1 = Integer.parseInt(rs1.getString("count(CustomerID)"));
                
                int sum = 1000+w1;
                w = Integer.toString(sum);
                wq = "CDL-".concat(w);
                cid.setText(wq);
            }
        }
        catch(Exception e){}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        doj = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        pc = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        error = new javax.swing.JLabel();
        p = new javax.swing.JPasswordField();
        q = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("New Customer");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 24));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/minimize.png"))); // NOI18N
        jButton26.setContentAreaFilled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 28, 24));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/exit.png"))); // NOI18N
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 28, 24));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 525, 30));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/go-back.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customer ID");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 11, 102, 30));

        cid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 11, 170, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Name");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 59, 102, 30));

        cn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 59, 170, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date Of Birth");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 107, 102, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mobile");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 155, 102, 30));

        mob.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 155, 170, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 203, 102, 30));

        em.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        em.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emFocusLost(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 203, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 250, 102, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 121, 42));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date Of Joining");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 300, 102, 30));
        jPanel1.add(doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 300, 170, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Address");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 348, 102, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pincode");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 396, 102, 30));

        add.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 348, 170, 30));

        pc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });
        jPanel1.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 396, 170, 30));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 107, 170, 30));
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 203, 36, 31));
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 251, 170, 31));

        q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 11, 132, 150));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("UPLOAD");
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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 179, 85, 31));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 520, 500));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/cool-background (2).png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(523, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton26jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26jButton2ActionPerformed
        this.setExtendedState(addnewcustomer.ICONIFIED);
    }//GEN-LAST:event_jButton26jButton2ActionPerformed

    private void jButton25jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton25jButton1ActionPerformed

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
        dashboard h = new dashboard();
        h.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date date = new Date();
        
        String Cust_name = cn.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birth = sdf.format(dob.getDate());
        String phone = mob.getText();
        String email = em.getText();
        String pass = p.getText();
        String join = sdf.format(doj.getDate());
        String address = add.getText();
        String pincode = pc.getText();
        
        if(Cust_name.isEmpty() || birth.isEmpty() || phone.isEmpty() || email.isEmpty() || pass.isEmpty() || join.isEmpty() || address.isEmpty() || pincode.isEmpty()){
            JOptionPane.showMessageDialog(this,"Check All the Boxes");
        }
        else{
            try{
                Connection con;
                myconnection reg = new myconnection();
                con = reg.getRegisterConnection();
                String sql = "select * from Customer where CustomerID = '"+wq+"'";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                JOptionPane.showMessageDialog(this, "Already Exist");
               
                cn.setText("");
                dob.setDate(date);
                mob.setText("");
                em.setText("");
                p.setText("");
                doj.setDate(date);
                add.setText("");
                pc.setText("");
                }
                else{
                String sql1 = "insert into Customer(CustomerID,Customername,DateOfBirth,Mobile,email,password,DateOfJoin,Address,Pincode,profilepic)values(?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                
                ps1.setString(1, wq);
                ps1.setString(2, Cust_name);
                ps1.setString(3, birth);
                ps1.setString(4, phone);
                ps1.setString(5, email);
                ps1.setString(6, pass);
                ps1.setString(7, join);
                ps1.setString(8, address);
                ps1.setString(9, pincode);
                ps1.setBytes(10, p_image);
                
                ps1.executeUpdate();
                JOptionPane.showMessageDialog(this, "New Customer Added Successfully");
                cid.setText(wq);
                cn.setText("");
                dob.setDate(date);
                mob.setText("");
                em.setText("");
                p.setText("");
                doj.setDate(date);
                add.setText("");
                pc.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(addnewcustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(q.getWidth(), q.getHeight(), Image.SCALE_SMOOTH));
        q.setIcon(imageicon);

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
            java.util.logging.Logger.getLogger(addnewcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewcustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    public static javax.swing.JTextField cid;
    private javax.swing.JTextField cn;
    private com.toedter.calendar.JDateChooser dob;
    private com.toedter.calendar.JDateChooser doj;
    private javax.swing.JTextField em;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField mob;
    private javax.swing.JPasswordField p;
    private javax.swing.JTextField pc;
    private javax.swing.JLabel q;
    // End of variables declaration//GEN-END:variables

}
