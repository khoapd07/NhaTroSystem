/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.ui;

import com.fpt.ptcd.nhatrosystem.dao.ThuePhongDAO;
import com.fpt.ptcd.nhatrosystem.entity.ThuePhong;
import com.fpt.ptcd.nhatrosystem.utils.MsgBox;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 24010
 */
public class TraPhongJDialog extends javax.swing.JDialog {

    /**
     * Creates new form TraPhongJDialog
     */
    public TraPhongJDialog(java.awt.Frame parent, boolean modal) {
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

        lblQL = new javax.swing.JLabel();
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
        lblMaPhong = new javax.swing.JLabel();
        cboMaPhong = new javax.swing.JComboBox<>();
        lblMaKH = new javax.swing.JLabel();
        cboMaKH = new javax.swing.JComboBox<>();
        txtTienCT = new javax.swing.JTextField();
        lblTienCT = new javax.swing.JLabel();
        lblNgayThue = new javax.swing.JLabel();
        txtNgayThue = new javax.swing.JTextField();
        txtMaPhieuThue = new javax.swing.JTextField();
        lblMaPhieuT = new javax.swing.JLabel();
        lblNgayTP = new javax.swing.JLabel();
        txtNgayTP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTraPhong = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtTimKiem1 = new javax.swing.JTextField();
        btnTimKiem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblQL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQL.setForeground(new java.awt.Color(0, 51, 204));
        lblQL.setText("QUẢN LÝ TRẢ PHÒNG");

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

        lblMaPhong.setText("Mã phòng");

        cboMaPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaPhongActionPerformed(evt);
            }
        });

        lblMaKH.setText("Mã khách hàng");

        cboMaKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaKHActionPerformed(evt);
            }
        });

        txtTienCT.setEditable(false);

        lblTienCT.setText("Tiền cọc trước");

        lblNgayThue.setText("Ngày thuê");

        txtNgayThue.setEditable(false);

        txtMaPhieuThue.setEditable(false);

        lblMaPhieuT.setText("Mã phiếu thuê");

        lblNgayTP.setText("Ngày trả phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTienCT)
                            .addComponent(lblMaPhieuT)
                            .addComponent(lblNgayThue))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayThue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                            .addComponent(txtTienCT)
                            .addComponent(txtMaPhieuThue)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaPhong)
                            .addComponent(lblMaKH)
                            .addComponent(lblNgayTP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMaKH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMaPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNgayTP))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhieuT)
                    .addComponent(txtMaPhieuThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayThue)
                    .addComponent(txtNgayThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTienCT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH)
                    .addComponent(cboMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhong)
                    .addComponent(cboMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayTP)
                    .addComponent(txtNgayTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("CHỈNH SỬA", jPanel1);

        tblTraPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu thuê", "Mã phòng", "Mã KH", "Ngày thuê", "Tiền Đã Cọc", "Ngày trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTraPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTraPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTraPhong);
        if (tblTraPhong.getColumnModel().getColumnCount() > 0) {
            tblTraPhong.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Tìm kiếm"));

        btnTimKiem1.setText("Tìm kiếm");
        btnTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", jPanel2);

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

    private void tblTraPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTraPhongMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblTraPhong.getSelectedRow();
            tabs.setSelectedIndex(0);
            this.edit();
//            dungDieuHuong = false;
//            voHieuHoaDieuHuong();
        }
    }//GEN-LAST:event_tblTraPhongMouseClicked

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void cboMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaKHActionPerformed
        // TODO add your handling code here:
        String maKH = (String) cboMaKH.getSelectedItem();
        fillComboboxMaPhongTheoKH(maKH);
//        this.setFormWithMaKH();
    }//GEN-LAST:event_cboMaKHActionPerformed

    private void cboMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaPhongActionPerformed
        // TODO add your handling code here:
