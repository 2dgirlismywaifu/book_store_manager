/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStoreManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author honkaiwaifu
 */
public class BillDetail extends javax.swing.JFrame {
    Connection con = NewConnection.getConnection();
    PreparedStatement ps, ps1;
    ResultSet rs;
    DefaultTableModel d;
    /**
     * Creates new form DAILYDOC
     */
    public BillDetail() {
        initComponents();
        User_load();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MaHD = new javax.swing.JTextField();
        MaSach = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TenSach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillInformationTable = new javax.swing.JTable();
        RefreshButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        ExcelExport = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        MaSachSearch = new javax.swing.JRadioButton();
        TenSachSearch = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        SoLuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(230, 34, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TIẾT HOÁ ĐƠN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mã hoá đơn");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mã sách");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Giá trị");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tên sách");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Số lượng");

        BillInformationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Giá trị", "Số lượng", "Thành tiền"
            }
        ));
        BillInformationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillInformationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillInformationTable);

        RefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RefreshButton.setText("Làm mới");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Tìm kiếm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        ExcelExport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExcelExport.setText("Xuất Excel");
        ExcelExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelExportActionPerformed(evt);
            }
        });

        MaSachSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaSachSearch.setText("Theo mã sách");

        TenSachSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TenSachSearch.setText("Theo tên sách");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Thành tiền");

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setText("Thoát");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RefreshButton)
                                .addGap(300, 300, 300)
                                .addComponent(ExcelExport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(MaSachSearch)
                                        .addGap(18, 18, 18)
                                        .addComponent(TenSachSearch))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Price, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TotalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(229, 229, 229)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TenSach)
                                            .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(MaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TenSachSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MaSachSearch))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ExcelExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed
    //Xuất Excel
    private void ExcelExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelExportActionPerformed
        // TODO add your handling code here:
        TableModel model = BillInformationTable.getModel();
        JFileChooser excelExportChooser = new JFileChooser();
        excelExportChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        excelExportChooser.setDialogTitle("Save Excel File");
        //filter the file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "*.xls", "xls", "xlsx", "xlsn");
        excelExportChooser.addChoosableFileFilter(filter);
        excelExportChooser.setFileFilter(filter);
        int excelchooser = excelExportChooser.showSaveDialog(null);

        if (excelchooser == JFileChooser.APPROVE_OPTION) {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("SalesReturnsDetails");

            Row row;
            Cell cell;

            try {
                // write the column headers
                row = sheet.createRow(0);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    cell = row.createCell(j);
                    cell.setCellValue(model.getColumnName(j));
                }

                for (int i = 0; i < model.getRowCount(); i++) {

                    row = sheet.createRow(i + 1);

                    for (int j = 0; j < model.getColumnCount(); j++) {
                        cell = row.createCell(j);
                        cell.setCellValue(model.getValueAt(i, j).toString());

                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            FileOutputStream excelFIS;

            try {
                excelFIS = new FileOutputStream(excelExportChooser.getSelectedFile() + ".xlsx");
                workbook.write(excelFIS);
                JOptionPane.showMessageDialog(null, "Xuất thành công",
                            "Thông báo",JOptionPane.INFORMATION_MESSAGE);
                workbook.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BillDetail.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BillDetail.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_ExcelExportActionPerformed

   //Tìm kiếm bản ghi
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String search = SearchField.getText();
        String mahd = MaHD.getText();
        try {
            if (MaSachSearch.isSelected()) {
                ps = con.prepareStatement("SELECT CHITIETHOADON.MaSach, THONGTINSACH.TenSach, THONGTINSACH.GiaTri,"
                    + "CHITIETHOADON.SoLuong, CHITIETHOADON.ThanhTien FROM HOADON, CHITIETHOADON, THONGTINSACH "
                    + "WHERE CHITIETHOADON.MaHD = HOADON.MaHD AND THONGTINSACH.MaSach = CHITIETHOADON.MaSach AND "
                    + "HOADON.MaHD = ? AND CHITIETHOADON.MaSach = ?");
                ps.setString(1,mahd);
                ps.setString(2,search);
                rs=ps.executeQuery();
                BillInformationTable.setModel(DbUtils.resultSetToTableModel(rs));
            } else if (TenSachSearch.isSelected()) {
                ps = con.prepareStatement("SELECT CHITIETHOADON.MaSach, THONGTINSACH.TenSach, THONGTINSACH.GiaTri,"
                    + "CHITIETHOADON.SoLuong, CHITIETHOADON.ThanhTien FROM HOADON, CHITIETHOADON, THONGTINSACH "
                    + "WHERE CHITIETHOADON.MaHD = HOADON.MaHD AND THONGTINSACH.MaSach = CHITIETHOADON.MaSach AND "
                    + "HOADON.MaHD = ? AND THONGTINSACH.TenSach = ?");
                ps.setString(1,mahd);
                ps.setString(2,search);
                rs=ps.executeQuery();
                BillInformationTable.setModel(DbUtils.resultSetToTableModel(rs));
            } else {
                JOptionPane.showMessageDialog(this,"Chưa chọn loại tìm kiếm","Tìm kiếm", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

   //làm mới
    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        MaSach.setText("");
        TenSach.setText("");
        Price.setText("");
        SoLuong.setText("");
        TotalPrice.setText("");
        
        User_load();
        clearchoose();
    }//GEN-LAST:event_RefreshButtonActionPerformed
    //thao tác trên bảng
    private void BillInformationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillInformationTableMouseClicked
        d = (DefaultTableModel)BillInformationTable.getModel();
        int selectIndex = BillInformationTable.getSelectedRow();
        MaSach.setText(d.getValueAt(selectIndex, 0).toString());
        TenSach.setText(d.getValueAt(selectIndex, 1).toString());
        Price.setText(d.getValueAt(selectIndex, 2).toString());
        SoLuong.setText(d.getValueAt(selectIndex, 3).toString());
        TotalPrice.setText(d.getValueAt(selectIndex, 4).toString());
    }//GEN-LAST:event_BillInformationTableMouseClicked
    //Load bảng từ SQL Server
    public void User_load() {
        int c;
        MaHD.setText(BillHistory.MaHD.getText());
        String mahd = MaHD.getText();
        //danh sach thong tin sach
        
        try {
            ps1 = con.prepareStatement("SELECT CHITIETHOADON.MaSach, THONGTINSACH.TenSach, THONGTINSACH.GiaTri,"
                    + "CHITIETHOADON.SoLuong, CHITIETHOADON.ThanhTien FROM HOADON, CHITIETHOADON, THONGTINSACH "
                    + "WHERE CHITIETHOADON.MaHD = HOADON.MaHD AND THONGTINSACH.MaSach = CHITIETHOADON.MaSach AND "
                    + "HOADON.MaHD = ?");
            ps1.setString(1, mahd);
            rs = ps1.executeQuery();
            
            ResultSetMetaData rad = rs.getMetaData();
            c = rad.getColumnCount();
            
            d = (DefaultTableModel)BillInformationTable.getModel();
            d.setRowCount(0);
            
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("CHITIETHOADON.MaSach"));
                    v2.add(rs.getString("THONGTINSACH.TenSach"));
                    v2.add(rs.getString("THONGTINSACH.GiaTri"));
                    v2.add(rs.getString("CHITIETHOADON.SoLuong"));
                    v2.add(rs.getString("CHITIETHOADON.ThanhTien"));
                }
                d.addRow(v2);
            }
             d.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(BillDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
                                                                                        
                
    }
    public void clearchoose() {
        MaSachSearch.setSelected(false);
        TenSachSearch.setSelected(false);
    }
    
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
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BillDetail dl = new BillDetail();
                dl.setVisible(true);
                dl.setResizable(false);
                dl.setTitle("Hồ sơ đại lý");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillInformationTable;
    private javax.swing.JButton ExcelExport;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField MaHD;
    private javax.swing.JTextField MaSach;
    private javax.swing.JRadioButton MaSachSearch;
    private javax.swing.JTextField Price;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTextField SoLuong;
    private javax.swing.JTextField TenSach;
    private javax.swing.JRadioButton TenSachSearch;
    private javax.swing.JTextField TotalPrice;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
