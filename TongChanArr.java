package BaiTap1_4;

import java.util.Scanner;

public class TongChanArr {
    public static int chanArr(int n) {
        int a = 0;
        for (int i = 2; i <= n; i++) {
            a += i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nutAn = sc.nextInt();
        System.out.println("Tổng từ 2 đến " + nutAn + " co " +chanArr(nutAn));
        sc.close();
    }
}
