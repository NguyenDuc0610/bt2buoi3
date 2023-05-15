import java.time.LocalDate;

class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia,
                       int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    @Override
    public double tinhTienVAT() {
        return getDonGia() * 0.1; // VAT hàng điện máy là 10%
    }

    @Override
    public String danhGiaBanRanh() {
        // Thực hiện đánh giá mức độ bận rộn của hàng điện máy
        return "Đánh giá hàng điện máy";
    }
}

class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia,
                      String nhaSanXuat, LocalDate ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    @Override
    public double tinhTienVAT() {
        return getDonGia() * 0.1; // VAT hàng sành sứ là 10%
    }

    @Override
    public String danhGiaBanRanh() {
        // Thực hiện đánh giá mức độ bận rộn của hàng sành sứ
        return "Đánh giá hàng sành sứ";
    }
}
