/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author accgs
 */
public class HoaDonService {
    // Email và mật khẩu của bạn (dùng tài khoản hỗ trợ gửi email)
    private static final String EMAIL_SENDER = "annttts01299@fpt.edu.vn";
    private static final String PASSWORD = "tujp nhbr nqwx lixq"; // Nếu dùng Gmail, cần bật 'App Password'

    public static void guiHoaDon(HoaDon hoaDon, String toEmail) {
        // Cấu hình SMTP cho Gmail
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Tạo phiên làm việc với Gmail
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
            message.setSubject("Hóa Đơn Thanh Toán - Mã: " + hoaDon.getMaHoaDon());

            // Nội dung email (HTML)
            String content = "<h2>Kính gửi khách hàng, quý anh/chị<h2>"
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