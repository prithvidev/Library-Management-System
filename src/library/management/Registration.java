/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    String filename;
    byte[] p_image = null;
    String w ;
    int xmouse, ymouse;
    public Registration() {
        initComponents();
        a1.setVisible(false);
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        a5.setVisible(false);
        a6.setVisible(false);
        a7.setVisible(false);
        a8.setVisible(false);
        a9.setVisible(false);
        a10.setVisible(false);
        a11.setVisible(false);
        try{
            Connection con1;
            myconnection reg = new myconnection();
            con1 = reg.getRegisterConnection();
            String sql = "select count(user_id) from record";
            PreparedStatement pss = con1.prepareStatement(sql);
            ResultSet rs1 = pss.executeQuery();
            if(rs1.next()){
                int w1 = Integer.parseInt(rs1.getString("count(user_id)"));
                
                int sum = 1000+w1+1;
                w = Integer.toString(sum);
            }
        }
        catch(NumberFormatException | SQLException e){}
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
        fn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dist = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pinc = new javax.swing.JTextField();
        q = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        a2 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

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
        jLabel2.setText("Registration");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 24));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/exit.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 2, 28, 24));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/minimize.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 2, 28, 24));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FIRST NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 56, 64, 30));

        fn.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        fn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fnMouseExited(evt);
            }
        });
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnKeyPressed(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 57, 132, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("D.O.B.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 118, 64, 30));

        dob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dobMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobMouseExited(evt);
            }
        });
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 118, 130, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LAST NAME");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 56, 64, 30));

        ln.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        ln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lnMouseExited(evt);
            }
        });
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnKeyPressed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 57, 132, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MOBILE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 117, 64, 30));

        mob.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        mob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mobMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mobMouseExited(evt);
            }
        });
        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        jPanel1.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 118, 136, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EMAIL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 178, 64, 30));

        em.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        em.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emFocusLost(evt);
            }
        });
        em.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emMouseExited(evt);
            }
        });
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 179, 271, 30));
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 178, 36, 31));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("USERNAME");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 239, 64, 30));

        user1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user1MouseExited(evt);
            }
        });
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });
        jPanel1.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 132, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PASSWORD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 239, 64, 30));

        pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pass1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pass1MouseExited(evt);
            }
        });
        jPanel1.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 239, 132, 31));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CITY");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 288, 64, 30));

        city.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        city.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cityMouseExited(evt);
            }
        });
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 289, 132, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DISTRICT");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 288, 64, 30));

        dist.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        dist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                distMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                distMouseExited(evt);
            }
        });
        dist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distActionPerformed(evt);
            }
        });
        jPanel1.add(dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 289, 132, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PINCODE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 337, 64, 30));

        pinc.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        pinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pincMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pincMouseExited(evt);
            }
        });
        pinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincActionPerformed(evt);
            }
        });
        pinc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pincKeyPressed(evt);
            }
        });
        jPanel1.add(pinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 338, 132, 30));

        q.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 132, 150));

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

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("IMAGE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 337, 64, 30));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 337, 85, 31));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("SUBMIT");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 114, -1));

        a2.setText("Last Name");
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 80, 18));

        a1.setText("First Name");
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 18));

        a3.setText("Date of Birth");
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 80, 20));

        a4.setText("Mobile Number");
        jPanel1.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 90, 20));

        a5.setText("Email");
        jPanel1.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, 20));

        a6.setText("Username");
        jPanel1.add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 70, -1));

        a7.setText("Password");
        jPanel1.add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, -1));

        a8.setText("City");
        jPanel1.add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 70, -1));

        a9.setText("District");
        jPanel1.add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 60, -1));

        a10.setText("Pincode");
        jPanel1.add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 80, -1));

        a11.setText("Choose Image");
        jPanel1.add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 90, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/cool-background (2).png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(Registration.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void distActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distActionPerformed

    private void pincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pincActionPerformed

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
       catch(IOException ex){
           JOptionPane.showMessageDialog(this,"ERROR2");
       }
       
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void fnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            fn.setEditable(true);
        }
        else{
            fn.setEditable(false);
        }
    }//GEN-LAST:event_fnKeyPressed

    private void lnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            ln.setEditable(true);
        }
        else{
            ln.setEditable(false);
        }
    }//GEN-LAST:event_lnKeyPressed

    private void pincKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pincKeyPressed
        String p1 = pinc.getText();
       char c = evt.getKeyChar(); 
       
        if(p1.length()<7 || evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE  || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            pinc.setEditable(true);
        }else{pinc.setEditable(false);}
    }//GEN-LAST:event_pincKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String fname = fn.getText();
        String lname = ln.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birth = sdf.format(dob.getDate());
        String mobile = mob.getText();
        String email = em.getText();
        String pass = pass1.getText();
        String user = user1.getText();
        String cit = city.getText();
        String district = dist.getText();
        String pincode = pinc.getText();
        String wq = "DEV-".concat(w);
        Date date = new Date();
        if(fname.isEmpty() || lname.isEmpty() || birth.isEmpty() || mobile.isEmpty() || email.isEmpty() || pass.isEmpty() || user.isEmpty() || cit.isEmpty() || district.isEmpty() || pincode.isEmpty()){
        JOptionPane.showMessageDialog(null,"Check All Boxes");}
        else {
            try{
            Connection con;
            myconnection register = new myconnection();
            con = register.getRegisterConnection();
            String sql1 = "select * from record where email='"+email+"'&& username='"+user+"'&& password='"+pass+"'&& phno="+mobile;
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ResultSet rs = ps1.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Already Exists");
                fn.setText("");
                ln.setText("");
                dob.setDate(date);
                mob.setText("");
                em.setText("");
                pass1.setText("");
                user1.setText("");
                city.setText("");
                dist.setText("");
                pinc.setText("");
                q.setText("");
            }
            else{
            String sql = "insert into record(first_name,last_name,dob,phno,email,username,password,city,address,pincode,image,user_id)values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, birth);
            ps.setString(4, mobile);
            ps.setString(5, email);
            ps.setString(6, user);
            ps.setString(7, pass);
            ps.setString(8, cit);
            ps.setString(9, district);
            ps.setString(10, pincode);
            ps.setBytes(11, p_image);
            ps.setString(12, wq);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "SUCCESSFULLY REGISTERED");
            fn.setText("");
                ln.setText("");
                dob.setDate(date);
                mob.setText("");
                em.setText("");
                pass1.setText("");
                user1.setText("");
                city.setText("");
                dist.setText("");
                pinc.setText("");
                q.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void fnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnMouseEntered
        a1.setVisible(true);
    }//GEN-LAST:event_fnMouseEntered

    private void fnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnMouseExited
        a1.setVisible(false);
    }//GEN-LAST:event_fnMouseExited

    private void lnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnMouseEntered
        a2.setVisible(true);
    }//GEN-LAST:event_lnMouseEntered

    private void lnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnMouseExited
        a2.setVisible(false);
    }//GEN-LAST:event_lnMouseExited

    private void dobMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobMouseEntered
        a3.setVisible(true);
    }//GEN-LAST:event_dobMouseEntered

    private void dobMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobMouseExited
        a3.setVisible(false);
    }//GEN-LAST:event_dobMouseExited

    private void mobMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobMouseEntered
        a4.setVisible(true);
    }//GEN-LAST:event_mobMouseEntered

    private void mobMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobMouseExited
        a4.setVisible(false);
    }//GEN-LAST:event_mobMouseExited

    private void emMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emMouseEntered
        a5.setVisible(true);
    }//GEN-LAST:event_emMouseEntered

    private void emMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emMouseExited
        a5.setVisible(false);
    }//GEN-LAST:event_emMouseExited

    private void user1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseEntered
        a6.setVisible(true);
    }//GEN-LAST:event_user1MouseEntered

    private void user1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseExited
        a6.setVisible(false);
    }//GEN-LAST:event_user1MouseExited

    private void pass1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass1MouseEntered
        a7.setVisible(true);
    }//GEN-LAST:event_pass1MouseEntered

    private void pass1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass1MouseExited
        a7.setVisible(false);
    }//GEN-LAST:event_pass1MouseExited

    private void cityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityMouseEntered
        a8.setVisible(true);
    }//GEN-LAST:event_cityMouseEntered

    private void cityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityMouseExited
        a8.setVisible(false);
    }//GEN-LAST:event_cityMouseExited

    private void distMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distMouseEntered
        a9.setVisible(true);
    }//GEN-LAST:event_distMouseEntered

    private void distMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distMouseExited
        a9.setVisible(false);
    }//GEN-LAST:event_distMouseExited

    private void pincMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pincMouseEntered
        a10.setVisible(true);
    }//GEN-LAST:event_pincMouseEntered

    private void pincMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pincMouseExited
        a10.setVisible(false);
    }//GEN-LAST:event_pincMouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        a11.setVisible(true);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        a11.setVisible(false);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        login h = new login();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JTextField city;
    private javax.swing.JTextField dist;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField em;
    private javax.swing.JLabel error;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mob;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JTextField pinc;
    private javax.swing.JLabel q;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
