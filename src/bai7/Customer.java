package bai7;

import java.util.Scanner;

public class Customer extends Person {
    private String tenCongTi;
    private double triGiaHoaDon;

    public Customer(){
        super();

    }

    public Customer(String tenCongTi, double triGiaHoaDon) {
        this.tenCongTi = tenCongTi;
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public Customer(String hoTen, String diaChi, String tenCongTi, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTi = tenCongTi;
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String getTenCongTi() {
        return tenCongTi;
    }

    public void setTenCongTi(String tenCongTi) {
        this.tenCongTi = tenCongTi;
    }

    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(double triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public void nhap(){
        super.nhapThongTin();
        System.out.println("Nhập vào tên công ti: ");
        this.tenCongTi=new Scanner(System.in).next();
        System.out.println("Nhập vào trị giá hóa đơn: ");
        this.triGiaHoaDon=new Scanner(System.in).nextDouble();
    }

    public void xuat(){
        super.xuatThongTin();
        System.out.println("ten cong ti"+this.tenCongTi);
        System.out.println("tri gia hoa don"+this.triGiaHoaDon);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "tenCongTi='" + tenCongTi + '\'' +
                ", triGiaHoaDon=" + triGiaHoaDon +
                '}';
    }
}
