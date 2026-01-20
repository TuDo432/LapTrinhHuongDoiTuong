// Bài 2 (Tuần 1) - Nhập 2 cạnh a,b tính chu vi/diện tích
import java.util.Scanner;

public class Bai2_HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        
        scanner.close();
    }
}