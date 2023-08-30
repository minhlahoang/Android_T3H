package BTVN2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tiepTuc;

        do {
            System.out.print("Nhap nam: ");
            int nam = scanner.nextInt();

            if (kiemTraNamNhuan(nam)) {
                System.out.println(nam + " la nam nhuan");
            } else {
                System.out.println(nam + " khong la nam nhuan");
            }

            System.out.print("Kiem tra nam khac? (Y/N): ");
            tiepTuc = scanner.next().charAt(0);
        } while (tiepTuc == 'Y' || tiepTuc == 'y');

        System.out.println("Ket thuc chuong trinh");
        scanner.close();
    }


    public static boolean kiemTraNamNhuan(int nam) {
        return (nam % 400 == 0) || ((nam % 4 == 0) && (nam % 100 != 0));
    }
}
