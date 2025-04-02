/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.ui;

import com.fpt.ptcd.nhatrosystem.dao.HoaDonDAO;
import com.fpt.ptcd.nhatrosystem.dao.KhachHangDAO;
import com.fpt.ptcd.nhatrosystem.dao.LoaiPhongDAO;
import com.fpt.ptcd.nhatrosystem.dao.MucGiaDAO;
import com.fpt.ptcd.nhatrosystem.dao.NhanVienDAO;
import com.fpt.ptcd.nhatrosystem.dao.PhongDAO;
import com.fpt.ptcd.nhatrosystem.dao.ThuePhongDAO;
import com.fpt.ptcd.nhatrosystem.entity.HoaDon;
import com.fpt.ptcd.nhatrosystem.entity.HoaDonService;
import com.fpt.ptcd.nhatrosystem.entity.KhachHang;
import com.fpt.ptcd.nhatrosystem.entity.LoaiPhong;
import com.fpt.ptcd.nhatrosystem.entity.MucGia;
import com.fpt.ptcd.nhatrosystem.entity.NhanVien;
import com.fpt.ptcd.nhatrosystem.entity.Phong;
import com.fpt.ptcd.nhatrosystem.entity.ThuePhong;
import com.fpt.ptcd.nhatrosystem.utils.Auth;
import com.fpt.ptcd.nhatrosystem.utils.MsgBox;
import com.fpt.ptcd.nhatrosystem.utils.XDate;
import com.fpt.ptcd.nhatrosystem.utils.XJdbc;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author 24010
 */
