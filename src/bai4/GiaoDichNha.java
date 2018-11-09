package bai4;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat {
    private String diaChi;
    private double thanhTien;
    private int loaiNha;

    public GiaoDichNha(){
        super();
    }

    public GiaoDichNha(String diaChi, int thanhTien,int loaiNha) {
        this.diaChi = diaChi;
        this.thanhTien = thanhTien;
        this.loaiNha=loaiNha;
    }

    public GiaoDichNha(int maGiaoDich, double donGia, int loaiDat, String diaChi, int thanhTien,int loaiNha) {
        super(maGiaoDich, donGia, loaiDat);
        this.diaChi = diaChi;
        this.thanhTien = thanhTien;
        this.loaiNha=loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public void nhap(){
        super.nhapThongTinGiaoDich();
        System.out.println("Nhập vào địa chỉ: ");
        this.diaChi=new Scanner(System.in).next();
        do {
            System.out.println("Nhập vào loại nhà: ");
            this.loaiNha = new Scanner(System.in).nextInt();
        }while (loaiNha != 0 && loaiNha != 1);

    }

    public void xuat(){
        super.xuatThongTinGiaoDich();
        System.out.println("dia chi"+this.diaChi);
        System.out.println("thanh tien"+this.thanhTien);
        System.out.println("loai nha"+this.loaiNha);
    }

    public double tinhTienNha(){
        if(loaiNha==0){
          thanhTien=getDienTich()*getDonGia();
        }else {
            thanhTien=getDienTich()*getDonGia()*0.9;
        }
        return thanhTien;
    }
}
