/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.ptcd.nhatrosystem.entity;

import com.fpt.ptcd.nhatrosystem.dao.HoaDonDAO;
import com.fpt.ptcd.nhatrosystem.dao.KhachHangDAO;
import com.fpt.ptcd.nhatrosystem.dao.LoaiPhongDAO;
import com.fpt.ptcd.nhatrosystem.dao.MucGiaDAO;
import com.fpt.ptcd.nhatrosystem.dao.NhanVienDAO;
import com.fpt.ptcd.nhatrosystem.dao.PhongDAO;
import com.fpt.ptcd.nhatrosystem.dao.ThuePhongDAO;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
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
    private static final HoaDonDAO hoaDonDAO = new HoaDonDAO();
    private static final PhongDAO phongDAO = new PhongDAO();
    private static final LoaiPhongDAO loaiPhongDAO = new LoaiPhongDAO();
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private static final MucGiaDAO mucGiaDAO = new MucGiaDAO();
    private static final ThuePhongDAO thuePhongDAO = new ThuePhongDAO();
    
    public double tinhTienDien(int soDien, MucGia mucGia) {
        double tienDien = mucGia.tinhTienDien(soDien);
        return tienDien;
    }

    public double tinhTienNuoc(int soNuoc, MucGia mucGia) {
        double tienNuoc = mucGia.tinhTienNuoc(soNuoc);
        return tienNuoc;
    }
    
    // Bắt đầu gửi email mỗi phút
    public static void startAutoEmail() {
    Runnable task = () -> {
        try {
            List<HoaDon> hoaDons = hoaDonDAO.selectAll(); // Lấy danh sách hóa đơn

            for (HoaDon hoaDon : hoaDons) {
                LocalDate ngayThue = thuePhongDAO.getNgayThueByMaPhieuThue(hoaDon.getMaPhieuThue()); // Lấy ngày thuê từ mã phiếu thuê
                LocalDate ngayTra = thuePhongDAO.getNgayTraByMaPhieuThue(hoaDon.getMaPhieuThue()); // Lấy ngày trả từ mã phiếu thuê
                LocalDate homNay = LocalDate.now(); // Lấy ngày hiện tại

                // Kiểm tra nếu ngày hiện tại đã đủ 1 tháng kể từ ngày thuê và chưa đến ngày trả
                if (!homNay.isBefore(ngayThue.plusMonths(1)) && homNay.isBefore(ngayTra)) {
                    String toEmail = khachHangDAO.getEmailByMaPhieuThue(hoaDon.getMaPhieuThue()); // Lấy email khách hàng
                    String filePath = "F:\\NhaTroSystem\\NhaTroSystem\\src\\main\\java\\excel\\mucGia.xlsx"; 
                    guiHoaDon(hoaDon, toEmail, filePath);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    // Lập lịch kiểm tra và gửi email mỗi ngày
    scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.DAYS);
}

    public static void guiHoaDon(HoaDon hoaDon, String toEmail, String filePath) throws UnsupportedEncodingException, IOException {
        String tenKhach = khachHangDAO.getTenKhachByMaPhieuThue(hoaDon.getMaPhieuThue());
        String tenNhanVien = nhanVienDAO.getTenNhanVienByMaPhieuThue(hoaDon.getMaPhieuThue());
        String maPhong = phongDAO.getMaPhongByMaPhieuThue(hoaDon.getMaPhieuThue());
        String tenLoai = loaiPhongDAO.getLoaiPhongByMaPhong(maPhong);
        double tienLoai = loaiPhongDAO.getGiaPhongByTenLoai(tenLoai);
        
        MucGia mucGia = mucGiaDAO.selectAll().get(0);
        
        double tienDien = mucGia.tinhTienDien(hoaDon.getSoDien());
        double tienNuoc = mucGia.tinhTienNuoc(hoaDon.getSoNuoc());
        
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
            MimeBodyPart textPart = new MimeBodyPart();
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL_SENDER));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(MimeUtility.encodeText("Hóa Đơn Thanh Toán - Mã: " + hoaDon.getMaHoaDon(), "UTF-8", "B"));

            String content = "<h2>Kính gửi anh/chị: " + tenKhach + ",</h2>"
                    + "<p><b>Em là nhân viên phụ trách:</b> " + tenNhanVien + "</p>"
                    + "<p><b>Mã phiếu thuê:</b> " + hoaDon.getMaPhieuThue() + "</p>"
                    + "<p><b>Loại phòng: </b>" + tenLoai +"<b>, với giá mỗi tháng là: </b>" + tienLoai +"VNĐ</p>"
                    + "<p><b>Số KWh điện sử dụng:</b> " + hoaDon.getSoDien() + " KWh <b>(Tương ứng: </b>" + tienDien + " VNĐ)</p>" 
                    + "<p><b>Số m3 nước sử dụng:</b> " + hoaDon.getSoNuoc() + " m3 <b>(Tương ứng: </b>" + tienNuoc + " VNĐ)</p>"
                    + "<p><b>Tiền Wifi:</b> " + hoaDon.getTienWifi() + " VNĐ</p>"
                    + "<p><b>Tiền Rác:</b> " + hoaDon.getTienRac() + " VNĐ</p>"
                    + "<p><b>Tiền các chi phí phát sinh:</b> " + hoaDon.getChiPhiKhac() + " VNĐ</p>"
                    + "<p><b>Tổng tiền:</b> " + hoaDon.getTongTien() + " VNĐ</p>"
                    + "<br><p>Vui lòng thanh toán đúng hạn!</p>";

            textPart.setContent(content, "text/html; charset=UTF-8");
             // Tạo phần đính kèm file Excel
            MimeBodyPart attachmentPart = new MimeBodyPart();
            File file = new File("F:\\DuAn_TotNghiep\\NhaTroSystem\\NhaTroSystem\\src\\main\\java\\excel\\mucGia.xlsx"); // Đường dẫn file Excel
            attachmentPart.attachFile(file);
            
            // Gộp các phần lại thành nội dung email
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(attachmentPart);
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Email đã gửi thành công đến " + toEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi gửi email: " + e.getMessage());
        }
    }
    
    
}