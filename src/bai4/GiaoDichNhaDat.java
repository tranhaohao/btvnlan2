package bai4;

import java.util.Scanner;

public class GiaoDichNhaDat {
    private int maGiaoDich;
    private double donGia;
    private double dienTich;

    public GiaoDichNhaDat(){
        this.maGiaoDich=0;
        this.donGia=0;
        this.dienTich=0;
    }
    public GiaoDichNhaDat(int maGiaoDich, double donGia, int loaiDat) {
        this.maGiaoDich = maGiaoDich;
        this.donGia = donGia;
        this.dienTich = loaiDat;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapThongTinGiaoDich(){
        System.out.println("Nhập vào mã giao dịch: ");
        this.maGiaoDich=new Scanner(System.in).nextInt();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia=new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào diện tích: ");
        this.dienTich=new Scanner(System.in).nextDouble();
    }

    public void xuatThongTinGiaoDich(){
        System.out.println("ma giao dich"+this.maGiaoDich);
        System.out.println("don gia"+this.donGia);
        System.out.println("dien tich"+this.dienTich);
    }
}
