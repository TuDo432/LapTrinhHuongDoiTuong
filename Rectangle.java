package OOP_T4;

public class Rectangle {
    // 1. Khai báo các thuộc tính (theo Diagram)
    private int length;
    private int width;


    // Constructor mặc định (không tham số)
    // Khởi tạo giá trị mặc định 
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor có 2 tham số
    // i_length, i_width: dùng tiền tố "i" để gợi nhớ kiểu int (giống i_so, i_thoigiansx trong giáo trình)
    public Rectangle(int i_length, int i_width) {
        length = i_length;
        width = i_width;
    }

    // Setter cho length: dùng tham số i_length
    public void setLength(int i_length) {
        length = i_length;
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    // Setter cho width: dùng tham số i_width
    public void setWidth(int i_width) {
        width = i_width;
    }

    // Getter cho width
    public int getWidth() {
        return width;
    }


    public int getArea() {
        return length * width; // Gợi ý: area = length * width
    }

    // Phương thức toString
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}

