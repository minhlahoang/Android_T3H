package QuanLyPhuongTien;

import java.util.Scanner;

public class XeBanTai extends PhuongTienCoDongCo implements CoTinhThue{
	private float taiTrong;
	private float chieuDaiThungXe;

	public XeBanTai() {
		super();
	}

	public XeBanTai(String ten, String hangSX, int namSX, int giaTien, float dungTichXiLanh, float taiTrong, float chieuDaiThungXe) {
		super(ten, hangSX, namSX, giaTien, dungTichXiLanh);
		this.taiTrong = taiTrong;
		this.chieuDaiThungXe = chieuDaiThungXe;
	}

	public float getTaiTrong() {
		return taiTrong;
	}

	public void setTaiTrong(float taiTrong) {
		this.taiTrong = taiTrong;
	}

	public float getChieuDaiThungXe() {
		return chieuDaiThungXe;
	}

	public void setChieuDaiThungXe(float chieuDaiThungXe) {
		this.chieuDaiThungXe = chieuDaiThungXe;
	}

	@Override
	public String toString() {
		return "XeBanTai{" +
				"taiTrong=" + taiTrong +
				", chieuDaiThungXe=" + chieuDaiThungXe +
				", dungTichXiLanh=" + dungTichXiLanh +
				", ten='" + ten + '\'' +
				", hangSX='" + hangSX + '\'' +
				", namSX=" + namSX +
				", giaTien=" + giaTien +
				'}';
	}

	@Override
	public float tinhThue() {
		// TODO Auto-generated method stub
		return giaTien * 0.72f;
	}

	@Override
	public void nhap(Scanner scanner) {
		super.nhap(scanner);
		System.out.println("Nhập tải trọng: ");
		this.taiTrong = scanner.nextFloat();
		System.out.println("Nhập chiều dài thùng xe: ");
		this.chieuDaiThungXe = scanner.nextFloat();
	}
}
