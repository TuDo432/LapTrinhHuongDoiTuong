// Bài tuần 3, bảng Nhân viên
public class NhanVien {
    // --- 1. THUỘC TÍNH 
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private double luong; 

    // --- 2. CONSTRUCTOR
    public NhanVien(String ten, String ngaySinh, String gioiTinh, double luong) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
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

    // Cặp cho Lương (Chú ý kiểu dữ liệu là số)
    public double getLuong() { return luong; }
    public void setLuong(double luong) { this.luong = luong; }

    // --- 4. HÀM HIỂN THỊ 
    public String toString() {
        return "NV: " + ten + " - Luong: " + (long)luong + " VND";
    }
}
