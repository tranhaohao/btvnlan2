package bai5;

import java.util.Scanner;

public class KhachHangNuocNgoai extends HoaDonTienDien {
    private String quocTich;
    private double thanhTien;

    public KhachHangNuocNgoai() {
        super();

    }

    public KhachHangNuocNgoai(String quocTich, double thanhTien) {
        this.quocTich = quocTich;
        this.thanhTien = thanhTien;
    }

    public KhachHangNuocNgoai(int maKhacHang, String hoTen, int soLuong, int donGia, String quocTich, double thanhTien) {
        super(maKhacHang, hoTen, soLuong, donGia);
        this.quocTich = quocTich;
        this.thanhTien = thanhTien;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhap(){
        super.nhapThongTinKhachHang();
        System.out.println("Nhập vào quốc tịch: ");
        this.quocTich=new Scanner(System.in).next();
    }

    public void xuat(){
        super.xuatThongTinKhachHang();
        System.out.println("quoc tich"+this.quocTich);
        System.out.println("thanh tien"+this.thanhTien);
    }

    public double tinhTien(){
        return thanhTien=getSoLuong()*getDonGia();
    }
}
