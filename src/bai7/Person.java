package bai7;

import java.util.Scanner;

public class Person {
    private String hoTen;
    private String diaChi;

    public Person(){
        this.hoTen="";
        this.diaChi="";
    }

    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin(){
        System.out.println("Nhập vào họ tên: ");
        this.hoTen=new Scanner(System.in).next();
        System.out.println("Nhập vào địa chỉ: ");
        this.diaChi=new Scanner(System.in).next();
    }

    public void xuatThongTin(){
        System.out.println("ho ten"+this.hoTen);
        System.out.println("dia chi"+this.diaChi);
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
