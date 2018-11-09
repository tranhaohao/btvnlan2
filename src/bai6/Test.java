package bai6;

public class Test {
    public static void main(String[] args) {
        QuanLyKhachSan quanLyKhachSan=new QuanLyKhachSan(2,2);
        quanLyKhachSan.nhapHoaDonTheoNgay();
        System.out.println(quanLyKhachSan.tongHoaDonTheoNgay());
        quanLyKhachSan.nhapHoaDonTheoGio();
        System.out.println(quanLyKhachSan.tongHoDonTheoGio());
    }
}
