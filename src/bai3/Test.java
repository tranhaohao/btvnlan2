package bai3;

public class Test {
    public static void main(String[] args) {
        QuanLy quanLys = new QuanLy(2,2);
        quanLys.nhapVang();
        System.out.println(quanLys.tongVang());
        quanLys.nhapTienTe();
        System.out.println(quanLys.tongTienTe());
        quanLys.tungBinhTienTe();
        System.out.println(quanLys.tungBinhTienTe());
        quanLys.nhapTienTe();
    }
}
