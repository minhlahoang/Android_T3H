package QuanLyPhuongTien;

import java.util.Scanner;

public class QuanLyPhuongTien {
    public static void main(String[] args) {
        PhuongTienGiaoThong phuongTienGiaoThong = null;
        Scanner scanner = new Scanner(System.in);
        String tiepTuc = "k";

        do {
            int option;
            System.out.println("======QUẢN LÝ PHƯƠNG TIỆN======");
            System.out.println("1. Nhập phương tiện");
            System.out.println("2. Hiện phương tiện");
            System.out.println("3. Tính thuế");
            System.out.print("Chọn chức năng: ");
            option = scanner.nextInt();
            scanner.nextLine(); //dọn đường ống [sau khi nhập số cần nhập chuỗi]

            switch (option) {
                case 1:
                    int n;
                    System.out.println("1. Xe đạp");
                    System.out.println("2. Xe máy");
                    System.out.println("3. Xe ô tô");
                    System.out.println("4. Xe bán tải");
                    System.out.print("Lựa chọn của bạn: ");
                    n = scanner.nextInt();
                    scanner.nextLine();
                    switch (n) {
                        case 1:
                            phuongTienGiaoThong = new XeDap();
                            break;
                        case 2:
                            phuongTienGiaoThong = new XeMay();
                            break;
                        case  3:
                            phuongTienGiaoThong = new XeOTo();
                            break;
                        case 4:
                            phuongTienGiaoThong = new XeBanTai();
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");
                    }
                    if (phuongTienGiaoThong != null) {
                        phuongTienGiaoThong.nhap(scanner);
                    }
                    break;
                case 2:
                    System.out.println(phuongTienGiaoThong);
                    break;
                case 3:
                    if(phuongTienGiaoThong instanceof  CoTinhThue) {
                        System.out.println(((CoTinhThue) phuongTienGiaoThong).tinhThue());
                    } else {
                        System.out.println("Không cần tính thuế!");
                    }
                    break;
                default:
                    System.out.println("Không có lựa chọn " + option);
            }
            System.out.println("Bạn có muốn tiếp tục không(c/k): ");
            tiepTuc = scanner.nextLine();
        } while (!tiepTuc.equals("k"));


        scanner.close();
        System.out.println("Chương trình kết thúc!");
    }
}
