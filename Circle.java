package OOP_T4;

public class Circle {
    // Khai báo biến private theo đề bài
    private double radius;
    private String color;

    // --- CÁC CONSTRUCTOR (Viết theo mẫu giáo trình) ---

    // 1. Constructor mặc định
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2. Constructor có 1 tham số (radius)
    // d_radius: d là viết tắt của double (giống f_chiphisx trong sách)
    public Circle(double d_radius) {
        radius = d_radius;
        color = "red"; // Giá trị mặc định
    }

    // 3. Constructor đầy đủ 2 tham số
    // s_color: s là viết tắt của String (giống s_nhasx trong sách)
    public Circle(double d_radius, String s_color) {
        radius = d_radius;
        color = s_color;
        
        // hoặc
        // this.radius = d_radius;
        // this.color = s_color;
    }

    // --- CÁC PHƯƠNG THỨC KHÁC (Theo yêu cầu đề bài Diagram) ---

    public double getRadius() {
        return radius;
    }

    public void setRadius(double d_radius) {
        radius = d_radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String s_color) {
        color = s_color;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}