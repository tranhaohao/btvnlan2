package bai4;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat {
    private int loaiDat;
    private double thanhTien;

    public GiaoDichDat() {
        super();
    }

    public GiaoDichDat(int loaiDat, double thanhTien) {
        this.loaiDat = loaiDat;
        this.thanhTien = thanhTien;
    }

    public GiaoDichDat(int maGiaoDich, double donGia, int loaiDat, int loaiDat1, double thanhTien) {
        super(maGiaoDich, donGia, loaiDat);
        this.loaiDat = loaiDat1;
        this.thanhTien = thanhTien;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhap() {
        super.nhapThongTinGiaoDich();
        do {
            System.out.println("Nhập vào loại đất: ");
            this.loaiDat = new Scanner(System.in).nextInt();
        } while (loaiDat != 0 && loaiDat != 1);

    }

    public void xuat() {
        super.xuatThongTinGiaoDich();
        System.out.println("loai dat" + this.loaiDat);
        System.out.println("thanh tien" + this.thanhTien);
    }

    public double tinhTienDat() {
        if (loaiDat == 0) {
            thanhTien = getDienTich() * getDonGia();
        } else {
            thanhTien = getDienTich() * getDonGia() * 1.5;
        }
        return thanhTien;
    }
}