public class HoaDonJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HoaDonJDialog
     */
    public HoaDonJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblMaDT = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        lblMaPT = new javax.swing.JLabel();
        txtSoDien = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTienWifi = new javax.swing.JSpinner();
        txtTienRac = new javax.swing.JSpinner();
        txtSoNuoc = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        txtChiPhiKhac = new javax.swing.JSpinner();
        lblNgayDT = new javax.swing.JLabel();
        txtNgayDT = new javax.swing.JTextField();
        btnGetDate = new javax.swing.JButton();
        cboMaPhieuThue = new javax.swing.JComboBox<>();
        btnSendEmail = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        lblQL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        lblMaDT.setText("Mã hóa đơn");

        txtMaHoaDon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblMaPT.setText("Mã phiếu thuê");

        jLabel5.setText("Tiền Rác/phòng");

        jLabel4.setText("Tiền Wifi/phòng");

        jLabel3.setText("Số m3/Nước");

        jLabel2.setText("Số kWh/Điện");

        txtTienWifi.setEnabled(false);

        txtTienRac.setEnabled(false);

        jLabel1.setText("Chi phí khác");

        lblNgayDT.setText("Ngày đóng tiền");

        txtNgayDT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnGetDate.setText("Get");
        btnGetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDateActionPerformed(evt);
            }
        });

        btnSendEmail.setText("Send mail");
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaDT)
                            .addComponent(lblMaPT))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboMaPhieuThue, 0, 330, Short.MAX_VALUE)
                            .addComponent(txtMaHoaDon))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNgayDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtChiPhiKhac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(txtTienRac, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienWifi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoNuoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoDien)
                            .addComponent(txtNgayDT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGetDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSendEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaDT)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPT)
                    .addComponent(cboMaPhieuThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSoNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTienWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTienRac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtChiPhiKhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayDT)
                    .addComponent(txtNgayDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFirst)
                        .addComponent(btnPrev)
                        .addComponent(btnNext)
                        .addComponent(btnLast))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnSua)
                        .addComponent(btnXoa)
                        .addComponent(btnMoi)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tabs.addTab("CHỈNH SỬA", jPanel1);

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Phiếu Thuê", "Số Kwh Điện", "Số m3 nước", "Tổng Tiền", "Ngày"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", jPanel2);

        lblQL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQL.setForeground(new java.awt.Color(0, 51, 204));
        lblQL.setText("QUẢN LÝ HÓA ĐƠN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQL)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
                this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
                this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
                this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
            this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
                this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
                this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
                this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
                this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        if(evt.getClickCount() == 2){
            this.row = tblHoaDon.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnGetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDateActionPerformed
        txtNgayDT.setText(XDate.toString(new Date(), "yyyy-MM-dd"));
    }//GEN-LAST:event_btnGetDateActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        sendHoaDonEmail();
    }//GEN-LAST:event_btnSendEmailActionPerformed

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
            java.util.logging.Logger.getLogger(HoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HoaDonJDialog dialog = new HoaDonJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnGetDate;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboMaPhieuThue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaDT;
    private javax.swing.JLabel lblMaPT;
    private javax.swing.JLabel lblNgayDT;
    private javax.swing.JLabel lblQL;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JSpinner txtChiPhiKhac;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtNgayDT;
    private javax.swing.JSpinner txtSoDien;
    private javax.swing.JSpinner txtSoNuoc;
    private javax.swing.JSpinner txtTienRac;
    private javax.swing.JSpinner txtTienWifi;
    // End of variables declaration//GEN-END:variables

    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    
    ThuePhongDAO tpdao = new ThuePhongDAO();
    MucGiaDAO mgdao = new MucGiaDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    
    int row = -1; //hàng được chọn hiện tại trên bảng
    
    void init(){
        this.setLocationRelativeTo(null);
        
        this.fillTable();
        this.row = -1;
        fillComboBoxPhieuThue();
        
        MucGiaDAO mucGiaDAO = new MucGiaDAO();
        MucGia mucGia = mucGiaDAO.selectAll().get(0);
        
        txtTienRac.setValue(mucGia.getTienRac());
        txtTienWifi.setValue(mucGia.getTienWifi());
    }
    

    public double tinhTienDien(int soDien, MucGia mucGia) {
        double tienDien = 0;
        if (soDien <0 ){
            MsgBox.alert(this, "Số KWh diện không thể âm!");
        }
        if (soDien <= 50 && soDien >=0) {
            tienDien = soDien * mucGia.getTienDienBac1();
        } else if (soDien >50 && soDien <= 100) {
            tienDien = (50 * mucGia.getTienDienBac1()) + ((soDien - 50) * mucGia.getTienDienBac2());
        } else if (soDien >100 && soDien <=200) {
            tienDien = (50 * mucGia.getTienDienBac1()) + (50 * mucGia.getTienDienBac2()) + ((soDien - 100) * mucGia.getTienDienBac3());
        } else if (soDien>200 && soDien<=300){
            tienDien = (50 * mucGia.getTienDienBac1()) + (50 * mucGia.getTienDienBac2()) + (100 * mucGia.getTienDienBac3()) + ((soDien -200) * mucGia.getTienDienBac4());
        } else if (soDien>300 && soDien<= 400){
            tienDien = (50 * mucGia.getTienDienBac1()) + (50 * mucGia.getTienDienBac2()) + (100 * mucGia.getTienDienBac3()) + (100 * mucGia.getTienDienBac4()) + ((soDien - 300) * mucGia.getTienDienBac5());
        } else{
            tienDien = (50 * mucGia.getTienDienBac1()) + (50 * mucGia.getTienDienBac2()) + (100 * mucGia.getTienDienBac3()) + (100 * mucGia.getTienDienBac4()) + (100 * mucGia.getTienDienBac5()) + ((soDien -400)* mucGia.getTienDienBac6());
        }
        return tienDien;
    }

    public double tinhTienNuoc(int soNuoc, MucGia mucGia) {
        double tienNuoc = 0;
        if (soNuoc < 0) {
            MsgBox.alert(this, "Số m3 nước không thể âm!");
        }else if(soNuoc <=10){
            tienNuoc = soNuoc * mucGia.getTienNuocBac1();
        }else if (soNuoc>10 && soNuoc <=20){
            tienNuoc = (10* mucGia.getTienNuocBac1()) + ((soNuoc-10)*mucGia.getTienNuocBac2());
        }else if (soNuoc>20 && soNuoc<=30){
            tienNuoc = (10* mucGia.getTienNuocBac1()) + (10 * mucGia.getTienNuocBac2()) + ((soNuoc -20) * mucGia.getTienNuocBac3());
        } else{
            tienNuoc = (10 * mucGia.getTienNuocBac1()) + (10 * mucGia.getTienNuocBac2()) +(10 * mucGia.getTienNuocBac3()) + ((soNuoc-30) *mucGia.getTienNuocBac4());
        }
        return tienNuoc;
    }
    
    void fillComboBoxPhieuThue() {
    DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cboMaPhieuThue.getModel();
    model.removeAllElements(); // Xóa dữ liệu cũ
    
    List<String> list = tpdao.getPhieuThueDaTra(); // Gọi phương thức từ ThuePhongDAO
    
    for (String maPT : list) {
        model.addElement(maPT); // Thêm vào ComboBox
    }
}
    
void fillTable() {
    DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
    model.setRowCount(0); // Xóa tất cả các hàng trên JTable
    
    try {
        List<HoaDon> list = hddao.selectAll(); // Lấy danh sách hóa đơn từ CSDL
        List<MucGia> mucGiaList = mgdao.selectAll(); // Lấy mức giá từ CSDL
        
        if (mucGiaList.isEmpty()) {
            MsgBox.alert(this, "Không có dữ liệu mức giá! Hãy thêm mức giá trước.");
            return;
        }
        
        // Lấy mức giá đầu tiên (giả sử chỉ có một mức giá)
        MucGia mucGia = mucGiaList.get(0);

        for (HoaDon hd : list) {
            ThuePhong thuePhong = tpdao.selectById(hd.getMaPhieuThue());
            if (thuePhong == null) continue;
            String maPhong = thuePhong.getMaPhong();
            PhongDAO pdao = new PhongDAO();
            Phong phong = pdao.selectById(maPhong);
            if (phong == null) continue;
            
            String maLoai = phong.getMaLoai();

            // Lấy giá phòng từ mã loại
            LoaiPhongDAO lpdao = new LoaiPhongDAO();
            LoaiPhong loaiPhong = lpdao.selectById(maLoai);
            double giaPhong = (loaiPhong != null) ? loaiPhong.getGiaPhong() : 0;
            Date ngayThue = thuePhong.getNgayThue();
            Date ngayTra = thuePhong.getNgayTra();

            int soThang = 1; // Mặc định tính 1 tháng nếu ngày trả là null

            if (ngayTra != null) { // Nếu đã trả phòng, tính số tháng thực tế
                long diffInMillies = ngayTra.getTime() - ngayThue.getTime();
                long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                soThang = (int) Math.ceil(diffInDays / 31.0); // Làm tròn lên số tháng
            }

            // Tính tổng tiền phòng theo số tháng
            double tienPhong = giaPhong * soThang;
            // Tính tiền điện theo số điện tiêu thụ
            int soDien = hd.getSoDien();
            double tienDien = tinhTienDien(soDien, mucGia);
            
            // Tính tiền nước
            int soNuoc = hd.getSoNuoc();
            double tienNuoc = tinhTienNuoc(soNuoc, mucGia);
            
            // Tổng tiền: Tiền điện + Tiền nước + WiFi + Rác + Chi phí khác
            double tongTien = tienDien + tienNuoc + hd.getTienWifi() + hd.getTienRac() + hd.getChiPhiKhac() + tienPhong;

            // Thêm dòng vào bảng
            Object[] row = { 
                hd.getMaHoaDon(), 
                hd.getMaPhieuThue(), 
                hd.getSoDien(), 
                hd.getSoNuoc(),
                tongTien, // Tổng tiền sau khi tính toán
                hd.getNgay()
            };
            model.addRow(row);
        }
    } catch (Exception e) {
        e.printStackTrace();
        MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
    }
}


        
    void clearForm(){
        boolean edit = (this.row >= 0);
        HoaDon hd = new HoaDon();
        hd.setNgay(new Date());
        this.setForm(hd);
        btnThem.setEnabled(edit);
        cboMaPhieuThue.setEnabled(edit);
    }
    HoaDon getForm() {
    HoaDon hd = new HoaDon();
    hd.setMaHoaDon(txtMaHoaDon.getText());
    hd.setMaPhieuThue((String) cboMaPhieuThue.getSelectedItem());
    hd.setSoDien(((Number) txtSoDien.getValue()).intValue());
    hd.setSoNuoc(((Number) txtSoNuoc.getValue()).intValue());
    hd.setTienWifi(((Number) txtTienWifi.getValue()).intValue());
    hd.setTienRac(((Number) txtTienRac.getValue()).intValue());
    hd.setChiPhiKhac(((Number) txtChiPhiKhac.getValue()).intValue());
    hd.setNgay(XDate.toDate(txtNgayDT.getText(), "yyyy-MM-dd"));

    // Tính tổng tiền trước khi lưu vào database
    int soDien = hd.getSoDien();
    int soNuoc = hd.getSoNuoc();

    // Lấy thông tin mức giá từ database
    List<MucGia> mucGiaList = mgdao.selectAll();
    if (mucGiaList.isEmpty()) {
        MsgBox.alert(this, "Không có dữ liệu mức giá!");
        return null;
    }
    MucGia mucGia = mucGiaList.get(0);

    // Tính tiền điện, nước
    double tienDien = tinhTienDien(soDien, mucGia);
    double tienNuoc = tinhTienNuoc(soNuoc, mucGia);

    // Lấy giá phòng từ mã phiếu thuê
    ThuePhong thuePhong = tpdao.selectById(hd.getMaPhieuThue());
    if (thuePhong != null) {
        Phong phong = new PhongDAO().selectById(thuePhong.getMaPhong());
        if (phong != null) {
            LoaiPhong loaiPhong = new LoaiPhongDAO().selectById(phong.getMaLoai());
            if (loaiPhong != null) {
                // Tính số tháng thuê
                int soThang = 1;
                if (thuePhong.getNgayTra() != null) {
                    long diffInMillies = thuePhong.getNgayTra().getTime() - thuePhong.getNgayThue().getTime();
                    long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                    soThang = (int) Math.ceil(diffInDays / 31.0);
                }
                double tienPhong = loaiPhong.getGiaPhong() * soThang;
                
                // Tổng tiền = tiền phòng + điện + nước + wifi + rác + chi phí khác
                double tongTien = tienPhong + tienDien + tienNuoc + hd.getTienWifi() + hd.getTienRac() + hd.getChiPhiKhac();
                hd.setTongTien((int) tongTien); // Cập nhật tổng tiền vào đối tượng
            }
        }
    }
    return hd;
}
    
    void setForm(HoaDon hd){
        txtMaHoaDon.setText(hd.getMaHoaDon());
        cboMaPhieuThue.setSelectedItem(hd.getMaPhieuThue());
        txtSoDien.setValue(hd.getSoDien());
        txtSoNuoc.setValue(hd.getSoNuoc());
        txtTienWifi.setValue(hd.getTienWifi());
        txtTienRac.setValue(hd.getTienRac());
        txtChiPhiKhac.setValue(hd.getChiPhiKhac());
        txtNgayDT.setText(XDate.toString(hd.getNgay(), "yyyy-MM-dd"));
    }
    
    void insert() {
        HoaDon model = getForm();
        if (model == null) return; // Nếu có lỗi khi lấy dữ liệu, dừng lại

        // Kiểm tra mã phiếu thuê có tồn tại không
        ThuePhong thuePhong = tpdao.selectById(model.getMaPhieuThue());
        if (thuePhong == null) {
            MsgBox.alert(this, "Mã phiếu thuê không tồn tại!");
            return;
        }

        try {
            hddao.insert(model); // Gọi DAO để thêm vào SQL
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (HeadlessException e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }   
    
    void update(){
        HoaDon model = getForm();
        if (model == null) return;

        try {
            hddao.update(model); // Cập nhật database
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete(){
            String maHoaDon = txtMaHoaDon.getText();
            try {
                hddao.delete(maHoaDon);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } 
            catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }            
        }
    
    void edit() {
        String mapt = (String) tblHoaDon.getValueAt(this.row, 0);
        HoaDon hd = hddao.selectById(mapt);
        this.setForm(hd);
        this.updateStatus();
        tabs.setSelectedIndex(0);
    }
        
        void first(){
        this.row = 0;
        this.edit();
    }
    void prev(){
        if(this.row > 0){
            this.row--;
            this.edit();
        }
    }
    void next(){
        if(this.row < tblHoaDon.getRowCount() - 1){
            this.row++;
            this.edit();
        }
    }
    void last(){
         this.row = tblHoaDon.getRowCount() - 1;
        this.edit();
    }
    
    void updateStatus(){
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblHoaDon.getRowCount() - 1);
        // Trạng thái form
        cboMaPhieuThue.setEnabled(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        
        // Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }
    
    public String getEmailByMaPhieuThue(String maPhieuThue) {
        String sql = "SELECT Email FROM KhachHang WHERE MaKhach = "
                   + "(SELECT MaKhach FROM ThuePhong WHERE MaPhieuThue = ?)";
        try {
            ResultSet rs = XJdbc.query(sql, maPhieuThue);
            if (rs.next()) {
                return rs.getString("Email");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
 void sendHoaDonEmail() {
    String maHoaDon = txtMaHoaDon.getText();
    HoaDon hd = hddao.selectById(maHoaDon);
    if (hd == null) {
        MsgBox.alert(this, "Không tìm thấy hóa đơn!");
        return;
    }

    // Lấy thông tin ngày thuê, ngày trả
    LocalDate ngayThue = tpdao.getNgayThueByMaPhieuThue(hd.getMaPhieuThue());
    LocalDate ngayTra = tpdao.getNgayTraByMaPhieuThue(hd.getMaPhieuThue());
    
    if (ngayThue == null || ngayTra == null) {
        MsgBox.alert(this, "Không tìm thấy ngày thuê hoặc ngày trả!");
        return;
    }

    // Lấy email khách hàng
    String emailKhachHang = khdao.getEmailByMaPhieuThue(hd.getMaPhieuThue());
    if (emailKhachHang == null || emailKhachHang.isEmpty()) {
        MsgBox.alert(this, "Không tìm thấy email khách hàng!");
        return;
    }

    String filePath = "F:\\NhaTroSystem\\NhaTroSystem\\src\\main\\java\\excel\\mucGia.xlsx"; // Thay bằng đường dẫn thực tế

    Runnable emailTask = () -> {
        try {
            LocalDate today = LocalDate.now();
            // Kiểm tra nếu hôm nay đã đủ 1 tháng từ ngày thuê và chưa đến ngày trả
            if (!today.isBefore(ngayThue.plusMonths(1)) && today.isBefore(ngayTra)) {
                HoaDonService.guiHoaDon(hd, emailKhachHang, filePath);
                System.out.println("Đã gửi hóa đơn đến " + emailKhachHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    // Lên lịch gửi mỗi ngày, bắt đầu từ bây giờ
    scheduler.scheduleAtFixedRate(emailTask, 0, 1, TimeUnit.DAYS);
    MsgBox.alert(this, "Hóa đơn sẽ được gửi hàng tháng đến " + emailKhachHang + " cho đến ngày trả.");
}
    
    
}
