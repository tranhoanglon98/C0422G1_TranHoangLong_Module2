package thuc_hanh.array_method;

import java.util.Scanner;

public class FindingValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentNames = {"Long", "Trang", "Phú", "Thìn", "Thái", "Duyên", "Tài", "Thức", "Tuấn"};
        System.out.println("Nhập tên muốn kiểm tra");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < studentNames.length; i++) {
            if (name.equals(studentNames[i])) {
                flag = true;
                System.out.println("Sinh viên " + name + " nằm ở vị trí " + (i + 1) + " trong danh sách.");
                break;
            }
        }
        if (!flag) {
            System.out.println(name + " không có trong danh sách.");
        }
    }
}
