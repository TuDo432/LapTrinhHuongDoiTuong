// Bài 3 (Tuần 1) - Kiểm tra số n có phải là nguyên tố hay không
import java.util.Scanner;

public class Bai3_KiemTraNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        boolean laNguyenTo = true;

        if (n < 2) {
            laNguyenTo = false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laNguyenTo = false;
                    break; 
                }
            }
        }

        if (laNguyenTo) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
        
        scanner.close();
    }
}