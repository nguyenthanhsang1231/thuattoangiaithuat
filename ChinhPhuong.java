package BaiTap1_4;

import java.util.Scanner;

public class ChinhPhuong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int chinhPhuong = i * i;
            System.out.println(chinhPhuong);
        }
    }
}
