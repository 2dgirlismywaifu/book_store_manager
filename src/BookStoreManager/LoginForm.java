/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStoreManager;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
/**
 *
 * @author honkaiwaifu
 */
public class LoginForm extends javax.swing.JFrame {
    Connection con = NewConnection.getConnection();
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Label2 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        CheckBox1 = new javax.swing.JCheckBox();
        userfield = new javax.swing.JTextField();
        PasswordField1 = new javax.swing.JPasswordField();
        ConnectStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        LevelSelection = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        ReloadButton = new javax.swing.JMenu();
        ConnectionButton = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        ExitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Software");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-key-32.png"))); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP HỆ THỐNG");
        jLabel1.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-login-32.png"))); // NOI18N
        jButton1.setText("Đăng Nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-password-32.png"))); // NOI18N
        Label2.setText("Mật khẩu");

        Label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-user-32.png"))); // NOI18N
        Label1.setText("Tài khoản");

        CheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckBox1.setText("Hiện mật khẩu");
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });

        userfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userfieldKeyPressed(evt);
            }
        });

        PasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordField1KeyPressed(evt);
            }
        });

        ConnectStatus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ConnectStatus.setText("Database Status");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Quên mật khẩu");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        Label3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-user-32.png"))); // NOI18N
        Label3.setText("Cấp độ");

        LevelSelection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LevelSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn cấp độ", "Quản Trị", "Thủ Kho", "Bán Hàng" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(CheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LevelSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userfield)
                                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(118, 118, 118))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConnectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(LevelSelection))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBox1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConnectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ReloadButton.setText("Main");
        ReloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadButtonActionPerformed(evt);
            }
        });

        ConnectionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-create-document-16.png"))); // NOI18N
        ConnectionButton.setText("Sửa kết nối");
        ConnectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectionButtonActionPerformed(evt);
            }
        });
        ReloadButton.add(ConnectionButton);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Logout-icon.png"))); // NOI18N
        jMenuItem2.setText("Khởi động lại");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ReloadButton.add(jMenuItem2);

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Actions-application-exit-icon.png"))); // NOI18N
        ExitButton.setText("Thoát");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        ReloadButton.add(ExitButton);

        jMenuBar1.add(ReloadButton);

        jMenu2.setText("About");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8-info-16.png"))); // NOI18N
        jMenuItem1.setText("Về phần mềm");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       if (con != null) {
           this.ConnectStatus.setText("Kết nối thành công");
           this.ConnectStatus.setForeground(Color.green);
        }
       else {          
           this.ConnectStatus.setText("Kết nối thất bại");
           this.ConnectStatus.setForeground(Color.red);
       }
    }//GEN-LAST:event_formWindowOpened
   
    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        // TODO add your handling code here:
        if (CheckBox1.isSelected()){
            PasswordField1.setEchoChar((char)0);
        } else {
            PasswordField1.setEchoChar('*');
        }

    }//GEN-LAST:event_CheckBox1ActionPerformed

    //login function
    private void Login_form() {
        String type = LevelSelection.getSelectedItem().toString();
        
        PreparedStatement ps0, ps;
        ResultSet rs0, rs;
        if(userfield.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Trường User không được trống!",
                "Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        else if(PasswordField1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Trường Password không được trống!",
                "Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        else if(LevelSelection.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn cấp độ tài khoản!",
                "Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                ps0 = con.prepareStatement("SELECT * FROM DANGNHAP WHERE Username = ?");
                ps0.setString(1, userfield.getText());
                rs0 = ps0.executeQuery();
                if (rs0.next()) {
                    String getpassword = String.valueOf(rs0.getString("password"));
                     if (BCrypt.checkpw( PasswordField1.getText(), getpassword)) {                       
                         JOptionPane.showMessageDialog(null,"Giải mã thành công!\nThực hiện đăng nhập",
                                "Đăng Nhập",JOptionPane.INFORMATION_MESSAGE);   
                         this.dispose();
                            
                        //now check level account
                            String gettype = rs0.getString(4);
                            if (gettype.equals(type) && type.equals("Quản Trị")) {
                                 AdminPageForm mf0 = new AdminPageForm();
                                //hiện tên người dùng ở trên
                                mf0.UserName.setText(rs0.getString(2));
                                mf0.setVisible(true);
                                mf0.setResizable(false);
                                mf0.pack();
                                mf0.setLocationRelativeTo(null);
                                mf0.setTitle("Quản trị hệ thống");
                                mf0.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            }
                            else if (gettype.equals(type) && type.equals("Thủ Kho")) {
                                 StoragePageForm mf1 = new StoragePageForm();
                                //hiện tên người dùng ở trên
                                mf1.UserName.setText(rs0.getString(2));
                                mf1.setVisible(true);
                                mf1.setResizable(false);
                                mf1.pack();
                                mf1.setLocationRelativeTo(null);
                                mf1.setTitle("Quản lý thủ kho");
                                mf1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            }
                            else if (gettype.equals(type) && type.equals("Bán Hàng")) {
                                 SalerPageForm mf2 = new SalerPageForm();
                                //hiện tên người dùng ở trên
                                mf2.UserName.setText(rs0.getString(2));
                                mf2.setVisible(true);
                                mf2.setResizable(false);
                                mf2.pack();
                                mf2.setLocationRelativeTo(null);
                                mf2.setTitle("Nhân viên bán hàng");
                                mf2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            }
                           
                        
                     } else {
                         JOptionPane.showMessageDialog(null,"Sai tài khoản hoặc mật khẩu",
                                "Đăng Nhập",JOptionPane.ERROR_MESSAGE);
                            userfield.setText("");
                            PasswordField1.setText("");
                     }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Thực hiện không thành công\nNếu bạn thay đổi kết nối;\nVui lòng khởi động lại phần mềm!","Thông báo", JOptionPane.ERROR_MESSAGE);
                java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login_form();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    //trườnng nhập mật khẩu
    private void PasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Login_form();
            }
    }//GEN-LAST:event_PasswordField1KeyPressed
    //trường nhập user
    private void userfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userfieldKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
                if(userfield.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Nhập tên tài khoản đăng nhập!",
                "Thông báo",JOptionPane.ERROR_MESSAGE);
                } else {
                    PasswordField1.requestFocus();
                }
            }
    }//GEN-LAST:event_userfieldKeyPressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        dispose();
        ForgotPassword fp = new ForgotPassword();
        fp.setVisible(true);
        fp.setResizable(false);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setTitle("Quên mật khẩu");
    }//GEN-LAST:event_jLabel2MousePressed

    private void ReloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadButtonActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_ReloadButtonActionPerformed

    private void ConnectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectionButtonActionPerformed
        // TODO add your handling code here:       
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "database/app.config");
            pb.start();
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Tập tin không tồn tại\nLiên hệ quản trị hệ thống để hỗ trợ!","Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConnectionButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        this.dispose();
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.setResizable(false);
        lf.setTitle("Đăng nhập hệ thống");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        try {
            // TODO add your handling code here:
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AboutSoftware as = new AboutSoftware();
        as.setVisible(true);
        as.setResizable(false);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setTitle("Về phần mềm");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginForm lf = new LoginForm();
                lf.setVisible(true);
                lf.setResizable(false);
                lf.setTitle("Đăng nhập hệ thống");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox1;
    public javax.swing.JLabel ConnectStatus;
    private javax.swing.JMenuItem ConnectionButton;
    private javax.swing.JMenuItem ExitButton;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JComboBox<String> LevelSelection;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JMenu ReloadButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
