package bai2;

public class Test {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy(2,2);
        quanLy.nhapSachGiaoKhoa();
        System.out.println(quanLy.tongSachGiaoKhoa());
        quanLy.nhapSachThamKhao();
        System.out.println(quanLy.tongSachThamKhao());
        quanLy.trungBinhCongDonGia();
        System.out.println(quanLy.trungBinhCongDonGia());
    }

}

