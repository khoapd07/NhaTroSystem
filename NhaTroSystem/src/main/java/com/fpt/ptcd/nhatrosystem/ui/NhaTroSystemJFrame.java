/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.ui;

import com.fpt.ptcd.nhatrosystem.utils.Auth;
import com.fpt.ptcd.nhatrosystem.utils.MsgBox;
import com.fpt.ptcd.nhatrosystem.utils.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author accgs
 */
public class NhaTroSystemJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NhaTroLandJFrame
     */
    public NhaTroSystemJFrame() {
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

        lblHinh = new javax.swing.JLabel();
        tbaCongCu = new javax.swing.JToolBar();
        btnQLTaiKhoan = new javax.swing.JButton();
        btnQLLoaiPhong = new javax.swing.JButton();
        btnPhong = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnMucGia = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnThuePhong = new javax.swing.JButton();
        btnTraPhong = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        pnlTrangThai = new javax.swing.JPanel();
        lblHeQuanLyDaoTao = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTK = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLH = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniTaiKhoan = new javax.swing.JMenuItem();
        mniLoaiPhong = new javax.swing.JMenuItem();
        mniPhong = new javax.swing.JMenuItem();
        mniKhachHang = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mniGiaThanh = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniNguoiDK = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniDoanhThu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblHinh.setBackground(new java.awt.Color(255, 255, 255));
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/NhaTroLand.png"))); // NOI18N
        lblHinh.setOpaque(true);

        tbaCongCu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbaCongCu.setRollover(true);

        btnQLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Billboard.png"))); // NOI18N
        btnQLTaiKhoan.setText("Quản lý tài khoản");
        btnQLTaiKhoan.setFocusable(false);
        btnQLTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTaiKhoanActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnQLTaiKhoan);

        btnQLLoaiPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Brick house.png"))); // NOI18N
        btnQLLoaiPhong.setText("Quản lý loại phòng");
        btnQLLoaiPhong.setFocusable(false);
        btnQLLoaiPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLLoaiPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLLoaiPhongActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnQLLoaiPhong);

        btnPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Home.png"))); // NOI18N
        btnPhong.setText("Quản lý phòng");
        btnPhong.setFocusable(false);
        btnPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnPhong);

        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/User group.png"))); // NOI18N
        btnKhachHang.setText("Quản lý khách hàng");
        btnKhachHang.setFocusable(false);
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnKhachHang);

        btnMucGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Money.png"))); // NOI18N
        btnMucGia.setText("Quản lý mức giá");
        btnMucGia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMucGia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMucGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMucGiaActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnMucGia);

        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbaCongCu.add(jSeparator1);

        btnThuePhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Handshake.png"))); // NOI18N
        btnThuePhong.setText("Thuê phòng");
        btnThuePhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThuePhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThuePhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuePhongActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnThuePhong);

        btnTraPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Friends.png"))); // NOI18N
        btnTraPhong.setText("Trả phòng");
        btnTraPhong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTraPhong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTraPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraPhongActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnTraPhong);

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Notes.png"))); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnHoaDon);
        tbaCongCu.add(jSeparator2);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Log out.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/No.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        tbaCongCu.add(btnKetThuc);

        pnlTrangThai.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHeQuanLyDaoTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Info.png"))); // NOI18N
        lblHeQuanLyDaoTao.setText("Hệ quản lý nhà trọ");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Clock.png"))); // NOI18N

        jLabel1.setText("Tài khoản : ");

        lblTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTK.setForeground(new java.awt.Color(0, 51, 255));

        jLabel2.setText("Email : dung9012@gmail.com");

        lblLH.setText("Liên Hệ : 0939079015");

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeQuanLyDaoTao)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTK, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(lblDongHo)
                .addContainerGap())
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeQuanLyDaoTao)
                        .addComponent(lblDongHo)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addComponent(lblLH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mnuHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Globe.png"))); // NOI18N
        mnuHeThong.setText("Hệ thống ");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Login.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Log out.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator3);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator4);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/No.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Computer.png"))); // NOI18N
        mnuQuanLy.setText("Quán lý");

        mniTaiKhoan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Billboard.png"))); // NOI18N
        mniTaiKhoan.setText("Tài khoản");
        mniTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTaiKhoanActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniTaiKhoan);

        mniLoaiPhong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLoaiPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Brick house.png"))); // NOI18N
        mniLoaiPhong.setText("Loại phòng");
        mniLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoaiPhongActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniLoaiPhong);

        mniPhong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Home.png"))); // NOI18N
        mniPhong.setText("Phòng");
        mniPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPhongActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniPhong);

        mniKhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/User group.png"))); // NOI18N
        mniKhachHang.setText("Khách hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhachHang);
        mnuQuanLy.add(jSeparator7);

        mniGiaThanh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniGiaThanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Money.png"))); // NOI18N
        mniGiaThanh.setText("Giá thành");
        mniGiaThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGiaThanhActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniGiaThanh);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Diagram.png"))); // NOI18N
        mnuThongKe.setText("Thống kê");

        mniNguoiDK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniNguoiDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Clien list.png"))); // NOI18N
        mniNguoiDK.setText("Số người đăng ký");
        mniNguoiDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiDKActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniNguoiDK);
        mnuThongKe.add(jSeparator6);

        mniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icon/Bar chart.png"))); // NOI18N
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        jMenuBar1.add(mnuThongKe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbaCongCu, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbaCongCu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        // TODO add your handling code here:
        this.openDangNhap();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        // TODO add your handling code here:   
        this.openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTaiKhoanActionPerformed
        // TODO add your handling code here:
        this.openTaiKhoan();
    }//GEN-LAST:event_mniTaiKhoanActionPerformed

    private void mniLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoaiPhongActionPerformed
        // TODO add your handling code here:
        this.openLoaiPhong();
    }//GEN-LAST:event_mniLoaiPhongActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
        // TODO add your handling code here:
        this.openKhachHang();
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mniGiaThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGiaThanhActionPerformed
        // TODO add your handling code here:
        this.openMucGia();
    }//GEN-LAST:event_mniGiaThanhActionPerformed

    private void mniNguoiDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiDKActionPerformed
        // TODO add your handling code here:
        this.openThongKe(0);
    }//GEN-LAST:event_mniNguoiDKActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        // TODO add your handling code here:
        this.openThongKe(1);
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        this.openKhachHang();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnQLLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLLoaiPhongActionPerformed
        // TODO add your handling code here:
        this.openLoaiPhong();
    }//GEN-LAST:event_btnQLLoaiPhongActionPerformed

    private void btnPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongActionPerformed
        // TODO add your handling code here:
        this.openPhong();
    }//GEN-LAST:event_btnPhongActionPerformed

    private void btnThuePhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuePhongActionPerformed
        // TODO add your handling code here:
        this.openThuePhong();
    }//GEN-LAST:event_btnThuePhongActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void mniPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPhongActionPerformed
        // TODO add your handling code here:
        this.openPhong();
    }//GEN-LAST:event_mniPhongActionPerformed

    private void btnQLTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTaiKhoanActionPerformed
        // TODO add your handling code here:
        this.openTaiKhoan();
    }//GEN-LAST:event_btnQLTaiKhoanActionPerformed

    private void btnMucGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMucGiaActionPerformed
        // TODO add your handling code here:
        this.openMucGia();
    }//GEN-LAST:event_btnMucGiaActionPerformed

    private void btnTraPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraPhongActionPerformed
        // TODO add your handling code here:
        this.openTraPhong();
    }//GEN-LAST:event_btnTraPhongActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        this.openHoaDon();
    }//GEN-LAST:event_btnHoaDonActionPerformed

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
            java.util.logging.Logger.getLogger(NhaTroSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaTroSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaTroSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaTroSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new NhaTroSystemJFrame().setVisible(true);
                ChaoJDialog loadingDialog = new ChaoJDialog(null, true);
                loadingDialog.setVisible(true);

                // Sau khi loading xong, mở màn hình đăng nhập
                DangNhapJDialog loginForm = new DangNhapJDialog(null, true);
                loginForm.setLocationRelativeTo(null);
                loginForm.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnMucGia;
    private javax.swing.JButton btnPhong;
    private javax.swing.JButton btnQLLoaiPhong;
    private javax.swing.JButton btnQLTaiKhoan;
    private javax.swing.JButton btnThuePhong;
    private javax.swing.JButton btnTraPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblHeQuanLyDaoTao;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblLH;
    private javax.swing.JLabel lblTK;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGiaThanh;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniLoaiPhong;
    private javax.swing.JMenuItem mniNguoiDK;
    private javax.swing.JMenuItem mniPhong;
    private javax.swing.JMenuItem mniTaiKhoan;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JToolBar tbaCongCu;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setIconImage(XImage.getAppIcon());
        this.setLocationRelativeTo(null);
        checkRole();
        this.startDongHo();
        lblTK.setText(Auth.user.getMaNV());
    }

    private void checkRole() {
        if (Auth.isLogin()) {
            if (!Auth.isManager()) {
                btnQLLoaiPhong.setVisible(false);
                btnQLTaiKhoan.setVisible(false);
                btnMucGia.setVisible(false);
                mnuThongKe.setVisible(false);
                mniGiaThanh.setVisible(false);
                btnQLTaiKhoan.setVisible(false);
                btnPhong.setVisible(false);
            }
        }
    }

    private void startDongHo() {
        new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);
                lblDongHo.setText(text);
            }
        }).start();
    }

    private void openTaiKhoan() {
        if (Auth.isLogin()) {
            new TaiKhoanJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openLoaiPhong() {
        if (Auth.isLogin()) {
            new LoaiPhongJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openPhong() {
        if (Auth.isLogin()) {
            new PhongJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openKhachHang() {
        if (Auth.isLogin()) {
            new KhachHangJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openMucGia() {
        if (Auth.isLogin()) {
            new MucGiaJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openThuePhong() {
        if (Auth.isLogin()) {
            new ThuePhongJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openTraPhong() {
        if (Auth.isLogin()) {
            new TraPhongJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openHoaDon() {
        if (Auth.isLogin()) {
            new HoaDonJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openThongKe(int index) {
        if (Auth.isLogin()) {
            if (index == 2 && !Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem thông tin doanh thu");
                return;
            }
            ThongKeJDialog tkwin = new ThongKeJDialog(this, true);
            tkwin.selectTab(index);
            tkwin.setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
    }

    private void openDoiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhauJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }

    private void openDangNhap() {
        if (Auth.isLogin()) {
            new DangNhapJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }

    private void dangXuat() {
        Auth.clear();
        dispose();
        DangNhapJDialog loginForm = new DangNhapJDialog(null, true);
        loginForm.setLocationRelativeTo(null);
        loginForm.setVisible(true);

    }

    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn chắc là muốn kết thúc làm việc chứ!!!")) {
            System.exit(0);
        }
    }
}
