package OOP_T4;

public class Account {
    // 1. Khai báo 3 biến private
    private String id;
    private String name;
    private int balance;


    // Tham số dùng tiền tố: s_ (String), i_ (int)
    public Account(String s_id, String s_name, int i_balance) {
        id = s_id;
        name = s_name;
        balance = i_balance;
    }

    // 3. Các phương thức Getter
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // 4. Phương thức credit (Nạp tiền)
    // Yêu cầu: Kiểm tra tham số đầu vào phải là số dương
    public int credit(int i_amount) {
        if (i_amount > 0) {
            balance = balance + i_amount;
        } else {
            System.out.println("So tien nap phai duong!");
        }
        return balance;
    }

    // 5. Phương thức debit (Thanh toán/Rút tiền)
    // Yêu cầu: Nếu số tiền thanh toán lớn hơn số dư thì báo lỗi
    public int debit(int i_amount) {
        if (i_amount <= balance) {
            balance = balance - i_amount;
        } else {
            System.out.println("Thanh toan khong thanh cong (So du khong du)");
        }
        return balance;
    }

    // 6. Phương thức transferTo (Chuyển tiền)
    // Yêu cầu: Chuyển tiền từ tài khoản này cho tài khoản khác
    public int transferTo(Account another, int i_amount) {
        // Kiểm tra xem có đủ tiền để chuyển không
        if (i_amount <= balance) {
            // Trừ tiền ở tài khoản hiện tại
            this.debit(i_amount);
            
            // Cộng tiền vào tài khoản kia
            another.credit(i_amount);
        } else {
            System.out.println("Chuyen tien khong thanh cong (So du khong du)");
        }
        return balance;
    }

    // 7. Phương thức toString
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}