// Bài tuần 3, bảng xe
public class Xe {
    private String soXe;      // Số xe
    private String chuXe;     // Chủ xe
    private String hieuXe;    // Hiệu xe
    private double giaXe;     // Giá xe 
    private int dungTich;     // Dung tích 

    // --- 2. HÀM KHỞI TẠO 
    public Xe(String soXe, String chuXe, String hieuXe, double giaXe, int dungTich) {
        this.soXe = soXe;
        this.chuXe = chuXe;
        this.hieuXe = hieuXe;
        this.giaXe = giaXe;
        this.dungTich = dungTich;
    }

    public String getSoXe() { return soXe; }
    public void setSoXe(String soXe) { this.soXe = soXe; }

    public int getDungTich() { return dungTich; }
    public void setDungTich(int dungTich) { this.dungTich = dungTich; }

    public double getGiaXe() { return giaXe; }
    public void setGiaXe(double giaXe) { this.giaXe = giaXe; }

    // 4. Tính thuế dựa trên dung tích 
    public double dongThue() {
        if (dungTich < 100) {
            return giaXe * 0.01; // Thuế 1%
        } else if (dungTich <= 200) {
            return giaXe * 0.03; // Thuế 3%
        } else {
            return giaXe * 0.05; // Thuế 5%
        }
    }

    public String toString() {
        return "Xe [" + soXe + ", Hãng: " + hieuXe + ", Chủ: " + chuXe + 
               ", CC: " + dungTich + ", Thuế: " + (long)dongThue() + " VND]";
    }
}