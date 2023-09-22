package BaiTap1_4;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        Scanner sc = new Scanner(System.in);
        System.out.println("so lon nhat trong 3 so");
        System.out.println("so 1: ");
        number1 = sc.nextInt();
        System.out.println("so 2: ");
        number2 = sc.nextInt();
        System.out.println("so 3: ");
        number3 = sc.nextInt();
        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1 + "max");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2 + "max");
        } else {
            System.out.println(number3 + "max");
        }
    }
}
