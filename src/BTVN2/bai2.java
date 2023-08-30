package BTVN2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh a");
        float a = sc.nextFloat();
        System.out.println("Nhap vao canh b");
        float b = sc.nextFloat();
        System.out.println("Nhap vao canh c");
        float c = sc.nextFloat();
        if(a+b>c && a+c >b && b+c > a)
            System.out.println("3 canh a, b,c tao thanh tam giac");
        else
            System.out.println("3 canh a, b,c khong tao thanh tam giac");
        sc.close();
    }

}
