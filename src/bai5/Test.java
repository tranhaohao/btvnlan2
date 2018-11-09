package bai5;

public class Test {
    public static void main(String[] args) {
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon(2,2);
        quanLyHoaDon.nhapKhachHangVN();
        System.out.println(quanLyHoaDon.tongKhachHangVietNam());
        quanLyHoaDon.nhapKhachHangNuocNgoai();
        System.out.println(quanLyHoaDon.tongKhachHangNuocNgoai());
        System.out.println(quanLyHoaDon.trungBinhKhachHangNuocNgoai());

    }
}
