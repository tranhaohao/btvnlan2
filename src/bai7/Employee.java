package bai7;

import java.util.Scanner;

public class Employee extends Person {
    private double heSoLuong;

    public Employee(){
        super();
        this.heSoLuong=0;
    }

    public Employee(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Employee(String hoTen, String diaChi, double heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void nhap(){
        super.nhapThongTin();
        System.out.println("Nhập vào hệ số lương: ");
        this.heSoLuong=new Scanner(System.in).nextInt();
    }

    public void xuat()
    {
        super.xuatThongTin();
        System.out.println("he so luong"+this.heSoLuong);
    }

    @Override
    public String toString(){
        return String.format("");
    }
}
