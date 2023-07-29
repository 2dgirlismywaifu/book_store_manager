/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.notelysia.bookstoremaven.Storage;

import com.notelysia.bookstoremaven.AboutSoftware;
import com.notelysia.bookstoremaven.ChangePassword.ChangePassAccount;
import com.notelysia.bookstoremaven.IconImageUtilities;
import com.notelysia.bookstoremaven.LoginForm;
import com.notelysia.bookstoremaven.LookandFeel;
import com.notelysia.bookstoremaven.NewConnection;
import com.notelysia.bookstoremaven.Recovery.RecKeyAccount;


public final class StoragePageForm extends javax.swing.JFrame {
    
    private final String username;
    IconImageUtilities iconImageUtilities = new IconImageUtilities();

    public StoragePageForm(String username) {
        initComponents();
        this.username = username;
        iconImageUtilities.setWindowImage(StoragePageForm.this);
        StorageAcc.setText(username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        StorageAcc = new javax.swing.JMenuItem();
        Changpassword = new javax.swing.JMenuItem();
        RecoveryKey = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        ExitApplication = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        BookInformation = new javax.swing.JMenuItem();
        BookPublisher = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        AboutSoftware = new javax.swing.JMenuItem();

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhập kho sách");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ NHẬP KHO SÁCH");
        jLabel2.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1200px-El_Ateneo_Bookstore.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        StorageAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-name-16.png"))); // NOI18N
        StorageAcc.setText("Thông tin tài khoản");
        StorageAcc.setEnabled(false);
        jMenu1.add(StorageAcc);

        Changpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modify-key-icon (1).png"))); // NOI18N
        Changpassword.setText("Thay đổi mật khẩu");
        Changpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangpasswordActionPerformed(evt);
            }
        });
        jMenu1.add(Changpassword);

        RecoveryKey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modify-key-icon (1).png"))); // NOI18N
        RecoveryKey.setText("Khoá phục hồi");
        RecoveryKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecoveryKeyActionPerformed(evt);
            }
        });
        jMenu1.add(RecoveryKey);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout-icon.png"))); // NOI18N
        Logout.setText("Đăng xuất");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jMenu1.add(Logout);

        ExitApplication.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ExitApplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-application-exit-icon.png"))); // NOI18N
        ExitApplication.setText("Thoát");
        ExitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitApplicationActionPerformed(evt);
            }
        });
        jMenu1.add(ExitApplication);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Thông tin");

        BookInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-create-document-16.png"))); // NOI18N
        BookInformation.setText("Thông tin sách");
        BookInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookInformationActionPerformed(evt);
            }
        });
        jMenu2.add(BookInformation);

        BookPublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-create-document-16.png"))); // NOI18N
        BookPublisher.setText("Nhà xuất bản");
        BookPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookPublisherActionPerformed(evt);
            }
        });
        jMenu2.add(BookPublisher);

        jMenuBar2.add(jMenu2);

        jMenu6.setText("Về");

        AboutSoftware.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-info-16.png"))); // NOI18N
        AboutSoftware.setText("Thông tin");
        AboutSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutSoftwareActionPerformed(evt);
            }
        });
        jMenu6.add(AboutSoftware);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   //thoát pm
    private void ExitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitApplicationActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_ExitApplicationActionPerformed
    //đăng xuất
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
         this.dispose();
         new LoginForm().main();
    }
//GEN-FIRST:event_LogoutActionPerformed

//GEN-LAST:event_LogoutActionPerformed
    //thay đổi mật khẩu
    private void ChangpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangpasswordActionPerformed
        // TODO add your handling code here:
        new ChangePassAccount(this, StorageAcc.getText()).main();
    }
//GEN-LAST:event_ChangpasswordActionPerformed
    //khoá phục hồi
    private void RecoveryKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecoveryKeyActionPerformed
        // TODO add your handling code here:       
        RecKeyAccount rk = new RecKeyAccount(StorageAcc.getText());
        rk.main();        
    }//GEN-LAST:event_RecoveryKeyActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void AboutSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutSoftwareActionPerformed
        // TODO add your handling code here:
        new AboutSoftware().main();
    }//GEN-LAST:event_AboutSoftwareActionPerformed

    private void BookInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookInformationActionPerformed
        // TODO add your handling code here:
        new BookInformation().main();
    }//GEN-LAST:event_BookInformationActionPerformed

    private void BookPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookPublisherActionPerformed
        // TODO add your handling code here:
        new BookPublishers().main();
    }//GEN-LAST:event_BookPublisherActionPerformed

    public void main() {
        /* Use FlatLaf theme */
        LookandFeel.setTheme();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StoragePageForm(username).setVisible(true);          
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutSoftware;
    private javax.swing.JMenuItem BookInformation;
    private javax.swing.JMenuItem BookPublisher;
    private javax.swing.JMenuItem Changpassword;
    private javax.swing.JMenuItem ExitApplication;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenuItem RecoveryKey;
    private javax.swing.JMenuItem StorageAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
