package QuanLyPhuongTien;

import java.util.Scanner;

public class XeOTo extends PhuongTienCoDongCo implements CoTinhThue{
	private float dungTichCop;

	public XeOTo() {
		super();
	}

	public XeOTo(String ten, String hangSX, int namSX, int giaTien, float dungTichXiLanh, float dungTichCop) {
		super(ten, hangSX, namSX, giaTien, dungTichXiLanh);
		this.dungTichCop = dungTichCop;
	}

	public float getDungTichCop() {
		return dungTichCop;
	}

	public void setDungTichCop(float dungTichCop) {
		this.dungTichCop = dungTichCop;
	}

	@Override
	public float tinhThue() {
		return giaTien*0.12f;
	}

	@Override
	public String toString() {
		return "XeOTo [dungTichCop=" + dungTichCop + ", dungTichXiLanh=" + dungTichXiLanh + ", ten=" + ten + ", hangSX="
				+ hangSX + ", namSX=" + namSX + ", giaTien=" + giaTien + "]";
	}

	@Override
	public void nhap(Scanner scanner) {
		super.nhap(scanner);
		System.out.print("Nhập dunng tích cốp: ");
		this.dungTichCop = scanner.nextFloat();
	}
}
