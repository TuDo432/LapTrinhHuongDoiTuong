package OOP_T4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // 2. Constructor
    // Tham số dùng tiền tố: i_ (int), s_ (String)
    public Employee(int i_id, String s_firstName, String s_lastName, int i_salary) {
        id = i_id;
        firstName = s_firstName;
        lastName = s_lastName;
        salary = i_salary;
    }

    // 3. Các phương thức Getter/Setter

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Yêu cầu: FullName = lastName + firstName
    public String getFullName() {
        return lastName + " " + firstName; 
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int i_salary) {
        salary = i_salary;
    }

    // Yêu cầu: Tính tổng lương hằng năm = salary * 12
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Yêu cầu: Tăng lương theo phần trăm và trả về lương mới
    // Công thức: salary + (salary * percent) / 100
    public int upToSalary(int i_percent) {
        int amountIncrease = (salary * i_percent) / 100;
        salary = salary + amountIncrease; // Cập nhật lương mới
        return salary; // Trả về lương mới
    }

    // Yêu cầu: Trả về chuỗi thông tin
    public String toString() {
        return "Employee[id=" + id + ", name=" + lastName + " " + firstName + ", salary=" + salary + "]";
    }
}