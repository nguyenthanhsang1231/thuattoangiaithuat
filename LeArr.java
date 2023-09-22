package BaiTap1_4;

import java.util.Scanner;
public class LeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 2 ==1) {
                System.out.println("so le " + i);
            }
        }
    }
}

