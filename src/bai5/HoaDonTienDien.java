package bai5;

import java.util.Scanner;

public class HoaDonTienDien {
    private int maKhacHang;
    private String hoTen;
    private int soLuong;
    private int donGia;

    public HoaDonTienDien(){
        super();

    }

    public HoaDonTienDien(int maKhacHang, String hoTen, int soLuong, int donGia) {
        this.maKhacHang = maKhacHang;
        this.hoTen = hoTen;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getMaKhacHang() {
        return maKhacHang;
    }

    public void setMaKhacHang(int maKhacHang) {
        this.maKhacHang = maKhacHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void nhapThongTinKhachHang(){
        System.out.println("Nhập vào mã khách hàng: ");
        this.maKhacHang=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào họ tên khách hàng: ");
        this.hoTen=new Scanner(System.in).next();
        System.out.println("Nhập vào số lượng: ");
        this.soLuong=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia=new Scanner(System.in).nextInt();

    }

    public void xuatThongTinKhachHang(){
        System.out.println("ma khach hang"+this.maKhacHang);
        System.out.println("ho ten"+this.hoTen);
        System.out.println("so luong"+this.soLuong);
        System.out.println("don gia"+this.donGia);
    }
}
