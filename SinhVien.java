// Bài tuần 3, bảng Sinh viên
public class SinhVien {
    // --- 1. THUỘC TÍNH
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String lop;

    // --- 2. CONSTRUCTOR
    public SinhVien(String ten, String ngaySinh, String gioiTinh, String lop) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }
    
    // Cặp cho Tên
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    // Cặp cho Ngày sinh
    public String getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(String ngaySinh) { this.ngaySinh = ngaySinh; }

    // Cặp cho Giới tính
    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    // Cặp cho Lớp
    public String getLop() { return lop; }
    public void setLop(String lop) { this.lop = lop; }

    // --- 4. HÀM HIỂN THỊ
    public String toString() {
        return "SV: " + ten + " - Lop: " + lop + " - GT: " + gioiTinh;
    }
}