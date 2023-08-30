package BTVN2;

import java.util.Scanner;

public class bai5_chuabai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a = ");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên b = ");
        int b = scanner.nextInt();

        while (a != b) {
            if(a>b) {
                a -=b;

            } else {
                b -=a;
            }
        }
        System.out.println("UCLN = " + a);
        scanner.close();
    }
}
