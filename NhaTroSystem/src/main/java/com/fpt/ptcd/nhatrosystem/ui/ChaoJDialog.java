/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author 24010
 */
public class ChaoJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChaoJDialog
     */
    public ChaoJDialog(java.awt.Frame parent, boolean modal) {
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

        lblLogo = new javax.swing.JLabel();
        pgdLoading = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon("D:\\JAva_Du_An_Tot_Nghiep\\NhaTroSystem\\NhaTroSystem\\src\\main\\resources\\logo\\icon\\NhaTroLand.png")); // NOI18N
        lblLogo.setAutoscrolls(true);
        lblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblLogo.setOpaque(true);

        pgdLoading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pgdLoading.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pgdLoading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgdLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChaoJDialog dialog = new ChaoJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblLogo;
    private javax.swing.JProgressBar pgdLoading;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        Random random = new Random();

        new Timer(80, new ActionListener() { // Chỉnh khoảng thời gian phù hợp
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = pgdLoading.getValue();
                if (value < pgdLoading.getMaximum()) {
                    // Sinh số ngẫu nhiên từ 1 đến 13 để tăng thanh loading không đều
                    int randomIncrement = random.nextInt(13) + 1; 
                    pgdLoading.setValue(Math.min(value + randomIncrement, pgdLoading.getMaximum()));
                } else {
                    ((Timer) e.getSource()).stop(); // Dừng Timer khi load xong
                    ChaoJDialog.this.dispose();
                }
            }
        }).start();
    }
}
