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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Vector;
import java.util.regex.Pattern;
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
public class EmployeeInformation extends javax.swing.JFrame {
    Connection con = NewConnection.getConnection();
    PreparedStatement ps, ps1, ps2;
    ResultSet rs, rs1, rs2;
    DefaultTableModel d;
    /**
     * Creates new form DAILYDOC
     */
    public EmployeeInformation() {
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
        MaNV = new javax.swing.JTextField();
        TenNV = new javax.swing.JTextField();
        TelEmployee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeInformation = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        ExcelExport = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        JobName = new javax.swing.JTextField();
        SearchSelection = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(230, 34, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN NHÂN VIÊN");

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
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Số điện thoại");

        MaNV.setEditable(false);
        MaNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MaNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaNV.setText("Mã ngẫu nhiên");

        TenNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TelEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Địa chỉ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Chức vụ");

        Email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        EmployeeInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Email", "Địa chỉ", "Chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeInformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeInformation);

        SaveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveButton.setText("Lưu");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        EditButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditButton.setText("Sửa");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteButton.setText("Xoá");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        RefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RefreshButton.setText("Làm mới");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.setText("Tìm kiếm");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        ExcelExport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExcelExport.setText("Xuất Excel");
        ExcelExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelExportActionPerformed(evt);
            }
        });

        SearchField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setText("Thoát");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        JobName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        SearchSelection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SearchSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn loại tìm kiếm", "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Email", "Địa chỉ", "Chức vụ" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(RefreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(ExcelExport)
                        .addGap(49, 49, 49)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TelEmployee, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(MaNV))
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email)
                            .addComponent(JobName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(SearchSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TelEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JobName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchSelection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExcelExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Load bảng từ SQL Server
    public void User_load() {
        int c;
        MaNV.setText("Mã ngẫu nhiên");

        //danh sach thong tin sach
        
        try {
            ps1 = con.prepareStatement("SELECT * FROM NHANVIEN");
            rs = ps1.executeQuery();
            
            ResultSetMetaData rad = rs.getMetaData();
            c = rad.getColumnCount();
            
            d = (DefaultTableModel)EmployeeInformation.getModel();
            d.setRowCount(0);
            
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("MaNV"));
                    v2.add(rs.getString("TenNV"));
                    v2.add(rs.getString("Tel"));
                    v2.add(rs.getString("Email"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("Job"));                                      
                }
                d.addRow(v2);
            }
             d.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
                                                                                        
                
    }
   
    //hàm kiểm tra email nhập vào có tên miền tồn tại không?
    public static String email_Validation (String email) {
        String email_Pattern = "^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(email_Pattern);
        if (pattern.matcher(email).matches()) {
            return "Vaild";
        } else {
            return "Invaild";
        }
    }
    
    //thêm nhân viên
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:     
        String employeecode, name, tel, email, addr, job, status;
        //tao ma nxb ngau nhien 6 chu so
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        // this will convert any number sequence into 6 character.
        employeecode = String.format("%06d", number);
        ///////////////////////////////////////////      
        name = TenNV.getText();
        tel = TelEmployee.getText();
        email = Email.getText(); 
        addr = Address.getText();
        job = JobName.getText();
        status = email_Validation(email);
        
        if (name.equals("")   || 
                tel.equals("")   || 
                email.equals("")  ||
                addr.equals("")   ||
                job.equals("") ) {
            JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ thông tin",
                "Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        else if (status.equals("Vaild")) {
            try {
                ps = con.prepareStatement("INSERT NHANVIEN (MaNV, TenNV, Tel, Email, Address, Job) "
                        + "VALUES (?,?,?,?,?,?)");                 

                ps.setString(1, employeecode);                 
                ps.setString(2, name);                   
                ps.setString(3, tel);                    
                ps.setString(4, email);                   
                ps.setString(5, addr);                    
                ps.setString(6, job);                                      
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thêm thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                User_load();
                
                TenNV.setText("");
                TelEmployee.setText("");
                Email.setText("");
                Address.setText("");
                JobName.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Đã xảy ra lỗi từ thông tin nhập!",
                        "Thông báo",JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_SaveButtonActionPerformed
    //thao tác trên bảng
    private void EmployeeInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeInformationMouseClicked
        d = (DefaultTableModel)EmployeeInformation.getModel();
        int selectIndex = EmployeeInformation.getSelectedRow();        
        MaNV.setText(d.getValueAt(selectIndex, 0).toString());
        TenNV.setText(d.getValueAt(selectIndex, 1).toString());
        TelEmployee.setText(d.getValueAt(selectIndex, 2).toString());
        Email.setText(d.getValueAt(selectIndex, 3).toString());
        Address.setText(d.getValueAt(selectIndex, 4).toString());
        JobName.setText(d.getValueAt(selectIndex, 5).toString());
        
             
        MaNV.setEditable(false);
        SaveButton.setEnabled(false);
    }//GEN-LAST:event_EmployeeInformationMouseClicked
    //sửa bản ghi
    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        d = (DefaultTableModel)EmployeeInformation.getModel();
        int selectIndex = EmployeeInformation.getSelectedRow(); 
        String employeecode, name, tel, email, addr, job, status;                  
        employeecode = d.getValueAt(selectIndex, 0).toString();
        name = TenNV.getText();
        tel = TelEmployee.getText();
        email = Email.getText(); 
        addr = Address.getText();
        job = JobName.getText();
        status = email_Validation(email);
        
        if (name.equals("")   || 
                tel.equals("")   || 
                email.equals("")  ||
                addr.equals("")   ||
                job.equals("") ) {
            JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ thông tin",
                "Thông báo",JOptionPane.ERROR_MESSAGE);
        }
        else if (status.equals("Vaild")) {
            try {
                ps = con.prepareStatement("UPDATE NHANVIEN SET TenNV = ?, Tel = ?, Email = ?, Address = ?, Job = ? "
                        + "WHERE MaNV = ?");                 
                              
                ps.setString(1, name);                   
                ps.setString(2, tel);                    
                ps.setString(3, email);                   
                ps.setString(4, addr);                    
                ps.setString(5, job);
                ps.setString(6, employeecode);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Sửa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                User_load();
                
                SaveButton.setEnabled(true);
                TenNV.setText("");
                TelEmployee.setText("");
                Email.setText("");
                Address.setText("");
                JobName.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Đã xảy ra lỗi từ thông tin nhập!",
                        "Thông báo",JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_EditButtonActionPerformed
    //làm mới
    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        User_load();
        SaveButton.setEnabled(true);
        SearchSelection.setSelectedIndex(0);
        TenNV.setText("");               
        TelEmployee.setText("");               
        Email.setText("");               
        Address.setText("");                
        JobName.setText("");
    }//GEN-LAST:event_RefreshButtonActionPerformed
    //xoá bản ghi
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        d = (DefaultTableModel)EmployeeInformation.getModel();
        int selectIndex = EmployeeInformation.getSelectedRow(); 
        String employeecode;                  
        employeecode = d.getValueAt(selectIndex, 0).toString();
                       
        try {
                
            ps = con.prepareStatement("DELETE FROM NHANVIEN WHERE MaNV = ?");                                                                               
            ps.setString(1, employeecode);               
            ps.executeUpdate();               
            JOptionPane.showMessageDialog(null, "Xoá thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);               
            
            DeleteAccount();
            User_load();
              
            SaveButton.setEnabled(true);
            TenNV.setText("");               
            TelEmployee.setText("");               
            Email.setText("");                
            Address.setText("");                
            JobName.setText("");           
        } catch (SQLException ex) {                
            JOptionPane.showMessageDialog(this,"Đã xảy ra lỗi từ thông tin nhập!",                        
                    "Thông báo",JOptionPane.ERROR_MESSAGE);                
            Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex); 
        }  
        
    }//GEN-LAST:event_DeleteButtonActionPerformed
    //Tìm kiếm bản ghi
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String search = SearchField.getText();
        String typesearch = SearchSelection.getSelectedItem().toString();
        try {
            switch (typesearch) {
                case "Mã nhân viên" -> {
                    ps = con.prepareStatement("SELECT * FROM NHANVIEN WHERE MaNV = ?");
                    ps.setString(1,search);
                    rs=ps.executeQuery();
                    EmployeeInformation.setModel(DbUtils.resultSetToTableModel(rs));
                }
                case "Tên nhân viên" -> {
                    ps = con.prepareStatement("SELECT * FROM NHANVIEN WHERE TenNV = ?");
                    ps.setString(1,search);
                    rs=ps.executeQuery();
                    EmployeeInformation.setModel(DbUtils.resultSetToTableModel(rs));
                }
                case "Số điện thoại" -> {
                    ps = con.prepareStatement("SELECT * FROM NHANVIEN WHERE Tel = ?");
                    ps.setString(1,search);
                    rs=ps.executeQuery();
                    EmployeeInformation.setModel(DbUtils.resultSetToTableModel(rs));
                }
                case "Email" -> {
                    ps = con.prepareStatement("SELECT * FROM NHANVIEN WHERE Email = ?");
                    ps.setString(1,search);
                    rs=ps.executeQuery();
                    EmployeeInformation.setModel(DbUtils.resultSetToTableModel(rs));
                }
                case "Địa chỉ" -> {
                    ps = con.prepareStatement("SELECT * FROM NHANVIEN WHERE Address = ?");
                    ps.setString(1,search);
                    rs=ps.executeQuery();
                    EmployeeInformation.setModel(DbUtils.resultSetToTableModel(rs2));
                }
                case "Chức vụ" -> {
                    ps = con.prepareStatement("SELECT * FROM NHANVIEN WHERE Job = ?");
                    ps.setString(1,search);
                    rs=ps.executeQuery();
                    EmployeeInformation.setModel(DbUtils.resultSetToTableModel(rs2));
                }
                default -> JOptionPane.showMessageDialog(this,"Chưa chọn loại tìm kiếm","Tìm kiếm", JOptionPane.ERROR_MESSAGE);
            }
           
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_SearchActionPerformed
    //Xuất Excel
    private void ExcelExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelExportActionPerformed
        // TODO add your handling code here:
        TableModel model = EmployeeInformation.getModel();
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
                Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }//GEN-LAST:event_ExcelExportActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    
    //đồng thời xoá luôn tài khoản
    private void DeleteAccount() {
        d = (DefaultTableModel)EmployeeInformation.getModel();
        int selectIndex = EmployeeInformation.getSelectedRow(); 
        String employeecode;                  
        employeecode = d.getValueAt(selectIndex, 0).toString();
                       
        try {
                
            ps = con.prepareStatement("DELETE FROM DANGNHAP WHERE MaNV = ?");                                                                               
            ps.setString(1, employeecode);               
            ps.executeUpdate();               
            JOptionPane.showMessageDialog(null, "Xoá thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);               
            
            User_load();
                                
            TenNV.setText("");               
            TelEmployee.setText("");               
            Email.setText("");                
            Address.setText("");                
            JobName.setText("");           
        } catch (SQLException ex) {                
            JOptionPane.showMessageDialog(this,"Đã xảy ra lỗi từ thông tin nhập!",                        
                    "Thông báo",JOptionPane.ERROR_MESSAGE);                
            Logger.getLogger(EmployeeInformation.class.getName()).log(Level.SEVERE, null, ex); 
        }  
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
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                EmployeeInformation dl = new EmployeeInformation();
                dl.setVisible(true);
                dl.setResizable(false);
                dl.setTitle("Hồ sơ đại lý");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField Email;
    private javax.swing.JTable EmployeeInformation;
    private javax.swing.JButton ExcelExport;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField JobName;
    private javax.swing.JTextField MaNV;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JComboBox<String> SearchSelection;
    private javax.swing.JTextField TelEmployee;
    private javax.swing.JTextField TenNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
