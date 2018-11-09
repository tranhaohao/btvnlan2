package bai7;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.Scanner;

public class Student extends Person {
    private double diemMonHoc1;
    private double diemMonHoc2;

    public Student() {
        super();
        this.diemMonHoc1 = 0;
        this.diemMonHoc2 = 0;
    }

    public Student(double diemMonHoc1, double diemMonHoc2) {
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }

    public Student(String hoTen, String diaChi, double diemMonHoc1, double diemMonHoc2) {
        super(hoTen, diaChi);
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }

    public double getDiemMonHoc1() {
        return diemMonHoc1;
    }

    public void setDiemMonHoc1(double diemMonHoc1) {
        this.diemMonHoc1 = diemMonHoc1;
    }

    public double getDiemMonHoc2() {
        return diemMonHoc2;
    }

    public void setDiemMonHoc2(double diemMonHoc2) {
        this.diemMonHoc2 = diemMonHoc2;
    }

    public void nhap() {
        super.nhapThongTin();
        System.out.println("Nhập vào điểm môn học 1: ");
        this.diemMonHoc1 = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào điểm môn học 2: ");
        this.diemMonHoc2 = new Scanner(System.in).nextDouble();
    }

    public void xuat() {
        super.xuatThongTin();
        System.out.println("diem mon hoc 1" + this.diemMonHoc1);
        System.out.println("diem mon hoc 2" + this.diemMonHoc2);
    }

    public double diemTrungBinh() {
        double tongtb =0 ;
            tongtb = (getDiemMonHoc1() + getDiemMonHoc2()) / 2;

        return tongtb;
    }

    @Override
    public String toString(){
        return String.format("%d%d%f",getHoTen(),getDiaChi(),diemTrungBinh());
    }
}
