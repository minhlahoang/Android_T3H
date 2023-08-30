package KiemTra1;

import java.util.Scanner;

public class QuanLyHocSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn chức năng:");
        System.out.println("1. Nhập thông tin học sinh");
        System.out.println("2. In thông tin học sinh");
        System.out.println("3. Tính điểm trung bình");
        System.out.println("0. Thoát");

        int choice;
        HocSinh hocSinh = null;

        do {
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên học sinh: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    System.out.print("Nhập điểm Toán: ");
                    float diemToan = scanner.nextFloat();
                    System.out.print("Nhập điểm Văn: ");
                    float diemVan = scanner.nextFloat();

                    hocSinh = new HocSinh(ten, tuoi, diemToan, diemVan);
                    break;
                case 2:
                    if (hocSinh != null) {
                        System.out.println(hocSinh);
                    } else {
                        System.out.println("Chưa có thông tin học sinh.");
                    }
                    break;
                case 3:
                    if (hocSinh != null) {
                        float diemTrungBinh = hocSinh.tinhDiemTB();
                        System.out.println("Điểm trung bình: " + diemTrungBinh);
                    } else {
                        System.out.println("Chưa có thông tin học sinh.");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }


}

