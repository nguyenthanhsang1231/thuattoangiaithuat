package BaiTap1_4;

import java.util.Scanner;

public class TinhTongBinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x");
        int x = sc.nextInt();
        System.out.println("nhap y");
        int y = sc.nextInt();
        int tong =( x * x ) * 2 + (y * y) * 2;
        System.out.println(tong);
    }
}
