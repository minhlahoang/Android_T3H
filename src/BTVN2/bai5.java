package BTVN2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong a");
        int a = sc.nextInt();
        System.out.println("Nhap vao so nguyen duong b");
        int b = sc.nextInt();

        int ucln = timUCLN(a, b);

        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + ucln);

        sc.close();
    }


    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
