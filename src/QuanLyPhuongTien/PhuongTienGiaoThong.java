package QuanLyPhuongTien;

import java.util.Scanner;

public abstract class PhuongTienGiaoThong {
    protected String ten;
    protected  String hangSX;
    protected int namSX;
    protected int giaTien;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String ten, String hangSX, int namSX, int giaTien) {
        this.ten = ten;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "ten='" + ten + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaTien=" + giaTien +
                '}';
    }
    public void nhap(Scanner scanner) {
     //   Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên phương tiện: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        this.hangSX = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        this.namSX = scanner.nextInt();
        System.out.print("Nhập giá phương tiện: ");
        this.giaTien = scanner.nextInt();
        scanner.nextLine();
   //     scanner.close();

    }
}
