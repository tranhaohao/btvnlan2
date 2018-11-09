package bai5;

import java.util.Scanner;

public class KhachHangVietNam extends HoaDonTienDien {
    private String doiTuong;
    private int dinhMuc;
    private double thanhTien;

    public KhachHangVietNam(){
        super();
    }

    public KhachHangVietNam(String doiTuong, int dinhMuc, int thanhTien) {
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
        this.thanhTien = thanhTien;
    }

    public KhachHangVietNam(int maKhacHang, String hoTen, int soLuong, int donGia, String doiTuong, int dinhMuc, double thanhTien) {
        super(maKhacHang, hoTen, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
        this.thanhTien = thanhTien;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhap(){
        super.nhapThongTinKhachHang();
        System.out.println("Nhập vào đối tượng: ");
        this.doiTuong=new Scanner(System.in).next();
        System.out.println("Nhập vào định mức: ");
        this.dinhMuc=new Scanner(System.in).nextInt();
    }
    public void xuat(){
        super.xuatThongTinKhachHang();
        System.out.println("doi tuong"+this.doiTuong);
        System.out.println("dinh muc"+this.dinhMuc);
        System.out.println("thanh tien"+this.thanhTien);
    }

    public double tinhTien(){
        if(getSoLuong()<=getDinhMuc()){
            thanhTien=getSoLuong()*getDonGia();
        }else {
            thanhTien=getSoLuong()*getDonGia()*(getSoLuong()-getDinhMuc())*getDonGia()*2.5;
        }
        return thanhTien;

    }
}