//        this.setFormWithMaPhong();
    }//GEN-LAST:event_cboMaPhongActionPerformed

    private void btnTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiem1ActionPerformed
        // TODO add your handling code here:
        this.timKiem();
        System.out.println("");
    }//GEN-LAST:event_btnTimKiem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TraPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraPhongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TraPhongJDialog dialog = new TraPhongJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem1;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboMaKH;
    private javax.swing.JComboBox<String> cboMaPhong;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMaPhieuT;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JLabel lblNgayTP;
    private javax.swing.JLabel lblNgayThue;
    private javax.swing.JLabel lblQL;
    private javax.swing.JLabel lblTienCT;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblTraPhong;
    private javax.swing.JTextField txtMaPhieuThue;
    private javax.swing.JTextField txtNgayTP;
    private javax.swing.JTextField txtNgayThue;
    private javax.swing.JTextField txtTienCT;
    private javax.swing.JTextField txtTimKiem1;
    // End of variables declaration//GEN-END:variables

    ThuePhongDAO dao = new ThuePhongDAO();
    int row = -1;
    boolean isUpdating = false;

    void init() {
        setLocationRelativeTo(null); // đưa cửa sổ ra giữa màn hình
        this.fillTable(); // đổ dữ liệu nhân viên vào bảng
        this.fillComboboxMaKH();
//        this.fillComboboxMaPhong();
        this.updateStatus(); // cập nhật trạng thái form
        if (tblTraPhong.getRowCount() > 0) {
            first(); // Tự động chọn dòng đầu tiên nếu có dữ liệu
        }
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblTraPhong.getModel();
        model.setRowCount(0);

        try {
            String keyword = txtTimKiem1.getText();
            List<ThuePhong> list = dao.selectByKeyword(keyword);

            for (ThuePhong tp : list) {
                Object[] row = {
                    tp.getMaPhieuThue(),
                    tp.getMaPhong(),
                    tp.getMaKhach(),
                    tp.getNgayThue(),
                    tp.getTienCoc(),
                    tp.getNgayTra()
                };
                System.out.println(tp.getMaKhach());
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void fillComboboxMaKH() {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cboMaKH.getModel();
        model.removeAllElements();

        try {
            List<ThuePhong> list = dao.selectAll();
            Set<String> uniqueMaKhach = new HashSet<>();

            for (ThuePhong tp : list) {
                if (uniqueMaKhach.add(tp.getMaKhach())) {
                    model.addElement(tp.getMaKhach());
                }
            }
            if (model.getSize() > 0) {
                cboMaKH.setSelectedIndex(0);
                String maKH = (String) cboMaKH.getSelectedItem();
                fillComboboxMaPhongTheoKH(maKH);
                
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu khách hàng!");
        }
    }

    void fillComboboxMaPhongTheoKH(String maKH) {
        if (isUpdating) {
            return;
        }
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) cboMaPhong.getModel();
        model.removeAllElements();

        if (maKH == null || maKH.trim().isEmpty()) {
            return;
        }

        try {
            List<ThuePhong> danhSachThue = dao.selectByMaKhach(maKH);
            String phongDangChon = (String) cboMaPhong.getSelectedItem(); // Lưu lại mã phòng đang chọn trước đó

            for (ThuePhong tp : danhSachThue) {
                model.addElement(tp.getMaPhong());
            }

            // Kiểm tra xem mã phòng cũ có trong danh sách không
            if (phongDangChon != null && danhSachThue.stream().anyMatch(tp -> tp.getMaPhong().equals(phongDangChon))) {
                cboMaPhong.setSelectedItem(phongDangChon); // Giữ nguyên phòng cũ nếu hợp lệ
            } else if (!danhSachThue.isEmpty()) {
                cboMaPhong.setSelectedIndex(0); // Chọn phòng đầu tiên nếu không có phòng cũ hợp lệ
            }
            
            
            
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu phòng!");
        }
    }

//    void setFormWithMaKH() {
//        if (isUpdating) {
//            return; // Ngăn chặn vòng lặp vô hạn
//        }
//        isUpdating = true; // Bắt đầu quá trình cập nhật
//
//        try {
//            String maKH = (String) cboMaKH.getSelectedItem();
//            System.out.println("Chon ma khach: " + maKH);
//
//            if (maKH == null || maKH.trim().isEmpty()) {
//                isUpdating = false;
//                return;
//            }
//
//            fillComboboxMaPhongTheoKH(maKH); // Cập nhật danh sách phòng
//
//            SwingUtilities.invokeLater(() -> {
//                String maPhong = (String) cboMaPhong.getSelectedItem();
//                if (maPhong != null && !maPhong.trim().isEmpty()) {
//                    System.out.println("Ma phong sau khi cap nhat: " + maPhong);
////                    setFormWithMaPhong();
//                } else {
//                    System.out.println("Không tìm thấy phòng hợp lệ sau khi cập nhật.");
//                }
//            });
//            
////            this.row = 0;
////            updateStatus();
//
////            dungDieuHuong = true;
////            voHieuHoaDieuHuong();
//            
//        } finally {
//            isUpdating = false; // Kết thúc quá trình cập nhật
//        }
//    }

//    void setFormWithMaPhong() {
//        if (isUpdating) {
//            return; // Ngăn chặn vòng lặp vô hạn
//        }
//        isUpdating = true; // Bắt đầu quá trình cập nhật
//
//        try {
//            String maPhong = (String) cboMaPhong.getSelectedItem();
//            String maKH = (String) cboMaKH.getSelectedItem();
//
//            if (maPhong == null || maPhong.trim().isEmpty() || maKH == null || maKH.trim().isEmpty()) {
//                System.out.println("Lỗi: Mã phòng hoặc mã khách rỗng.");
//                return;
//            }
//
//            System.out.println("Dang set form voi MaPhong: " + maPhong + " va MaKH: " + maKH);
//
//            ThuePhong tp = dao.selectByMaPhongVaMaKhach(maPhong, maKH);
//
//            if (tp != null) {
//                System.out.println("Du lieu tu DB: " + tp.getMaPhieuThue() + ", "
//                        + tp.getMaPhong() + ", " + tp.getMaKhach() + ", "
//                        + tp.getNgayThue() + ", " + tp.getTienCoc() + ", "
//                        + tp.getNgayTra());
//
//                this.setForm(tp);
//            } else {
//                System.out.println("Không tìm thấy phiếu thuê!");
//            }
////            row = 0;
////            edit();
////            dungDieuHuong = true;
////            voHieuHoaDieuHuong();
//        } finally {
//            isUpdating = false; // Kết thúc quá trình cập nhật
//        }
//    }

    void insert() {
            MsgBox.alert(this, "Nếu bạn muốn thêm dữ liệu thuê phòng hãy chuyển sang tab thuê phòng nhé!");
//        ThuePhong thuePhong = this.getForm();
//        boolean kqkt = kiemTraDinhDang(thuePhong);
//
//        if (kqkt) {
//            try {
//                dao.insert(thuePhong);
//                fillTable();
//                clearForm();
//                MsgBox.alert(this, "Thêm mới thành công!");
//            } catch (Exception e) {
//                MsgBox.alert(this, "Thêm mới thất bại!");
//            }
//        }
    }

    void update() {
        ThuePhong thuePhong = this.getForm();
        boolean kqkt = kiemTraDinhDang(thuePhong);

        if (kqkt) {
            try {
                ThuePhong existingTP = dao.selectById(thuePhong.getMaPhieuThue());
                if (existingTP == null) {
                    MsgBox.alert(this, "Mã phiếu thuê không tồn tại! Không thể sửa.");
                    return;
                }
                // Chỉ cập nhật ngày trả
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date ngayTra = sdf.parse(txtNgayTP.getText());
                    existingTP.setNgayTra(ngayTra);
                } catch (ParseException e) {
                    MsgBox.alert(this, "Định dạng ngày không hợp lệ!");
                    return;
                }
                dao.update(existingTP);
                fillTable();
                MsgBox.alert(this, "Sửa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Sửa thất bại!");
            }
        }
    }

    void delete() {
        if (txtMaPhieuThue.getText().trim().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập mã phiếu thuê!");
            return;
        } else {
            String maPhieuThue = txtMaPhieuThue.getText();
            MsgBox.confirm(this, "Bạn thực sự muốn xóa phiếu thuê này?");
            try {
                dao.delete(maPhieuThue);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }

    private void timKiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        this.updateStatus();
    }

    ThuePhong getForm() {
        ThuePhong thuePhong = new ThuePhong();
        thuePhong.setMaPhieuThue(txtMaPhieuThue.getText());
        thuePhong.setMaPhong((String) cboMaPhong.getSelectedItem());
        thuePhong.setMaKhach((String) cboMaKH.getSelectedItem());

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            thuePhong.setNgayThue(sdf.parse(txtNgayThue.getText()));
            thuePhong.setNgayTra(sdf.parse(txtNgayTP.getText()));
        } catch (Exception e) {
            MsgBox.alert(this, "Định dạng ngày không hợp lệ!");
        }

        try {
            thuePhong.setTienCoc(Double.parseDouble(txtTienCT.getText()));
        } catch (NumberFormatException e) {
            MsgBox.alert(this, "Tiền cọc phải là số hợp lệ!");
        }

        return thuePhong;
    }

    void clearForm() {
        ThuePhong thuePhong = new ThuePhong();
        this.setForm(thuePhong);

        this.row = -1;
        updateStatus();
    }

    void setForm(ThuePhong thuePhong) {

        System.out.println("Cap nhat form: " + thuePhong.getMaPhieuThue() + ", "
                + thuePhong.getMaPhong() + ", " + thuePhong.getMaKhach());

        txtMaPhieuThue.setText(thuePhong.getMaPhieuThue());
        cboMaPhong.setSelectedItem(thuePhong.getMaPhong());
        cboMaKH.setSelectedItem(thuePhong.getMaKhach());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        txtNgayThue.setText(thuePhong.getNgayThue() != null ? sdf.format(thuePhong.getNgayThue()) : "");
        txtNgayTP.setText(thuePhong.getNgayTra() != null ? sdf.format(thuePhong.getNgayTra()) : "");

        txtTienCT.setText(String.valueOf(thuePhong.getTienCoc()));
    }

    boolean kiemTraDinhDang(ThuePhong thuePhong) {
        if (thuePhong.getMaPhieuThue().trim().isEmpty()) {
            MsgBox.alert(this, "Không bỏ trống mã phiếu thuê");
            return false;
        }
        if (thuePhong.getMaPhong().trim().isEmpty()) {
            MsgBox.alert(this, "Vui lòng chọn mã phòng");
            return false;
        }
        if (thuePhong.getMaKhach().trim().isEmpty()) {
            MsgBox.alert(this, "Vui lòng chọn mã khách");
            return false;
        }
        if (thuePhong.getNgayThue() == null) {
            MsgBox.alert(this, "Ngày thuê không hợp lệ");
            return false;
        }
        if (thuePhong.getNgayTra() == null) {
            MsgBox.alert(this, "Ngày trả không hợp lệ");
            return false;
        }
        if (thuePhong.getTienCoc() < 0) {
            MsgBox.alert(this, "Tiền cọc không thể âm");
            return false;
        }
        return true;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblTraPhong.getRowCount() - 1);
        boolean hasData = (tblTraPhong.getRowCount() > 0);

        // Trạng thái form
        txtMaPhieuThue.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        // Trạng thái điều hướng (Vô hiệu hóa nếu không có dữ liệu)
        btnFirst.setEnabled(hasData && edit && !first);
        btnPrev.setEnabled(hasData && edit && !first);
        btnNext.setEnabled(hasData && edit && !last);
        btnLast.setEnabled(hasData && edit && !last);
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblTraPhong.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblTraPhong.getRowCount() - 1;
        this.edit();
    }
    
//    boolean dungDieuHuong = false;

    void edit() {
        if (this.row < 0 || this.row >= tblTraPhong.getRowCount()) {
            return;
        }

        String maPhieuThue = (String) tblTraPhong.getValueAt(this.row, 0);
        ThuePhong tp = dao.selectById(maPhieuThue);

        if (tp != null) {
            setForm(tp);
            updateStatus();
//            dungDieuHuong = true;
            
        }
    }
    
//    void voHieuHoaDieuHuong(){
//        if (!dungDieuHuong) return;
//        
//        btnFirst.setEnabled(false);
//        btnPrev.setEnabled(false);
//        btnNext.setEnabled(false);
//        btnLast.setEnabled(false);
//        
//    }

}
