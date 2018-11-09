package bai6;

import java.util.Scanner;

public class KhachThuePhong {
    private int maHoaDon;
    private String tenKhachHang;
    private int maPhong;
    private double donGia;

    public KhachThuePhong(){
        this.maHoaDon=1;
        this.tenKhachHang="";
        this.maPhong=0;
        this.donGia=0;
    }

    public KhachThuePhong(int maHoaDon, String tenKhachHang, int maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapThongTin(){
        System.out.println("Nhập vào mã hóa đơn: ");
        this.maHoaDon=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tên khách hàng: ");
        this.tenKhachHang=new Scanner(System.in).next();
        System.out.println("Nhập vào mã phòng: ");
        this.maPhong=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia=new Scanner(System.in).nextDouble();
    }

    public void xuatThongTin(){
        System.out.println("ma hoa don"+this.maHoaDon);
        System.out.println("ten khach hang"+this.tenKhachHang);
        System.out.println("ma phong"+this.maPhong);
        System.out.println("don gia"+this.donGia);

    }
}
