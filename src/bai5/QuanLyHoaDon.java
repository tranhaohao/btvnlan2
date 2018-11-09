package bai5;

public class QuanLyHoaDon {
    private KhachHangVietNam[] khachHangVietNams;
    private KhachHangNuocNgoai[] khachHangNuocNgoais;
    private int soLuongKhachVietNam;
    private int soLuongKhachNuocNgoai;

    public QuanLyHoaDon(int soLuongKhachVietNam, int soLuongKhachNuocNgoai) {
        this.soLuongKhachVietNam = soLuongKhachVietNam;
        this.soLuongKhachNuocNgoai = soLuongKhachNuocNgoai;
        this.khachHangVietNams = new KhachHangVietNam[this.soLuongKhachVietNam];
        this.khachHangNuocNgoais = new KhachHangNuocNgoai[this.soLuongKhachNuocNgoai];
    }

    public int getSoLuongKhachVietNam() {
        return soLuongKhachVietNam;
    }

    public void setSoLuongKhachVietNam(int soLuongKhachVietNam) {
        this.soLuongKhachVietNam = soLuongKhachVietNam;
    }

    public int getSoLuongKhachNuocNgoai() {
        return soLuongKhachNuocNgoai;
    }

    public void setSoLuongKhachNuocNgoai(int soLuongKhachNuocNgoai) {
        this.soLuongKhachNuocNgoai = soLuongKhachNuocNgoai;
    }

    public void nhapKhachHangVN() {
        for (int i = 0; i < this.soLuongKhachVietNam; i++) {
            this.khachHangVietNams[i] = new KhachHangVietNam();
            this.khachHangVietNams[i].nhap();
        }
    }

    public void xuatKhachHangVietNam() {
        for (int i = 0; i < this.soLuongKhachVietNam; i++) {
            this.khachHangVietNams[i].xuat();
        }
    }

    public void nhapKhachHangNuocNgoai() {
        for (int i = 0; i < this.soLuongKhachNuocNgoai; i++) {
            this.khachHangNuocNgoais[i] = new KhachHangNuocNgoai();
            this.khachHangNuocNgoais[i].nhap();
        }
    }

    public void xuatKhachhangNuocNgoai() {
        for (int i = 0; i < this.soLuongKhachNuocNgoai; i++) {
            this.khachHangNuocNgoais[i].nhap();
        }
    }

    public double tongKhachHangVietNam() {
        double tong=0;
        for (int i = 0; i < this.soLuongKhachVietNam; i++) {
            tong += this.khachHangVietNams[i].getThanhTien();
        }
        return tong;
    }

    public double tongKhachHangNuocNgoai(){
        double tong=0;
        for (int i = 0; i < this.soLuongKhachNuocNgoai; i++) {
            tong+=this.khachHangNuocNgoais[i].getThanhTien();
        }
        return tong;
    }

    public double trungBinhKhachHangNuocNgoai(){
        double tongTb=0;
        for (int i = 0; i <this.soLuongKhachNuocNgoai ; i++) {
            tongTb+=this.tongKhachHangNuocNgoai()/getSoLuongKhachNuocNgoai();
        }
        return tongTb;
    }

    public void xuatHoaDonThang9Nam2013VietNam(){


    }

    public void xuatHoaDonThang9Nam2013NuocNgoai(){


    }
}
