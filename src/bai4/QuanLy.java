package bai4;

import bai3.GiaoDichVang;

public class QuanLy {
    private GiaoDichNha[] gdNha;
    private GiaoDichDat[] gdDat;
    private int soLuongNha;
    private int soLuongDat;

    public QuanLy(GiaoDichNha[] gdNha, GiaoDichDat[] gdDat, int soLuongNha, int soLuongDat) {
        this.gdNha = gdNha;
        this.gdDat = gdDat;
        this.soLuongNha = soLuongNha;
        this.soLuongDat = soLuongDat;
    }

    public QuanLy(int soLuongNha,int soLuongDat){
        this.soLuongNha=soLuongNha;
        this.soLuongDat=soLuongDat;
        this.gdNha= new GiaoDichNha[this.soLuongNha];
        this.gdDat=new GiaoDichDat[this.soLuongDat];
    }

    public void nhapNha(){
        for (int i = 0; i < this.soLuongNha; i++) {
            this.gdNha[i] =new GiaoDichNha();
            this.gdNha[i].nhap();
        }
    }

    public void xuatNha(){
        for (int i = 0; i <this.soLuongNha ; i++) {
            this.gdNha[i].xuat();
        }
    }

    public void nhapDat(){
        for (int i = 0; i <this.soLuongDat ; i++) {
            this.gdDat[i]=new GiaoDichDat();
            this.gdDat[i].nhap();
        }
    }

    public void xuatDat(){
        for (int i = 0; i < this.soLuongDat; i++) {
            this.gdDat[i].xuat();
        }
    }

    public int tongNha(){
        int tong = 0;
        for (int i = 0; i < this.soLuongNha; i++) {
            tong += this.gdNha[i].getThanhTien();
        }
        return tong;
    }

    public int tongDat(){
        int tong=0;
        for (int i = 0; i < this.soLuongDat; i++) {
            tong +=this.gdDat[i].getThanhTien();
        }
        return tong;
    }

    public double trungBinhTienDat(){
        double tongtb = 0;
        for (int i = 0; i < this.soLuongDat; i++) {
            tongtb += tongDat() / this.soLuongDat;
        }
        return tongtb;
    }

    public void xuatGiaoDichThang9Nam2013(){
    }
}
