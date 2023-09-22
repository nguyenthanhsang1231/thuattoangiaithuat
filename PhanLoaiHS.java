package BaiTap1_4;

import java.util.Scanner;

public class PhanLoaiHS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem");
        int point = sc.nextInt();
        if (point <= 10 && point >= 8) {
            System.out.println("hoc sinh gioi");
        } else if (point <= 8 && point >=6) {
            System.out.println("hoc sinh kha");
        } else {
            System.out.println("hoc sinh dot");
        }
    }
}
