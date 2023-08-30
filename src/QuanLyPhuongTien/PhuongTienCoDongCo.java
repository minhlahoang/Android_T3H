package QuanLyPhuongTien;

import java.util.Scanner;

public abstract class PhuongTienCoDongCo extends PhuongTienGiaoThong{
    protected float dungTichXiLanh;

    public PhuongTienCoDongCo() {
        super();
    }

    public PhuongTienCoDongCo(String ten, String hangSX, int namSX, int giaTien, float dungTichXiLanh) {
        super(ten, hangSX, namSX, giaTien);
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public float getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(float dungTichXiLanh) {
        this.dungTichXiLanh = dungTichXiLanh;
    }

    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhập dung tích xi lanh: ");
        this.dungTichXiLanh = scanner.nextFloat();
    }
}
