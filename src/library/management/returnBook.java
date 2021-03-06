/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PrithviDevKumar
 */
public class returnBook extends javax.swing.JFrame {

    /**
     * Creates new form returnBook
     */
    int xmouse, ymouse;
    String ll, pp;
    public returnBook() {
        initComponents();
        
    }

    returnBook(String u1, String display) {
        ll = u1;
        pp = display;
    }
    private void add(){
        String cust_id = cid.getText();
        String b_id = bid.getText();
        String cust_name = cn.getText();
        String phone = mob.getText();
        String book_name = bname.getText();
        String author = auth.getText();
        String doi = issueDate.getText();
        String dor = returnDate.getText();
        String l = lfee.getText();
        String pp = finestatus.getSelectedItem().toString();
        try{
                Connection con;
                myconnection reg = new myconnection();
                con= reg.getRegisterConnection();
                String sql = "insert into retunbook(customerid,bookid,customername,mobile,bookname,author,dateofissue,dateofreturn,latefee,finestatus)values(?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                
                ps.setString(1, cust_id);
                ps.setString(2, b_id);
                ps.setString(3, cust_name);
                ps.setString(4, phone);
                ps.setString(5, book_name);
                ps.setString(6, author);
                ps.setString(7, doi);
                ps.setString(8, dor);
                ps.setString(9, l);
                ps.setString(10, pp);
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book Returned");
                con.close();
        }
        catch(HeadlessException | SQLException e){}
    }
    
    private void delete(){
        String cust_id = cid.getText();
        String book_id = bid.getText();
        try {
            Connection con;
            myconnection reg = new myconnection();
            con= reg.getRegisterConnection();
            String sql = "delete from issuebook where customerid ='"+cust_id+"'&& bookid ='"+book_id+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("ISSUED BOOK RETURNED");
        } catch (SQLException ex) {
            Logger.getLogger(returnBook.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        issueDate = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        auth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        returnDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lfee = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        finestatus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel26.setText("Return Book");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 24));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/exit.png"))); // NOI18N
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 28, 24));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/minimize.png"))); // NOI18N
        jButton26.setContentAreaFilled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 28, 24));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/go-back.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 30, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Customer ID");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 102, 30));

        cid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel3.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/search.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 32, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Name");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 102, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mobile");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 102, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date of Issue");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 102, 30));

        issueDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        issueDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                issueDateFocusGained(evt);
            }
        });
        issueDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueDateMouseClicked(evt);
            }
        });
        jPanel3.add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 160, 30));

        mob.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel3.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, 30));

        cn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel3.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Book ID");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 102, 30));

        bid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel3.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 160, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Name");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 102, 30));

        bname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnameActionPerformed(evt);
            }
        });
        jPanel3.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 160, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Author");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 102, 30));

        auth.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        auth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authActionPerformed(evt);
            }
        });
        jPanel3.add(auth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Date of Return");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 102, 30));

        returnDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        returnDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                returnDateFocusGained(evt);
            }
        });
        returnDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnDateMouseClicked(evt);
            }
        });
        returnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnDateActionPerformed(evt);
            }
        });
        jPanel3.add(returnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 160, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Late Fee");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 102, 30));

        lfee.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lfeeFocusGained(evt);
            }
        });
        lfee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lfeeMouseClicked(evt);
            }
        });
        jPanel3.add(lfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fine Status");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 102, 30));

        finestatus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        finestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAID", "NOT-PAID" }));
        finestatus.setSelectedIndex(-1);
        finestatus.setOpaque(false);
        jPanel3.add(finestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 158, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("RETURN");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 459, 123, 23));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/cool-background (2).png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(308, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton25jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25jButton1ActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_jButton25jButton1ActionPerformed

    private void jButton26jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26jButton2ActionPerformed
        this.setExtendedState(returnBook.ICONIFIED);
    }//GEN-LAST:event_jButton26jButton2ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cust_id = cid.getText();
        String book_id = bid.getText();
        if(cust_id.isEmpty() || book_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill CustomerID and BookID in the particular boxes");
        }
        else{
            try{
                Connection con;
                myconnection reg = new myconnection();
                con = reg.getRegisterConnection();
                String sql = "select * from issuebook where Bookid = '"+book_id+"'&& customerid = '"+cust_id+"'";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    cn.setText(rs.getString(6));
                    mob.setText(rs.getString(7));
                    bname.setText(rs.getString(2));
                    auth.setText(rs.getString(3));
                    issueDate.setText(rs.getString(4));
                    returnDate.setText(rs.getString(8));
                    String r = rs.getString(8);
                    Date returnD = new SimpleDateFormat("yyyy-MM-dd").parse(r);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date today = sdf.parse(sdf.format(new Date()));
                    if(today.after(returnD)){
                        long daysbetween = returnD.getTime() - today.getTime();
                        long d = TimeUnit.DAYS.convert(daysbetween , TimeUnit.MILLISECONDS);
                        long fine = d * -5;
                        lfee.setText(fine+"");
                    }
                    else{lfee.setText(0+"");}
                }
                else{JOptionPane.showMessageDialog(this,"No Record Found","Return Book",JOptionPane.INFORMATION_MESSAGE);}
            }catch(SQLException ex){System.out.println("ERROR"+ex);} catch (ParseException ex) {
                Logger.getLogger(returnBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void issueDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_issueDateFocusGained
        
    }//GEN-LAST:event_issueDateFocusGained

    private void issueDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueDateMouseClicked
        
    }//GEN-LAST:event_issueDateMouseClicked

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnameActionPerformed

    private void authActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authActionPerformed

    private void returnDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_returnDateFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_returnDateFocusGained

    private void returnDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_returnDateMouseClicked

    private void lfeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lfeeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lfeeFocusGained

    private void lfeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lfeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lfeeMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dashboard h = new dashboard();
        this.dispose();
        h.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cust_id = cid.getText();
        String b_id = bid.getText();
        String cust_name = cn.getText();
        String phone = mob.getText();
        String book_name = bname.getText();
        String author = auth.getText();
        String doi = issueDate.getText();
        String dor = returnDate.getText();
        String l = lfee.getText();
        String status = finestatus.getSelectedItem().toString();
        
        if(cust_id.isEmpty() || b_id.isEmpty() || cust_name.isEmpty() || phone.isEmpty() || book_name.isEmpty() || author.isEmpty() || doi.isEmpty() || dor.isEmpty() || l.isEmpty() || status.equals("-1")){
            JOptionPane.showMessageDialog(this, "Fill all the Boxes");
        }
        else{
            add();
            delete();
            JOptionPane.showMessageDialog(this,"BOOK RETURNED!!","Return Book",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void returnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnDateActionPerformed

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
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auth;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cn;
    private javax.swing.JComboBox<String> finestatus;
    private javax.swing.JTextField issueDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField lfee;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField returnDate;
    // End of variables declaration//GEN-END:variables
}
