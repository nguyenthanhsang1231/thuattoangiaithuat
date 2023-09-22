package BaiTap1_4;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so bat ki : ");
        number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("so chan");
            } else {
                System.out.println("so le");
            }
        }
    }

