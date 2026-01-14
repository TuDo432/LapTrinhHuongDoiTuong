import java.util.Scanner;

public class BaiTapMangBT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- a. Nhập mảng một chiều các số nguyên ---
        System.out.print("Nhap so luong phan tu trong mang (n): ");
        int n = scanner.nextInt();

        // Tạo mảng có n phần tử
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // --- b. Xuất các phần tử mảng ra cửa sổ xuất chuẩn ---
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Xuống dòng cho đẹp

        // --- c. Tìm vị trí của một số nguyên x trong mảng ---
        System.out.print("Nhap so x can tim: ");
        int x = scanner.nextInt();
        boolean timthay = false; // Cờ hiệu để kiểm tra xem có tìm thấy không
        System.out.print("Vi tri cua " + x + " trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " "); // In ra chỉ số (index)
                timthay = true;
            }
        }
        if (!timthay) {
            System.out.print("Khong tim!");
        }
        System.out.println();

        // --- d & e. Tìm giá trị lớn nhất (max) và nhỏ nhất (min) ---
        // Giả sử phần tử đầu tiên là max và min, sau đó đi so sánh với các số còn lại
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat trong mang: " + max);
        System.out.println("Gia tri nho nhat trong mang: " + min);

        // --- f. Tìm vị trí phần tử có giá trị lớn nhất ---
        // Vì có thể có nhiều số cùng bằng max, ta duyệt lại mảng để in hết các vị trí đó
        System.out.print("Vi tri cua so lon nhat (" + max + ") la: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // --- g. Sắp xếp mảng tăng dần ---
        // Sử dụng thuật toán đổi chỗ trực tiếp (Interchange Sort) - Dễ hiểu nhất cho người mới
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Nếu số trước lớn hơn số sau thì đổi chỗ (hoán vị)
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Mang sau khi nhap sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
 
       }
       scanner.close();
    }
}