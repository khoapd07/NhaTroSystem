/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fpt.ptcd.nhatrosystem;

import com.fpt.ptcd.nhatrosystem.ui.ChaoJDialog;
import com.fpt.ptcd.nhatrosystem.ui.DangNhapJDialog;
import com.fpt.ptcd.nhatrosystem.ui.NhaTroSystemJFrame;

/**
 *
 * @author phamd
 */
public class NhaTroSystem {

    public static void main(String[] args) {
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
}
