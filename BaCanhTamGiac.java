package BaiTap1_4;

import java.util.Scanner;

public class BaCanhTamGiac {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chi so de lam thanh cai tam giac ma ban yeu thich:");
        System.out.println("nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();
        System.out.println("nhap c");
        c = sc.nextInt();
        // dieu kien de lam thanh tam giac
        if (isaTriangle(a, b, c)) {
            // dieu kien dac biet cua cac tam giac
            if (isEquilateralTriangle(a, b, c)) {
                System.out.println(" do la tam giac deu");
            } else if (isIsoscelesTriangle(a, b, c)) {
                System.out.println("do la tam giac can");
            } else if (isSquareTriangle(a, b, c)) {
                System.out.println("do la tam giac vuong");
            } else if (isSquareTriangles(a, b, c)) {
                System.out.println("do la tam giac vuong can");
            } else {
                System.out.println("tam giac thuong");
            }
        } else {
            System.out.println("3 canh k du dieu kien tao thanh tam giac");
        }
        sc.close();

    }

    private static boolean isSquareTriangles(int a, int b, int c) {
        return ((a * a + b * b == c * c) && (a == b)) || ((a * a + c * c == b * b) && (a == c)) || ((b * b + c * c == a * a) && (b == c));
    }

    private static boolean isSquareTriangle(int a, int b, int c) {
        return (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b);
    }

    private static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    private static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isaTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0);
    }
}
