/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

import com.fpt.ptcd.nhatrosystem.dao.KhachHangDAO;
import com.fpt.ptcd.nhatrosystem.dao.NhanVienDAO;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

/**
 *
 * @author accgs
 */
public class HoaDonService {
    private static final String EMAIL_SENDER = "annttts01299@fpt.edu.vn";
    private static final String PASSWORD = "tujp nhbr nqwx lixq";

    private static final KhachHangDAO khachHangDAO = new KhachHangDAO();
    private static final NhanVienDAO nhanVienDAO = new NhanVienDAO();

    public static void guiHoaDon(HoaDon hoaDon, String toEmail) throws UnsupportedEncodingException {
        // Lấy tên khách hàng và tên nhân viên
        String tenKhach = khachHangDAO.getTenKhachByMaPhieuThue(hoaDon.getMaPhieuThue());
        String tenNhanVien = nhanVienDAO.getTenNhanVienByMaPhieuThue(hoaDon.getMaPhieuThue());

        // Cấu hình SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_SENDER, PASSWORD);
            }
        });

        try {
            // Tạo email
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL_SENDER));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(MimeUtility.encodeText("Hóa Đơn Thanh Toán - Mã: " + hoaDon.getMaHoaDon(), "UTF-8", "B"));


            // Nội dung email (HTML)
            String content = "<h2>Kính gửi khách hàng, quý anh/chị: " + tenKhach + ",</h2>"
                    + "<p><b>Em là nhân viên phụ trách:</b> " + tenNhanVien + ", dưới đây là chi tiết hóa đơn của mình</p>"
                    + "<p><b>Mã phiếu thuê:</b> " + hoaDon.getMaPhieuThue() + "</p>"
                    + "<p><b>Số KWh điện sử dụng:</b> " + hoaDon.getSoDien() + " KWh</p>"
                    + "<p><b>Số m3 nước sử dụng:</b> " + hoaDon.getSoNuoc() + " m3</p>"
                    + "<p><b>Tiền Wifi:</b> " + hoaDon.getTienWifi() + " VNĐ</p>"
                    + "<p><b>Tiền Rác:</b> " + hoaDon.getTienRac() + " VNĐ</p>"
                    + "<p><b>Tiền các chi phí phát sinh:</b> " + hoaDon.getChiPhiKhac() + " VNĐ</p>"
                    + "<p><b>Tổng tiền:</b> " + hoaDon.getTongTien() + " VNĐ</p>"
                    + "<p><b>Ngày lập:</b> " + hoaDon.getNgay() + "</p>"
                    + "<br><p>Vui lòng thanh toán đúng hạn!</p>";

            message.setContent(content, "text/html; charset=UTF-8");

            // Gửi email
            Transport.send(message);
            System.out.println("Email đã gửi thành công đến " + toEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi gửi email: " + e.getMessage());
        }
    }
}