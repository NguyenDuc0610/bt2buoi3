import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng hàng thực phẩm
        HangThucPham hangThucPham = new HangThucPham("TP001", "Hàng thực phẩm", 10, 100000,
                LocalDate.of(2023, 5, 15), LocalDate.of(2023, 12, 31), "Nhà cung cấp A");

        System.out.println("Mã hàng: " + hangThucPham.getMaHang());
        System.out.println("Tên hàng: " + hangThucPham.getTenHang());
        System.out.println("Số lượng tồn: " + hangThucPham.getSoLuongTon());
        System.out.println("Đơn giá: " + hangThucPham.getDonGia());
        System.out.println("Ngày sản xuất: " + hangThucPham.getNgaySanXuat());
        System.out.println("Ngày hết hạn: " + hangThucPham.getNgayHetHan());
        System.out.println("Nhà cung cấp: " + hangThucPham.getNhaCungCap());
        System.out.println("Tiền VAT: " + hangThucPham.tinhTienVAT());
        System.out.println("Đánh giá bận rộn: " + hangThucPham.danhGiaBanRanh());

        System.out.println();

        // Tạo đối tượng hàng điện máy
        HangDienMay hangDienMay = new HangDienMay("DM001", "Hàng điện máy", 5, 5000000,
                12, 1500);

        System.out.println("Mã hàng: " + hangDienMay.getMaHang());
        System.out.println("Tên hàng: " + hangDienMay.getTenHang());
        System.out.println("Số lượng tồn: " + hangDienMay.getSoLuongTon());
        System.out.println("Đơn giá: " + hangDienMay.getDonGia());
        System.out.println("Thời gian bảo hành: " + hangDienMay.getThoiGianBaoHanh());
        System.out.println("Công suất: " + hangDienMay.getCongSuat());
        System.out.println("Tiền VAT: " + hangDienMay.tinhTienVAT());
        System.out.println("Đánh giá bận rộn: " + hangDienMay.danhGiaBanRanh());

        System.out.println();

        // Tạo đối tượng hàng sành sứ
        HangSanhSu hangSanhSu = new HangSanhSu("SS001", "Hàng sành sứ", 3, 2000000,
                "Nhà sản xuất A", LocalDate.of(2023, 5, 15));

        System.out.println("Mã hàng: " + hangSanhSu.getMaHang());
        System.out.println("Tên hàng: " + hangSanhSu.getTenHang());
        System.out.println("Số lượng tồn: " + hangSanhSu.getSoLuongTon());
        System.out.println("Đơn giá: " + hangSanhSu.getDonGia());
        System.out.println("Nhà sản xuất: " + hangSanhSu.getNhaSanXuat());
        System.out.println("Ngày nhập kho: " + hangSanhSu.getNgayNhapKho());
        System.out.println("Tiền VAT: " + hangSanhSu.tinhTienVAT());
        System.out.println("Đánh giá bận rộn: " + hangSanhSu.danhGiaBanRanh());
    }
}
