package CaseStudy.Models.Service;

public class contract {
    private int soHopDong;
    private double soTienCoc;
    private double tongTienThanhToan;

    public contract(int soHopDong, double soTienCoc, double tongTienThanhToan) {
        this.soHopDong = soHopDong;
        this.soTienCoc = soTienCoc;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public double getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(double soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public double getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(double tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }
}
