package BTVN2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thang");
        int thang = sc.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang" + thang + "co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + thang + " co 30 ngay");
                break;
            case 2:
                System.out.println("Moi nhap nam ");
                int nam = sc.nextInt();
                if (((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0))
                    System.out.println("Thang " + thang + "nam " + nam + " co 29 ngay");
                else
                    System.out.println("Thang " + thang + "nam " + nam + " co 28 ngay");
                break;
            default:
                System.out.println("Khong co thang vua nhap");
                break;

        }
        sc.close();
    }
}
