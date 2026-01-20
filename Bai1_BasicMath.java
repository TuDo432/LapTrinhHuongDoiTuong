// Bài 1 (Tuần 1) - tính tổng hiệu tích thương bằng bàn phím
import java.util.Scanner;

public class Bai1_BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (a): ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số thứ hai (b): ");
        double b = scanner.nextDouble();

        System.out.println("--- KẾT QUẢ ---");
        System.out.println("Tổng (a + b) = " + (a + b));
        System.out.println("Hiệu (a - b) = " + (a - b));
        System.out.println("Tích (a * b) = " + (a * b));

        if (b != 0) {
            System.out.println("Thương (a / b) = " + (a / b));
        } else {
            System.out.println("Không thể chia cho 0");
        }
        
        scanner.close(); 
    }
}