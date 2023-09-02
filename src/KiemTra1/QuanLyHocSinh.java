package KiemTra1;

import java.util.Scanner;

public class QuanLyHocSinh {
    public static void main(String[] args) {
        HocSinh hocSinh = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Thêm học sinh");
        System.out.println("2. Hiển thị thông tin học sinh");
        System.out.println("3. Điểm trung bình hai môn");
        System.out.println("0. Thoát");
        int choose;
        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
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
                    if (hocSinh != null)
                        System.out.println(hocSinh);
                    else
                        System.out.println("Chưa có thông tin học sinh");
                    break;
                case 3:
                    if (hocSinh != null) {
                        float diemTB = hocSinh.tinhDiemTrungBinh();
                        System.out.println("Điểm trung bình là: " + diemTB);
                    } else
                        System.out.println("Chưa có thông tin học sinh");
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
            }
        } while (choose != 0);
        scanner.close();

    }
}

