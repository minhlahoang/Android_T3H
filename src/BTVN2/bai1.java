package BTVN2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm");
        int nam = scanner.nextInt();
        if(((nam %4 == 0) && (nam%100 != 0)) || (nam%400 == 0 ))
            System.out.println("Năm " + nam + "là năm nhuận");
        else
            System.out.println("Năm " + nam + "không là năm nhuận");

        scanner.close();
    }
}
