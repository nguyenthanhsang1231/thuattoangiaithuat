package BaiTap1_4;

import java.util.Scanner;

public class NhapABCChiaHet35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a = sc.nextInt();
        System.out.println("nhap b");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0 && i % 3 ==0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("k co trung hop nao");
            }
        }
    }
}
