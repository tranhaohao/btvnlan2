package bai6;

import java.util.Scanner;

public class HoaDonTheoGio extends KhachThuePhong {
    private double soGioThue;
    private double thanhTien;

    public HoaDonTheoGio(){
        super();

    }

    public HoaDonTheoGio(double soGioThue, double thanhTien) {
        this.soGioThue = soGioThue;
        this.thanhTien = thanhTien;
    }

    public HoaDonTheoGio(int maHoaDon, String tenKhachHang, int maPhong, double donGia, double soGioThue, double thanhTien) {
        super(maHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
        this.thanhTien = thanhTien;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhap(){
        System.out.println("Nhập vào số giờ thuê: ");
        this.soGioThue=new Scanner(System.in).nextDouble();
    }

    public void xuat(){
        System.out.println("so gio thue: "+this.soGioThue);
        System.out.println("thanh tien"+this.thanhTien);
    }

    public double tinhTien(){
        return thanhTien=getSoGioThue()*getDonGia();

    }
}
