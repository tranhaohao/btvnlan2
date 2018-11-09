package bai6;

public class QuanLyKhachSan {
    private HoaDonTheoGio[] hoaDonTheoGios;
    private HoaDonTheoNgay[] hoaDonTheoNgays;
    private int soLuongHoaDonTheoGio;
    private int soLuongHoaDonTheoNgay;

    public QuanLyKhachSan(){
        super();

    }

    public QuanLyKhachSan(int soLuongHoaDonTheoGio, int soLuongHoaDonTheoNgay) {
        this.soLuongHoaDonTheoGio = soLuongHoaDonTheoGio;
        this.soLuongHoaDonTheoNgay = soLuongHoaDonTheoNgay;
        this.hoaDonTheoGios=new HoaDonTheoGio[this.soLuongHoaDonTheoGio];
        this.hoaDonTheoNgays=new HoaDonTheoNgay[this.soLuongHoaDonTheoNgay];

    }

    public int getSoLuongHoaDonTheoGio() {
        return soLuongHoaDonTheoGio;
    }

    public void setSoLuongHoaDonTheoGio(int soLuongHoaDonTheoGio) {
        this.soLuongHoaDonTheoGio = soLuongHoaDonTheoGio;
    }

    public int getSoLuongHoaDonTheoNgay() {
        return soLuongHoaDonTheoNgay;
    }

    public void setSoLuongHoaDonTheoNgay(int soLuongHoaDonTheoNgay) {
        this.soLuongHoaDonTheoNgay = soLuongHoaDonTheoNgay;
    }

    public void nhapHoaDonTheoGio(){
        for (int i = 0; i <this.soLuongHoaDonTheoGio ; i++) {
            this.hoaDonTheoGios[i]=new HoaDonTheoGio();
            this.hoaDonTheoGios[i].nhap();

        }
    }

    public void xuatHoaDonTheoGio(){
        for (int i = 0; i <this.soLuongHoaDonTheoGio ; i++) {
            this.hoaDonTheoGios[i].xuat();
        }
    }

    public void nhapHoaDonTheoNgay(){
        for (int i = 0; i <this.soLuongHoaDonTheoNgay ; i++) {
            this.hoaDonTheoNgays[i]=new HoaDonTheoNgay();
            this.hoaDonTheoNgays[i].nhap();
        }
    }

    public void xuatHoaDonTheoNgay(){
        for (int i = 0; i < this.soLuongHoaDonTheoNgay; i++) {
            this.hoaDonTheoNgays[i].xuat();
        }
    }

    public double tongHoDonTheoGio(){
        double tong=0;
        for (int i = 0; i <this.soLuongHoaDonTheoGio ; i++) {
            tong+=this.hoaDonTheoNgays[i].getThanhTien();
        }
        return tong;
    }

    public double tongHoaDonTheoNgay(){
        double tong=0;
        for (int i = 0; i <this.soLuongHoaDonTheoNgay ; i++) {
            tong+=this.hoaDonTheoNgays[i].getThanhTien();
        }
        return tong;
    }
}
