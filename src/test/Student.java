package test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai danh sach ");
        int lengthStu= Integer.parseInt(sc.nextLine());
        String [] arr = new String[lengthStu];
        System.out.println("nhap danh sach sinh vien ");
        for (int i = 0; i < lengthStu; i++) {
            arr[i]= sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap ten sinh vien muon kiem tra ");
        String nameStu = sc.nextLine();
        int num = 0;
        for (int i = 0; i < lengthStu; i++) {
            if (Objects.equals(nameStu, arr[i])){
                num= i;
                break;
            }
        }
        if (num  == 0){
            System.out.println("sinh vien khong co trong danh sach ");
        }
        System.out.println(nameStu + "co trong danh sach " + "ở vi tri" + num );

    }
}
